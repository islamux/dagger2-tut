# Dagger Annotations Explained
This README provides a beginner-friendly explanation of key annotations used in Dagger, a dependency injection framework.

Understanding Dependencies

Imagine you're building a house (your class). It requires various tools (dependencies) like a hammer, saw, and nails to get the job done. These dependencies might be other classes or objects needed by your class to function properly.

Dagger Annotations

Dagger helps manage these dependencies by using annotations to tell it what's needed and how to provide it. Here are some essential annotations:

# 1. @Inject and @Component

@Inject: This annotation marks a constructor or field in your class, indicating it needs an injection from Dagger. It's like telling the builder that a specific tool is required for the house construction.
@Component: This annotation marks an interface that defines how Dagger provides these dependencies. Think of it as a blueprint for creating a "toolbox" that holds all the necessary tools for building your house.
# 2. @Module and @Provides

Some dependencies might come from external libraries or frameworks that you don't directly control. Modules come in handy here:

@Module: This annotation identifies a class that tells Dagger how to provide these dependencies. Modules act like workshops that manufacture the tools needed for construction.
@Provides: This annotation is placed above a method inside a module. It defines the instructions for creating an instance of a dependency. It's like the specific steps on how to build a tool within the workshop.
# 3. @Component.Builder and @BindInstance

What if you need custom tools specific to your house (application) or the builder (user)? These annotations help:

@Component.Builder: This annotation creates a builder interface for your component. You can use this builder to customize which tools are included in the toolbox, just like specifying the exact tools needed for your house construction.
@BindInstance: This annotation is used within methods in the builder interface. It allows you to provide your own instance of a specific dependency, overriding what Dagger might provide by default. It's like bringing your own special tool for a particular task during construction.

# 4. @Singleton 
when i want to  create objects that exist as a single instance throughout the lifecycle of a specific component. 
@Singleton above the class that we own
@Singleton above the module that provide us with the class that we wont own.
