public class GameNumber {
    private int rawNumber;

    public GameNumber(int i) {
        rawNumber = i;
    }

    @Override
    public String toString() {
        if (isDividedBy(15)) {
            return "FizzBuzz";
        }
        if (isDividedBy(3)) {
            return "Fizz";
        }
        if (isDividedBy(5)) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }

    private boolean isDividedBy(int i) {
        return rawNumber % i == 0 || String.valueOf(rawNumber).contains(String.valueOf(i));
    }
}
