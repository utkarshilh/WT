class A{

     void displayA(){
       System.out.println("hello i am in a");
       
     }
 }
 
 class B extends A{
      void displayB(){
      
         System.out.println("hello i am in b");
         
      }
 }
 
 class C extends B{
     void displayC()
     {
    System.out.println("hello i am in c");
    }
 }
 
 public class B_multi_inheritence{
 
 public static void main(String args[])
 {
   A obj1 = new A();
   B obj2 = new B();
   C obj3 = new C();
   
    obj1.displayA();
    
    obj2.displayA();
    obj2.displayB();
    
    
    obj3.displayA();
    obj3.displayB();
    obj3.displayC();
    
    }
    
    
    
   
 }