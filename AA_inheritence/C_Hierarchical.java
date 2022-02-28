
class A{

   void displayA(){
   
     System.out.println("A");
     
   }
}

class B extends A{

    void displayB(){
      System.out.println("B");
    }
}

class C extends A{

  void displayC()
  {
  
     System.out.println("C");
     
  }
}

public class C_Hierarchical{

  public static void main(String args[])
  {
   A obj1 = new A();
   
   B obj2 = new B();
   C obj3 = new C();
   
   obj1.displayA();
   
   obj2.displayA();
   obj2.displayB();
   
   obj3.displayA();
   obj3.displayC();
   
   }
   
}



