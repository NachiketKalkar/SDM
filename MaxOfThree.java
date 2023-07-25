import java.util.Scanner;

class MaxOfThree{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers");
        a =sc.nextInt();
        b =sc.nextInt();
        c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("sum = "+sum);
        int avg=sum/3;
        System.out.println("Average = "+avg);
    }
}