public class Second {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 8, 2, 9, 1 };
        int cmax = 10, max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            max = max + arr[j];
            if (max == cmax) {
                System.out.println("number is" + max + arr[j]);
            }
        }
    }
}
