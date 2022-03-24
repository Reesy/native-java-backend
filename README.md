# native-java-backend

_Note: A java example client that makes use of the same API can be found [here](https://github.com/Reesy/native-java-api-requester)_

A http/rest backend server using native packages ```com.sun.net.httpserver``` rather than any particular framework. 

By default the server runs on port 8001

# Commands



Compile: ```ant compile```

Create JAR: ```ant jar``` 

Running:   ```ant run```

All-in-one: ```ant compile jar run```

## REST API 

### GET ```/ping```
Example request:
```
GET /ping HTTP/1.1
```

Example response:
```
HTTP/1.1 200 OK
Server: My RESTful API
Content-Type: text/html; charset=utf-8
Content-Length: xy

"Pong" 
```
