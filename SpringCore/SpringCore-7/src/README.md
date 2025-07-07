This project is for creating init() and destroy() method
using annotation approach check xml file for configuration

init() - it used to create connection like db connection 
         it will run before custom utility method
       e.g - if my custom utility method has logic for create data
           then init() have the db connection and it run before utility
          so db related configuration already to push code into db

destroy() - it is used to destroy bean once after custom utility method
            run, and now we want to close the connection.