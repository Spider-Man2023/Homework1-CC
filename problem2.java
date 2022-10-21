import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();             //how many data

        float[] y = new float[t];

        for(int i = 0;i < t;i++){

            float x1 = input.nextFloat();
            float y1 = input.nextFloat();
            float x2 = input.nextFloat();       //input data
            float y2 = input.nextFloat();
            float x = input.nextFloat();

            y[i] =  (y1 + ((y1 - y2)/(x1 - x2))*(x - x1));
        }

        for(int i = 0;i < t;i++){
            System.out.printf("%.1f\n",y[i]);
        }


    }
}
