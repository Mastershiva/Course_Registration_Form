📘 Course Registration Form (Java Servlet + JSP + Tomcat)
This project is a simple Course Registration Web Application built using:

Java Servlet
JSP
JDBC
MySQL
Apache Tomcat 10
MVC Architecture

✅ Features

✔ Register a student into database
✔ Stores Name, Email, Contact, Course, Comments
✔ Validations on form
✔ Displays a success message:
"Hey (name), Registration Successful!"

🏗 Tech Stack
Java
Servlet API
JSP
MySQL
Tomcat 10
JDBC

📂 Project Modules
Employee.java
EmployeeDao.java
EmployeeDaoImpl.java
DBConnection.java
RegisterServlet.java
index.html

📂 Project Structure

Course_Registration_Form/
├── src/
│ ├── com.tap.model/Employee.java
│ ├── com.tap.dao/EmployeeDao.java
│ ├── com.tap.daoimpl/EmployeeDaoImpl.java
│ ├── com.tap.util/DBConnection.java
│ └── com.tap/RegisterServlet.java
│
└── WebContent/
├── index.html
└── WEB-INF/web.xml

---

 🗄 Database Table (MySQL)

sql
CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    email VARCHAR(100),
    contact VARCHAR(20),
    course VARCHAR(50),
    comments VARCHAR(255)
);

🔧 How to Run
Import the project into Eclipse
Configure Apache Tomcat 10
Create MySQL table
Run on Server

Open:
http://localhost:8080/Course_Registration_Form/index.html

🤝 Author
Shiva Narayanan S
B.Tech IT | Software Developer

⭐ Show Support

If you like this project, give it a ⭐ on GitHub!
