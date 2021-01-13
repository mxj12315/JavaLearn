public class operator {
    public static void main(String[] args) {
        /*
        int a= 10;
        int b = ++ a;
        System.out.println(a);  // 11
        System.out.println(b);   // 11

        int c= 10;
        int d =  a ++;
        System.out.println(c);  // 10
        System.out.println(d);   // 11
        */
        /*
        // 逻辑与
        int a = 1;
        int b = 3;
        System.out.println(a > b & ++a >2);   //false
        System.out.println(a);  // a = 2

        // 短路与
        int a = 1;
        int b = 3;
        System.out.println(a > b && ++a >2);   //false
        System.out.println(a);  // a = 1


        char n = 97;
        System.out.println(n);  // a  Unicode编码

        char m = 'a';
        System.out.println(m);  //a


        char o = '中';
        System.out.println(o);
        */


        int a = 10;
        int b = 20;
        System.out.println(a+b);  // 30
        System.out.println(a+b+"30");  // 3030
        System.out.println("10+20="+(a+b));  // 10+20=30
        System.out.println(a+"+"+b+"="+(a+b)); // 10+20=30


    }
}
