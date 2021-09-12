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
        return String.valueOf(rawNumber);
    }
}
