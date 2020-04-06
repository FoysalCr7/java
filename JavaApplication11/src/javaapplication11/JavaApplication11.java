/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author USER
 */
public class JavaApplication11 {
   static int Queue_size = 32000;
static int next_event_type;
static int num_custs_delayed;
static int num_events=2;
static int num_in_q;
static int server_status;
static int num_delays_required;
static double area_num_in_q;
static double area_server_status;
static double sim_time;
static double time_last_event;
static double total_of_delays;
static double mean_interarrival;
static double mean_service;
 
static double[] time_arrival = new double[Queue_size];
static double[] time_next_event=new double[3];
 
static Random random = new Random(10000);
 
static void initialize()
{
sim_time = 0;
 
server_status = 0;
num_in_q = 0;
time_last_event = 0;
 
num_custs_delayed = 0;
total_of_delays = 0;
area_num_in_q = 0;
area_server_status = 0;
 
time_next_event[1] = sim_time + expon(mean_interarrival);
time_next_event[2] = 1.0e+30;
}
 
static void timing()
{
 
if (time_next_event[1] < time_next_event[2])
next_event_type = 1;
else
next_event_type = 2;
 
sim_time = time_next_event[next_event_type];
}
 
static void arrive()
{
double delay;
 
time_next_event[1] = sim_time + expon(mean_interarrival);
 
if (server_status == 1)
{
num_in_q++;
time_arrival[num_in_q] = sim_time;
}
 
else
{
delay = 0;
total_of_delays += delay;
 
num_custs_delayed++;
server_status = 1;
 
time_next_event[2] = sim_time + expon(mean_service);
}
}
 
static void depart()
{
if (num_in_q == 0)
{
server_status = 0;
time_next_event[2] = 1.0e+30;
}
else
{
num_in_q--;
 
num_custs_delayed++;
time_next_event[2] = sim_time + expon(mean_service);
 
for (int i = 1; i <= num_in_q; i++)
time_arrival[i] = time_arrival[i+1];
}
}
 
static void report()
{
System.out.println( "TOtal customer uses this server " + num_custs_delayed + "\n");
System.out.println( "Average delay in queue minutes  " + total_of_delays / num_custs_delayed + "\n");
System.out.println( "Average number in queue  " + area_num_in_q / sim_time + "\n");
System.out.println( "Server utilization  " + area_server_status / sim_time + "\n");
}
 
static void update_time_avg_stats()
{
double time_since_last_event;
 
time_since_last_event = sim_time - time_last_event;
time_last_event = sim_time;
 
area_num_in_q += num_in_q * time_since_last_event;
 
area_server_status += server_status * time_since_last_event;
}
 
static double expon(double  mean)
{
return -mean * Math.log(random.nextDouble());
}
    public static void main(String[] args) {
 
timing();
update_time_avg_stats();
 
switch (next_event_type)
{
case 1: arrive();
break;
case 2: depart();
}
}
}
