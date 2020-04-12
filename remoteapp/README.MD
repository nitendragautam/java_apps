
## App to connect to removes server using jsch library
## Build the package

```bash
mvn package
```

## Running the App

```bash
java -cp ./target/remoteapp-1.0.jar com.nitendratech.remoteapp.RemoteAppMain ./src/main/resources/application.properties


```

## Properties File
```./src/main/resources/application.properties```

This file contains the credentials to connect to the server