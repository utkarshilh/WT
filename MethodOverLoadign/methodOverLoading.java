class a{

  void A(int y,int z)
  {
  
      System.out.println(y+z);
      
  }
  
  void A(int x,int y,int z)
  {
  
     System.out.println(x+y+z);
     
  }
  
  void A(String y,String z)
  {
     String temp = y+z;
     System.out.println(temp);
     
  }
    
}

public class methodOverLoading{

  public static void main(String args[])
  {
  
    a  obj = new a();
    
    obj.A(8,9);
    obj.A(8,9,8);
    obj.A("hello","world");
    
  }
}