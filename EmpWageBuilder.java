public class EmpWageBuilder {

   
    public static void main(String[] args) {
            // Display welcome Message
            System.out.println("Welcome to Employee Wage Computation Program");
 
           final int Max_Day = 20;
           final int Max_Hour = 100;
            
           Employee E1 = new Employee(20, 8); // Full Time Employee
           Employee PE1 = new Employee(20, 4); // Part Time Employee

            // Attendance Checker for Full Time Emp
            int is_Present_Full_Time = E1.AttendanceChecker();

            // Daily FUll Time Emp Wage Computation
            int Full_Time_Daily_Wage = E1.DailyWageComputation(is_Present_Full_Time);
            System.out.println("Today's total wage For Full Time Employee is : " + Full_Time_Daily_Wage);
            
          // Monthly Full Time Emp Wage Computation
          int Full_Time_Monthly_Wage = E1.MonthlyWageComputation();
          System.out.println("Monthly Wage for Full Time Emp is : " + Full_Time_Monthly_Wage);

           // Monthly Full Time Emp Wage Computation using condition
          System.out.println("Monthly total wage for Full Time Emp using condition is : "
                  + E1.MonthlyWageComputationCondition(Max_Hour, Max_Day));

                  
            // Attendance Checker for Part Time Emp;
            int is_Present_Part_Time = PE1.AttendanceChecker();
           
             
            // Daily Part Time Emp Wage COmputation
            int Part_Time_Daily_Wage = PE1.DailyWageComputation(is_Present_Part_Time);
            System.out.println("Today's total wage for Part Time Employee is : " + Part_Time_Daily_Wage);
           

          
          // Monthly Part Time Emp Wage Computation
          int Part_Time_Monthly_Wage = PE1.MonthlyWageComputation();
          System.out.println("Monthly Wage for Part Time Emp is : " + Part_Time_Monthly_Wage);



         
          // Monthly Part time emp wage computation using condition
         System.out.println("Monthly total wage for Part Time Emp using condition is : " +
         PE1.MonthlyWageComputationCondition(Max_Hour, Max_Day));

        }
    }
