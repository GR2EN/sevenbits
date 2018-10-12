package main.it.sevenbits;

public class Segment {

  private Point startPoint;
  private Point endPoint;

  public Segment(Point startPoint, Point endPoint) {
    this.startPoint = startPoint;
    this.endPoint = endPoint;
  }

  public double getLength() {
    // |AB|^2 = (x2 - x1)^2 + (y2 - y1)^2
    return Math.sqrt(
        Math.abs(
            Math.pow((endPoint.getX() - startPoint.getX()), 2)
                + Math.pow((endPoint.getY() - startPoint.getY()), 2)
        )
    );
  }

}
