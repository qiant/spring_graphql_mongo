# README Spring GraphQL Mongo
Resume demo project using Spring GraphQL and mongoDB

## What is this repository for? 
This resume management demo project is built with Spring GraphQL and MongoDB.

## How to Setup & Run the application? 
* Java 17 or higher
* Maven 3 or higher
* MongoDB 
* Spring for GraphQL

### Summary of Setup

* Clone this repository to local working environment
```
 $ git clone 
```

Before run the application
1. Install mongodb on local or use online Atlas service
2. Create Database resume_service using MongoDB Compass
3. In MongoDB Compass MONGOSH (Shell) run command:
   ```
     > use resume_service 
     > db.createUser({user: "databaseuser", pwd: "password", roles: [{role:"dbOwner", db: "resume_service"}])
   ```
4. Update the database access information in src/main/resources/application.properties


After setting up MongoDB, run Maven commands to install dependencies
   ```
    $ cd spring_graphql_mongo
    $ mvn clean install
   ```

