import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();             //declare the amount of tested months
        int[] array = new int[t];
        int i = 0;

        while(i < t) {
            int m = input.nextInt();    //input the months

            if (m < 13 && m > 0) {
                array[i] = m;
            } else {
                System.out.println("This number can't represent a month, please enter again:");
                continue;
            }
            i ++;
        }

        for (i = 0; i < t; i++) {
            switch (array[i]){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Yes");
                    break;
                default:
                    System.out.println("No");


            }
            System.out.println((-5)%3);
        }
    }
}

