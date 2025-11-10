package lect_2;
import java.util.Scanner;
public class sum_of_natural_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0, i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}