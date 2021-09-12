import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {
    private List<GameNumber> gameNumbers;

    public Game(int size) {
        gameNumbers = IntStream.range(1, size + 1).mapToObj(GameNumber::new).collect(Collectors.toList());
//        gameNumbers = new ArrayList<>();
//        for (int i = 1; i <= size; i++) {
//            gameNumbers.add(new GameNumber(i));
//        }
    }

    public int size() {
        return gameNumbers.size();
    }
}
