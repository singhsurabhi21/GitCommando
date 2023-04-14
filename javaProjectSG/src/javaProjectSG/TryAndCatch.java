public class TryAndCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[4] = 5;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index out of bounds: " + ex.getMessage());
        }
        finally {
            System.out.println("This code is always executed.");
        }
    }
}
