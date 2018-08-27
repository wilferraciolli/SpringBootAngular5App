This is a Spring 2 Angular 5 application.

It ses MySQL database to persist data. 


It queries the database for employees
Eg SQL 
```
CREATE TABLE employee(
    id        int auto_increment
                 primary key,
    email     varchar(255) not null,
    first_Name varchar(255) not null,
    last_Name  varchar(255) not null,
    phone     varchar(255) not null);
```