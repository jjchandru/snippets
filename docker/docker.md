### Docker commands for NGINX

* `docker pull nginx:1.17.5`
* `docker image ls`
* `docker run --name my-nginx -d -p 8085:80 nginx:1.17.5`
   * `run` - starts the container 
   * `--name` - provides an user defined name for the container 
   * `-d` - runs nginx in the background and get back the control to the prompt 
   * `-p` - specifies that port 80 of nginx needs to be mapped to 8085 port of machine in which it is running
   * `nginx` - denotes the image 
   * `1.17.5` is known as the tag that points to the respective software version

Nginx runs in port 80. Docker starts nginx is started in a separate environment, 
hence from EC2 instance we cannot connect using port 80 and we can only connect 
using port 8085. Check server running using below command:

`curl http://locahost:8085`

### Accessing nginx from browser
1. In browser, go to AWS > EC2 > Instances > Click on Instance Id > Click "Connect"
2. Copy the Server DNS Name from "Public IPv4 DNS" section
3. Try `http://[server-dns]:8085` in the browser, this will not access the server.

### Configure Security Group to enable inbound traffic
1. AWS > EC2 > Instances > Click on Instance Id
2. Click "Security" tab > Click link under "Security groups"
3. Under "Inbound" select "Edit Inbound Rules"
4. Click "Add rule"
5. Select "All traffic" in "Type"
6. In the source drop down select "My IP"
7. Click "Save rules"
8. Try `http://[server-dns]:8085` in the browser and check if it works

### Docker commands to view and manage containers
* `docker container ls`
* `docker stop my-nginx`
* `docker container ls`
* `docker container ls -a`
* `docker start my-nginx`

## Create NGINX container using Dockerfile
* Create new folder named 'nginx' in EC2 instance
* Change to the new folder
* Create a new file named `home.html` having some html content.
* Create new file named 'Dockerfile' using nano and add the below lines  
`FROM nginx:1.17.5`  
`COPY home.html /usr/share/nginx/html`  
* Run the following command to build the docker file:
`docker build -t nginx-df .`
* After execution of the above command, a new image can be found.
* Start that image using the following command:
`docker run -d -p 8085:80 nginx-df`
* Check if the nginx home page is accessible
* Check if home.html is accessible.

## Docker compose
* Install docker compose using the following command  
`apt install docker-compose`  
* Create a new file named `docker-compose.yml` in the nginx folder with content from docker-compose.yml from this folder.
* Run the following command to start:  
`docker-compose up`  
* Try accessing nginx from browser
