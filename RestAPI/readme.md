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

