public class Diamond_pettern
{
  public static void main(String[] args)
  {
  int n=4;

   for(int i=1; i<=n; i++){
     //space
       for(int j=1; j<=n-i; j++){
    System.out.print("   ");
     
   }
  //upper half number 
  for(int j=1; j<=2*i-1; j++){
    System.out.print(" * ");
  }
  
  
   System.out.println();
   }
  
   for(int i=n; i>=1; i--){
     //space
       for(int j=1; j<=n-i; j++){
    System.out.print("   ");
     
   }
  //lower half number 
  for(int j=1; j<=2*i-1; j++){
    System.out.print(" * ");
  }
  
  
   System.out.println();
   }
  }
}