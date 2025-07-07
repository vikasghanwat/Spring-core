Autowiring

inject a dependency automatically called autowiring
types:
1. byName
2. byType
3. autoDetect (depricated from spring ver 3.x)
4. constructor

this project we used constructor autowiring 

constructor(byType>byName)
while injecting dependency via constructor it will first check with byType then byName
and inject if anyone of these fields all filed which we are injecting from bean is failed l.e all are null

