The example project for StringBoot service

<div align="center">
    <img src="./assets/images/spring_boot_icon.png"/>
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
$ ./mvnw clean package
```

![Build](./assets/images/build.png)

- Run project

```shell script
$ cd  spring-boot-auto-configuration
$ ../mvnw spring-boot:run
...
2021-09-08 14:41:40.873  INFO 10417 --- [           main] i.c.a.AutoConfigurationApplication       : Started AutoConfigurationApplication in 1.789 seconds (JVM running for 2.367)
Id: 1
Value: my value
```

Output:

```
Id: 1
Value: my value
```

## Contribute

## Reference