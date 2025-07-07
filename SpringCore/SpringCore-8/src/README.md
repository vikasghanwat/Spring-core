BEAN FACTORY

till now we used <bean> tag to create bean but for custom bean

if we want to create custom bean means depending on some logic
then we cant do that in .xml file so spring provide alternative for 
that we can write custom obj creation logic into
static method and pass that method name into .xml "factory-method" into <bean>

this way we can create our own custom bean based on some logic

