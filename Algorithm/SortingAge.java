import java.util.Scanner;

public class SortingAge {
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of People => ");
        int size = sc.nextInt();
        int[] ageArray = new int[size];
        for (int i = 0; i < size; i++) {
            ageArray[i] = sc.nextInt();
        }

        SortingAge ob = new SortingAge();
        ob.sort(ageArray);

        printArray(ageArray);
    }
}
