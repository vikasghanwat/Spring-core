Autowiring

inject a dependency automatically called autowiring
types:
1. byName
2. byType
3. autoDetect (depricated from spring ver 3.x)
4. constructor

this project we used byType autowiring 

in byType IOC check the type of that filed and inject directly bean name can be anything here
if we have multiple bean with same type it will throw error
l.e-> NoUniqueBeanDefinitionException: No qualifying bean of type 'com.mainapp.Account' 
available: expected single matching bean but found 2: bean1,bean2

we can disqualify bean using <bean id="bean2" class="com.mainapp.Account" C>

In case of byName if there are two bean available and we are looking for single bean then
we can disqualify a bean by using autowire-candidate="false", still it
available for manual injection and autowire byName injection


if we have multiple bean with same type so instead of doing <bean id="bean2" class="com.mainapp.Account" autowire-candidate="false">
for all we can do one thing the bean which we want inject we can use below tag <bean id="bean1" class="com.mainapp.Account" primary="true">
in this case IOC directly inject primary=true bean 