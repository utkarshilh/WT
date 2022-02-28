class a extends Thread{
        public void run()
        {
            int i;
            for(i=1 ;i<=50000;i++)
            {
                if(i%2==0) 
                System.out.println(" a Even" + i);
                else
                System.out.println(" a odd" + i);

            }

            
        }

       
    }

    class b extends Thread{
         public  void run()
        {
            int i;

            for(i=50001;i<100000;i++)
            {
                if(i%2==0)
                System.out.println(" b even" + i);
                else
                System.out.println(" b odd"+i);

            }

        }
    }

public class threadClass{
    public static void main(String args[])
    {

        a obj1 = new a();
        b obj2 = new b();
        obj1.start();
        obj2.start();

    }

    
}

