public class AreaCalculator {
    public static void main(String[] args) {
        double areaCirle = area(5.0);
        System.out.println(areaCirle);
        double areaRectangle = area(4.0 , 5.0);
        System.out.println(areaRectangle);
    }
    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Value is Invalid");
            return -1.0d;
        } else {
            double areaCirle = Math.pow(radius,2) * Math.PI;
            return areaCirle;
        }
    }
    public static double area(double x, double y) {
        if (x < 0  || y < 0) {
            System.out.println("Value is Invalid");
            return -1.0d;
        } else {
            double areaRectangle = x * y;
            return areaRectangle;
        }
    }
}
