public class new {
    
}
ublic class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] numbers = new int[size];

        // Accept array elements from the user
        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        // Print the sum
        System.out.println("The sum of the array elements is: " + sum);

        // Close the scanner
        scanner.close();
    }
}