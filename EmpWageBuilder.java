import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageBuilder {

   
    public static void main(String[] args) {
        // Display welcome Message
        System.out.println("Welcome to Employee Wage Computation Program");

        Scanner sc = new Scanner(System.in);
        ArrayList<Company> companyMapper = new ArrayList<>();

        System.out.println("Please enter the total no. of companies ");
        int companyNo = sc.nextInt();

        while (companyNo > 0) {
            System.out.println("Please Enter name of company");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.println("Enter wage for that company");
            int wage = sc.nextInt();
            System.out.println("Enter total working day");
            int totalWorkingDay = sc.nextInt();
            System.out.println("Enter total working Hour");
            int totalWorkingHour = sc.nextInt();
            Company cmp = new Company(name, wage, totalWorkingDay, totalWorkingHour);
            companyMapper.add(cmp);
            companyNo--;
        }

        Logger(companyMapper);

    }

    /*
     * @desc: log out all the company object stored in arraylist
     * @params: arraylist which store company object
     * 
     */
    public static void Logger(ArrayList<Company> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
    }
