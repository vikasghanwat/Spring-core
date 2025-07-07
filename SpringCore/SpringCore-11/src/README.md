Bean interface

To achive modularity in code and in bean file
what ever common data or properties are there we can 
add those properties into separate bean tag and pass that tag
to the other child bean so they can use that

<bean id="student" class="com.mainapp.Student">
        <property name="countryCode" value="+91"> </property>
        <property name="countryName" value="INDIA"> </property>
        <property name="continental" value="ASIA"> </property>
    </bean>

    <bean id="employee" class="com.mainapp.Employee">
        <property name="countryCode" value="+91"> </property>
        <property name="countryName" value="INDIA"> </property>
        <property name="continental" value="ASIA"> </property>
    </bean>

    <bean id="client" class="com.mainapp.Client">
        <property name="countryCode" value="+91"> </property>
        <property name="countryName" value="INDIA"> </property>
        <property name="continental" value="ASIA"> </property>
    </bean>