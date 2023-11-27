public class Employee {
    String name;
    private int IS_FULL_TIME;
    private int WAGE_PER_HOUR;
    private int TIME_HOUR;


    // getter function
    public int FullTime() {
        return IS_FULL_TIME;
    }

    public int WagePerHour() {
        return WAGE_PER_HOUR;
    }

    public int TimeHour(){
        return   TIME_HOUR;
    }


    Employee( int WAGE_PER_HOUR, int TIME_HOUR) {
        
        this.WAGE_PER_HOUR=WAGE_PER_HOUR;
        this.TIME_HOUR=TIME_HOUR;
    }
    
     // Attendance Checker 
    public  int AttendanceChecker() {
        int initialVal = 1;
        int empChecker = ((int) (Math.random() * 10)) % 2;
        if (empChecker == initialVal) {

            System.out.println("Full Time Employee is Present ");
            return 1;
        } 
            else
                System.out.println("FUll Time Employee is not Present");
            return 0;
        
    }
    
    // Daily Wage Computation
    public  int DailyWageComputation(int isPresent) {
        
        return isPresent * TIME_HOUR * WAGE_PER_HOUR;
    }

    // Monthly Wage Computation
    public  int MonthlyWageComputation() {
        int workingDayPerMonth = 30;
        int totalWage = 0;

        for (int i = 0; i < workingDayPerMonth; i++) {
            int isPresent = (int) (Math.random() * 10) % 2;
            totalWage += DailyWageComputation(isPresent);
        }
        return totalWage;
    }
    // Monthly Wage Computation Using Condition

    public  int MonthlyWageComputationCondition( int Max_Hour, int Max_Day) {
        int workingDayPerMonth = 30;
        int currDay = 0;
        int currHour = 0;
        int totalWage = 0;
        while (currHour < Max_Hour && currDay < Max_Day) {
            int isPresent = (int) ((Math.random() * 10) % 2);
            if (isPresent == 1) {
                currDay += 1;
                currHour += Math.min(TIME_HOUR, Max_Hour - currHour);
            }

        }
        totalWage = currHour * WAGE_PER_HOUR;
        return totalWage;
    }
}
