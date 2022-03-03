class A implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Thread A Even :" + i);
            }

            else {
                System.out.println("Thread A odd : " + i);

            }

            try {
                Thread.sleep(1000);

            } catch (Exception e) {

            }
        }
    }
}

class B implements Runnable {

    public void run(int i=11;i<=20;i++)
    {
        if(i%2==0)
        System.out.println("Thread B Even" + i);
        
        else
        System.out.println("Thread B odd"+i);

        try{
            Thread.sleep(1500);
        }
        catch(Exception e)
        {

        }


    }

    
}

class RunnableInterface1{

    public static void main(String args[])
    {
    A obj1 = new A();
    B obj2 = new B();

    // Thread class ka object banane ke liye thred use baad object ka naam
    // bs constructor ki jagah object pass karna hoga
    Thread th1 = new Thread(obj1);

    Thread th2 = new Thread(obj2);

    th1.start();
    th2.start();
    }
}
