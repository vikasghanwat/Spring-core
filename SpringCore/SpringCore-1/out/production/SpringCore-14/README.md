Autowiring

inject a dependency automatically called autowiring
types:
1. byName
2. byType
3. autoDetect (depricated from spring ver 3.x)
4. constructor

this project we used byName autowiring 

In case of byName if there are two bean available and we are looking for single bean then
we can disqualify a bean by using autowire-candidate="false", still it
available for manual injection and autowire byName injection