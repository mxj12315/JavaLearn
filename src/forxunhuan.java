public class forxunhuan {
    public static void main(String[] args) {
        /*
        for(int x = 10; x < 20; x++) {
            if (x == 15 ){
                break;   //  x == 15的时候不再执行后续代码，进入下一次循环
            }
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
        */
        int count = 0; // 统计
        for (int i = 2; i<=100; i++){
            boolean isSuShu = true;  // 标记
            for (int j = 2; j<i; j++){
                if (i%j==0){
                    isSuShu = false;
                    break;
                }
            }

            if (isSuShu){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("共有："+count + "个质素");
    }
}
