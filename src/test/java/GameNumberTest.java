import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameNumberTest {
    @Test
    public void should_say_1_when_game_number_is_1() {
        GameNumber gameNumber = new GameNumber(1);
        assertThat(gameNumber.toString()).isEqualTo("1");
    }

    @Test
    public void should_say_fizz_when_game_number_is_3() {
        GameNumber gameNumber = new GameNumber(3);
        assertThat(gameNumber.toString()).isEqualTo("Fizz");

    }

    @Test
    public void should_say_buzz_when_raw_number_is_5() {
        assertThat(new GameNumber(5).toString()).isEqualTo("Buzz");

    }
}

