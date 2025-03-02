import java.util.Scanner;

public class Userdetail {
    public static String name, address, password;
    public static long phonenumber, citizenship_number;
    public static String emoji= "😊";
    public static String crossemoji= "❌";
    public static String tickemoji= "✔️";
    public static String sademoji= "😕";
    public static boolean namefield, phonenumberfield, citizenshipnumberfield , passwordfield = false;
    public static void userdetail(String name, String address, Long phonenumber , Long citizenship_number, String password){
        System.out.println("Hello! "+ name+ " Thankyou, for being a part of our project. If we have any issue we will contact you in "+phonenumber+""+emoji );
    }
    public static boolean containsLowLetter(String str) {
        return str.matches(".*[a-z].*");  // [a-zA-Z] ensures at least one letter is present
    }
    public static boolean containsUpperLetter(String str) {
        return str.matches(".*[A-Z].*");  // [a-zA-Z] ensures at least one letter is present
    }
    public static boolean containsDigit(String str) {
        return str.matches(".*\\d.*");  // \d means any digit
    }
    public static boolean containsSpecialChar(String str) {
        return str.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*"); // Common special characters
    }

    public static void User_status_case2_loop_for_password(){
        boolean hasLowletter= Userdetail.containsLowLetter(Userdetail.password);
        boolean hasUpperletter= Userdetail.containsUpperLetter(Userdetail.password);
        boolean hasdigit= Userdetail.containsDigit(Userdetail.password);
        boolean haspecialchar= Userdetail.containsSpecialChar(Userdetail.password);
        if (Userdetail.containsLowLetter(Userdetail.password) && Userdetail.containsUpperLetter(Userdetail.password)&& Userdetail.containsDigit(Userdetail.password) && Userdetail.containsSpecialChar(Userdetail.password)) {
            Userdetail.userdetail(Userdetail.name, Userdetail.address, Userdetail.phonenumber, Userdetail.citizenship_number, Userdetail.password);
        }  else if (!hasLowletter) {
            System.out.println(Userdetail.crossemoji+"Your password i.e."+ Userdetail.password+ " doesn't contain lower letter.");
        } else if (!hasUpperletter) {
            System.out.println(Userdetail.crossemoji+"Your password i.e."+Userdetail.password+ " doesn't contain Upper letter.");
        } else if (!hasdigit) {
            System.out.println(Userdetail.crossemoji+"Your password i.e."+Userdetail.password+ " doesn't contain Digit.");
        } else if (!haspecialchar) {
            System.out.println(Userdetail.crossemoji+"Your password i.e."+Userdetail.password+ " doesn't contain Special character.");
        } else if (!hasdigit && !hasUpperletter) {
            System.out.println(Userdetail.crossemoji+"Your password i.e."+Userdetail.password+ " doesn't contain Digit and Upper letter.");
        } else if (!hasUpperletter && !hasLowletter) {
            System.out.println(Userdetail.crossemoji+"Your password i.e."+Userdetail.password+ " doesn't contain Upper and lower letter.");
        } else if (!hasLowletter && !haspecialchar) {
            System.out.println(Userdetail.crossemoji+"Your password i.e."+Userdetail.password+ " doesn't contain Lower letter and Special Character.");
        } else if (!hasdigit && !hasLowletter) {
            System.out.println(Userdetail.crossemoji+"Your password i.e."+Userdetail.password+ " doesn't contain Digit and Low letter.");
        }else if (!hasdigit && !haspecialchar) {
            System.out.println(Userdetail.crossemoji+"Your password i.e."+Userdetail.password+ " doesn't contain Digit and Special Character.");
        }else if (!haspecialchar && !hasUpperletter) {
            System.out.println(Userdetail.crossemoji+"Your password i.e."+Userdetail.password+ " doesn't contain Special Character and Upper letter.");
        }
    }

    public static void user_detail_for_signup(){
        System.out.println("Enter your name:");
        Userdetail.name= Registration.scannerobject.next();
        namefield= true;
        System.out.println("Enter your address:");
        Userdetail.address= Registration.scannerobject.next();

        System.out.println("Enter your phone number:");
        Userdetail.phonenumber= Registration.scannerobject.nextLong();
        phonenumberfield= true;
        System.out.println("Enter your citizenship number or National Identity card:");
        Userdetail.citizenship_number= Registration.scannerobject.nextLong();
        citizenshipnumberfield= true;
        System.out.println("""
                                        Create a password which should be the combination of Capital and small letter, Special character and integer:""");
        Userdetail.password= Registration.scannerobject.next();
        passwordfield= true;
        if (namefield && phonenumberfield && citizenshipnumberfield && passwordfield){
            System.out.println(Userdetail.tickemoji+" All required field has been field. Your licence has been approved.");
        }else {
            System.out.println(Userdetail.crossemoji+" Fields are missing plzz fill the form again.");
        }
    }
}
