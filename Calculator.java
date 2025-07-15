import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        
        System.out.println("Basic Calculator\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Please choose your choice(1-4): ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 -> System.out.println("The Addition is "+(a+b));
            case 2 -> System.out.println("The Substraction is "+(a-b));
            case 3 -> System.out.println("The Multiplication is "+(a*b));
            case 4 -> {
                if(b!=0){
                    System.out.println("The Division is "+(a/b));
                }
                else{
                    System.out.println("Can't divide by zero");
                }
                
                
                sc.close();
                sc.close();
                sc.close();
                sc.close();
            }
            
        }
       
    }
}