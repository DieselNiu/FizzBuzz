public class GameNumber {
    private int rawNumber;

    public GameNumber(int i) {
        rawNumber = i;
    }

    @Override
    public String toString() {
        if (isRelatedTo(15)) {
            return "FizzBuzz";
        }
        if (isRelatedTo(3)) {
            return "Fizz";
        }
        if (isRelatedTo(5)) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }

    private boolean isRelatedTo(int i) {
        return rawNumber % i == 0 || String.valueOf(rawNumber).contains(String.valueOf(i));
    }
}
