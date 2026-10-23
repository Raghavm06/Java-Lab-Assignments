<%@ page import="java.sql.*" %>
<%@ page import="java.nio.file.Files,java.nio.file.Path" %>
<html><head><title>Employee Result</title></head><body>
<%
String url = "jdbc:mysql://localhost:3306/jdbc_demo";
String user = "root";
String password = Files.readString(Path.of(application.getRealPath("/WEB-INF/db_password.txt"))).trim();
String action = request.getParameter("action");
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    try (Connection con = DriverManager.getConnection(url, user, password)) {
        if ("add".equals(action)) {
            try (PreparedStatement ps = con.prepareStatement("INSERT INTO employee_jsp (id, name, department, salary) VALUES (?, ?, ?, ?)")) {
                ps.setInt(1, Integer.parseInt(request.getParameter("id")));
                ps.setString(2, request.getParameter("name"));
                ps.setString(3, request.getParameter("department"));
                ps.setDouble(4, Double.parseDouble(request.getParameter("salary")));
                ps.executeUpdate(); out.println("Employee added successfully.");
            }
        } else if ("update".equals(action)) {
            try (PreparedStatement ps = con.prepareStatement("UPDATE employee_jsp SET name=?, department=?, salary=? WHERE id=?")) {
                ps.setString(1, request.getParameter("name")); ps.setString(2, request.getParameter("department"));
                ps.setDouble(3, Double.parseDouble(request.getParameter("salary"))); ps.setInt(4, Integer.parseInt(request.getParameter("id")));
                int rows = ps.executeUpdate(); out.println(rows > 0 ? "Employee updated." : "Employee not found.");
            }
        } else if ("delete".equals(action)) {
            try (PreparedStatement ps = con.prepareStatement("DELETE FROM employee_jsp WHERE id=?")) {
                ps.setInt(1, Integer.parseInt(request.getParameter("id"))); int rows = ps.executeUpdate();
                out.println(rows > 0 ? "Employee deleted." : "Employee not found.");
            }
        } else if ("view".equals(action)) {
            try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM employee_jsp")) {
                out.println("<h2>Employee Records</h2><table border='1'><tr><th>ID</th><th>Name</th><th>Department</th><th>Salary</th></tr>");
                while (rs.next()) out.println("<tr><td>"+rs.getInt("id")+"</td><td>"+rs.getString("name")+"</td><td>"+rs.getString("department")+"</td><td>"+rs.getDouble("salary")+"</td></tr>");
                out.println("</table>");
            }
        }
    }
} catch (Exception e) { out.println("Error: " + e.getMessage()); }
%>
<br><br><a href="index.jsp">Go Back</a></body></html>
