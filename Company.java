
import java.util.Scanner;

public class Company implements CompanyInterface{
    public String name;
    private int wage;
    private int  totalWorkingDay;
    private int totalWorkingHour;
    public int totalWage = 0;
    public int dailyWage = 0;

    // getter function
    public int wage() {
        return this.wage;
    }

    public int totalWorkingDay() {
        return this.totalWorkingDay;
    }

    public int totalWorkingHour() {
        return this.totalWorkingHour;
    }

    Company( String name, int wage, int totalWorkingDay,int totalWorkingHour) {
        this.name = name;
        this.wage = wage;
        this.totalWorkingDay=totalWorkingDay;
        this.totalWorkingHour = totalWorkingHour;
        this.totalWageComputation(totalWorkingDay, totalWorkingHour);
        dailyWage(wage);
    }

    /*
     * @desc: compute dailywage by using attendance of emp using random fnc and type of emp also using random
     * fnc and accordingly working hour per day is assigned
     * @param:wage per hour
     * @return : daily wage 
     */
    @Override
    public void dailyWage(int wage) {
       int isPresent = (int) ((Math.random() * 10) % 2);
       int workingHour = 0;
         int TypeofEmp = (int) ((Math.random() * 10) % 2);
         switch (TypeofEmp) {
             case 0: // Part Time
                 workingHour = 4;
                 break;
             case 1: // full time
                 workingHour = 8;
                 break;
             default:
                 workingHour = 0;

         }
            
         this.dailyWage = isPresent * workingHour * wage;
    }

   

    
    /*
     * @desc: compute total wage of employee in month such that total days work doesn't exceed totalworkingday
     * and total hours worked shouldn't exceed totalworkinghour
     * @params: totalworkingDay and totalworkingHour
     * @return : totalwage(int)
     */
   @Override
    public  void totalWageComputation(int totalWorkingDay, int totalWorkingHour) {
        int currentDay = 0;
        int totalWage = 0;
        int currentHour = 0;
        while (currentHour < totalWorkingHour && currentDay < totalWorkingDay) {
            int isPresent = (int) ((Math.random() * 10) % 2);
            int workingHour = 0;
            int TypeofEmp = (int) ((Math.random() * 10) % 2);
            switch (TypeofEmp) {
                case 0: // Part Time
                    workingHour = 4;
                    break;
                case 1: // full time
                    workingHour = 8;
                    break;
                default:
                    workingHour = 0;

            }

            if (isPresent == 1) {
                currentDay += 1;
                currentHour += Math.min(workingHour, totalWorkingHour - currentHour);
            }
           // System.out.println("Day: "+currentDay + " Total working Hour: "+currentHour);

        }
        this.totalWage = currentHour * this.wage;
       
       
        
    }
    

   
    /*
     * @desc: log out all the company object stored in arraylist
     * 
     * @params: arraylist which store company object
     * 
     */
    @Override
    public void Logger() {
        System.out.println(String.format("""
               Name: %s
               DailyWage:%s
               TotalWage: %d 
               """,this.name,this.dailyWage, this.totalWage));

    }

    @Override
    public String toString() {
       String temp= String.format("""
               Name: %s
               DailyWage:%s
               TotalWage: %d 
               """,this.name,this.dailyWage, this.totalWage);
       return temp;
       
    }
}
