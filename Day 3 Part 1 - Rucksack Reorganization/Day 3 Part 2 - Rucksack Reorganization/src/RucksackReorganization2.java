import java.util.Arrays;
import java.util.Scanner;

public class RucksackReorganization2 {
    public static void main(String[] args) {

        char[] alphabet = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        int counter = 0;
        int n = 0;

        Scanner scan = new Scanner(System.in);

        for (int h = 0; h < 300; h++) {
            String input = scan.nextLine();
            char[] rucksack = input.toCharArray();
            input = scan.nextLine();
            char[] rucksack2 = input.toCharArray();
            input = scan.nextLine();
            char[] rucksack3 = input.toCharArray();

//            System.out.println(Arrays.toString(rucksack));
//            System.out.println(Arrays.toString(rucksack2));
//            System.out.println(Arrays.toString(rucksack3));
            for (int i = 0; i < rucksack.length; i++) {
//                System.out.println("First compartment " + i + " and "+(rucksack.length/2));

                for (int k = 0; k < rucksack2.length; k++) {
//                        System.out.print("FC " + i + " - "+(rucksack.length/2));
//                        System.out.println(" SC"+ k + " - "+(rucksack.length));

                    if (rucksack[i] == rucksack2[k]) {
                        for (int y = 0; y < rucksack3.length; y++) {

                            if (rucksack3[y] == rucksack2[k]) {

                                for (int j = 1; j < (alphabet.length); j++) {
                                    if (rucksack[i] == alphabet[j]) {
//                                    System.out.println(alphabet[j]);
                                        counter += j;
                                        System.out.println(counter);
                                        i = rucksack.length;
                                        k = rucksack2.length;
                                        y = rucksack3.length;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}