import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Labtaskjava {
    public static void main(String[] args) {
        int[] nums;
        System.out.println("enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        nums = new int[sc.nextInt()];
        System.out.println("enter the elements in the array");
        double sum = 0;
        double avg = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min2 = min;
        int max2 = max;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
            avg = sum / nums.length;
            if (min > nums[i]) {
                min2 = min;
                min = nums[i];
            } else if (min2 > nums[i]) {
                min2 = nums[i];
            }


            if (max < nums[i]) {
                max2 = max;
                max = nums[i];

            } else if (max2 < nums[i]) {
                max2 = nums[i];
            }

        }


        System.out.println(Arrays.toString(nums));
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("secondmax = " + max2);
        System.out.println("secondmin = " + min2);




//        palindrome check

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter a number or a word to check if it's a palindrome: ");
        String word = sc2.nextLine();

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        System.out.println("reversed input = " + reverse);

        if (word.equals(reverse)) {
            System.out.println("palindrome :)");
        }
        else{
            System.out.println("not palindrome :((( ");
        }
        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter a sentence to check if it's a palindrome: ");
        String sentence = sc3.nextLine();
        System.out.println("sentence = " + sentence);



        String[] words = sentence.split(" ");
        String reverseSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence += words[i];
            if (i != 0) {
                reverseSentence += " ";
            }
        }

        System.out.println("reversed sentence = " + reverseSentence);
        if (sentence.equals(reverseSentence)) {
            System.out.println("palindrome sentence:)");
        }
        else{
            System.out.println("not a palindrome sentence:(( ");
        }

    }
}
