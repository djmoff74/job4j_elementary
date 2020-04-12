package ru.job4j.condition;

public class TrgArea {
    private Point first;
    private Point second;
    private Point third;

    public TrgArea(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    /**
     * Method for calculating the perimeter by the lengths of the sides.
     * <p>
     * Formula
     * <p>
     * (a + b + c) / 2
     *
     * @param a distance between points a b
     * @param b distance between points a c
     * @param c distance between points b c
     * @return Perimeter
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    /**
     * The method should calculate the area of the triangle.
     *
     * Formula.
     *
     * √ p * (p - ab) * (p - ac) * (p - bc)
     *
     * where √ is the square root, use the Math.sqrt () method to extract the root.
     *
     * @return Return the area if the triangle exists or -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * The method checks whether it is possible to build a triangle with such side lengths.
     *
     * Formula
     * the sum of the two sides must be greater than the third party
     *  a + b > c and a + c > b and b + c > a
     * @param a Length from point a b.
     * @param b Length from point a c.
     * @param c Length from point b c.
     * @return returns true or false
     */
    private boolean exist(double a, double b, double c) {
        return a + b > c && b + c > a && a + c > b;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        Point c = new Point(5, 0);
        TrgArea triange = new TrgArea(a, b, c);
        triange.area();
        System.out.println(triange.area());
    }
}
