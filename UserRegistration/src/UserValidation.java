import java.util.regex.Matcher;

import java.util.Scanner;
import java.util.regex.*;
public class UserValidation {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[]args)
    {
        SelectOption();
    }
    public static void SelectOption() {
    		
    		System.out.println("Select Option");
    		System.out.println("------------------");
            System.out.println("1.FirstName");
            System.out.println("2.Last Name");
            System.out.println("3.E-Mail");
            System.out.println("4.Enter number");
            System.out.println("5.Enter password");
            System.out.println("Enter option ");
            int inputOption = scan.nextInt();


            switch (inputOption) {
                case 1:
                    System.out.println("Enter your first name");
                    String firstName = scan.next();
                    isValidFirstname(firstName);
                    SelectOption();
                    break;
                case 2:
                    System.out.println("Enter your last name");
                    String lastName = scan.next();
                    isValidLastname(lastName);
                    SelectOption();
                    break;

                case 3:
                    System.out.println("Enter your mail");
                    String email = scan.next();
                    isValidEmail(email);
                    SelectOption();
                    break;

                case 4:
                    System.out.println("Enter your number");
                    String number = scan.next();
                    isValidPhone(number);
                    SelectOption();
                    break;

                case 5:
                    System.out.println("Enter your Password");
                    String password = scan.next();
                    isValidPassword(password);
                    SelectOption();
                    break;
			default:
                    System.out.println("Enter a valid Option");
                    SelectOption();
            }

    }
    
    public static boolean isValidFirstname(String fname) 
    { 
        String regex = "^[A-Z]{1}[a-z]{2,}\\w{5,29}$"; 
        Pattern p = Pattern.compile(regex); 
        Matcher m = p.matcher(fname); 
        boolean found = false;    
        while (m.find()) {    
            System.out.println("Match Found");    
            found = true;    
        }    
        if(!found){    
            System.out.println("No match found.");    
        }
        return m.matches(); 
    }
    
    public static boolean isValidLastname(String lname) 
    { 
        String regex = "^[A-Z]{1}[a-z]{2,}\\w{5,29}$"; 
        Pattern p = Pattern.compile(regex); 
        Matcher m = p.matcher(lname);
        boolean found = false;    
        while (m.find()) {    
            System.out.println("Match Found");    
            found = true;    
        }    
        if(!found){    
            System.out.println("No match found.");    
        }
          return m.matches(); 
    }
    
    
    public static boolean isValidEmail(String email) 
    { 
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; 
        Pattern p = Pattern.compile(regex); 
        Matcher m = p.matcher(email);
        boolean found = false;    
        while (m.find()) {    
            System.out.println("Match Found");    
            found = true;    
        }    
        if(!found){    
            System.out.println("No match found.");    
        }
        return m.matches(); 
    }
    
    
    public static boolean isValidPassword(String psswd) 
    { 
        String regex = "(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]{1}).{8,}"; 
        Pattern p = Pattern.compile(regex); 
        Matcher m = p.matcher(psswd); 
        boolean found = false;    
        while (m.find()) {    
            System.out.println("Match Found");    
            found = true;    
        }    
        if(!found){    
            System.out.println("No match found.");    
        }
         return m.matches(); 
    }
    
    
    
    public static boolean isValidPhone(String phone) 
    { 
        String regex = "^+(?:[0-9]\\s ?){6,14}[0-9]{10}$"; 
        Pattern p = Pattern.compile(regex); 
        Matcher m = p.matcher(phone); 
        boolean found = false;    
        while (m.find()) {    
            System.out.println("Match Found");    
            found = true;    
        }    
        if(!found){    
            System.out.println("No match found.");   
        }
        return m.matches(); 
    }
    
    
}