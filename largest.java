
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        int secondLargest = 0;
        int secondSmallest = 0;

        boolean hasSecondLargest = false;
        boolean hasSecondSmallest = false;

        for (int i = 1; i < n; i++) {

            // Find largest and second-largest
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                hasSecondLargest = true;
            }
            else if (arr[i] < largest &&
                     (!hasSecondLargest || arr[i] > secondLargest)) {
                secondLargest = arr[i];
                hasSecondLargest = true;
            }

            // Find smallest and second-smallest
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
                hasSecondSmallest = true;
            }
            else if (arr[i] > smallest &&
                     (!hasSecondSmallest || arr[i] < secondSmallest)) {
                secondSmallest = arr[i];
                hasSecondSmallest = true;
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        if (hasSecondLargest) {
            System.out.println("Second-largest unique element: " + secondLargest);
        } else {
            System.out.println("Second-largest unique element does not exist.");
        }

        if (hasSecondSmallest) {
            System.out.println("Second-smallest unique element: " + secondSmallest);
        } else {
            System.out.println("Second-smallest unique element does not exist.");
        }

        sc.close();
    }
}
