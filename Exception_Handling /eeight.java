// Throw keyword;


public class eeight{
    public static void main(String args[])
    {
        // ham apna khud ka object aur class bana rahe that is why we have creating the object of the class wich have the file name 
        eeight obj = new eeight();
        obj.verify(1);

        
    }

    void verify(int age)
    {
        if(age>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            // ham kisi bhi category me throw kar sakte hain
            throw new ArithmeticException("Not Eligible");

        }
    }
}