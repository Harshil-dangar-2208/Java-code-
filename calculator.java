import java.util.*;

public class calculator
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
  System.out.println("Enter the first number");  
  int num1 = sc.nextInt();
  System.out.println(num1);
  
  System.out.println("Enter the second number");
  int num2 = sc.nextInt();
    System.out.println(num2);


System.out.println("Choose an operator");

System.out.println("1. Addition (+)");
System.out.println("2. Subtraction (-)");
System.out.println("3. Multiplication (*)");
System.out.println("4. Division (/)");
System.out.println("5. Moduler (%)");


int choice = sc.nextInt();

double result;
  switch(choice){
    case 1: 
            result=num1+num2;
            System.out.println(result);
            break;
    case 2: 
            result=num1-num2;
            System.out.println(result);
            break;
    case 3: 
            result=num1*num2;
            System.out.println(result);
            break;
    case 4: 
            result=num1/num2;
            System.out.println(result);
            break;
    case 5: 
            result=num1%num2;
            System.out.println(result);
            break;
    
    default:
            System.out.println("invalid choice! please valid operator");
            
  }
  
  
  }
}