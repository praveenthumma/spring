# Initializing using Bean Factory (Deprecated way)
## 

> Create a file spring.xml in the project and add the required beans (see below example)
> Initialize XmlBeanFactory( now deprecated)
> pass the spring.xml as FileSystemResource



## Usage
### Spring xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- bean definitions here -->
    
<bean id="alien" class="com.tp.UnderstandingBeanFatcory.Alien" ></bean>
</beans>
```

### Java code

```java
    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	Alien obj = (Alien)factory.getBean("alien");    	
    	obj.code();
```


# Initializing using ApplicationContext 

> Create a file spring.xml and add  required beans (see below example) and __add it to classpath__
> Initialize ClassPathXmlApplicationContext
> pass the spring.xml

```java    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	Alien obj = (Alien)factory.getBean("alien");    	
    	obj.code();
```

# Spring Container
> - Application context will create a spring container
> - In the JVM where this code runs , Spring creates a Spring Container
> - This container contains beans mentioned in spring.xml
> - The moment the below line is run , It creates  the beans specified in spring.xml


```java
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
```

> - __By default all the beans will be a singleton__
> - If you want to change the scope use the scope tag in the spring xml.

```xml    
<bean id="alien" class="com.tp.UnderstandingBeanFatcory.Alien" scope="prototype" ></bean>

```

# Setter Injection
> - you can inject values to your bean at the time of bean definition.

```xml
	<bean id="alien" class="com.tp.UnderstandingBeanFatcory.Alien">
		<property name="age" value="10"></property>
		<property name="value" value="20"></property>
	</bean>
```

# Ref Attribute
> - You can inject other classes to your bean at the time of definition

```xml
	<bean id="alien" class="com.tp.UnderstandingBeanFatcory.Alien">
		<property name="age" value="10"></property>
		<property name="value" value="20"></property>
		<property name="laptop" ref="laptop"></property>
	</bean>
	<bean id="laptop" class="com.tp.UnderstandingBeanFatcory.Laptop"></bean>
```
# Constructor injection
> - You can inject values to the constructor at the time on bean initilization.
> - Constructor arguments should match the constructor defined in the class.
> - Only initialize necessary values

```xml
	<bean id="alien" class="com.tp.UnderstandingBeanFatcory.Alien">
		<constructor-arg  name="age" value="10" ></constructor-arg>
		<constructor-arg  name="laptop" ref="laptop" ></constructor-arg>		
		<property name="age" value="10"></property>
		<property name="value" value="20"></property>
		<property name="laptop" ref="laptop"></property>
	</bean>
	<bean id="laptop" class="com.tp.UnderstandingBeanFatcory.Laptop"></bean>
	
```

# Primary property
> - You dont always need to mention property name if you set autowire to __byType__ spring will automatucally pick the class by type
> - You can use the primary property set to true to specify the preperence when multiple candidates are qualified to autowire.

```xml
	<bean id="alien" class="com.tp.UnderstandingBeanFatcory.Alien" autowire="byType">
		
		<property name="age" value="10"></property>
		<property name="value" value="20"></property>
<!--  <property name="com" ref="com"></property>  -->
	</bean>
		
  	<bean id="com" class="com.tp.UnderstandingBeanFatcory.Laptop" primary="true"></bean> 
  	<bean id="desktop" class="com.tp.UnderstandingBeanFatcory.Desktop"></bean>

```
