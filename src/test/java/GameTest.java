import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    public void should_create_game_object_with_given_size() {
        Game game = new Game(100);
        assertThat(game.size()).isEqualTo(100);
    }
    @Test
    public void should_provide_words_to_be_spoken(){
        Game game = new Game(100);
        List<String> wordsToBeSpoken = game.words();
        assertThat(wordsToBeSpoken.size()).isEqualTo(100);
        assertThat(wordsToBeSpoken.get(0)).isEqualTo("1");
    }
}

