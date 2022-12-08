import java.util.Arrays;
import java.util.Scanner;

public class RucksackReorganization {
    public static void main(String[] args) {

        char[] alphabet = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

//        for (int i=0; i<alphabet.length; i++){
//            System.out.print(i+" ");
//            System.out.println(alphabet[i]);
//        }
//        System.out.println((alphabet.length/2));
//        System.out.println(alphabet[(alphabet.length/2)]);
//
//        System.out.println(Arrays.toString(alphabet));

        int counter = 0;
        int n = 0;

        Scanner scan = new Scanner(System.in);
//        Scanner che = new Scanner(System.in);
//        char check = 'y';
        System.out.println("Insert your values and press enter when you are done.");
        for (int h=0; h<300; h++) {
//            System.out.println("Do you want to insert value? y/n");
//            check = che.next().charAt(0);
//
//            if (check == 'y') {
                String input = scan.nextLine();
                char[] rucksack = input.toCharArray();
//                System.out.println(Arrays.toString(rucksack));

                for (int i = 0; i <= ((rucksack.length / 2)-1); i++) {
//                System.out.println("First compartment " + i + " and "+(rucksack.length/2));

                    for (int k = (rucksack.length / 2); k < (rucksack.length); k++) {
//                        System.out.print("FC " + i + " - "+(rucksack.length/2));
//                        System.out.println(" SC"+ k + " - "+(rucksack.length));

                        if (rucksack[i] == rucksack[k]) {
                            for (int j = 1; j <= (alphabet.length); j++)
                                if (rucksack[i] == alphabet[j]) {
//                                    System.out.println(alphabet[j]);
                                    counter += j;
//                                    System.out.println(counter);
                                    i = (rucksack.length/2);
                                    k = rucksack.length;
                                    break;
                                }
                            }
                        }

                    }

//                }

            }
            System.out.println("Counter " + counter);
        }
    }