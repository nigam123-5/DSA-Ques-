public class usingDataTypes {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b, float c) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.5f, 4.2f, 5.4f));
    }
}

// output
// 8 -> int
// 7.7 -> flaot

