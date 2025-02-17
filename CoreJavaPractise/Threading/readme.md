
**Multithreading**
------------------

1. If you want any process to be completed first then another process to start then use join method.
   for e.g, if t1,t2 and t3 are the thread which are executing and you want t1 to finish before
   t2 then use below
   t1.start()
   t1.join() - join will ensure t1 gets finished before t2 starts.
   t2.start()
   t2.join() - once t2 finished then t2 will start
   t3.join()

    2. Multithreading can be achieved by 2 ways.Extending the class with Thread and implementing by runnable interface.
       Extending ny thread can be preferred as the object can use multiple methods yield and interrupt
       which is not possible in case of runnable.

Life Cycle of Multithreads

![img.png](img.png)

**Thread scheduler** 
---------------------

1. To schedule thread to run every 2 seconds till 10 seconds
Use ScheduledExecutorService class and call scheduleAtFixedRate method to call Thread class where function is written
Refer program TestThread in this package

