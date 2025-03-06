import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LicenceApplication {

    public static String filepath;
    public static int count, extra;
public static Random random = new Random();
    public static void file_upload_for_licence(){
        //we can't upload file directly in console so we are using File class to check the path of the licence file.
        System.out.println(Registration.emoji[1]+"""
                plzz provide the path of vehicle training completion certificate.
                """);
        takingfilepathfromtheuser();
    }
    public static void takingfilepathfromtheuser(){
        filepath= Registration.scannerobject.next();
        filepath= filepath.toLowerCase();
        if (filepath.endsWith(".pdf")){
            System.out.println(Registration.emoji[4]+" File has been uploaded successfully.");
        }
        else {
            System.out.println("File path is invalid:"+ Registration.emoji[5]);
        }
    }
    public static void requirement_for_licence(){
        System.out.println("Enter the age:");
        int age= Registration.scannerobject.nextInt();
        if (age>=Registration.required_age){
            System.out.println(Registration.emoji[4]+" Age requirement meet.");
            System.out.println("Enter years of experience:");
            int experence= Registration.scannerobject.nextInt();

            if (experence>2){
                System.out.println(Registration.emoji[4]+" Experience requirement meet.");
                LicenceStatus.rules_of_traffic();
            }
            else if(experence <2) {
                System.out.println("Enter the experience for small vehicles like "+Registration.small_vechicles);
                int smallvehiclesexperence= Registration.scannerobject.nextInt();
                if (smallvehiclesexperence>=2){
                    System.out.println(Registration.emoji[4]+" Experience requirement meet.");
                    LicenceStatus.rules_of_traffic();
                }
                else {
                    System.out.println(Registration.emoji[3]+" Sry rejected.");
                }

            } else if (experence==2) {
                System.out.println(Registration.emoji[4]+" Experience requirement meet.");
                LicenceStatus.rules_of_traffic();
            }
        }else {
            System.out.println(Registration.emoji[3]+" Sry rejected.");
        }
    }
public static void Adminreviewandapproval() throws InterruptedException {
    System.out.println("Enter your licence number or userId:");
    Registration.userenteredID= Registration.scannerobject.nextInt();
    if ((LicenceStatus.licencereview= true) && (Registration.userenteredID== LicenceStatus.userid || (Registration.userenteredID== LicenceStatus.license_number))){
        System.out.println("Your licence has been approve. "+Registration.emoji[0]);
    }else {
        System.out.println("Your licence is not approve ."+Registration.emoji[5]);
    }
    System.out.println("""
            What else you want to do?
            1. Check the update of traffic rules
            2. Check the level of traffic knowledge you have""");
    extra= Registration.scannerobject.nextInt();
    switch (extra){
        case 2:
            // Storing questions and answers
            String[][] quiz = {
                    {"What does a red traffic light mean?" +
                            "A) Go\n" +
                            "B) Slow down\n" +
                            "C) Stop", "stop"},
                    {" What should you do if an emergency vehicle (ambulance, fire truck) is behind you with sirens on?" +
                            "A) Speed up\n" +
                            "B) Stop immediately\n" +
                            "C) Pull over to the side and allow it to pass", "pull over to the side and allow it to pass"},
                    {"What is the maximum speed limit in a school zone?" +
                            "A) 50 km/h\n" +
                            "B) 20 km/h\n" +
                            "C) 80 km/h", "20 km/h"},
                    {"Which side should you overtake another vehicle from?" +
                            "A) Left\n" +
                            "B) Right\n" +
                            "C) Any side", "right"},
                    {"What does a yellow traffic light mean?" +
                            "A) Stop immediately\n" +
                            "B) Prepare to stop\n" +
                            "C) Speed up", "prepare to stop"},
                    {"What is the penalty for driving without a license in Nepal?\n" +
                            "A) Rs. 1000 fine\n" +
                            "B) Rs. 1500 fine\n" +
                            "C) Rs. 5000 fine", "rs. 5000 fine"}
            };

            for (int i=0; i<5;i++) {
                // Select a random question
                int index = random.nextInt(quiz.length);
                Registration.scannerobject.nextLine();
                System.out.println("Question: " + quiz[index][0]);

                // Get user answer
                System.out.print("Your Answer: ");
                String userAnswer = Registration.scannerobject.nextLine();
                userAnswer = userAnswer.toLowerCase();
                // Check answer
                if (userAnswer.equals(quiz[index][1])) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println("Wrong! The correct answer is: " + quiz[index][1]);
                    count--;

                }
            }

            if (count>3){
                System.out.println("congs,"+ LicenceStatus.userdetailobj.getName()+"you have high level of traffic knowledge.");
            } else if (count<3) {
                System.out.println("Good! "+LicenceStatus.userdetailobj.getName()+" you can increase your knowledge by practising above question.");
            } else{
                System.out.println("Did you attempt the questions? 😵‍💫");
            }
            break;
        case 1:
            String [][] update={
                    {"Odd-Even Vehicle Operation in Kathmandu" +
                            "To address increasing traffic congestion and pollution in Kathmandu, the city implemented an odd-even vehicle operation system starting September 21, 2024. Under this system, vehicles with license plates ending in odd numbers are permitted to operate on odd-numbered dates, while those with even-numbered plates can operate on even-numbered dates. "},
                    {" Enforcement of 'No Horn' Zones" +
                            "The Kathmandu Valley Traffic Police have intensified efforts to enforce the 'No Horn' policy, originally introduced on April 14, 2017, to combat noise pollution. Due to a resurgence in unnecessary honking, stricter measures have been implemented since October 2024. Drivers caught honking in restricted areas now face fines up to Rs. 1,500. "},
                    {"E-Challan System Integration with Nagarik App" +
                            "In an effort to modernize traffic enforcement, the E-Challan (Digital Chit) system was introduced in October 2024. Key features include:\n" +
                            "\n" +
                            "Digital Fines: Traffic violations are now recorded digitally, and fines can be paid electronically.\n" +
                            "Nagarik App Integration: Drivers can view and manage their traffic violation records through the Nagarik App, a government service platform.\n" +
                            "No Physical License Confiscation: Physical licenses are no longer seized during traffic rule violations; instead, records are maintained digitally."},
                    {"Current Traffic Conditions" +
                            "As per the latest update on February 21, 2025:\n" +
                            "\n" +
                            "Maitighar to Thapathali Service Lane: Pedestrian gatherings have led to rerouting vehicles to the main lane, causing minor delays.\n" +
                            "Other Major Intersections: Traffic is being managed with occasional brief stops to maintain flow.\n" +
                            "Entry Points (Nakas): Vehicle movement is reported to be normal."}
            };
            int updateint = random.nextInt(update.length);
            System.out.println("Latest Update: " + update[updateint][0]);
            TimeUnit.SECONDS.sleep(1);
    }
    }
}



