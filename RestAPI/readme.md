Rest API security
------------------
1. Use Basic Auth or OAuth
2. Never expose passwords . usernames or any credentials in the URL , 
   use post as this is encrypted always.
3. Use HTTPS/SSL which requires token for authorise the access.
4. Authentication means who , Authorisation means what can be accessed?
4. Use API Gateways as extra layer for authentication and authorisation.

**What API Gateways can do?**
-----------------------------
rate limiting
throttling
logging and monitoring
transforming the traffic
route handlers
centralized authorization and authentication

****what is Idempotent and which method is idempotent****
---------------------------------------------------------
In REST APIs, idempotent HTTP methods include GET, HEAD, PUT, DELETE, and OPTIONS, meaning multiple 
identical requests have the same effect as a single request.

POST and PATCH:
These methods are generally not idempotent,as repeated requests can lead to multiple resource creations or modifications, respectively


