public class longDataType{
    public static void main(String args[])
    {
        int lightspeed = 299792458;

        long days = 10000;


        long seconds;
        long distance;

        seconds = days * 24 * 60 *60; // converting into second

        distance = lightspeed * seconds;
        
        System.out.println("The light travels in " + days+ "days "+ distance + " distance");




    }
}