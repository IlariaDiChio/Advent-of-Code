import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        int counter = 0;
        int n = 0;
        System.out.println("Insert your values. When you are done, press Enter TWICE to exit.");
        Scanner scan = new Scanner(System.in);

        while ( n==0){
            String a = scan.nextLine();

            if (a.equals("A X")) {
                counter += 3 + 1;
                } else if ("A Y".equals(a)) {
                counter += 6 + 2;
                } else if ("A Z".equals(a)) {
                counter += 3;
                } else if ("B X".equals(a)){
                counter += 1;
                }else if ("B Y".equals(a)){
                counter += 3 + 2;
                }else if("B Z".equals(a)){
                counter += 6 + 3;
                }else if("C X".equals(a)){
                counter += 6 + 1;
                } else if ("C Y".equals(a)) {
                counter += 2;
                }else if ("C Z".equals(a)){
                counter += 3 + 3;
                }
                else {
                n = 1;
                }

            }System.out.println(counter);

        }

    }
