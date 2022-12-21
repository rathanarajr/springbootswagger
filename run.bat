docker build --tag=boot-swagger:latest .

docker run -p8887:8080 boot-swagger:latest