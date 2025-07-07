Collection DI

setter DI to inject list

in this project we see constructor base dependency injection
to inject list from .xml file
we can pass list of data from xml file by default it used
Array list

below xml code to inject list/collection using default collection
class l.e ArrayList

    <bean id="employee" class="com.mainapp.Employee">
        <constructor-arg name="defaultListBooks">
             <list>
                <value>java</value>
                <value>paython</value>
                <value>AI</value>
              </list>
        </constructor-arg>
    </bean>

below code is use to inject through constructor DI but using custom
collection class

     <bean id="employee" class="com.mainapp.Employee">
        <constructor-arg name="defaultListBooks" ref="List">
        </constructor-arg>
    </bean>

      <util:list id="List" list-class="java.util.LinkedList">
          <value>java</value>
          <value>paython</value>
          <value>AI</value>
      </util:list>

we can inject any collection class by using above approach
also use our custom collection to inject