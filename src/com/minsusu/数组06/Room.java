package com.minsusu.数组06;

/**
 * 房间
 */
public class Room {
    /**
     * 房间编号
     */
    private int no;
    /**
     * 房间类型
     */
    private String roomType;
    /**
     * 房间状态
     */
    private boolean status;
    /**
     * 无参数构造
     */
    public Room(){}
    /**
     * 有参数构造
     */
    public Room(int no, String roomType, boolean status) {
        this.no = no;
        this.roomType = roomType;
        this.status = status;
    }
    /**
     * Getter and Setter
     */
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * 重写equals
     */
    @Override
    public boolean equals(Object obj) {
        //传入对象为空或者对象不是RoomManageSystem创建的实例放回false
        if (obj==null || !(obj instanceof Room)) return false;
        // 内存地址相同
        if (this==obj) return true;
        // 向下转型
        Room r = (Room) obj;
        // 当前房间编号==传递过来的房间编号，两个房间编号相同，则认为是同一个对象,因为是int可以用双等号
        if (this.no==r.getNo()) return true;
        return false;
    }
    /**
     * 重写toString，直接打印对象时不会直接打印内存地址
     */
    @Override
    public String toString() {
        return "{[房间编号]："+no+" [房间类型]："+roomType+" [状态]："+(status?"占用":"空闲")+"}";
    }

    /**
     * 测试
     * @param args
     */
    /*public static void main(String[] args) {
        Room r = new Room(101,"单人间",true);
        //System.out.println(r.toString());
        System.out.println(r); //自动调用toString
    }*/

}
