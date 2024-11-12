# What is Java?
- Java is a programming `language` and a `platform`. 
- Java is a high level, robust, object-oriented and secure programming language.

# Language:
- Java is a high level language, which means it is close to human language.

# Platform:
 - Every hardware or software is run in environment, known as platform.
   Since Java have it's own running environment and API, it is known as platform.


# History:
1. Java was developed by Sun Microsystems(1995)
2. James Gosling is known as the father of Java.
3. Java was initially called Oak.
4. Later the project went by the name Green and was finally renamed Java, from Java coffee.



# Application:
- Java is used in developing:
  1. Mobile applications
  2. Web applications
  3. Desktop applications
  4. Web servers and application servers
  5. Games
  6. Database connection
  7. And much more.

# Types of Java Applications:
1. Standalone Application
2. Web Application
3. Enterprise Application
4. Mobile Application

# Java Features:
1. `Simple`:
    - It is easy to learn and understand.

2. `Object-Oriented`:
    - Java is object-oriented programming language, which supports the concept of objects.
    - Java is not 100% object oriented because it uses primitive data types.
    So, it is a true object-oriented programming language.

3. `Platform Independent`:
    - Java is platform independent, which means it can run on any platform.
    - It is achieved by using JVM (Java Virtual Machine).

4. `Secure`:
  - Java is secure because it does not use explicit pointers.
    It has a security manager which defines the access of classes.

  - Security over C++:
    1. No explicit pointer
    2. Java programs run inside JVM sandbox
    3. Classloader: It is used to load classes and interfaces.

5. `Robust`:
- Java is robust because:
    1. It uses strong memory management.
    2. There is no explicit pointer.
    3. Exception handling and type checking mechanism.

6. `Architecture Neutral`:
- Java is architecture neutral because:
  1. Compiler generates an architecture-neutral object file format.
  2. Compiled code is executable on many processors, given the presence of JVM on the target system.

7. `Portable`:
  - Java is portable because:
    1. It is platform independent.
    2. It is not dependent on the hardware.
    3. It is not dependent on the operating system.

8. `High Performance`:
    - Java is faster than traditional interpretation since byte code is "close" to native code.
    - It is still slower than a compiled language like C++.
    but, Java is faster than traditional interpretation.

9. `Distributed`:
- Java is distributed because:
    1. RMI and EJB are used for creating distributed applications.
    2. It supports the TCP/IP protocol.

- What is RMI?
    - RMI stands for Remote Method Invocation.
    - It is a mechanism that allows an object residing in one system to invoke methods on an object residing in another system.
    
- What is EJB?
    - EJB stands for Enterprise Java Beans.
    - It is a server-side component that encapsulates the business logic of an application.

10. `Dynamic`:
 - Java is dynamic because:
    1. It supports dynamic loading of classes.
    2. It supports functions from the libraries.

11. `Interpreted`:

    Java is interpreted because:
    1. Byte code is translated on the fly to native machine instructions and is not stored anywhere.
    2. The development process is more rapid and analytical since the linking is an incremental and light-weight process.

12. `Multithreaded`:

    Java is multithreaded because:
    1. It supports multiple threads of execution.
    2. It is possible to write programs that can perform many tasks simultaneously.

13. `Automatic Memory Management`:

    Java has an automatic garbage collector that runs in the background to clean up the unused objects.

14. `High Performance`:

    - Java is faster than traditional interpretation since byte code is "close" to native code.
    -  It is still slower than a compiled language like C++.
    but, Java is faster than traditional interpretation.


# Compilation and Execution:
- Java is compiled and interpreted language.

   - Steps from program undergoes for execution:
        1. Java source code is written in a text file with .java extension.
        2. The source code is compiled by the Java compiler into bytecode.
        3. The bytecode is saved in a .class file.
        4. The bytecode is executed by the JVM (Java Virtual Machine).
- Inside JVM, the bytecode is first loaded via ClassLoader.
- Then, the bytecode is verified by Bytecode Verifier.
- Then, the bytecode is executed by the Interpreter.


# Java Virtual Machine (JVM):
- JVM is an abstract machine that provides a runtime environment in which Java bytecode can be executed.
  - It is a part of the Java Run Environment (JRE).
    -  It is responsible for executing the bytecode.
    - It provides a runtime environment.
    - It provides a set of libraries.
    - It is platform dependent.
    - It is a specification that must be implemented.

    `JRE = JVM + Java Packages Classes(Core Libraries)`
    
    Inside JVM there are three main components:
    1. ClassLoader
    2. Bytecode Verifier
    
    Before Interpretation the entire code during compilation 
    Just in time compiler (JIT) is used to compile the portion of the code that is used most frequently.
    then it is stored in the cache memory.

    Interpreter is used to execute the remaining code.

# Java Development Kit (JDK):
- JDK is a software development kit used to develop Java applications.
- It is a superset of JRE.
-  It contains JRE + Development tools.
-  It is used to compile and run Java programs.

 ` JDK = JRE + Development Tools`

  `JRE = JVM + Library Classes`

 ` JVM = ClassLoader + Bytecode Verifier + Interpreter`

# Java Program undergoes in 5 steps:
-  Java Source Code
- Java Compiler (Javac)
- ClassLoader load the class file(class file contains bytecode)
- Bytecode Verifier
- Interpreter

Java SDK(Software Development Kit) is a combination of:
1. JRE (Java Runtime Environment)
2. Java Development Tools
    - javac : Java Compiler
    ```
    javac filename.java
    ```
    - java  : Java Interpreter
    ```
    java filename
    ```
    - javadoc : Java Documentation Generator
    ```
    javadoc filename.java
    ```

    - jar : Java Archive
    ```
    jar -cvf filename.jar filename.class
    jar -xvf filename.jar
    ```
    - javap : Java Disassembler(decompile the class file)
    ```
    javap filename.class
    ```
    

3. Java Libraries



