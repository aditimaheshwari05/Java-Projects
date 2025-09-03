import java.util.Scanner;
public class calc {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter number A: ");
       int a = sc.nextInt(); 
       
       System.out.println("Enter number B: ");
       int b = sc.nextInt();
       
       System.out.println("Enter operator: ");
       int op = sc.nextInt();
       switch (op) {
        case '+':
        System.out.println("Addition: ", a+b);            
            break;
        case '-':
        System.out.println("Subtraction: ", a-b);            
            break;
        case '*':
        System.out.println("Multiplication: ", a*b);            
            break;
        case '/':
        if(b!=0){
        System.out.println("Division: ", a/b);
        }            
        else{
            System.out.println("ERROR! Division is not possible");
        }
            break;
       
        default:
        System.out.println("Invalid Operator");
            break;
       }
       sc.close();
    }
    
}
