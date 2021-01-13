public class overLoad {
    /*
    //方法不使用重载，功能相似的需要些多个
    public static void main(String[] args) {
        int resInt = sumInt(1, 2);
        double resDouble = sumDouble(1.0, 2.0);
        long resLong = sumLong(1L, 2L);
        System.out.println(resInt + "\t" + resDouble + "\t" + resLong);

    }

    public static int sumInt(int a, int b) {
        return a + b;
    }

    public static double sumDouble(double a, double b) {
        return a + b;
    }

    public static long sumLong(long a, long b) {
        return a + b;
    }
    */


    //    使用方法重载
    public static void main(String[] args) {
        int resInt = sum(1, 2);
        double resDouble = sum(1.0, 2.0);
        long resLong = sum(1L, 2L);
        System.out.println(resInt + "\t" + resDouble + "\t" + resLong);
        // 多个参数的
        System.out.println(sum(1,2,3));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }


    //多个参数
    public static long sum(int a, int b, int c) {
        return a + b + c;
    }
}
