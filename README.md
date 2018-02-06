
```sh
export CLASSPATH=/usr/local/Cellar/tomcat/8.5.27/libexec/lib/servlet-api.jar
javac HelloWorld.java
mv HelloWorld.class /usr/local/opt/tomcat/libexec/webapps/ROOT/WEB-INF/classes/HelloWorld.class
cp /usr/local/opt/tomcat/libexec/webapps/ROOT/WEB-INF/web.xml{,.bak}
cp web.xml /usr/local/opt/tomcat/libexec/webapps/ROOT/WEB-INF/web.xml
```


export CLASSPATH=/Users/tung/src/java/lib/postgresql-42.2.1.jar:/usr/local/Cellar/tomcat/8.5.27/libexec/lib/servlet-api.jar


mkdir -p /usr/local/opt/tomcat/libexec/webapps/ROOT/WEB-INF/lib/
cp /Users/tung/src/java/lib/postgresql-42.2.1.jar /usr/local/opt/tomcat/libexec/webapps/ROOT/WEB-INF/lib/
