import java.util.Scanner;

public class Userdetail {
    private String name, address, password;
    private long phonenumber, citizenship_number;
    public static boolean namefield, phonenumberfield, citizenshipnumberfield , passwordfield = false;
    public String getName() {
        return name;
    }
    public String getAddress(){
        return address;
    }
    public long getPhonenumber(){
        return phonenumber;
    }
    public long getCitizenship_number(){
        return citizenship_number;
    }
    public String getPassword(){
        return  password;
    }
    public static void userdetail(String name, String address, Long phonenumber , Long citizenship_number, String password){
        System.out.println("Hello! "+ name+ " Thankyou, for being a part of our project. If we have any issue we will contact you in "+phonenumber+""+Registration.emoji[0] );
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

    public void User_status_case2_loop_for_password(){
        boolean hasLowletter= Userdetail.containsLowLetter(this.password);
        boolean hasUpperletter= Userdetail.containsUpperLetter(this.password);
        boolean hasdigit= Userdetail.containsDigit(this.password);
        boolean haspecialchar= Userdetail.containsSpecialChar(this.password);
        if (Userdetail.containsLowLetter(this.password) && Userdetail.containsUpperLetter(this.password)&& Userdetail.containsDigit(this.password) && Userdetail.containsSpecialChar(this.password)) {
            Userdetail.userdetail(this.name, this.address, this.phonenumber, this.citizenship_number, this.password);
        }  else if (!hasLowletter) {
            System.out.println(Registration.emoji[3]+"Your password i.e."+ this.password+ " doesn't contain lower letter.");
        } else if (!hasUpperletter) {
            System.out.println(Registration.emoji[3]+"Your password i.e."+this.password+ " doesn't contain Upper letter.");
        } else if (!hasdigit) {
            System.out.println(Registration.emoji[3]+"Your password i.e."+this.password+ " doesn't contain Digit.");
        } else if (!haspecialchar) {
            System.out.println(Registration.emoji[3]+"Your password i.e."+this.password+ " doesn't contain Special character.");
        } else if (!hasdigit && !hasUpperletter) {
            System.out.println(Registration.emoji[3]+"Your password i.e."+this.password+ " doesn't contain Digit and Upper letter.");
        } else if (!hasUpperletter && !hasLowletter) {
            System.out.println(Registration.emoji[3]+"Your password i.e."+this.password+ " doesn't contain Upper and lower letter.");
        } else if (!hasLowletter && !haspecialchar) {
            System.out.println(Registration.emoji[3]+"Your password i.e."+this.password+ " doesn't contain Lower letter and Special Character.");
        } else if (!hasdigit && !hasLowletter) {
            System.out.println(Registration.emoji[3]+"Your password i.e."+this.password+ " doesn't contain Digit and Low letter.");
        }else if (!hasdigit && !haspecialchar) {
            System.out.println(Registration.emoji[3]+"Your password i.e."+this.password+ " doesn't contain Digit and Special Character.");
        }else if (!haspecialchar && !hasUpperletter) {
            System.out.println(Registration.emoji[3]+"Your password i.e."+this.password+ " doesn't contain Special Character and Upper letter.");
        }
    }

    public void Userdetail(String name, String address, long phonenumber, long citizenship_number, String password){
        this.name= name;
        this.address= address;
        this.phonenumber= phonenumber;
        this.citizenship_number= citizenship_number;
        this.password= password;
        System.out.println("Enter your name:");
        this.name= Registration.scannerobject.next();
        namefield= true;
        System.out.println("Enter your address:");
        this.address= Registration.scannerobject.next();

        System.out.println("Enter your phone number:");
        this.phonenumber= Registration.scannerobject.nextLong();
        phonenumberfield= true;
        System.out.println("Enter your citizenship number or National Identity card:");
        this.citizenship_number= Registration.scannerobject.nextLong();
        citizenshipnumberfield= true;
        System.out.println("""
                                        Create a password which should be the combination of Capital and small letter, Special character and integer:""");
        this.password= Registration.scannerobject.next();
        passwordfield= true;
        if (namefield && phonenumberfield && citizenshipnumberfield && passwordfield){
            System.out.println(Registration.emoji[4]+" All required field has been field. Your licence has been approved.");
        }else {
            System.out.println(Registration.emoji[3]+" Fields are missing plzz fill the form again.");
        }
    }
}
