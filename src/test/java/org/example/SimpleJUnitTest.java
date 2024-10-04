package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleJUnitTest {

  @Test
  public void test() {
    Assertions.assertDoesNotThrow(() -> Main.main(new String[]{}));
  }

}
