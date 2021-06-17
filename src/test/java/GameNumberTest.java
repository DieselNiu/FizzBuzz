import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GameNumberTest {
    @Test
    public void should_(){
        assertThat(new GameNumber(1).toString).isEqualTo("1");
    }
}
