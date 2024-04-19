# Lokaverkefni HBV202G
Verkefnið heitir AudioPlayer og hægt er að skrá sig inn og hlusta á lög.

**Note that the POM includes version 4.11 of JUnit 4 which has a vulnerability:** while the vulnerable rule (see https://www.cve.org/CVERecord?id=CVE-2020-15250) is not used, it is part of the assignment to **update the version to 4.13.2**.



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
