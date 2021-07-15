import java.util.Scanner;

public class emailMain
{
    private String firstName, lastName;
    private String password;
    private String departmentCode;
    private int mailBoxCapacity;
    private int defaultPasswordLength = 10;
    private String altEmail;

    public emailMain(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email generated: " + firstName + "." + lastName + "@xeron.com");

        this.departmentCode = getDepartmentCode();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("A randomly generated password has been assigned to this account: " + this.password);
    }


    private String getDepartmentCode()
    {
        System.out.println("Select your department from the codes displayed below \n 1 for Sales \n 2 for Engineering \n 3 for Marketing \n 4 for Accounting \n 0 to quit");

        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        if(userChoice == 1) { return "Sales"; }
        else if(userChoice == 2) { return "Engineering"; }
        else if(userChoice == 3) { return "Marketing"; }
        else if(userChoice == 4) { return "Accounting"; }
        else if(userChoice == 0) { return "Quit"; }
        else { return ""; }

    }

    private String randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_*";
        char[] password = new char[length];

        for(int i = 0; i < length; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }





}
