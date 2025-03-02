public class Renew {
    public static void licencerenew(){
        LicenceApplication.filepath= Registration.drivinglicencepath; // filepath value is stored in drivinglicencepath and now filepath is empty.
        System.out.println("File path of original Driving licence:");
        LicenceApplication.takingfilepathfromtheuser(); //now filepath contain driving licence path
        LicenceApplication.filepath= Registration.citizenshippath;
        System.out.println("File path of citizenship document:");
        LicenceApplication.takingfilepathfromtheuser();//now filepath contain citizenship document path
        LicenceApplication.filepath= Registration.medicalpath;
        System.out.println("File path of Medical document:");
        LicenceApplication.takingfilepathfromtheuser();//now filepath contain driving Medical document path
        LicenceApplication.filepath= Registration.passwordsizepath;
        System.out.println("File path of Password size photo:");
        LicenceApplication.takingfilepathfromtheuser();//now filepath contain password size path
        System.out.println("""
                                ***Renewal Fee (5 Years) for following category:
                                1. Motorcycle          NPR 1,500
                                2. Car                 NPR 3,000
                                3. Bus                 NPR 5,000
                                """);
        System.out.println("plzz select licence category:");
        Registration.licencecategory= Registration.scannerobject.next();
        Registration.licencecategory= Registration.licencecategory.toLowerCase();
    }

    public static void licence_category_form(){
        System.out.println("Enter the required amount:");
        Registration.userenteredamount= Registration.scannerobject.nextInt();
        if (Registration.userenteredamount == Registration.requiredamount){
            System.out.println("*****Plzz fill below form****");
            System.out.println("First Name:");
            Registration.firstname= Registration.scannerobject.next();
            System.out.println("Last Name:");
            Registration.lastname= Registration.scannerobject.next();
            System.out.println("Age:");
            Registration.age= Registration.scannerobject.nextInt();
            System.out.println("Occupation:");
            Registration.occupation= Registration.scannerobject.next();
            System.out.println("Blood Group:");
            Registration.blood_group= Registration.scannerobject.next();
            System.out.println("Citizenship Number:");
            Registration.citizenship_number= Registration.scannerobject.nextInt();
            System.out.println("Date of birth:");
            Registration.date_of_birth= Registration.scannerobject.next();
            System.out.println("Gender:");
            Registration.gender= Registration.scannerobject.next();
            System.out.println("Citizenship Issue District:");
            Registration.citizenship_issue_district= Registration.scannerobject.next();
    }
}
public static void choosing_number_case4(){
    Renew.licencerenew();
    switch (Registration.licencecategory) {
        case "motorcycle":
            Registration.requiredamount = 1500;
            Renew.licence_category_form();
            break;
        case "bus":
            Registration.requiredamount= 5000;
            Renew.licence_category_form();
            break;
        case "car":
            Registration.requiredamount= 3000;
            Renew.licence_category_form();
            break;
    }
    System.out.println("+-------------------------------------------------------------------------------------+");
    System.out.println("|                                          USER INFO                                  |");
    System.out.println("+-------------------------------------------------------------------------------------+");
    System.out.println("| Licence Category:              "+ Registration.licencecategory+"                    |");
    System.out.println("| First Name:                    "+ Registration.firstname+"                          |");
    System.out.println("| Last Name:                     "+ Registration.lastname+"                           |");
    System.out.println("| Age:                           "+ Registration.age+"                                |");
    System.out.println("| Occupation:                    "+ Registration.occupation+"                         |");
    System.out.println("| Blood Group:                   "+ Registration.blood_group+"                        |");
    System.out.println("| Citizenship Number:            "+ Registration.citizenship_number+"                 |");
    System.out.println("| Date of Birth:                 "+ Registration.date_of_birth+"                      |");
    System.out.println("| Gender:                        "+ Registration.gender+"                             |");
    System.out.println("| Citizenship Issue District:    "+ Registration.citizenship_issue_district+"         |");
    System.out.println("+-------------------------------------------------------------------------------------+");
    System.out.println("Your licence has Renewal."+ Registration.rocketemoji);
}
}
