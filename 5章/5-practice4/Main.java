public class Main{
  public static double calcTriangleArea(double bottom, double height) {
    double triangleArea = (bottom * height) / 2;
    return triangleArea;
  }
  public static double calcCircleArea(double radius) {
    double circleArea = radius * radius * 3.14;
    return circleArea;
  }
  public static void main(String[] args) {
    System.out.println("三角形の底辺の長さが10.0cm,高さが5.0cmの場合、面積は25.0cm2");
    System.out.println("これをメソッドを用いると：");
    System.out.println("( 10.0cm * 5.0cm )/2 =" + calcTriangleArea(10, 5) + "cm2");
    System.out.println("円の半径が5.0cmの場合、面積は78.5cm2");
    System.out.println("これをメソッドを用いると：");
    System.out.println(" 5.0cm * 5.0cm * 3.14 =" + calcCircleArea(5) + "cm2");
  }
}