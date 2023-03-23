import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if(N>1 && N<=10){
            for (int i=1; i<=10; i++){
                int result=N*i;
                System.out.println(N +" x " + i + " = " + result);
            }
        }



    }
}
