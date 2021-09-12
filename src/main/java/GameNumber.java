public class GameNumber {
    private int rawNumber;

    public GameNumber(int i) {
        rawNumber = i;
    }

    @Override
    public String toString() {
      return String.valueOf(rawNumber);
    }
}
