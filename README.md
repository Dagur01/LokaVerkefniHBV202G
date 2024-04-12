# HBV202GAssignment5
A very simple implementation of a stack for storing integer numbers to be tested using JUnit4.

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands when you `git clone` it. The provided Maven POM includes the JUnit4 dependency. The POM sets the Java version to 17: you may need to downgrade it if you use an older JDK.

**Note that the POM includes version 4.11 of JUnit 4 which has a vulnerability:** while the vulnerable rule (see https://www.cve.org/CVERecord?id=CVE-2020-15250) is not used, it is part of the assignment to **update the version to 4.13.2**.

Both the implementation and the tests are in Java package `is.hi.hbv202g.ass5`,
but in the usual separate Maven `src` directories:

- `src/main/java`:
    - `IntStack.java`: Implementation of a simple stack.
    - `IntStackMain.java`: A class with a main method demonstrating some sample usage of the stack.

- `src/test/java`:
    - `IntStackTest.java`: A skeleton for a class containing JUnit4 test cases for the `IntStack` class, containing one sample test case.

# Maven:

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, `Tests`, or `TestCase` -- in our case, this will match `IntStackTest`).

# POM:

- Supports to execute the MAIN method
- <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <version>3.0.0</version>
        <configuration>
          <mainClass>is.hi.hbv202g.ass5.IntStackMain</mainClass>
        </configuration>
      </plugin>


# License:

- License site: [MIT](https://spdx.org/licenses/MIT.html)