package Employee;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
        //class constructor
        Employee(String name,double salary,int workHours,int hireYear){
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }
        //tax method
        public double tax(){
            if(this.salary > 1000){
                return (this.salary * 3) /100;
            }else {
                return 0.0;
            }
        }
        //Bonus method
        public double bonus(){
            int bonus = this.workHours - 40;
            return bonus * 30;
        }
        //Raise Salary Method
        public double raiseSalary(){
            int year = 2022 - this.hireYear;

            if (year < 9){
                return (this.salary * 5) /100;
            }else if (year < 20 && year > 9){
                return (this.salary * 10) /100;
            }else {
                return (this.salary * 15) /100;
            }
        }
        //toString method
        public void toString(Employee emp){
            System.out.println("Name: " + emp.name);
            System.out.println("Salary: "+ emp.salary);
            System.out.println("Work Hours: " + emp.workHours);
            System.out.println("Hire Date: " + emp.hireYear);
            System.out.println("Tax: " + emp.tax());
            System.out.println("Bonus: " + emp.bonus());
            System.out.println("Raise of Salary: " + emp.raiseSalary());
            System.out.println("Salary with tax and bonus: " + (emp.salary - emp.tax() + emp.bonus()));
            System.out.println("Total Salary with the raise of salary: " + (emp.salary + emp.raiseSalary()));

        }

}
