import java.util.Scanner;

class largestTwoNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        int firstnum = sc.nextInt();

        System.out.println("Enter your 2nd number ");
        int secondnum = sc.nextInt();

        if (firstnum >= secondnum){
            System.out.println(" Num1 is greater than num2 :  " + firstnum);
        }
        else {
            System.out.println(" num 2 is grater than num 1 : " + secondnum);
        }
    }
}
