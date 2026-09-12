# Test Generator using Builder Pattern


## Project Description

This project demonstrates the Builder Design Pattern in Java.

The main idea of the project is to create a Test object step by step instead of using a large constructor with many parameters.

The Test Generator allows users to create different types of tests by setting:
- test title
- subject
- difficulty level
- number of questions
- time limit
- question type


## Design Pattern

The project uses the Builder Pattern.

Builder Pattern is useful when an object has many parameters and needs to be created in different configurations.

In this project:

- Test is the Product class that stores test information.
- TestBuilder is responsible for creating the Test object step by step.
- TestDirector creates predefined test configurations.
- Main class demonstrates how the builder works.


## Project Structure


## How It Works

First, the builder receives different test parameters using setter methods.

Example:

After all required information is added, the build() method creates the final Test object.


## Clean Code Principles Used


### 1. Meaningful Names

All classes, methods and variables have clear names.

For example:

`numberOfQuestions`

shows the purpose of the variable better than using unclear names.


### 2. Single Responsibility

Each class has its own responsibility:

- Test stores information about the test.
- TestBuilder creates objects.
- TestDirector manages predefined configurations.
- Main runs and checks the program.


### 3. Small Methods

Methods perform only one specific task.

For example:

- setTitle()
- setSubject()
- build()


### 4. Validation

The build() method checks required fields before creating an object.

If important information is missing, the program shows an error message.


### 5. Method Chaining

Builder methods return the same builder object, which allows creating objects in a readable way.


## Technologies

- Java
- IntelliJ IDEA
- Maven


## Author

Student project for Software Design Patterns course.