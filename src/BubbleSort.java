import java.util.Scanner;

public class BubbleSort {
    private static final int ASC = 1;
    private static final int DESC = 2;

    private int arrayLength;
    private int arrayElement = 1;

    Scanner scanner = new Scanner(System.in);
    int[] array; //= new int[arrayLength];

    void getData() {
        System.out.println("Podaj długość tablicy");
        arrayLength = scanner.nextInt();
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Wprowadź " + arrayElement + " element tablicy: ");
            array[i] = scanner.nextInt();
            arrayElement++;
        }

        System.out.println("\n" + "Stan początkowy tablicy");
        printArray();
    }

    void selectSort() {
        int option;

        System.out.println("Sortowanie od najmniejszej do największej - Wybierz 1");
        System.out.println("Sortowanie od największej do najmniejszej - Wybierz 2");

        option = scanner.nextInt();
        switch (option) {
            case ASC:
                sortAscending();
                break;
            case DESC:
                sortDescending();
                break;
        }
    }

    void sortAscending() {
        for (int i = 1; i < arrayLength; i++) {
            for (int j = arrayLength - 1; j >= i; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("\n" + "Tablica posortowana: ");
        printArray();
    }

    void sortDescending() {
        for (int i = 1; i < arrayLength; i++) {
            for (int j = arrayLength - 1; j >= i; j--) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("\n" + "Tablica posortowana: ");
        printArray();
    }

    private void printArray() {
        for (int j : array) {
            System.out.print(" | " + j);
        }
        System.out.println(" |");
    }


}
