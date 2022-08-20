## Summary

![awesome-kotlin-springboot-multi-module](https://socialify.git.ci/heli-os/awesome-kotlin-springboot-multi-module/image?description=1&font=Inter&language=1&name=1&owner=1&stargazers=1&theme=Dark)

Basics for starting Kotlin SpringBoot Multi Module

## Overall Structure

```bash
Template
├── commons
│   ├── common-util
│   ├── health-check
│   ├── logback-appender
│   ├── model
│   └── persistence-database
├── application
│   ├── build.gradle.kts
│   └── src
├── build.gradle.kts
├── docker-build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```

하나의 프로젝트에 필요한 여러 애플리케이션(API, Batch, Kafka Consumer 등)과 이에 필요한 공통 모듈을 분리하여 효율적으로 운영할 수 있는 구조

- 공통 모듈: util, logback-appender, model, database, health-check
- 애플리케이션: application

## Features

### 1. 도커 이미지 빌드

애플리케이션 빌드 결과물을 도커 이미지로 생성 | `palantir.docker` 활용

```bash
./gradlew clean docker -p {{APPLICATION_NAME}} -x test
```

### 2. logback-appender

- APPLICATION_FILE: Application Log Standard Output
- JSON_FILE: JSON Log (generally Request & Response)
- (TBU)SENTRY_FILE: Appender for Sentry

## Dependencies

| Name           | Version              | Description | Repository | LICENSE |
|----------------|----------------------|-------------|------------|---------|
| Kotlin         | 1.6.21               | TBU         | TBU        | TBU     |
| SpringBoot     | 2.7.3                | TBU         | TBU        | TBU     |
| SpringBoot-WEB | 2.7.3                | TBU         | TBU        | TBU     |
| SpringBoot-AOP | Inherited SpringBoot | TBU         | TBU        | TBU     |
| SpringBoot-JPA | Inherited SpringBoot | TBU         | TBU        | TBU     |
| Mockk          | 1.12.1               | TBU         | TBU        | TBU     |
| StriKT         | 0.34.0               | TBU         | TBU        | TBU     |
