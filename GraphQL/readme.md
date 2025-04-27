**GraphQL**
-----------

GraphQL is a query language to retrieve data from a server.
It is an alternative to REST, SOAP, or gRPC
you can define the schema for your query and mention what response is needed

Schema Example

    type Query {
        bookById(id: ID): Book----request
    }

    type Book {---response
        id: ID
        name: String
        pageCount: Int
        author: Author
    }

    type Author {
        id: ID
        firstName: String
        lastName: String
    }

This schema tells that same format will come in request and you need to send the response 


Enable GraphQL in properties file

spring.graphql.graphiql.enabled=true

