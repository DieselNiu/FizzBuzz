import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameNumberTest {
    @Test
    public void should_say_1_when_raw_number_is_1(){
      assertThat(new GameNumber(1).toString()).isEqualTo("1");
    }
    @Test
    public void should_say_fizz_when_raw_number_is_3(){
      assertThat(new GameNumber(3).toString()).isEqualTo("Fizz");
    }
    @Test
    public void should_say_buzz_when_raw_number_is_5(){
        assertThat(new GameNumber(5).toString()).isEqualTo("Buzz");
    }
    @Test
    public void should_say_fizzbuzz_when_raw_number_is_15(){
      assertThat(new GameNumber(15).toString()).isEqualTo("FizzBuzz");
    }
}
