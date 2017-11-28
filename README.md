# Java hiring test

This project is the skeleton of a service that handles the attempts of the students.

This service is implemented with Spring Boot and configured with two controllers as endpoints
 to implement the business logic required in the specs.

As defined in the [test description](Java-back-end-engineer-test-Contents.pdf), this service must be decoupled from other services, 
for this reason, a stub of the `Book Structure Service` is provided, [StubBookStructureService](src/main/java/com/vicensvives/digital/javahiringtest/services/bookstructure/StubBookStructureService.java).

This will help you to navigate through the structure of the books without having to think about it's model.

This is the structure created in [StubBookStructureService](src/main/java/com/vicensvives/digital/javahiringtest/services/bookstructure/StubBookStructureService.java):

```
+-- Unit 1 = 9f50d492-03fe-4e42-8717-c3ce87650dd2
|   +-- Section A = 9e1b818d-7b9d-43ef-b5da-0771de057e81
|       +-- Activity 1 = 4e405905-91b4-49a9-8fe7-1574cea01580
|       +-- Activity 2 = 3cafb913-cf92-4aa9-8a83-6be5c3f05c43
|   +-- Section B = 31011407-974f-4aaf-a153-c00991c2e6a7
|       +-- Activity 1 = 9a1b3747-af98-481c-ac24-33544200f8b0
|       +-- Activity 2 = 9838997b-5e07-43e1-9cce-0a75dd27fcd5
```


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
