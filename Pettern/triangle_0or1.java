public class triangle_0or1
{
  public static void main(String[] args)
  {
  int n=5;
//outer loop
   for(int i=1; i<=n; i++){
     //inner loop
    
     for(int j=1; j<=i; j++){
int sum = i+j;
    if(sum % 2 == 0){//even number 
      System.out.print(" 1 ");
    }else{//odd number
      System.out.print(" 0 ");
    }
     }
     System.out.println();
     
     
   }
  
  
  }
}