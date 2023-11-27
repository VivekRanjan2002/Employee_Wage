import java.util.HashMap;

public class EmpWageBuilder {

   
    public static void main(String[] args) {
            // Display welcome Message
            System.out.println("Welcome to Employee Wage Computation Program");
           HashMap<String,Company> CompanyMapper= new HashMap<>();

            Company c1 = new Company("Reliance", 20, 20, 100);
            c1.CompanyMapper(CompanyMapper);
            Company c2 = new Company("GE", 25, 15, 100);
            c2.CompanyMapper(CompanyMapper);
            



        }
    }
