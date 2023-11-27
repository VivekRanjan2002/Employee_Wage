import java.util.Scanner;

public class EmployeeSwitchCase {

        public static int AttendanceChecker(int initialVal, String EmpType) {
            int empChecker = ((int) (Math.random() * 10)) % 2;
            if (empChecker == initialVal) {
                System.out.println(EmpType + " Employee is Present");
            } else {
                System.out.println(EmpType + " Employee is not Present");
            }
            return empChecker;
        }

        public static int DailyWageComputation(int isPresent, int WorkingHour, int WagePerHour) {
            return isPresent * WorkingHour * WagePerHour;
        }

        public static void main(String[] args) {
            // Display welcome Message
            System.out.println("Welcome to Employee Wage Computation Program");

            int IS_FULL_TIME = 1;
            int WAGE_PER_HOUR = 20;
            int FULL_TIME_HOUR = 8;
            int PART_TIME_HOUR = 4;
            // taking input from user to know the type of employee
           
            System.out.println("Press 0 for Part Time Employee");
            System.out.println("Press 1 for Full Time Employee ");
             System.out.println("Please Enter Type of Employee ");
            Scanner sc= new Scanner(System.in);
            int TypeofEmp = sc.nextInt();
            switch (TypeofEmp) {
                case 0:  // Part Time Employee
             // Attendance Checker for Part Time Emp;
            int is_Present_Part_Time = AttendanceChecker(1, "Part Time");

            // Daily Part Time Emp Wage COmputation
            int Part_Time_Daily_Wage = DailyWageComputation(is_Present_Part_Time, PART_TIME_HOUR, WAGE_PER_HOUR);
            System.out.println("Today's total wage for Part Time Employee is : " + Part_Time_Daily_Wage);
                    break;
                case 1: // Full Time Employee
                         // Attendance Checker for Full Time Emp
            int is_Present_Full_Time = AttendanceChecker(1, "Full Time");

            // Daily FUll Time Emp Wage Computation
            int Full_Time_Daily_Wage = DailyWageComputation(is_Present_Full_Time, FULL_TIME_HOUR, WAGE_PER_HOUR);
            System.out.println("Today's total wage For Full Time Employee is : " + Full_Time_Daily_Wage);
            break;
        default:
                System.out.println("Please Enter valid Option ");
                    break;
            }
           

           

        }
    }

