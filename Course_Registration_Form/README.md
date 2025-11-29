# Course_Registration_Form

Simple Java Servlet + JDBC Course Registration application.

## Project Structure

- src/com/tap (RegisterServlet)
- src/com/tap/model (Employee.java)
- src/com/tap/dao (EmployeeDao.java)
- src/com/tap/daoimpl (EmployeeDaoImpl.java)
- WebContent/index.html
- WebContent/WEB-INF/web.xml

## Setup

1. Create MySQL database and table:

```sql
CREATE DATABASE course_db;
USE course_db;
CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    contact VARCHAR(20),
    course VARCHAR(100),
    comments VARCHAR(255)
);
```

2. Update DB credentials in `src/com/tap/daoimpl/EmployeeDaoImpl.java`.

3. Add `mysql-connector-j-8.x.x.jar` into `WebContent/WEB-INF/lib`.

4. Import project into Eclipse as **Dynamic Web Project** or **Existing Project**.

5. Run on Tomcat 10+.

## Notes
- Servlet mapping: `/register`
- Form posts to `/register` with method POST.
