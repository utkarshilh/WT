class A{

        int a = 10;
        
        void DisplayA(){
          System.out.println("i am a parent class");
          System.out.println(a);
          
        }
}
   
class B extends A{
          int b = 20;
        void DisplayB(){
        
           System.out.println("I am in child class");
           System.out.println(a);
           System.out.println(b);
           
        }
}
    
    public class inheritence{
       public static void main(String args[])
       {
           B obj = new B();
           obj.DisplayA();
           obj.DisplayB();
       }
     }