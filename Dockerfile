FROM debian:latest

RUN apt-get update && apt-get install -y openjdk-11-jdk

WORKDIR /app

COPY . /app

RUN javac Main.java

ENTRYPOINT ["java", "Main"]