public class EmpWageBuilder {
    public static void main(String[] args) {
        // Display welcome Message
        System.out.println("Welcome to Employee Wage Computation Program");
        
        // Attendance Checker
        int IS_FULL_TIME = 1;
        int empChecker=((int)(Math.random()*10))%2;
        if(empChecker==IS_FULL_TIME) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is not Present");
        }

        
    }
}