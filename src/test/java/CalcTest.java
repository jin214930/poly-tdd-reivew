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

    @Test
    @DisplayName("1 + 1 == 2")
    public void test3() {
        assertThat(Calc.run("1 + 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("1 - 1 == 0")
    public void test4() {
        assertThat(Calc.run("1 - 1")).isEqualTo(0);
    }

    @Test
    @DisplayName("1 * 1 == 1")
    public void test5() {
        assertThat(Calc.run("1 * 1")).isEqualTo(1);
    }

    @Test
    @DisplayName("1 / 1 == 1")
    public void test6() {
        assertThat(Calc.run("1 / 1")).isEqualTo(1);
    }

    @Test
    @DisplayName("-1 + 1 == 0")
    public void test7() {
        assertThat(Calc.run("-1 + 1")).isEqualTo(0);
    }

    @Test
    @DisplayName("1 + -1 == 0")
    public void test8() {
        assertThat(Calc.run("1 + -1")).isEqualTo(0);
    }

    @Test
    @DisplayName("-1 + -1 == -2")
    public void test9() {
        assertThat(Calc.run("-1 + -1")).isEqualTo(-2);
    }
}