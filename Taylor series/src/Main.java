import java.io.*;

public class Main {

    public static void main(String arg[]) throws IOException {

        int fact = 1;
        double sumA = 1;
        double term;
        int start = 1;
        int iter = 4;

        for (int i = 1; i < iter; i++) {
            fact *= i;
            term = Math.pow(start, i) / fact;
            sumA += term;
        }
        System.out.print("\n\n\tanswer = " + sumA);
    }
}