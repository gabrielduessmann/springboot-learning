# springboot

### Starting Spring Boot
> Class ```src/main/java/springbootstarter/ApiApp.java```

>Method ```SpringApplication.run(ApiApp.class, args); ``` 

- sets up default configuration
- start Spring Application context
- starts Tomcat server


## Rest API

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


### POST /topic
// FIXME
```console
$ curl -X POST http://localhost:8080/topics  
    -H "Content-Type: application/json" 
    d '{"id": "Spring6", "name": "name6", "description": "description6"}' 
```