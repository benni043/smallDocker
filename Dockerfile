FROM debian:latest

RUN apt update -y && apt install default-jdk -y

WORKDIR /app

COPY . /app

WORKDIR /app/src

RUN javac Main.java

ENTRYPOINT ["java", "Main"]