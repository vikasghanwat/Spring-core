Collection DI

setter DI to inject list

in this project we see setter base dependency injection
to inject list from .xml file
we can pass list of data from xml file by default it used
Array list

below code is to perform SETTER DI default it use Arraylist
<bean id="employee" class="com.mainapp.Employee">
        <property name="defaultListBooks">
            <list>
                <value>java</value>
                <value>paython</value>
                <value>AI</value>
            </list>
        </property>
    </bean>


below code is to perform SETTER DI with custom list

<!--STANDALONE LIST-->

    <bean id="employee" class="com.mainapp.Employee">
        <property name="defaultListBooks" ref="List">
        </property>
    </bean>

    <util:list id="List" list-class="java.util.LinkedList">
        <value>java</value>
        <value>paython</value>
        <value>AI</value>
    </util:list>