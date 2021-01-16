package com.minsusu.数组06;

import java.util.Scanner;

/**
 * 房间管理系统案例
 */
public class RoomMeangeSystem {
    public static void main(String[] args) {

        //创建一个酒店对象
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用酒店订房系统");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1.查看所有房间");
            System.out.println("2.订房");
            System.out.println("3.退房");
            System.out.println("0.退出系统");
            System.out.print("请输入对应功能：");

            int i = s.nextInt();
            if (i == 1) {
                hotel.print();
            } else if (i == 2) {
                System.out.print("请输入订房编号");
                int roomNo = s.nextInt();
                hotel.order(roomNo);
            } else if (i == 3) {
                System.out.print("请输入退房编号");
                int roomNo = s.nextInt();
                hotel.checkOut(roomNo);
            } else if (i == 0){
                System.out.println("退出……");
                break;
            }else {
                System.out.println("没有此功能，请检查\n");

            }
        }


    }

}
