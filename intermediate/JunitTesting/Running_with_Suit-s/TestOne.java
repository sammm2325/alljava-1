package intermediate.JunitTesting.Running_with_Suit-s;

import org.junit.Test;
import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestExample {
  String test = "Test one!"

  @Test
  public void test2() {
    assertThat(test, equalTo(“Test one!”));
}