import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1
        System.out.println("task1");
        Scanner scan = new Scanner(System.in);

        int []  numbers = new int[] {1, 2, 3};
        double[] fractNumbers = new double[] {1.57, 7.654, 9.986};
        String[] words = new String [5];
        System.out.println("Напиши 5 слов");
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.nextLine();
        }

//        task2
        System.out.println("task2");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        for(int i = 0; i < fractNumbers.length; i++){
            System.out.print(fractNumbers[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + ", ");
        }
        System.out.println();

//        task3
        System.out.println("task3");

        for(int c = numbers.length - 1; c >= 0; c--) {
            System.out.print (numbers[c] + ", ");
        }
        System.out.println();
        for(int c = fractNumbers.length - 1; c >= 0; c--) {
            System.out.print (fractNumbers[c] + ", ");
        }
        System.out.println();
        for(int c = words.length - 1; c >= 0; c--) {
            System.out.print (words[c] + ", ");
        }
        System.out.println();

//        task4
        System.out.println("task4");

        for (int j = 0; numbers.length > j; j++) {
            if(numbers[j] % 2 == 1) {
                numbers [j] = numbers[j] + 1;
            }
            System.out.print(numbers[j] + ", ");
        }

    }
}
