import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    public void should_create_game_object_with_given_size() {
        Game game = new Game(100);
        assertThat(game.size()).isEqualTo(100);
    }
}

