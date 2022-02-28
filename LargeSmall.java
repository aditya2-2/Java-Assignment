public class LargeSmall {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 400, 555, 200 };

        int large = arr[0];
        int small = arr[0];

        for (int num : arr) {
            if (num > arr[0]) {
                large = num;
            }

            if (num < arr[0]) {
                small = num;

            }

        }
        System.out.println("Largest number in array : " + large);
        System.out.println("Smallest number in array : " + small);

    }

}
