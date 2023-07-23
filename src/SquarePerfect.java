import java.util.Scanner;

public class SquarePerfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean check = false;
        for(int i = 1;i*i<=num;i++)
        {
            if(num%i==0 && i*i==num)
            {
                check = true;
            }
        }
        System.out.println(check);
    }
}
