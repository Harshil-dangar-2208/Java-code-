//enter month number show monthname using switch case

import java.util.*;

public class monthname
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
  System.out.print("Enter the Month number:= ");  
  int monthnumber = sc.nextInt();
  System.out.println(monthnumber);

  String monthname;


  switch(monthnumber){
    case 1: 
            monthname = "January";  
            break;
    case 2: 
            monthname = "February";  
            break;
    case 3: 
            monthname = "March";  
            break;
    case 4: 
            monthname = "April";  
            break;
    case 5: 
            monthname = "May";  
            break;
    case 6: 
            monthname = "June";  
            break;
    case 7: 
            monthname = "Julay";  
            break;
    case 8: 
            monthname = "August";  
            break;
    case 9: 
            monthname = "September";  
            break;
    case 10: 
            monthname = "Octomber";  
            break;
    case 11: 
            monthname = "November";  
            break;
    case 12: 
            monthname = "Desember";  
            break;
    default:
            monthname = "invalid month number! please enter 1-12 month number ";
            
  }
  
  System.out.println("Month Name := " +monthname);
  }
}