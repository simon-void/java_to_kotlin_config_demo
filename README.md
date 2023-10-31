## Configuration changes while converting a multi-module Maven project from Java to Kotlin

This is a demo project showcasing how to adapt the normal
[Kotlin-next-to-Java configuration](https://kotlinlang.org/docs/maven.html#compile-kotlin-and-java-sources)
to a project using Maven modules.

The base project was copied from [spring-guides/gs-multi-module](https://github.com/spring-guides/gs-multi-module) and
then adapted to the needs of this project.

This project exists in three versions/branches: **java_config**, **java_and_kotlin_config** and **kotlin_config** showcasing each step in the process of converting a Java project to Kotlin.

### how to build and start the app

```shell
./mvnw clean package && java -jar ./application/target/application-0.1.0-SNAPSHOT.jar
```
after having started to app, you can go to [http://localhost:8080/](http://localhost:8080/) to see a welcome message.