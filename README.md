# README

Based on [Servlets First Example](https://www.tutorialspoint.com/servlets/servlets-first-example.htm)

## Build

```
./build.sh
```

## PostgreSQL Connector

Copy the postgresql connector from https://jdbc.postgresql.org/download.html to to `/usr/local/opt/tomcat/libexec/webapps/ROOT/WEB-INF/lib`

```sh
mkdir -p /usr/local/opt/tomcat/libexec/webapps/ROOT/WEB-INF/lib
cp /Users/tung/src/java/lib/postgresql-42.2.1.jar /usr/local/opt/tomcat/libexec/webapps/ROOT/WEB-INF/lib
```

## Start Server

```sh
catalina run
```

For any changes and re-compilation of the HelloWorld.java requires restarting the server.
