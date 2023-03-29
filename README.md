# Spring Boot Login example with Spring Security, MySQL and JWT

- Appropriate Flow for User Login and Registration with JWT
- Spring Boot Rest Api Architecture with Spring Security
- How to configure Spring Security to work with JWT
- How to define Data Models and association for Authentication and Authorization
- Way to use Spring Data JPA to interact with MySQL Database


## Dependency
– use MySQL:


```xml
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <scope>runtime</scope>
</dependency>
```
## Configure Spring Datasource, JPA, App properties
Open `src/main/resources/application.properties`

- For MySQL
```
spring.datasource.url= jdbc:mysql://localhost:3306/testdb?useSSL=false
spring.datasource.username= root
spring.datasource.password= 

spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto= update

# App Properties
auth.app.jwtSecret= authSecretKey
auth.app.jwtExpirationMs= 86400000
```
## Run Spring Boot application
```
mvn spring-boot:run
```

## Run following SQL insert statements
```
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```


## React Login and Registration example with JWT and HttpOnly cookie

Build React JWT Authentication and Authorization example using React Hooks, React Router, Axios and Bootstrap (without Redux):
- JWT Authentication Flow for User Signup & User Login
- Project Structure for React Authentication (without Redux) with React Router & Axios
- Creating React Components with Form Validation using Formik and Yup
- React Pages for accessing protected Resources (Authorization)
- Dynamic Navigation Bar in React App



### Project setup

In the project directory, you can run:

```
npm install
# or
yarn install
```
yarn
or

### Compiles and hot-reloads for development

```
npm start
# or
yarn start
```

Open [http://localhost:8081](http://localhost:8081) to view it in the browser.
