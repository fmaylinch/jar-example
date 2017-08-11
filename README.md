
# JAR file Example

In this example, we have a simple project where we will use a library.
First we will package the library as a JAR file and then use it from the project.
Finally, some notes about using Maven with a standalone JAR file.

## Library

`cd library`

Compile the util Java files and put the classes into `out`:
```
javac -d out src/com/codethen/util/StringUtil.java
```

Note: First `mkdir out` if it doesn't exist.

Create jar file with everything in the `out` folder:
```
jar cvf util.jar -C out .
```

List files to make sure:
```
unzip -l util.jar
```


## Project

`cp library/util.jar project/libs`

`cd project`

Compile the project Java files, referencing the library:
```
javac -cp libs/util.jar -d out src/com/codethen/Main.java
```

Note: First `mkdir out` if it doesn't exist.

Execute the program specifying project classes and library:
```
java -cp out:libs/util.jar com.codethen.Main hello 5
```


## Maven

Install jar in Maven local repository ([execute mvn install jar file](https://www.google.com/search?q=mvn+install+jar+file)):
```
mvn install:install-file -Dfile=util.jar -DgroupId=com.codethen -DartifactId=simple-util -Dversion=1.0 -Dpackaging=jar
```

From IntelliJ ([execute mvn command intellij](https://www.google.com/search?q=execute+mvn+command+intellij))
- Don't say `mvn`, just the arguments
- Use absolute path to jar: e.g. `/Users/fmaylinch/dev/codethen/jar-example/library`
