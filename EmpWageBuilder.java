import java.util.HashMap;

public class EmpWageBuilder {

   
    public static void main(String[] args) {
            // Display welcome Message
            System.out.println("Welcome to Employee Wage Computation Program");
           HashMap<String,Integer> CompaniesWage= new HashMap<>();

            Company c1 = new Company("Reliance", 20, 20, 100);
            System.out.println("Total Wage for " + c1.name + " is " + c1.totalWage);
            c1.WageMapper(CompaniesWage);


        }
    }
