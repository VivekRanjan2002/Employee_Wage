public class EmpWageBuilder {
    public static void main(String[] args) {
        // Display welcome Message
        System.out.println("Welcome to Employee Wage Computation Program");
     
        
        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_TIME_HOUR = 8;

        // Attendance Checketr
        int empChecker = ((int) (Math.random() * 10)) % 2;
        if (empChecker == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is not Present");
        }


        // Full Time Daily Emp Wage Computation
        int Full_Time_Daily_Wage = empChecker * FULL_TIME_HOUR * WAGE_PER_HOUR;
        System.out.println("Today's total Wage of Employee is :" + Full_Time_Daily_Wage);

    }
}