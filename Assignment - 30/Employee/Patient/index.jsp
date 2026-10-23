<html><head><title>Patient Management</title></head><body>
<h2>Patient Management System</h2>
<form action="PatientAction.jsp" method="post">
Patient ID: <input type="number" name="id" required><br><br>
Name: <input type="text" name="name" required><br><br>
Age: <input type="number" name="age" required><br><br>
Disease: <input type="text" name="disease" required><br><br>
Treatment Status: <input type="text" name="status" required><br><br>
<button type="submit" name="action" value="add">Add</button>
<button type="submit" name="action" value="update">Update</button>
<button type="submit" name="action" value="delete">Delete</button>
<button type="submit" name="action" value="view">View All</button>
</form></body></html>
