<%@ page import="java.sql.*" %>
<html><head><title>Patient Result</title></head><body>
<%
String url = "jdbc:mysql://localhost:3306/jdbc_demo";
String user = "root";
String password = "YOUR_MYSQL_PASSWORD";
String action = request.getParameter("action");
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, user, password);
    if ("add".equals(action)) {
        PreparedStatement ps = con.prepareStatement("INSERT INTO patient VALUES (?, ?, ?, ?, ?)");
        ps.setInt(1, Integer.parseInt(request.getParameter("id")));
        ps.setString(2, request.getParameter("name"));
        ps.setInt(3, Integer.parseInt(request.getParameter("age")));
        ps.setString(4, request.getParameter("disease"));
        ps.setString(5, request.getParameter("status"));
        ps.executeUpdate();
        out.println("Patient added successfully.");
        ps.close();
    } else if ("update".equals(action)) {
        PreparedStatement ps = con.prepareStatement("UPDATE patient SET name=?, age=?, disease=?, treatment_status=? WHERE patient_id=?");
        ps.setString(1, request.getParameter("name"));
        ps.setInt(2, Integer.parseInt(request.getParameter("age")));
        ps.setString(3, request.getParameter("disease"));
        ps.setString(4, request.getParameter("status"));
        ps.setInt(5, Integer.parseInt(request.getParameter("id")));
        int rows = ps.executeUpdate();
        out.println(rows > 0 ? "Patient updated." : "Patient not found.");
        ps.close();
    } else if ("delete".equals(action)) {
        PreparedStatement ps = con.prepareStatement("DELETE FROM patient WHERE patient_id=?");
        ps.setInt(1, Integer.parseInt(request.getParameter("id")));
        int rows = ps.executeUpdate();
        out.println(rows > 0 ? "Patient deleted." : "Patient not found.");
        ps.close();
    } else if ("view".equals(action)) {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM patient");
        out.println("<h2>Patient Records</h2><table border='1'><tr><th>ID</th><th>Name</th><th>Age</th><th>Disease</th><th>Status</th></tr>");
        while (rs.next()) {
            out.println("<tr><td>" + rs.getInt("patient_id") + "</td><td>" + rs.getString("name") + "</td><td>" + rs.getInt("age") + "</td><td>" + rs.getString("disease") + "</td><td>" + rs.getString("treatment_status") + "</td></tr>");
        }
        out.println("</table>");
        rs.close();
        st.close();
    }
    con.close();
} catch (Exception e) {
    out.println("Error: " + e.getMessage());
}
%>
<br><br><a href="index.jsp">Go Back</a>
</body></html>
