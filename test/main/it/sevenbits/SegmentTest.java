package main.it.sevenbits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SegmentTest {

  @Test
  public void getLength() {
    // init
    Point point1 = new Point(1, 3);
    Point point2 = new Point(2, 5);
    Segment segment = new Segment(point1, point2);

    // test
    assertEquals(2.236, segment.getLength(), 3);
  }
}