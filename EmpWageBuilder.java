public class EmpWageBuilder {
   // Attendance Checker 
   public static int AttendanceChecker(int initialVal, String EmpType) {
       int empChecker = ((int) (Math.random() * 10)) % 2;
       if (empChecker == initialVal) {
           System.out.println(EmpType + " Employee is Present");
       } else {
           System.out.println(EmpType + " Employee is not Present");
       }
       return empChecker;
   }
    
    //Daily Wage Computation 
    public static int DailyWageComputation(int isPresent, int WorkingHour, int WagePerHour) {
        return isPresent * WorkingHour * WagePerHour;
    }

    // Monthly Wage Computation
    public static int MonthlyWageComputation(int WorkingHour, int WagePerHour) {
        int workingDayPerMonth = 30;
        int totalWage = 0;

        for (int i = 0; i < workingDayPerMonth; i++) {
            int isPresent = (int) (Math.random() * 10) % 2;
            totalWage += DailyWageComputation(isPresent, WorkingHour, WagePerHour);
        }
        return totalWage;
    }
    
    
    // Monthly Wage Computation Using Condition

    public static int MonthlyWageComputationCondition(int WorkingHour, int WagePerHour,int Max_Hour, int Max_Day) {
        int workingDayPerMonth = 30;
        int currDay = 0;
        int currHour = 0;
        int totalWage = 0;
        while ( currHour < Max_Hour && currDay < Max_Day) {
            int isPresent = (int) ((Math.random() * 10) % 2);
            if (isPresent == 1) {
                currDay += 1;
                currHour += Math.min(WorkingHour, Max_Hour - currHour);
            }
            
        }
        totalWage = currHour * WagePerHour;
        return totalWage;
    }
    public static void main(String[] args) {
            // Display welcome Message
            System.out.println("Welcome to Employee Wage Computation Program");
 
            int IS_FULL_TIME = 1;
            int WAGE_PER_HOUR = 20;
            int FULL_TIME_HOUR = 8;
            int IS_PART_TIME = 1;
            int PART_TIME_HOUR = 4;
            int Max_Day = 20;
            int Max_Hour = 100;

        
            // Attendance Checker for Full Time Emp
            int is_Present_Full_Time = AttendanceChecker(IS_FULL_TIME , "Full Time");

            // Daily FUll Time Emp Wage Computation
            int Full_Time_Daily_Wage = DailyWageComputation(is_Present_Full_Time, FULL_TIME_HOUR, WAGE_PER_HOUR);
            System.out.println("Today's total wage For Full Time Employee is : " + Full_Time_Daily_Wage);
            

            // Attendance Checker for Part Time Emp;
            int is_Present_Part_Time = AttendanceChecker(IS_PART_TIME, "Part Time");
             
            // Daily Part Time Emp Wage COmputation
            int Part_Time_Daily_Wage = DailyWageComputation(is_Present_Part_Time, PART_TIME_HOUR, WAGE_PER_HOUR);
            System.out.println("Today's total wage for Part Time Employee is : " + Part_Time_Daily_Wage);
           
          // Monthly Full Time Emp Wage Computation
          int Full_Time_Monthly_Wage = MonthlyWageComputation(FULL_TIME_HOUR, WAGE_PER_HOUR);
          System.out.println("Monthly Wage for Full Time Emp is : " + Full_Time_Monthly_Wage);
          
          // Monthly Part Time Emp Wage Computation
          int Part_Time_Monthly_Wage = MonthlyWageComputation(PART_TIME_HOUR, WAGE_PER_HOUR);
          System.out.println("Monthly Wage for Part Time Emp is : " + Part_Time_Monthly_Wage);


          // Monthly Full Time Emp Wage Computation using condition
          System.out.println("Monthly total wage for Full Time Emp using condition is : "
                  + MonthlyWageComputationCondition(FULL_TIME_HOUR, WAGE_PER_HOUR, Max_Hour, Max_Day));

          // Monthly Part time emp wage computation using condition
         System.out.println("Monthly total wage for Part Time Emp using condition is : " +
         MonthlyWageComputationCondition(PART_TIME_HOUR,WAGE_PER_HOUR, Max_Hour, Max_Day));
        }
    }
