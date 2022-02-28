class a extends Thread{
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            try{
                sleep(1000);
                System.out.println("A Thread :" + i);

            }
            catch(Exception e){
                
            }
        }
    }
}

class b extends Thread{
    public void run()
    {
        for(int i=10;i<11;i++)
        {
            try{
                sleep(1000);
                System.out.println("A Thread :" + i);

            }
            catch(Exception e){
                
            }
        }
  
    }
}

class c extends Thread{
    public void run()
    {
        for(int i=11;i<=30;i++)
        {
            try{
                // here delay is passed to between two answert
                sleep(1000);
                System.out.println("A Thread :" + i);

            }
            catch(Exception e){
                
            }
        }
    }
}

class two{
    public static void main(String args[])
    {
        a obj1 = new a();
        b obj2 = new b();
        c obj3 = new c();

        obj1.start();
        obj2.start();
        obj3.start();



    }
}