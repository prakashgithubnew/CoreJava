
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
   3. Suppose you have 2 threads and you started both by using t1.start and t2.start and then you are using
   t1.join and then t2.join.This will not synchonze threads to sun one after another because you started both together.
   To make it work one after another you need to use as below
   t1.start()
   t1.join()
   t2.start()
   t2.join()

Now this will make t1 to start and finish first and then same way for t2.

4. if you started both by t1.start and t2.start and t1.join and t2.join then to make it synchronize 
you will need to use either synchronized block or method.


**Life Cycle of MultiThreads**
-------------------------------
![img.png](img.png)

**Thread scheduler** 
---------------------

1. To schedule thread to run every 2 seconds till 10 seconds
Use ScheduledExecutorService class and call scheduleAtFixedRate method to call Thread class where function is written
Refer program TestThread in this package


**Thread Pool**
---------------
1.  Create pool of threads and use it when needed else put that in pool to future use.
2.  Refer Program ThreadPoolTest.java for more reference

**CountDownLatch**
-------------------
1. Using a CountDownLatch we can cause a thread to block until other threads have completed a given task.
2. you need to create an instance of countdownlatch and use methods wait and countdown to decrement the sequence.
3. CountDownLatch is particularly useful in scenarios where you need to wait for a set of operations to 
    complete before proceeding. 

**difference between wait,notify and notify all and sleep**
-----------------------------------------------------------
wait, notify and notifyall are object class method where sleep is thread class method

**Thread Interruption**
-----------------------
Thread can be interrupted by using Thread.interrupt() method.
Once thread is started by start method the same can be interrupted anytime.
