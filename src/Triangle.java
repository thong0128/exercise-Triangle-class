import java.text.DecimalFormat;

public class Triangle extends Shape{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private double side1 = 1.0
            , side2 = 1.0
            , side3 = 1.0;

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getArea() {
        double a = getSide1()
                , b = getSide2()
                , c = getSide3()
                , s = getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public String toString() {
        return "A Triangle with area=" + df.format(getArea()) + ", perimeter=" + df.format(getPerimeter()) + " and " + super.toString();
    }

}
