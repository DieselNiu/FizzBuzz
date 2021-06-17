import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
    @Test
    public void should_create_object_with_given_size(){
      assertThat(new Game(100).size()).isEqualTo(100);
    }
    @Test
    public void should_provide_words_with_given_size(){
        Game game = new Game(100);
        List<String> wordsToBeSpoken= game.words();
        assertThat(wordsToBeSpoken.size()).isEqualTo(100);
        assertThat(wordsToBeSpoken.get(0)).isEqualTo("1");
        assertThat(wordsToBeSpoken.get(1)).isEqualTo("2");
        assertThat(wordsToBeSpoken.get(2)).isEqualTo("Fizz");
        assertThat(wordsToBeSpoken.get(4)).isEqualTo("Buzz");
    }
}
