import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        int[] S = new int[t];
        for(int i = 0; i < t; i++){
            S[i] = input.nextInt();
        }

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;//declare four grades

        int i = 0;
        while(i < t){
            if(S[i] > 100||S[i] < 0){
                System.out.printf("The %d score is wrong,please edit it again:",i+1);
                S[i] = input.nextInt();
            }else if(S[i] >=90){
                A++;
                i++;
            }else if(S[i] >= 80){               //judge and store
                B++;
                i++;
            }else if(S[i] >= 70){
                C++;
                i++;
            }else if(S[i] >= 60){
                D++;
                i++;
            }else{
                i++;
            }
        }

        System.out.printf("A: %d\n",A);       //output the statistics
        System.out.printf("B: %d\n",B);
        System.out.printf("C: %d\n",C);
        System.out.printf("D: %d\n",D);
    }
}
