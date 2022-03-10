import java.util.Scanner;

public class temp {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = 0;
        int sum = 0;

        while (n >= 10) {
            temp = n % 10;
            if (n != 0) {
                temp = 10 - temp;

            }
            n = (n / 10) + 1;

            sum += temp;

        }

        if (n > 0)
            sum += 9;
        System.out.println(sum);

    }

}
