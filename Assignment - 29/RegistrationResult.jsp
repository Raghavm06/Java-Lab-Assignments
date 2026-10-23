<html><head><title>Registration Result</title></head><body>
<h2>Registration Successful</h2>
<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
%>
Name: <%= name %><br><br>
Email: <%= email %><br><br>
Phone Number: <%= phone %><br><br>
<a href="Registration.jsp">Go Back</a>
</body></html>
