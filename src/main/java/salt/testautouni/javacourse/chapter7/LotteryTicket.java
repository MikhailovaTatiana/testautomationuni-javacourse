package salt.testautouni.javacourse.chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber)); // or change to binarySearch(...)
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find  a value
     * @param array Value to search through
     * @param numberToSearch Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearch) {
        for (int value: array) {
            if (value == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch (int[] array, int numberToSearch) {
        int index = Arrays.binarySearch(array, numberToSearch);
        if (index > 0) {
            return true;
        } else return false;
    }

    public static void printTicket(int ticket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
