## Testing with Junit5 and Mockito


## Dependencies for Junit 5

Below two dependencies are needed for writing JUnit 5 Test Cases
```



 <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.jupiter.version}</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>${junit.jupiter.version}</version>
            <scope>test</scope>
        </dependency>
```


## Maven Surefire Plugin for running Test Cases

Below dependency needs to be added in the ```pom.xml```  build tag to
 run the JUnit tests through Maven. This plugin integrates the JUnit test cases with Maven.

```
 <plugins>
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
            </plugin>


        </plugins>

```
