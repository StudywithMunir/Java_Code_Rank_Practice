import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();

            System.out.print(s1 + "              ");

            int x=sc.nextInt();
            if (x>=0 && x<=999){

                if(x==0 || x>99){
                    System.out.println(x);
                } else if (x<100) {
                    System.out.println("0" + x);
                }
            }

            //System.out.printf("%-14s %03d %n",s1,x);
            // %-14s left-justified from o to 14 for string
            // %03d padded with leading zero for int
        }

        System.out.println("================================");


    }


}

/* Other Solution
* Scanner sc = new Scanner(System.in);
                System.out.println("================================");
                for(int i = 0; i < 3; i++) {
                    String s1 = sc.next();

                    // left-justify the string and add trailing whitespace
                    System.out.printf("%-15s", s1);

                    int x = sc.nextInt();
                    if (x >= 0 && x <= 999) {
                        // format the integer with leading zeroes and display it in the 16th character position
                        System.out.printf("%03d", x);
                    }

                    System.out.println();
                }
                System.out.println("================================");*/
