package com.minsusu.面向对象06.this的使用;


public class User {
    String name = "java";  // 实例属性
    static String _name = "User";  // 类属性


    public static void main(String[] args) {
        // 访问静态方法
        User._sum();

        // 访问实例方法
        User u = new User();
        u.sum();
    }
    /**
     * static修饰的方法中没有this
     */
    public static void _sum(){
       // this.name;  // 错误的
       // name;  // 错误
       //  如果要访问实例变量需要new
        User u = new User();
        System.out.println("这是静态方法中访问实例属性"+u.name);
    }

    /**
     * 没有static修饰的实例方法
     */
    public void sum(){
        System.out.println(_name);
        String names = this.name;
        // or
        // String names = name;
        System.out.println("这是在实例方法中访问实例属性"+names);
    }

}
