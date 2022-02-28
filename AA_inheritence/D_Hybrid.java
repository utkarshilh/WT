class A{

  void displayA()
  {
  
     System.out.println("A");
  }
  
}


class B extends A{

   void displayB()
  {
  
     System.out.println("B");
  }
}

class C extends B{

  void displayC()
  {
  
     System.out.println("C");
  }
}

class D extends B{

   void displayD()
  {
  
     System.out.println("D");
  }
}


public class D_Hybrid
{

   public static void main(String args[])
   {
      C obj1 = new C();
      D obj2 = new D();
      
      
      obj1.displayA();
      obj1.displayB();
      obj1.displayC();
      
      obj2.displayA();
      obj2.displayB();
      obj2.displayD(); 
   }
}

