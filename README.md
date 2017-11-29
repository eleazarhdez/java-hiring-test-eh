# Java hiring test

This project is the skeleton of a service that handles the attempts of the students.

This service is implemented with Spring Boot and configured with two controllers as endpoints
 to implement the business logic required in the [specs](Java-back-end-engineer-test-Contents.pdf).

## Configuration

We provide an [application.properties](src/main/resources/application.properties) file with the default configuration of the project,
and if necessary all extra configurations can be placed there.


## Execute
The application can be ran with just checking out the project.

```
./gradlew bootRun
```

This command will execute the application listening the 8989 port, and can be accessed via [http://localhost:8989/](http://localhost:8989/).

You can see in logs `c.v.digital.javahiringtest.Application   : Started Application in X seconds` to know when api is available. 

The default port can be configured at the configuration file.

## API Doc

As you could see, the API is documented with Swagger wich allows you to test the API using it's interface.
