public class hello {
    public static void main(String[] args) {
        System.out.println("========整型========");
        int a= 123;
        System.out.println(a);
        long l= 123L;
        System.out.println(l);
        int b=  0b10110;  // 二进制
        System.out.println(b);
        int c = 012;  // 八进制
        System.out.println(c);
        int d =0x2f;
        System.out.println(d);
        byte b1=127;
        System.out.println(b1);
        short s1 =32767;
        System.out.println(s1);
        System.out.println("========整型========");

        System.out.println("========浮点型========");
        float e = 1.0f;
        System.out.println(e);
        double  f = 1.23;  // 或者double  f = 1.2d;
        System.out.println(f);
        System.out.println("========浮点型========");

        System.out.println("========布尔型========");
        boolean g =true;
        System.out.println(g);
        boolean h =false;
        System.out.println(h);
        System.out.println("========布尔型========");

        System.out.println("========char类型========");
        System.out.println("Hello World!");
        System.out.println("'Hello World!'");
        System.out.println("“Hello World!”");   // 中文双引号
        System.out.println("\"Hello World!\"");  //  \转译
        System.out.println("Hello\tWorld!");  //  \t转译制表符
        System.out.println("========chart类型========");
    }
}
