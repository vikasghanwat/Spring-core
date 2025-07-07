Bean Post Processor:
-bean loading
-bean initialisation
postProcessbeforeInitialisation()   //LOG
-init()
postProcessAfterInitialisation()    //LOG
-custom methods
-destory()

-postProcessbeforeInitialisation()
it used to check if initialisation of bean is correct o not
it will always run before init() to make sure that evrything 
initialise correctly

-postProcessAfterInitialisation()
it will run after initialization done 
here we can log everything in init() method is correct or not
we can verify these things

in code we used both this method to catch logs