# [JUnit Framework](https://junit.org/)

- Open-source testing framework for Java programmers
- Used to create test cases (to ensure that the program logic is right and works as expected)
- org.unit package consists of several interfaces & classes: Assert, Test, Before, After, etc.
- Two types: 
  - Manual (No tool support, time-consuming and less reliable)
  - Automated (Uses a tool support, quicker and more reliable)
- Dependency - JAR Files: junit4.jar & hamcrest-core.jar
 

## Annotations

JUnit version 4.x is ‘Annotations-based’. The following are some of the commonly used annotations while writing unit test cases:

```java
@Test // To specify that the corresponding method is the 'test method' (the method under consideration)

@Test(timeout = 1000) // If the method takes more than (1000 milliseconds ~ 1 second), it will fail

@BeforeClass // This method will be invoked before starting all the tests. This is done only once.

@Before // This method will be invoked before each test

@After // This method will be invoked after each test

@AfterClass // This method will be invoked after all the tests are complete. This is done only once. 
```

## Assert Class

```java

void assertEquals(boolean expected, boolean actual) // Asserts if the two parameters (primitives / objects) are one and the same

void assertTrue (boolean condition) // Asserts if the condition is TRUE

void assertFalse (boolean condition) // Asserts if the condition is FALSE

void assertNull (Object obj) // Asserts if the object 'obj' is NULL

void assertNull (Object obj) // Asserts if the object 'obj' is NOT NULL
```
