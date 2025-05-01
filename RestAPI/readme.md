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

**Difference between PUT and PATCH**
-------------------------------------
PUT replaces an entire resource, while PATCH applies partial updates to specific fields of a 
resource.

Patch used for partial updates only, should be used when you are aware that the request will come for
update only and with few attributes.



**Difference between HTTP and HTTPS**
--------------------------------------
HTTP is unencrypted and transmits data in plain text, while HTTPS encrypts data using SSL/TLS(
SECURE SOCKET LAYER,TRANSPORT LAYER SECURITY),making it secure for sensitive information

HTTPS adds additional layer of security in HTTP

**How HTTPs works?**
--------------------
1. The client (browser) and server establish a TCP connection, similar to how HTTP works.
2. The client initiates the TLS handshake by sending a "Client Hello" message, containing .
   information about its supported cryptographic algorithms and TLS versions.
3. The server responds with a "Server Hello" message, including its chosen algorithm and a
   digital certificate containing its public key.
4. The client verifies the server's certificate, ensuring it's valid and issued by a trusted
   Certificate Authority (CA).
5. The client generates a random symmetric key (session key), encrypts it using the server's
   public key, and sends it to the server.
6. The server decrypts the encrypted session key using its private key, and now both the client
   and server have the same session key, enabling secure encrypted communication.
7. All subsequent data exchange between the client and server is encrypted using the
   agreed-upon session key.

**Where HTTPS should be used**
------------------------------
**Login Pages:** Websites that require users to log in, such as banking, email, or social media sites, should always use HTTPS.

**E-commerce:** Websites that handle financial transactions or personal information, such as online stores, should use HTTPS to ensure secure payment processing and data protection.

**Healthcare:** Websites that store or transmit sensitive health information should use HTTPS to protect patient data.

**Any Website Handling Sensitive Data:** Any website that collects, processes, or stores sensitive information should use HTTPS to ensure the security of user data.


**Rest API error Codes**
------------------------

                **Client Error (4xx):**

**400 Bad Request:** The server cannot process the request due to a malformed request syntax or invalid
data.

**401 Unauthorized:** The client needs to authenticate to access the requested resource.

**403 Forbidden:** The client is authenticated but lacks the necessary permissions to access the resource.

**404 Not Found:** The requested resource could not be found on the server.

**405 Method Not Allowed:** The HTTP method used in the request is not allowed for the requested resource.

**408 Request Timeout:** The server timed out waiting for the request to complete

**409 Conflict:** The request could not be completed due to a conflict with the current state of the resource.

**410 Gone:** The requested resource is no longer available and has been permanently removed.

**429 Too Many Requests:** The client has sent too many requests in a given amount of time.

                **Server Error (5xx):**

**500 Internal Server Error:**

**502 Bad Gateway:**

**503 Service Unavailable:**

                **Succesful Action**

200 OK

201 Created

202 Accepted


**what is the Authorize and UnAuthorize error?**

    An "unauthorized error" (often a 401 error) means the server doesn't recognize your credentials 
    or you're not authorized to access a resource, while an "authorized error" (often a 403 error) 
    means you are authenticated but lack the necessary permissions for that specific resource



**How MAE is having controller**
--------------------------------
@RestController
@RequestMapping("{CONTEXTPATH}")
public class ExampleController
{

@Putmapping("/{id}/showdata")
public void show(){
}
}

**What are the rest API standards**
----------------------------------
**1. HTTP Methods (CRUD Operations):**
   REST APIs use standard HTTP methods to perform CRUD (Create, Read, Update, Delete) operations:

GET: Retrieve data from the server (Read operation).

POST: Send data to the server (Create operation).

PUT: Update data on the server (Replace operation).

PATCH: Partially update data on the server (Partial Update).

DELETE: Remove data from the server (Delete operation).

**2. Uniform Resource Identifier (URI):**
   REST APIs use clear and consistent URIs to identify resources.

Singular vs Plural: Resources should be named in plural form (e.g., /users, /posts).

Hierarchical Structure: Use nested URIs to represent relationships (e.g., /users/{userId}/posts).

Avoid Actions: Avoid using verbs in URIs (e.g., use /users instead of /getUsers).

**3. Stateless:**
   Each API call should contain all the information needed to complete the request. The server should not store any session data between requests. Every request is independent and self-contained.

**4. Response Format:**
   JSON (preferred): JSON is the most widely used data format for REST APIs because it’s lightweight and easy to parse. XML is also an option, but JSON is the standard.

HTTP Status Codes: REST APIs should use standard HTTP status codes to indicate the outcome of the request:

200 OK: Successful request.

201 Created: Resource created successfully.

400 Bad Request: Invalid request from the client.

401 Unauthorized: Client is not authorized.

403 Forbidden: Access to the resource is forbidden.

404 Not Found: The requested resource was not found.

500 Internal Server Error: Server encountered an error.

**5. Request Headers:**
   REST APIs use request headers for various purposes, such as:

Content-Type: Specifies the media type of the resource (e.g., application/json).

Authorization: Used for authentication (e.g., Bearer {token}).

Accept: Indicates the expected response format (e.g., application/json).

**6. Versioning:**
   It's important to version your API so that changes don't break existing clients. This can be done in various ways:

URI Versioning: /api/v1/users.

Query Parameter Versioning: /api/users?version=1.

Header Versioning: Accept: application/vnd.myapi.v1+json.

**7. Pagination:**
   For large datasets, it's important to paginate the response:

Use query parameters like ?page=1&limit=20 or ?offset=0&limit=10.

**8. HATEOAS (Hypermedia as the Engine of Application State):**
   HATEOAS is a constraint of REST that allows clients to navigate the API dynamically by providing links to related resources in the response. This is often represented in a links section of the response.

**9. Error Handling:**
   REST APIs should return clear error messages with relevant status codes and details:

Include an error code, a description, and possibly a more specific message (e.g., {"error": {"code": "400", "message": "Invalid user ID"}}).

**10. Security:**
    Authentication: Use OAuth, JWT (JSON Web Tokens), or API keys for authentication.

Authorization: Make sure that users can only access resources they are permitted to.

HTTPS: Always use HTTPS to encrypt API communication.

**11. Idempotency:**
    Some requests (like GET, PUT, and DELETE) should be idempotent, meaning that making the same request multiple times should produce the same result without causing side effects.

**12. Caching:**
    REST APIs can benefit from caching to reduce the number of requests:

Use HTTP caching headers like Cache-Control, ETag, and Last-Modified.

Enable server-side or client-side caching for frequently accessed resources.


**API Versioning**
------------------
API versioning is the strategy to support existing users as well as new users.
Old users can use the existing old version of APIs without an impact on new users.

Types of API versioning - 
1. URL Versioning - /api/v1/resource(Most recommended way)
2. Header versioning - you can send versions in headers.

**What is backward compatibility**
----------------------------------
Backward compatibility is to ensure old clients can continue with their work even after the 
APIs are updated.

you can achieve this by API versioning and also by adding optional 
parameters considering UI has to handle the optional field gracefully.

API Version starategy

3.             2.                    1

Major          New Features         Bug Fixes or patches


**API Life Cycle**
------------------

Define
design
develop
test
secure
dePloy
observe
distribute

**API throttling vs rate limiting**
------------------------------------
There are slight difference in these 2 terms
API Throttling - Number of API requests that can be processed by API.Slow down the process once
                  limit is breached but still request can be processed but in slow manner.

API Rate Limiting - Number of API request a client can make. Once limit is breached other request 
                     are rejected.


**Throttling Implementation in Spring boot**
---------------------------------------------
How to Implement throttling in spring boot

1. Add below dependency
   <dependencies>
   <dependency>
   <groupId>com.weddini.throttling</groupId>
   <artifactId>spring-boot-throttling-starter</artifactId>
   <version>0.0.9</version>
   </dependency>
   </dependencies>
2. The service method which you want to be limit the request you can add lke below

@Throttling(type = ThrottlingType.RemoteAddr, limit = 1, timeUnit = TimeUnit.SECONDS)
public void serviceMethod() {}

[it says 1 request per second is the limit]

3. error handling if limit reached

@ResponseStatus(code = HttpStatus.TOO_MANY_REQUESTS, reason = "Too many requests")
public class ThrottlingException extends RuntimeException {}

**How to check no of users hit the API End Point**
--------------------------------------------------
1. Use AtomicInteger.incrementAndGet method helps to identify the number of users hit the API
   But this is conditional that server is not going to stop anytime
   if server restarts then again it will start the counter from 1

if you want some permanent storage then you can use any persistent DB and store there for life time.


In-memory uses RAM or local cache to save anything there but its always temporary and when server starts
all data in memory is lost.
