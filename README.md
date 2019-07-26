# Nerdulator - Java

This is the java implementation of the nerdulator nerd.vision calculator demo API.

## Build

To build use maven:

```bash
mvn clean package
``` 

Then build the dockerfile.

```bash
docker build -t nerdulator/java .
```

## Run

To run the API use docker-compose

```bash
docker-compose up
```

## Configure

To configure the agent, change the NV_API_KEY key in the Dockerfile.