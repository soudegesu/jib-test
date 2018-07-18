# jib-test
jib-test is a practice repository for [jib](https://github.com/GoogleContainerTools/jib).

## Preconditions
This repo requires
* Java 1.8 or more
* Gradle 4.8.1 or more

## Quickstart

* Build docker image using jib

```bash
./gradlew jibDockerBuild
```

* Run docker image

```bash
docker run -p 8080:8080 -d ${image id}
```

* request to container application

```bash
curl -v -H 'Content-Type: application/json' 'http://localhost:8080/user?name=hoge'

*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 8080 (#0)
> GET /user?name=hoge HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.54.0
> Accept: */*
> Content-Type: application/json
>
< HTTP/1.1 200
< Content-Type: application/json;charset=UTF-8
< Transfer-Encoding: chunked
< Date: Wed, 18 Jul 2018 00:52:47 GMT
<
* Connection #0 to host localhost left intact
{"name":"hoge"}%
```
