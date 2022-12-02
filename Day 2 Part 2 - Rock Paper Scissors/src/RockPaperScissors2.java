import java.util.Scanner;

public class RockPaperScissors2 {
    public static void main(String[] args) {

        int counter = 0;
        int n = 0;

        System.out.println("Insert your values. When you are done, press Enter TWICE to exit.");
        Scanner scan = new Scanner(System.in);

        while ( n==0){
            String a = scan.nextLine();

            if ("A X".equals(a)) {
                counter += 2;
            } else if ("A Y".equals(a)) {
                counter += 4;
            } else if ("A Z".equals(a)) {
                counter += 8;
            } else if ("B X".equals(a)){
                counter += 1;
            }else if ("B Y".equals(a)){
                counter += 5;
            }else if("B Z".equals(a)){
                counter += 9;
            }else if("C X".equals(a)){
                counter += 1;
            } else if ("C Y".equals(a)) {
                counter += 6;
            }else if ("C Z".equals(a)){
                counter += 7;
            }
            else n = 1;

        }
        System.out.println(counter);

    }

}