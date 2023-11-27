public class EmpWageBuilder {

   
    public static void main(String[] args) {
            // Display welcome Message
            System.out.println("Welcome to Employee Wage Computation Program");
 
            Company c1 = new Company("Reliance", 20, 20, 100);
            System.out.println("Total Wage for " + c1.name+ " is "+c1.totalWage);

        }
    }
