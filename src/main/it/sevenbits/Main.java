package main.it.sevenbits;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Point[] points = new Point[6];
    Segment[] segments = new Segment[3];
    double[] lengths = new double[3];

    points[0] = new Point(1, 3);
    points[1] = new Point(2, 5);
    points[2] = new Point(2, 4);
    points[3] = new Point(4, 1);
    points[4] = new Point(0, 0);
    points[5] = new Point(2, 5);

    segments[0] = new Segment(points[0], points[1]);
    segments[1] = new Segment(points[2], points[3]);
    segments[2] = new Segment(points[4], points[5]);

    for (int i = 0; i < 3; i++) {
      lengths[i] = segments[i].getLength();
      System.out.println("Segment length = " + lengths[i]);
    }

    Arrays.sort(lengths);
    System.out.println("Max length = " + lengths[2]);
  }

}
