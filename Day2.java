import java.util.Arrays;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        int a = 5;
        double d = 0.4;
        d=a; //implicit casting
        System.out.println("d= "+d);
        d = 3.14;
        a=(int)d; //explicit casting
        System.out.println("a= "+a);


        while(a>0){
            System.out.println("looping in a while");
            a--;
        }

        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
        }

        for(int i=1; i<13; i++) {
            switch (i) {
                case 1:
                    System.out.println("on vacation");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("studying");
                    break;
                case 6:
                    System.out.println("on vacation");
                    break;
                default:
                    System.out.println("studying");
                    break;
            }

//            arrays
            int[] nums = new int[10];
            for(i=0; i<nums.length; i++){
                nums[i]=i;
            }

            System.out.println(nums);
            System.out.println(Arrays.toString(nums));


            for(int x:nums){
                x=i++;

                System.out.println("Last x ="+x+" ");
            }

            System.out.println(Arrays.toString(nums));

            int n = 3;
            int m = 4;
            int[][] matrix = new int[n][m];
            int l;
            for(l = 0; l < matrix.length; l++) {
                for(int j = 0; j < matrix[0].length; j++) {
                    matrix[l][j]=l+j;
                }
            }
            System.out.println(Arrays.deepToString(matrix));

            double[] darr = {1.0, 2.0, 3.0};
            int[] iarr = {1, 2, 3, 4};
            System.out.println(Arrays.toString(darr));

//            command line arguments
            System.out.println("First parameter "+args[0]);
            System.out.println("Second parameter "+args[1]);


//            Scanner scan = new Scanner(System.in);
//
//            System.out.println("Enter your name: ");
//            String name = scan.nextLine();
//
//            System.out.println("Enter your age: ");
//            int age = scan.nextInt();
//
//            System.out.println("Enter your gpa: ");
//            double gpa = scan.nextDouble();
//
//            System.out.println("Hi " + name + "!");
//            if(gpa >= 3.5){
//                System.out.println("You're a High Honor Student");
//            }
//            else {
//                System.out.println("You're regular student");
//            }
//
//            Scanner scan2 = new Scanner(System.in);
//            System.out.println("Enter your principal amount: ");
//            double p = scan2.nextDouble();
//
//            System.out.println("Enter your interest rate: ");
//            double in = scan2.nextDouble();
//
//            System.out.println("Enter your number of months: ");
//            int mo = scan2.nextInt();
//
//            double mortgage = (p * (in * Math.pow(1 + in, mo))) / (Math.pow(1 + in, mo) - 1);
//
//            System.out.println("Mortgage: "+mortgage);



            Scanner scan2 = new Scanner(System.in);

            System.out.println("Enter your principal amount: ");
            double p = scan2.nextDouble();

            System.out.println("Enter your annual interest rate (in percentage): ");
            double annualRate = scan2.nextDouble();
            double monthlyRate = annualRate / 100 / 12;

            System.out.println("Enter your number of months: ");
            int mo = scan2.nextInt();


            double mortgage = (p * (monthlyRate * Math.pow(1 + monthlyRate, mo))) /
                    (Math.pow(1 + monthlyRate, mo) - 1);

            System.out.println(mortgage);



        }
    }
}