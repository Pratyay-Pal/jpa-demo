# jpa-demo

Uses more recent APIs to connect to Database.<br>
Exploration of CRUD operations using Spring JDBC, Spring JPA, and Spring Data JPA.


#### How to use?
1. Run the SQL scripts present in src/main/resources/SQL/Schema against any database. This will create the table.
2. Run the SQL scripts present in src/main/resources/SQL/Data against any database. This will create the data for the tables.
3. Run the application.
4. Profit

#### Accessing the endpoints
Hit **http://localhost:8080/endpoint** with details to do Database operations.<br><br><br>
**endpoint** can be as follows. Note the endpoints are divided into 3 categories utilizing the 3 different approaches.<br><br>

<b>/SpringJDBC/insert</b> - Insert Operation using Spring JDBC<br>
<b>/SpringJDBC/update</b> - Update Operation using Spring JDBC<br>
<b>/SpringJDBC/delete</b> - Delete Operation using Spring JDBC<br>
<b>/SpringJDBC/select</b> - Select Operation using Spring JDBC<br>
<br><br>
<b>/JPA/insert</b> - Insert Operation using JPA specifications<br>
<b>/JPA/update</b> - Update Operation using JPA specifications<br>
<b>/JPA/delete</b> - Delete Operation using JPA specifications<br>
<b>/JPA/select</b> - Select Operation using JPA specifications<br>
<br><br>
<b>/SpringJDBC/insert</b> - Insert Operation using Spring Data JPA<br>
<b>/SpringJDBC/update</b> - Update Operation using Spring Data JPA<br>
<b>/SpringJDBC/delete</b> - Delete Operation using Spring Data JPA<br>
<b>/SpringJDBC/select</b> - Select Operation using Spring Data JPA<br>