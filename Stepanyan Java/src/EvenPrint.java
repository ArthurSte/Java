public class EvenPrint {
    public void printEvenNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
