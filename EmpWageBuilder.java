import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageBuilder  {

    public static void main(String[] args) {
        // Display welcome Message
        System.out.println("Welcome to Employee Wage Computation Program");

        Scanner sc = new Scanner(System.in);
        ArrayList<Company> companyMapper = new ArrayList<>();

        System.out.println("Please enter the total no. of companies ");
        int companyNo = sc.nextInt();
        getCompaniesInfo(companyNo, companyMapper);

        // print each company stored 
        for (int i = 0; i < companyNo; i++) {
            companyMapper.get(i).Logger();
         }

    }

    /*
     * @desc: takes all the input of a particular company like name,wage,totalworkinghour,totalworkingday
     *         and store company object in array list
     * @params: no. of company and arraylist 
     * 
     */
   
    public static void getCompaniesInfo(int companyNo, ArrayList<Company>companyMapper) {
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
             companyMapper.add(cmp);

         }
         sc.close();

    }

}

