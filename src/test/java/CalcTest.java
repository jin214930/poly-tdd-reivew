import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    @Test
    @DisplayName("1 == 1")
    public void test1() {
        assertThat(Calc.run("1")).isEqualTo(1);
    }

    @Test
    @DisplayName("-1 == -1")
    public void test2() {
        assertThat(Calc.run("-1")).isEqualTo(-1);
    }
}