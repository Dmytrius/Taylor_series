import java.io.*;

public class Main {

    public static void main(String arg[]) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int fact = 1;
        double sum = 1;
        double term;
        System.out.print("\n\n\tEnter the value of start : ");
        var start = Double.parseDouble(br.readLine());
        System.out.print("\n\n\tEnter the number of terms : ");
        var iter = Integer.parseInt(br.readLine());

        for (int i = 1; i < iter; i++) {
            fact *= i;
            term = Math.pow(start, i) / fact;
            sum += term;
        }
        System.out.print("\n\n\tanswer = " + sum);
    }
}