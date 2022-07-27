<div align="center">
    <img src="./assets/images/spring_boot_icon.png"/>
</div>

## Getting Started

## Project structure
```
.
├── auto-configuration
│   ...
├── docker-compose.yaml
|
└── README.md
```

## Start project
## Start project in local

- Clean and build
```shell script
$ ./mvnw clean package
...
[INFO] 
[INFO] Auto Configuration ................................. SUCCESS [  9.644 s]
[INFO] Parent ............................................. SUCCESS [  0.127 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  10.279 s
[INFO] Finished at: 2022-07-27T10:54:42+07:00
[INFO] ------------------------------------------------------------------------
```

- Run project

```shell script
$ cd auto-configuration
$ ../mvnw spring-boot:run
...
2022-07-27 10:55:36.215  INFO 6566 --- [           main] i.g.h.a.AutoConfigurationApplication     : Started AutoConfigurationApplication in 1.006 seconds (JVM running for 1.341)
Id: 1
Value: my value
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.490 s
[INFO] Finished at: 2022-07-27T10:55:36+07:00
[INFO] ------------------------------------------------------------------------
```

## Contribute

## Reference