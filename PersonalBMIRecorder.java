package lolll;

import java.io.IOException;
import java.util.Scanner;

public class PersonalBMIRecorder 
{
    /* declare scanner once */
    public static final Scanner SCANNER = new Scanner(System.in);
    
    /* helper functions for user input */
    public static String inputString(String label) 
    {
        System.out.print(label);
        try 
        {
            return SCANNER.nextLine();
        } 
        catch(Exception e) 
        {
            System.out.println("Invalid input, try again...");
            return inputString(label);
        }
    }

    public static int inputInt(String label) 
    {
        System.out.print(label);
        try 
        {
            int out = SCANNER.nextInt();
            SCANNER.nextLine();
            return out;
        } 
        catch(Exception e) 
        {
            System.out.println("Invalid input, try again...");
            SCANNER.nextLine();
            return inputInt(label);
        }
    }

    public static double inputDouble(String label) 
    {
        System.out.print(label);
        try 
        {
            double out = SCANNER.nextDouble();
            SCANNER.nextLine();
            return out;
        } 
        catch(Exception e) 
        {
            System.out.println("Invalid input, try again...");
            SCANNER.nextLine();
            return inputInt(label);
        }
    }

    public static void clearConsole() 
    {
        try 
        {
            if (System.getProperty("os.name").contains("Windows")) 
            {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else 
            {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {}
    }
    
    public static void main(String[] args) 
    {
        boolean retry = true;
        
        int currentPeriod = 0; //represent which loop currently
            
        //polymorphism   
        People t1 = new Trainer("ABU AZMAN BIN SALIM", "Male", 34, "0143265543", "NO. 45, LORONG EKUITI 45", "TAMAN MAHKOTA AMAN", "JOHOR BAHARU", "JOHOR", 24135);
        People t2 = new Trainer("NURSALLEH HAZIMAN BIN BASIR", "Male", 26, "016986758", "A-34-4, BLOK A", "KOMPLEKS VIENNA", "JOHOR BAHARU", "JOHOR", 24146);
        People t3 = new Trainer("ZAMANI HALIM BIN YASIN", "Male", 33, "0168594657", "LOT 45, JALAN HASSAN 3", "TAMAN PERUMAHAN BEUFORDS 1", "JOHOR BAHARU", "JOHOR", 24143);
        People t4 = new Trainer("FATIN NURHANIS BINTI JAILANI", "Female", 25, "0136367754", "NO. 22, LRG JAYA 4", "TAMAN PERAMU", "JOHOR BAHARU", "JOHOR", 24165);
        
       
            
        System.out.println("\n");
        System.out.println("----------ENTER USER DETAILS HERE----------");
        String mbName = inputString("Username : ");
        String mbGender = inputString("Gender(Male/Female) : ");
        int mbAge = inputInt("Age : ");
        String mbPhoneNum = inputString("Phone Number : ");
        String mbAddLine1 = inputString("Address Line 1 : ");
        String mbAddLine2 = inputString("Address Line 2 : ");
        String mbAddCity = inputString("City : ");
        String mbAddState = inputString("State : ");
        int mbAddPostcode = inputInt("Postcode : ");
        int period = inputInt("Enter months you wanna train: ");
            
        //create Member object and Trainer array after filling bio
        People member = new Member(mbName, mbGender, mbAge, mbPhoneNum, mbAddLine1, mbAddLine2, mbAddCity, mbAddState, mbAddPostcode, period);
        Trainer[] trainers = new Trainer[period];
            
            
            
            
        //after filling bio, loop for every months
        while(currentPeriod < period && retry) 
        {
            
            System.out.println("\n");
            System.out.println("----------ENTER YOUR WEIGHT & HEIGHT----------");
            String date = inputString("Enter current date: ");
            double weight = inputDouble("Weight (kg): ");
            double height = inputDouble("Weight (m): ");
            
            
            
            ((Member)member).addRecord(date, weight, height);
            
            System.out.println("\n");
            System.out.println("<<<<<<<<<<THANK YOU FOR ENTERING YOUR INFORMATION, YOUR RESULTS ARE POSTED BELOW>>>>>>>>>>");
            
            
            double bmi = ((Member)member).getCurrentRecord().getBMI();
            String bmiCategory = ((Member)member).getCurrentRecord().getCatBMI();
            
            System.out.println("\n");
            System.out.println("----------BMI RESULT & TRAINER RECOMMENDATION----------");
            System.out.format("Your BMI is :  %.2f\n", bmi );
            System.out.println("BMI Category : " + bmiCategory );

            System.out.println("\n");
            System.out.println("----------RECOMMENDED TRAINER INFORMATION----------");
            
            if (bmiCategory == "Underweight") {
            	((Trainer)t1).showTrainerInfo();
            	trainers[currentPeriod] = (Trainer) t1;
            }
            else if (bmiCategory == "Normal") {
            	((Trainer)t2).showTrainerInfo();
            	trainers[currentPeriod] = (Trainer) t2;
            }
            else if (bmiCategory == "Overweight") {
            	((Trainer)t3).showTrainerInfo();
            	trainers[currentPeriod] = (Trainer) t3;
            }
            else if (bmiCategory == "Obese") {
            	((Trainer)t4).showTrainerInfo();
            	trainers[currentPeriod] = (Trainer) t4;
            }
            
            currentPeriod++;
            ((Member)member).incurCurentMonth();
            
            if(currentPeriod < period) retry = !(inputInt("\nInput for next months? [0/1]: ") == 0);
        }
            
            
        
         //print all the saved data before terminating
            
         System.out.println("\n");
         System.out.println("\n<<<<<<<<<<THANK YOU FOR USING OUR SERVICES!! HERE IS THE SUMMARY OF YOUR TRAININGS>>>>>>>>>>"); 
         
         System.out.println("\n");
         member.printInfo();
            
         Record r[] = ((Member)member).getAllRecord();
         
         System.out.println("+---------------------------------+");
         System.out.println("| You have trained for " + currentPeriod + " months. |");
         System.out.println("+---------------------------------+");
         System.out.println("\n");
         
         for(int i=0 ; i<currentPeriod ; i++ ) {
        	 System.out.println("Date: " + r[i].getDate());
        	 System.out.format("Your BMI is :  %.2f\n", r[i].getBMI() );
        	 System.out.println("BMI Category: " + r[i].getCatBMI());
        	 System.out.println("Trainer Name: " + trainers[i].getName());
        	 System.out.println("-------------------------------------------------------------------");
         }
    }
    
}
