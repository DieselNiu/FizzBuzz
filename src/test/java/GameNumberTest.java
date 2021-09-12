import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameNumberTest {
    @Test
    public void should_say_fizz_when_game_number_is_1(){
        GameNumber gameNumber = new GameNumber(1);
        assertThat(gameNumber.toString()).isEqualTo("1");
    }

    }
