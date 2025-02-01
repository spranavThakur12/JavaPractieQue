class Dog{
 
   String breed = "German Shepherd";
   int age = 2;
   String color = "Brown"; 

} 
  
 public class ClassAttributes{
   public static void main(String[] a){

      Dog obj = new Dog();
      
      System.out.println(obj.breed);
      System.out.println(obj.age);
      System.out.println(obj.color);
      System.out.println("==================");
      obj.breed = "Pammerian";
      obj.age = 5;
      obj.color = "Black And White";

      System.out.println(obj.breed);
      System.out.println(obj.age);
      System.out.println(obj.color);

   }
 }