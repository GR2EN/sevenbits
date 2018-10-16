package main.it.sevenbits;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormatterTest {

  @Test
  public void format() {
    // aaa {
    //     bbbb;
    //     ccc;
    // }
    String expected = "aaa {\n    bbbb;\n    ccc;\n}";
    String source = "aaa { bbbb; ccc;}";
    String actual = Formatter.format(source);
    assertEquals(expected, actual);
  }
}