public class function {
    // 方法
    public static int getSum(int a, int b){
        return  a+b;
    }

    public static void add(){

    }
    //主方法，入口
    public static void main(String[] args) {
         int result = getSum(1,3);  // 或 int result = function.getSum(1,3)
         System.out.println(result);
         int result1 = sub.subs(6,1);
         System.out.println(result1);
         add();
    }

};



class sub {
    public  static int subs(int x,int y){
        return x-y;
    }
}