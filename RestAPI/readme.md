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


