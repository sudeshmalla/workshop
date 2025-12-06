import java.util.Scanner;

public class NIBfixeddeposite
{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        char choice = 'x';
        do{
        System.out.println("Enter Principal:");
        float P = scanner.nextFloat();
        if(P<10000){ System.out.println("Minimum deposite 10000!");
        continue;
    } System.out.println("Enter time in Years:");
    float t = scanner.nextFloat();
    if(t<0||t>5){System.out.println("Not more than 5 years!");
        continue;
    } System.out.println("Enter Rate:");
    float r = scanner.nextFloat();
    if(t<8 || t>12){System.out.println("Rate must be between 8 and 12!");
    continue;}
    float n = t*12;
    double amount= P * Math.pow(1 + (r / 100) / n, n * t);
    double fee = amount * 0.005;
    System.out.println("Your amount is: Rs."+ amount);
    System.out.println("Your processinf fee is: Rs."+ fee);
    System.out.println("Do you want to calculate another FD? (Yes/No):");
    choice = scanner.next().charAt(0);
    
    } while (choice == 'x');
        
    }
}