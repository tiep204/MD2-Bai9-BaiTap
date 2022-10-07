package ra;

public class TriangleClassifier {
    public static String check(int a, int b, int c) {
        if (a == b && b == c) {
            return "TamGiacDeu";

        }
        if (a == b || a == c || b == c) {
            return "TamGiacCan";

        }
        if (a + b > c && a + c > b && b + c > a) {
            return "TamGiacThuong";
        } else if (a + b < c || a + c < b || b + c < a){
            return "KhongPhaiLa1TamGiac";
        }

        else
        return null;
    }
}
