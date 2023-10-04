Please create a file named "application.properties" under the path src/main/resources/ with the text below:

spring.jpa.hibernate.ddl-auto=none // or can be "update", "create", "create-drop" or "validate" according to the environment. "none" is recommended as production
spring.datasource.url= // your database address
spring.datasource.username= // the name of your appointed MySQL user
spring.datasource.password= // the password of the user above
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver