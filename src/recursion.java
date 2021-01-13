public class recursion {
    // 计算1~n的和
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    //    求和
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

}
