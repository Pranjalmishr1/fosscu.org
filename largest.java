public class LargestElement {

    // Method to find the largest element in an array
    public static int findLargest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int largest = arr[0]; // Assume the first element is the largest

        // Iterate through the array to find the largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is larger
            }
        }

        return largest; // Return the largest element
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Example array

        try {
            int largest = findLargest(arr);
            System.out.println("The largest element in the array is: " + largest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
