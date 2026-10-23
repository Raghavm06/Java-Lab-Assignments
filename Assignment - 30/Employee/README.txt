Assignment 30 - JSP CRUD Application

Folder structure:
- Employee/: employee CRUD pages
- Patient/: patient CRUD pages
- WEB-INF/db_password.txt: local MySQL password (keep private; do not commit)
- WEB-INF/lib/: put your MySQL Connector/J JAR here

Database: jdbc_demo
MySQL username: root
Tables required: employee_jsp and patient

Before running:
1. Ensure MySQL is running and database jdbc_demo exists.
2. Create the tables using the SQL script provided separately in this folder.
3. Put your mysql-connector-j JAR in WEB-INF/lib/.
4. Copy this Assignment30 folder into Tomcat's webapps directory.
5. Start Tomcat and visit:
   http://localhost:8080/Assignment30/Employee/index.jsp
   http://localhost:8080/Assignment30/Patient/index.jsp

Security: WEB-INF/db_password.txt contains your local password. Do not upload it to GitHub.
