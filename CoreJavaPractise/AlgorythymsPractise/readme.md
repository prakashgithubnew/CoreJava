**How to check no of users hit the API End Point**
--------------------------------------------------
1. Use AtomicInteger.incrementAndGet method helps to identify the number of users hit the API
But this is conditional that server is not going to stop anytime
if server restarts then again it will start the counter from 1

if you want some permanent storage then you can use any persistent DB and store there for life time.


In-memory uses RAM or local cache to save anything there but its always temporary and when server starts 
all data in memory is lost.






