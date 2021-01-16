package com.minsusu.数组06;


/**
 * 酒店
 */
public class Hotel {
    /**
     * 房间二维数组
     */
    private Room[][] rooms; // Room类型二位数组


    /**
     * 无参数构造
     */
    public Hotel(){
        /**
         * 创建酒店的房间
         */
        this.rooms = new Room[3][10];// 三层，每层10个房间
        for (int i=0;i<rooms.length;i++){  // i代表楼层
            for (int j=0;j<rooms[i].length;j++){
                // 第一层,单人间
                if (i==0){
                    rooms[i][j] =new Room((i+1)*100+j+1,"单人间",false);
                }else if (i==1){   // 第2层,豪华间
                    rooms[i][j] =new Room((i+1)*100+j+1,"豪华间",false);
                }else if (i==2){   // 第3层,总统套房
                    rooms[i][j] =new Room((i+1)*100+j+1,"总统套房",false);
                }
             }
        }
    }

    /**
     * 打印酒店房间方法
     */
    public void print(){
        for (int i = 0; i<rooms.length;i++){
            for (int j=0; j<rooms[i].length;j++){
                Room r = rooms[i][j];
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }

    /**
     * 订房
     * @param roomNo 房间编号
     */
    public void order(int roomNo){
        if (roomNo/100-1>rooms.length-1 || roomNo/100-1<0 || roomNo%100-1>rooms[rooms.length-1].length-1 || roomNo%100-1<0) {
            System.out.println(roomNo + "不存在");
            return;
        }
        // 例如roomNo=207，下标是rooms[1][6]
        Room m =  rooms[roomNo/100-1][roomNo%100-1];  // 得到订房的Room对象
        if (m.getStatus()){
            System.out.println(m.getNo()+"房间已经是占用");
        }else {
            m.setStatus(true);  //房间状态修改为false
            System.out.println(m.getNo()+"订房成功！");
        }

    }

    public void checkOut(int roomNo){
        if (roomNo/100-1>rooms.length-1 || roomNo/100-1<0 || roomNo%100-1>rooms[rooms.length-1].length-1 || roomNo%100-1<0) {
            System.out.println(roomNo + "不存在");
            return;
        }
        // 例如roomNo=207，下标是rooms[1][6]
        Room m =  rooms[roomNo/100-1][roomNo%100-1];  // 得到订房的Room对象
        if (!m.getStatus()){
            System.out.println(m.getNo()+"已经是空闲");
        }else {
            m.setStatus(false);
            System.out.println(m.getNo()+"退房成功！");
        }
    }

    /**
     * 测试
     * @param args
     */
   /* public static void main(String[] args) {
        Hotel h = new Hotel();
        h.print();
    }*/
}
