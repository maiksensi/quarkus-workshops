#!/usr/bin/env bash

cd ..
cd rest-fight/
./mvnw clean package -DskipTests && docker build -f src/main/docker/Dockerfile.jvm -t quarkus-workshop-fight .
cd ..
cd rest-hero/
./mvnw clean package -DskipTests && docker build -f src/main/docker/Dockerfile.jvm -t quarkus-workshop-hero .
cd ..
cd rest-villain/
./mvnw clean package -DskipTests && docker build -f src/main/docker/Dockerfile.jvm -t quarkus-workshop-villain .
cd ..
cd ui-super-heroes/
docker build -t quarkus-workshop-ui .
cd ..
cd infrastructure/
