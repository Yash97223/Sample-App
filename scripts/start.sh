#!/bin/bash
echo "Starting the application..."
nohup java -jar /home/ec2-user/demo.jar > /dev/null 2>&1 &
