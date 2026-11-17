# SOFTENG 281 – Maven Demo

[![Open in GitHub Codespaces](https://github.com/codespaces/badge.svg)](https://codespaces.new/DigitalEdu-Websites/softeng281-maven-demo?quickstart=1)

A tiny Maven project for practising the Maven wrapper commands.

Click the button above to open it in your browser (no installs needed), then use the terminal at the bottom:

```
./mvnw compile
./mvnw test
./mvnw clean
```

1. `./mvnw compile` fails. Read the output and fix the **compilation error** in `src/main/java/Basics.java`.
2. `./mvnw test` fails. Read the output and fix the **logic mistake** in `src/main/java/Basics.java`.
   Don't change `src/test/java/TestSuite.java`. The test is correct!
3. `./mvnw clean` deletes the generated `target` folder.

On Windows (on your own machine), use `.\mvnw.cmd` instead of `./mvnw`.
