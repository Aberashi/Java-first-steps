import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        ////////////////////////////
        // BUBBLE SORT ALGORITMUS //
        ////////////////////////////

        // Trida Random generuje nahodnou hodnotu.
        Random rd = new Random();

        // Pole o 20 elementu
        int[] randomNums = new int[20];

        // cyklem(loop) 'for' naplnim hodnotu od 0 - 199
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = rd.nextInt(200);
        }

        // Print state of array before sort
        System.out.println("Array before :");
        printArray(randomNums);

        // Sort the array using bubble sort
        bubbleSort(randomNums);

        // Print result
        System.out.println("Array after :");
        printArray(randomNums);
    }

    public static void printArray(int[] arr) {
        String currentArray = "";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                currentArray += arr[i];
            } else {
                currentArray += arr[i] + ",";
            }
        }
        System.out.println(currentArray);
    }

    public static void bubbleSort(int[] arr) {
        // Ulozime delku pole arr do promenne n.
        int d = arr.length;
        // Cyklem for i projdeme pole od zacatku do konce
        for (int i = 0; i < d; i++) {
            // Cyklem for j projdeme polr of 1 do n-i
            for (int j = 1; j < (d - i); j++) {
                // Pokud pozice j-1 je mensi nez j, pak provedu swap hodnot
                if (arr[j - 1] > arr[j]) {
                    // Swap hodnot
                    int box = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = box;
                }
            }
        }

    }
}
