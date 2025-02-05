public class MinFunctionExa{
   public static void main(String[] args){
     int a = 35;
     int b = 25;
     int c = MinFunction(a, b);
     System.out.println("Minmum No is : " + c);
   }
      public static int MinFunction(int n1, int n2){
         int min;
         if(n1 > n2){
            min = n2;
         }
         else{
            min = n1;
         } 
         return min;
      }
   }