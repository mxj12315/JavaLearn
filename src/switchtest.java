public class switchtest {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("请输入内容1：");
        int uerInput1 = in.nextInt();
        System.out.print("请输入内容2：");
        int uerInput2 = in.nextInt();
        System.out.print("请输入要执行的运算符：");
        String uerInputType = in.next();
        int result = 0;
        switch (uerInputType){
            case "+":
                result = uerInput1 + uerInput2;
                System.out.println(result);
                break;
            case "*":
                result = uerInput1 * uerInput2;
                System.out.println(result);
                break;
            default:
                System.out.println("输入运算符错误");
        }
    }
}
