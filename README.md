# SpringBoot-Mongo-docker


————Docker commands————

1. docker images;
2. docker pull mongo:latest
3. docker run -d -p 27017:27017 --name shivrajmongodb mongo:latest
4. docker ps
5.  docker build -t springboot-mongdb:1.0
6.  docker images 
7. docker run -p 8080:8080 --name springboot-mongdb --link shivrajmongodb:mongo -d springboot-mongdb:1.0
8. docker logs springboot-mongodb


1. docker exec -it shivrajmongodb bash
2. mongo 

1. docker rm  2016801b6fdf  || docker rm -f 2016801b6fdf

1. Cd Path of docker compose
2. docker-compose up
