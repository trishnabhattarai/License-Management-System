

import java.util.Scanner;

public class Registration {
    public static String rocketemoji="🚀";
    public static String firstname, lastname, occupation, blood_group, gender, citizenship_issue_district,date_of_birth;
    public static int required_age, userenteredID,userenteredamount, requiredamount,age,citizenship_number;
    public static String small_vechicles, nexteligibility, citizenshippath, drivinglicencepath ,medicalpath, passwordsizepath, licencecategory;
    public static boolean task_one_completed= false;
    public static boolean task_two_completed= false;
    public static boolean task_three_completed= false;
    public static Scanner scannerobject= new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {


        while (true) {
            System.out.println("""
                    Choose 1 number from the menu below:
                    1. User Registration and Login (Login to application)
                    2. License Application (registration of licence)
                    3. Admin Review and Approval (checking if the licence is approve or not)
                    4. Reporting (renewal licence)
                    5. Exit""");
            int userinput = scannerobject.nextInt();
            if (userinput >= 1 && userinput <= 5) {
                switch (userinput) {
                    case 1:
                        LicenceStatus.chossing_number_case1();
                        break;
                    case 2:
                        LicenceStatus.chossing_number_case2();
                        break;
                    case 3:
                        LicenceApplication.Adminreviewandapproval();
                        break;
                    case 4:
                        Renew.choosing_number_case4();
                        break;
                    case 5:
                        System.exit(0);
                }
            }else{
                System.out.println("**** PLZ Enter the number from the menu ****");
            }
        }

    }
}
