import java.util.ArrayList;

public class Company {
    public String name;
    private int wage;
    private int  totalWorkingDay;
    private int totalWorkingHour;
    public int totalWage = 0;

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
    }

   

   

    
    // totalWageComputation

    private  void totalWageComputation(int totalWorkingDay, int totalWorkingHour) {
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
    

   
    @Override
    public String toString() {
       String temp= String.format("""
               Name: %s
               TotalWage: %d 
               """,this.name, this.totalWage);
       return temp;
       
    }
}
