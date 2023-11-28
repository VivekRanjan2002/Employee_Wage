import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageBuilder  {

    public static void main(String[] args) {
        // Display welcome Message
        System.out.println("Welcome to Employee Wage Computation Program");

        Scanner sc = new Scanner(System.in);
        Company[] companyMapper;

        System.out.println("Please enter the total no. of companies ");
        int companyNo = sc.nextInt();

        companyMapper = new Company[companyNo];
        getCompaniesInfo(companyNo, companyMapper);

        // print each company stored 
        for (int i = 0; i < companyNo; i++) {
            companyMapper[i].Logger();
         }

    }

    /*
     * @desc: takes all the input of a particular company like name,wage,totalworkinghour,totalworkingday
     *         and store company object in arr
     * @params: size of arr, arr
     * 
     */
   
    public static void getCompaniesInfo(int companyNo, Company[] companyMapper) {
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
             companyMapper[i] = cmp;

         }
         sc.close();

    }

}

