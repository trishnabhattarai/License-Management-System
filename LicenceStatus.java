public class LicenceStatus {
    public static boolean licencereview= false;
    public static int licencecategory, userid, license_number;
    public static void rules_of_traffic(){
        System.out.println("""
                Speed Limits
                Kathmandu Valley: The speed limit is set at 50 km/h.
                
                Common Traffic Violations and Fines
                The Motor Vehicles and Transport Management Act of 1993 outlines various offenses and their penalties:
                
                
                **Rs. 500 Fine:
                
                Not wearing a helmet on motorcycles or seat belts in four-wheelers.
                Carrying passengers on the roof of vehicles.
                Overloading beyond vehicle capacity.
                Using vehicles beyond the permitted use.
                Reckless driving endangering others.
                Obstructing the road.
                
                **Rs. 1,000 Fine:
                
                Driving under the influence of alcohol.
                Unauthorized parking in public places.
                Driving without a license or allowing an unlicensed person to drive.
                Involvement in accidents or fleeing the scene.
                
                **Rs. 1,500 Fine:
                
                Disobeying traffic signs.
                Wrong lane driving.
                Operating public vehicles without a route permit.
                Overcharging passengers.
                Over speeding.
                Driving in prohibited areas.
                Driving without headlights at night.
                Refusing to pick up passengers in public transport.
                
                
                """);
        System.out.println("Are you agree with that?");
        String useragree= Registration.scannerobject.next();
        useragree= useragree.toLowerCase();
        switch (useragree){
            case "yes":
                System.out.println("Congs,"+Userdetail.name+" for your licence approval."+LicenceApplication.staremoji);
                userid= (int) ((Math.random()*90000)+10000);
                System.out.println("Your user ID is: "+userid);
                licencereview= true;
                break;
            case "no":
                System.out.println(Userdetail.crossemoji+" Sry doesn't approved.");
                break;
        }
    }

    public static void chossing_number_case1(){
        System.out.println("""
                                What do you want to do?
                                1. Login
                                2. SignUp""");
        int userstatus= Registration.scannerobject.nextInt();
        switch (userstatus){
            case 1:
                System.out.println("Enter the citizenship Number:");
                long userenteredcitizenshipnumber= Registration.scannerobject.nextLong();
                System.out.println("Enter password:");
                String userenteredpassword= Registration.scannerobject.next();
                if (userenteredcitizenshipnumber==Userdetail.citizenship_number && userenteredpassword.equals(Userdetail.password)){
                    System.out.println("Hence, Successfully Login.");
                }
                else {
                    System.out.println("**The detail you provided is wrong. plz Try again.**");
                }
                break;
            case 2:
                Userdetail.user_detail_for_signup();
                Userdetail.User_status_case2_loop_for_password();
                break;
        }
    }

    public static void chossing_number_case2(){
        System.out.println("""
                                ****License Application****
                                Choose from below menu:
                                1. Apply for new licence.
                                2. View avaliable licence.""");
        int userlicence= Registration.scannerobject.nextInt();
        switch (userlicence){
            case 1:
                System.out.println("""
                                        For which category, You want to apply?
                                        1. Motorcycle
                                        2. Car
                                        3. Bus
                                        """);
                licencecategory= Registration.scannerobject.nextInt();
                if (licencecategory<=3 && licencecategory>=1){
                    LicenceApplication.file_upload_for_licence();
                }
                switch (licencecategory){
                    case 1:

                            Registration.required_age= 16;
                            Registration.small_vechicles="Bicycle";
                            Registration.nexteligibility= "Car";
                            LicenceApplication.requirement_for_licence();
                            Registration.task_one_completed= true;
                            break;

                    case 2:

                            Registration.required_age= 18;
                            Registration.small_vechicles= "Motorcycle";
                            Registration.nexteligibility= "Bus";
                            LicenceApplication.requirement_for_licence();
                            Registration.task_two_completed= true;
                            break;

                    case 3:

                            Registration.required_age= 18;
                            Registration.small_vechicles= "Motorcycle";
                            Registration.nexteligibility= "Bus";
                            LicenceApplication.requirement_for_licence();
                            Registration.task_three_completed= true;
                            break;


                }
                System.out.println("Enter the license number:");
                license_number= Registration.scannerobject.nextInt();

                break;
            case 2:
                if (userid>0) {
                    System.out.println("Category: "+licencecategory);
                    System.out.println("Licence ID: "+userid);
                } else {
                    System.out.println("Your licence category is empty.");
                }
                break;
        }
    }
}
