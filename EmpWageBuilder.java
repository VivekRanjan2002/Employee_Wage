import java.util.HashMap;
import java.util.Scanner;

public class EmpWageBuilder {

    public static void main(String[] args) {
        // Display welcome Message
        System.out.println("Welcome to Employee Wage Computation Program");

        Scanner sc = new Scanner(System.in);
        HashMap<String, Company> companyMapper = new HashMap<>();
        boolean running = true;
        while (running) {
            System.out.println("Press 1 to add new entry");
            System.out.println("Press 2 to print company details");
            System.out.println("Press 3 to exit");
            System.out.println("Press your option");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please enter the total no. of companies ");
                    int companyNo = sc.nextInt();
                    getCompaniesInfo(companyNo, companyMapper);

                    break;
                case 2:
                    System.out.println("Please Type the name of company");
                    String name = sc.nextLine();
                   sc.nextLine();
                    companyLogger(name, companyMapper);
                     
                    break;
                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Option");
                    sc.nextLine();
                    break;
            }

        }

       
    }

    /*
     * @desc: takes all the input of a particular company like
     * name,wage,totalworkinghour,totalworkingday
     * and store company object in array list
     * 
     * @params: no. of company and arraylist
     * 
     */

    public static void getCompaniesInfo(int companyNo, HashMap<String, Company> companyMapper) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < companyNo; i++) {

            System.out.println("Please Enter name of company");

            String name = sc.nextLine();

            System.out.println("Enter wage for that company");
            int wage = sc.nextInt();
            System.out.println("Enter total working day");
            int totalWorkingDay = sc.nextInt();
            System.out.println("Enter total working Hour");
            int totalWorkingHour = sc.nextInt();
            sc.nextLine();
            Company cmp = new Company(name, wage, totalWorkingDay, totalWorkingHour);
            companyMapper.put(name, cmp);

        }
      

    }
    
    public static void companyLogger(String name, HashMap<String, Company> companyMapper) {
        if (companyMapper.containsKey(name)) {
            System.out.println(companyMapper.get(name).toString());
        }
        else {
            System.out.println("oops! No such company name exist");
        }
    }

}
