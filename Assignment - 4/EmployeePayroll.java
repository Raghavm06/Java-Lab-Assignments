public class EmployeePayroll {

    public static void main(String[] args) {

        String empId = "101";
        String salary = "45000";
        String bonus = "5000";

        Integer id = Integer.valueOf(empId);
        Double basicSalary = Double.valueOf(salary);
        Double bonusAmount = Double.valueOf(bonus);

        if (basicSalary >= 0 && bonusAmount >= 0) {

            double netSalary = basicSalary + bonusAmount;

            System.out.println("Employee ID : " + id);
            System.out.println("Basic Salary : " + basicSalary);
            System.out.println("Bonus : " + bonusAmount);
            System.out.println("Net Salary : " + netSalary);

        } else {

            System.out.println("Invalid Salary Details");

        }
    }
}