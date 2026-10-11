class Employee {
    double calculateSalary() {
        return 40000.0;
    }
}

class Manager extends Employee {
    @Override
    double calculateSalary() {
        return super.calculateSalary() + 25000.0; // Base salary + Managerial bonus
    }
}

public class task29 {
    public static void main(String[] args) {
        // Store both types in one Employee array (Polymorphism)
        Employee[] employees = {
                new Employee(),
                new Manager(),
                new Employee()
        };

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + " Salary: " + employees[i].calculateSalary());
        }
    }
}