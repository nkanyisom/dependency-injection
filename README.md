This is a Dependency Injection example.

reference: https://www.journaldev.com/2394/java-dependency-injection-design-pattern-example-tutorial


Java Dependency Injection design pattern allows us to remove the hard-coded dependencies and make our application loosely coupled, extendable and maintainable. We can implement dependency injection in java to move the dependency resolution from compile-time to runtime.

Java Dependency injection seems hard to grasp with theory, so we will take a simple example and then we will see how to use 
dependency injection pattern to achieve loose coupling and extendability in the application.

Benefits of Java Dependency Injection
Some of the benefits of using Dependency Injection in Java are:

Separation of Concerns
Boilerplate Code reduction in application classes because all work to initialize dependencies is handled by the injector component
Configurable components makes application easily extendable
Unit testing is easy with mock objects
Disadvantages of Java Dependency Injection
Java Dependency injection has some disadvantages too:

If overused, it can lead to maintenance issues because effect of changes are known at runtime.
Dependency injection in java hides the service class dependencies that can lead to runtime errors that would have been caught at compile time.



