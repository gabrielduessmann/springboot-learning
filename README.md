# springboot

Project to learn Spring Boot.
It was based on 

```https://www.youtube.com/watch?v=msXL2oDexqw&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x&index=1```

## Instalation

### Build
``` mvn clean install ```

Clean the target/ and rebuild the target folder.



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