public class GameNumber {
    private int rawNumber;

    public GameNumber(int i) {
        rawNumber = i;
    }

    @Override
    public String toString() {
        if (rawNumber % 3 == 0) {
            return "Fizz";
        }
        if (rawNumber % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }
}
