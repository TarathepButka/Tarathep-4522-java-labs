package butka.tarathep.lab5;

//The program will 
// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 9, 2022

public class TestPolygons {
  public static void main(String[] args) {
    Polygon polygon1 = new Polygon();
    polygon1.width = 2;
    polygon1.height = 3;
    polygon1.type = PolygonType.RECTANGLE;
    Polygon.setNumPolygons(1);
    Polygon.setSumPolygonsArea(polygon1.getArea());

    Polygon polygon2 = new Polygon();
    polygon2.width = 3;
    polygon2.height = 4;
    polygon2.type = PolygonType.TRIANGLE;
    Polygon.setNumPolygons(1);
    Polygon.setSumPolygonsArea(polygon2.getArea());

    System.out.println("The number of polygons is " + Polygon.numPolygons + " or " + polygon1.numPolygons + " or "
        + polygon2.numPolygons);
    System.out.println("The width of polygon1 is " + polygon1.width + " the width of polygon2 is " + polygon2.width);
    System.out.println("The sum of polygons area is " + Polygon.sumPolygonsArea);
  }
}

// Enum for polygon types
enum PolygonType {
  RECTANGLE,
  TRIANGLE
}

class Polygon {
  // Instance variables
  double width;
  double height;
  PolygonType type;

  // Static variables
  static int numPolygons = 0;
  static double sumPolygonsArea = 0;

  // Instance method for calculating area and returns the area of a polygon based
  // on width, height, and type of a polygon.
  public double getArea() {
    if (type == PolygonType.RECTANGLE) {
      return width * height;
    } else {
      return (width * height) / 2;
    }
    // return area;
  }

  // Static method for adding to numPolygons.
  public static void setNumPolygons(int numNewPolygons) {
    numPolygons += numNewPolygons;
  }

  // Static method for adding to sumPolygonsArea.
  public static void setSumPolygonsArea(double newPolygonsArea) {
    sumPolygonsArea += newPolygonsArea;
  }
}
