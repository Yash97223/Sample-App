#!/bin/bash
echo "Starting the application..."
nohup java -jar demo-0.0.1-SNAPSHOT.jar > demo.log 2>&1 &
