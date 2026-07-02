import java.util.Scanner;

public class LargestThreenum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter your 2nd number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter your 3rd number : ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println(" Num1 is the greatest of three : " + num1);
        } else if ( num2 >= num1 && num2 >= num3) {
            System.out.println("Num2 is the greatest of three : " + num2);
        }
        else {
            System.out.println("Num3 is the greatest of three : " + num3);
        }
    }
//    smallest value make the same just change the sign
}
