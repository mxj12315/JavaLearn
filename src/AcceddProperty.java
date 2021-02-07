public class AcceddProperty {
    static int i= 47;
    public void call(){
        System.out.println("调用call");
        for (i = 0; i < 3; i++) {
            System.out.print(i+" ");
            if (i==2){
                System.out.println("\n");
            }
        }
    }
    public AcceddProperty(){

    }

    public static void main(String[] args) {
        AcceddProperty t1 = new AcceddProperty();
        AcceddProperty t2 = new AcceddProperty();
        t2.i = 60;
        System.out.println("第一个实例对象调用变量i的结果： "+t1.i++);
        t1.call();
        System.out.println("第二个实例对象调用变量i的结果： "+t2.i);
        t2.call();

    }
}
