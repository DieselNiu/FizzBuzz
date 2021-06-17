import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {
    public static void main(String[] args) {
        Game game = new Game(100);
        System.out.println(game.words());
    }
    private final List<GameNumber> gameNumbers;

    public Game(int size) {
        gameNumbers = IntStream.range(1, size + 1).mapToObj(GameNumber::new).collect(Collectors.toList());
    }

    public int size() {
        return gameNumbers.size();
    }

    public List<String> words() {
        return gameNumbers.stream().map(GameNumber::toString).collect(Collectors.toList());
    }
}
