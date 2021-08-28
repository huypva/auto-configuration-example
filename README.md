The example project for StringBoot service

<div align="center">
    <img src="./assets/images/hello-world.png"/>
</div>

## Getting Started

## Project structure
```
.
├── auto-configuration
│   ├── Dockerfile
│   ...
├── docker-compose.yaml
|
└── README.md
```

## Prerequisites
- Make sure that you have Docker and Docker Compose installed
  - Windows or macOS:
    [Install Docker Desktop](https://www.docker.com/get-started)
  - Linux: [Install Docker](https://www.docker.com/get-started) and then
    [Docker Compose](https://github.com/docker/compose)

## Start project
## Start project in local

- Clean and build
```shell script
mvn clean package
```

![Build](./assets/images/build.png)

- Run project
Go to auto-configuration director
```shell script
mvn spring-boot:run
```

```
Id: 1
Value: my value
```

## Contribute

## Reference