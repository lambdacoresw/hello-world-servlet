#!/bin/bash -exu

export CLASSPATH=/usr/local/Cellar/tomcat/8.5.27/libexec/lib/servlet-api.jar
javac HelloWorld.java
mv HelloWorld.class /usr/local/opt/tomcat/libexec/webapps/ROOT/WEB-INF/classes/HelloWorld.class
