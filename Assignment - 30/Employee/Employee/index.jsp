<html><head><title>Employee Management</title></head><body>
<h2>Employee Management System</h2>
<form action="EmployeeAction.jsp" method="post">
Employee ID: <input type="number" name="id" required><br><br>
Name: <input type="text" name="name" required><br><br>
Department: <input type="text" name="department" required><br><br>
Salary: <input type="number" step="0.01" name="salary" required><br><br>
<button type="submit" name="action" value="add">Add</button>
<button type="submit" name="action" value="update">Update</button>
<button type="submit" name="action" value="delete">Delete</button>
<button type="submit" name="action" value="view">View All</button>
</form></body></html>
