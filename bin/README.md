
# Level 1.2: Find the maximum of 2 numbers (Java)

## Table of Contents

- [Overview](#overview)
- [Learning Objectives](#learning-objectives)
- [Setup and Tutorial](#setup-and-tutorial)
- [Project Overview](#project-overview)
- [Submission Guidelines](#submission-guidelines)

## Overview

In this project, you will write a Java program that finds the maximum of two numbers. You will use the `Scanner` class to read input from the user and the `System.out.println` method to display the result.

## Learning Objectives

By the end of this project, you will be able to:

- Write a Java program that uses the `Scanner` class to read input from the user.
- Learn to use `System.out.println` method to display the result.
- Learn conditional `if` statement to compare two numbers and find the maximum.
- Learn the `else` statement to handle the case when the two numbers are equal.

## Setup and Tutorial

### 1. Setup

#### 1.1 Git and Github

To setup this project, please follow this simple git and github tutorial provided [here](https://github.com/Programming-Club-IAU/git-and-github)

#### 1.2 Java Development Kit (JDK)

To setup the Java Development Kit (JDK), please follow this simple tutorial provided [here (Windows)](https://github.com/pbelathur/setup-jde-using-chocolatey) or [here (Mac)](https://devqa.io/brew-install-java/)

### 2. Tutorial

#### 2.1 Java Scanner Class

The `Scanner` class is used to get user input, and it is found in the `java.util` package. To use the `Scanner` class, create an object of the class and use any of the available methods found in the `Scanner` class.

Here is an example of how to use the `Scanner` class to read input from the user:

```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
```

#### 2.2 Java Conditional Statements

Java supports the usual logical conditions from mathematics:

- Less than: `<`
- Less than or equal to: `<=`
- Greater than: `>`
- Greater than or equal to: `>=`
- Equal to: `==`
- Not equal to: `!=`
- Logical AND: `&&`
- Logical OR: `||`
- Logical NOT: `!`

Java has the following conditional statements:

- Use `if` to specify a block of code to be executed, if a specified condition is true
- Use `else` to specify a block of code to be executed, if the same condition is false
- Use `else if` to specify a new condition to test, if the first condition is false

Here is an example of how to use the `if` statement to compare two numbers and find the maximum:

```java
public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    if (x > y) {
      System.out.println("x is greater than y");
    }
  }
}
```

Here is an example of how to use the `else` statement to handle the case when the two numbers are equal:

```java
public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 10;

    if (x > y) {
      System.out.println("x is greater than y");
    } else if (x < y) {
      System.out.println("x is less than y");
    } else {
      System.out.println("x is equal to y");
    }
  }
}
```

## Project Overview

Your task is to write a Java program that finds the maximum of two numbers. You will use the `Scanner` class to read input from the user and the `System.out.println` method to display the result.

### Requirements

- The program should prompt the user to enter two numbers.
- The program should use the `Scanner` class to read the two numbers from the user.
- The program should use the `if` statement to compare the two numbers and find the maximum.

### Bonus

- The program should use the `else` statement to handle the case when the two numbers are equal.
- The program should use the `System.out.println` method to display the result.
- The program should have a pretty output to the console (Use some ascii art to make it look cool!)

## Submission Guidelines

- The app should be pushed to Github and a pull request should be created. You can check how to push your code to Github in section [2.1.2 Add Changes](https://github.com/Programming-Club-IAU/git-and-github#212-add-changes).
- The pull request title should be in the following format: `<your-name> - <project-name>`. You can check how to make a pull request in section [2.1.5. Create a pull request](ttps://github.com/Programming-Club-IAU/git-and-github#215-create-a-pull-request).
- The pull request description should contain the following:
  - A description of your project.
  - A screenshot of the app.
