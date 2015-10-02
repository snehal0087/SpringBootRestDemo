It is simple Spring Boot Rest service CRUD operation example using H2 in-memory database.

Import project in Eclipse/Spring STS.

Run project as SpringBootApplication or deploy it on Tomcat.

Open Postman rest client or other rest client.

Set Content type as application/json.

Post Request

URL: http://localhost:8080/user

Method: POST

Request: 

{  
  "name": "abc",
  
  "address": "India"
  
}

Get Request

URL: http://localhost:8080/user

Method: GET

Put Request

URL: http://localhost:8080/user

Method: PUT

Request: 

{  
  "id": 1,
  
  "name": "abc",
  
  "address": "USA"
  
}

Delete Request 

URL: http://localhost:8080/user/1

Method: DELETE
