public class exp2 {
    exp2(int w, int h) {
        System.out.println("area of rectangle" + w * h);
    }

    exp2(double r) {
        System.out.println("area of circle" + 3.14 * r * r);
    }

    public static void main(String[] args) {
        exp2 object1 = new exp2(4, 5);
        exp2 object2 = new exp2(2.5);
    }
}
