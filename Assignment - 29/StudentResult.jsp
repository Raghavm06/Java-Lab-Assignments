<html><head><title>Student Result</title></head><body>
<h2>Student Information</h2>
<%
String name = request.getParameter("name");
String roll = request.getParameter("roll");
String course = request.getParameter("course");
%>
Name: <%= name %><br><br>
Roll Number: <%= roll %><br><br>
Course: <%= course %><br><br>
<a href="Student.jsp">Go Back</a>
</body></html>
