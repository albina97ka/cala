import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );
        System.out.print("Dlina: ");
        int n = in.nextInt();
        int[] mass = new int[n];

        for (int i = 0; i < mass.length; i++){
            mass[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(mass));

        boolean Sort = false;
        int a;
        while(!Sort) {
            Sort = true;
            for (int i = 0; i < mass.length-1; i++) {
                if(mass[i] > mass[i+1]){
                    Sort = false;

                    a = mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}