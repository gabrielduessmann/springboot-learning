# springboot

Site

``` https://whispering-savannah-50376.herokuapp.com/ ```

Project to learn Spring Boot.
It was based on 

```https://www.youtube.com/watch?v=msXL2oDexqw&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x&index=1```

## Installation

### Build
` $ mvn clean install `

` $ docker-compose up `


Clean the target/ and rebuild the target folder.

### Run
``` $ mvn spring-boot:run ```

## Technologies

- Spring Boot
- Spring Data JPA
- Apache Derby

### Starting Spring Boot
> Class ```src/main/java/springbootstarter/ApiApp.java```

>Method ```SpringApplication.run(ApiApp.class, args); ``` 

- sets up default configuration
- start Spring Application context
- starts Tomcat server


## Rest API

- Topics

### GET /topics
 
```$ curl -X GET http://localhost:8080/topics ```

### Get /topics/{id}

```$ curl -X GET http://localhost:8080/topics/Spring2 ```

```json
{
    id: "Spring2", 
    name: "Spring framework 2", 
    description: "Spring tutorial 2"
} 
```


### POST /topics
// FIXME
```console
$ curl -X POST http://localhost:8080/topics  
    -H "Content-Type: application/json" 
    -d '{"id": "Spring6", "name": "name6", "description": "description6"}' 
```

### PUT /topic/{id}
// FIXME
```console
$ curl -X PUT http://localhost:8080/topics/Spring6  
    -H "Content-Type: application/json" 
    -d '{"id": "Spring6", "name": "NoName", "description": "NoDescription"}' 
```

### DELETE /topics/{id}
 
```$ curl -X DELETE http://localhost:8080/topics/Spring6 ```



- Courses

### GET /topics/{topicId}/courses
 
```$ curl -X GET http://localhost:8080/topics/Spring/courses ```

### Get /topics/{topicId}/courses/{id}

```$ curl -X GET http://localhost:8080/topics/Spring/courses/Course1 ```

```json
{
    "id": "Course1", 
    "name": "Course1 name", 
    "description": "Course1 description",
    "topic":  {
        "id": "Spring",
        "name:": "Spring name",
        "description": "Spring description"
    } 
} 
```

### POST /topics/{topicId}/courses
// FIXME
```console
$ curl -X POST http://localhost:8080/topics/Spring/courses}  
    -H "Content-Type: application/json" 
    -d '{"id": "Spring6", "name": "name6", "description": "description6"}' 
```

### PUT POST /topics/{topicId}/courses
// FIXME
```console
$ curl -X PUT http://localhost:8080/topics/Spring/courses/Course1  
    -H "Content-Type: application/json" 
    -d '{"id": "Spring1", "name": "Name2", "description": "Description2"}' 
```

### DELETE /topics/{topicId}/courses/{id}
 
```$ curl -X DELETE http://localhost:8080/topics/Spring/courses/Course1 ```

# Database Postgres

* `database name:` springDocker    
* ```username:``` postgres
* ```password:``` postgres

## Postgres Docker Setup
```docker pull postgres```<br>
`docker run --name postgres -e POSTGRES_PASSWORD=1234 -p 5432:5432 -d postgres `<br>
`docker exec -it postgres bash` <br>

## Postgres Docker Usage (Postgres already in the docker container)
* `docker start postgres-container`
* `docker exec -it postgres-container /bin/bash`<br>
* This will make you enter inside the container.
* To run psql command, it will be required root role.
* `psql -U postgres`

## Command list

* `psql -U postgres` Create user 'postgres'
* `/password` Set a new password  
*  `\l ` Show all databases
* ` create database database_name`  
* ` \c database_name ` Use database
* ` \dt ` Show all tables
* ` \dt ` Show specific table
* ` \d ` Show all tables
* ` \q ` Exit database
* ` exit ` Exit container (linux)

If you are having issues with postgres configuration, watch this video below: <br>
` https://www.youtube.com/watch?v=aHbE3pTyG-Q `
