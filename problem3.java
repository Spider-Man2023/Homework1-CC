import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] Y = new int[t];

        for(int i = 0;i < t;i++){
            Y[i] = input.nextInt();
        }
        for(int i = 0;i < t;i++){
            boolean b = Y[i] % 4 == 0 & Y[i] % 100 != 0;
            if(b|Y[i] %400 == 0){
                if(Y[i] > 2000){
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                    int D = - (Y[i] - 2000)/4*1461 - 59 - (2000 - Y[i])/100 + (2000 - Y[i])/400;
                    System.out.println(D);
                }

            }else{
                System.out.println("No");
            }
        }
    }
}
