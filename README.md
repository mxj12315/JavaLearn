# Java笔记

[TOC]

------

运行一个Java程序的步骤：
1、编辑源代码xxx.java
2、编译xxx.java文件生成字节码文件xxx.class
3、JVM中的类加载器加载字节码文件
4、JVM中的执行引擎找到入口方法main()，执行其中的方法

![2019052212505029](F:\java学习\md_img\2019052212505029.png)

## 一、JDK、JRE、JVM区别与联系

JDK是 Java 语言的软件开发工具包(SDK)。在JDK的安装目录下有一个jre目录，里面有两个文件夹bin和lib，在这里可以认为bin里的就是jvm，lib中则是jvm工作所需要的类库，而jvm和 lib合起来就称为jre。

### 1.1jdk

> JDK(Java Development Kit) 是整个JAVA的核心，包括了Java运行环境（Java Runtime Envirnment），一堆Java工具（javac/java/jdb等）和Java基础的类库（即Java API 包括rt.jar）。
> JDK是java开发工具包，基本上每个学java的人都会先在机器 上装一个JDK，那他都包含哪几部分呢？在目录下面有 六个文件夹、一个src类库源码压缩包、和其他几个声明文件。其中，真正在运行java时起作用的 是以下四个文件夹：bin、include、lib、 jre。有这样一个关系，JDK包含JRE，而JRE包 含JVM。

### 1.2JRE

> JRE（Java Runtime Environment，Java运行环境），包含JVM标准实现及Java核心类库。JRE是Java运行环境，并不是一个开发环境，所以没有包含任何开发工具（如编译器和调试器）
> JRE是指java运行环境。光有JVM还不能成class的 执行，因为在解释class的时候JVM需要调用解释所需要的类库lib。 （jre里有运行.class的java.exe）
> JRE （ Java Runtime Environment ），是运行 Java 程序必不可少的（除非用其他一些编译环境编译成.exe可执行文件……），JRE的 地位就象一台PC机一样，我们写好的Win64应用程序需要操作系统帮 我们运行，同样的，我们编写的Java程序也必须要JRE才能运行。

### 1.3JVM

> JVM（Java Virtual Machine），即java虚拟机, java运行时的环境，JVM是一种用于计算设备的规范，它是一个虚构出来的计算机，是通过在实际的计算机上仿真模拟各种计算机功能来实现的。针对java用户，也就是拥有可运行的.class文件包（jar或者war）的用户。里面主要包含了jvm和java运行时基本类库（rt.jar）。rt.jar可以简单粗暴地理解为：它就是java源码编译成的jar包。Java虚拟机在执行字节码时，把字节码解释成具体平台上的机器指令执行。这就是Java的能够“一次编译，到处运行”的原因。
>
> 包含栈内存、堆内存、方法区内存

### 1.4JDK、JRE、JVM三者联系

> JVM不能单独搞定class的执行，解释class的时候JVM需要调用解释所需要的类库lib。在JDK下面的的jre目录里面有两个文件夹bin和lib,在这里可以认为bin里的就是jvm，lib中则是jvm工作所需要的类库，而jvm和 lib和起来就称为jre。JVM+Lib=JRE。总体来说就是，我们利用JDK（调用JAVA API）开发了属于我们自己的JAVA程序后，通过JDK中的编译程序（javac）将我们的文本java文件编译成JAVA字节码，在JRE上运行这些JAVA字节码，JVM解析这些字节码，映射到CPU指令集或OS的系统调用。

### 1.5JDK、JRE、JVM三者区别

> a.JDK和JRE区别：在bin文件夹下会发现，JDK有javac.exe而JRE里面没有，javac指令是用来将java文件编译成class文件的，这是开发者需要的，而用户（只需要运行的人）是不需要的。JDK还有jar.exe, javadoc.exe等等用于开发的可执行指令文件。这也证实了一个是开发环境，一个是运行环境。
> b.JRE和JVM区别：JVM并不代表就可以执行class了，JVM执行.class还需要JRE下的lib类库的支持，尤其是rt.jar。

## 二、JDK目录

JDK/bin目录下有javac.exe和java.exe

> javac.exe：负责编译

> java.exe：负责运行

# 开始

一个java源文件中public修饰的class必须和文件名保持一致，只能定义一个public class

```java
// hello.java

public class hello {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("hello java");
	}

}
```

## 1、java`文件中能包含多`class`

```java
package hello;

public class hello {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("hello java");
	}

}

class A{
	public static void main(String[] args) {
		System.out.println("hello java A");
	}
}


class B{
	public static void main(String[] args) {
		System.out.println("hello java B");
	}
}

class C{
	public static void main(String[] args) {
		System.out.println("hello java C");
	}
}
```

## 2、编译

只检查语法

```powershell
javac hello.java  // 生成A.class   B.class  ……
```

## 3、运行

负责运算

```powershell
# java运行的时候，有包名要带上包名
javac -encoding UTF-8 com/minsusu/数组02/ArrayTest02.java   // xxx代表xxx.class文件 
# 编译异常：错误: 编码GBK的不可映射字符
# 使用 javac -encoding UTF-8 TestIf.java
# or
java xxx   // xxx代表xxx.class文件，不需要写.class后缀名
```

# 规范

## 标识符

> 类名
>
> 方法名
>
> 接口名
>
> 常量名

## 标识符命名规范

构成：数字、字母、$ 、_ 

> 不能以数字开头
>
> 严格区分大小写
>
> 非关键字
>
> 见名知意
>
> 多个单词使用CamelCase驼峰命名法
>
> 类名、接口名：首字母大写，后面每个单词首字母大写
>
> 常量名、方法名：首字母小写，后面单词首字母大写
>
> 常量名：全部大写

## 关键字和保留字

| 类别                 | 关键字       | 说明                         |
| -------------------- | ------------ | ---------------------------- |
| 访问控制             | private      | 私有的，只能在本类中使用     |
| –                    | protected    | 受保护的，同包下，子类可访问 |
| –                    | 缺省         | 同包下可访问                 |
| –                    | public       | 公共的，所有地方都可以访问   |
| 类、方法和变量修饰符 | abstract     | 声明抽象                     |
| –                    | class        | 类                           |
| –                    | extends      | 扩充/继承                    |
| –                    | final        | 最终值，不可改变的           |
| –                    | implements   | 实现（接口）                 |
| –                    | interface    | 接口                         |
| –                    | native       | 本地，原生方法（非Java实现） |
| –                    | new          | 新，创建                     |
| –                    | static       | 静态                         |
| –                    | strictfp     | 严格，精准                   |
| –                    | synchronized | 线程，同步                   |
| –                    | transient    | 短暂                         |
| –                    | volatile     | 易失                         |
| 基本类型             | boolean      | 布尔型                       |
| –                    | byte         | 字节型                       |
| –                    | char         | 字符型                       |
| –                    | double       | 双精度浮点                   |
| –                    | float        | 单精度浮点                   |
| –                    | int          | 整型                         |
| –                    | long         | 长整型                       |
| –                    | short        | 短整型                       |
| 程序控制语句         | break        | 跳出循环                     |
| –                    | case         | 定义一个值以供switch选择     |
| –                    | continue     | 继续                         |
| –                    | default      | 默认                         |
| –                    | do           | 运行                         |
| –                    | else         | 否则                         |
| –                    | for          | 循环                         |
| –                    | if           | 如果                         |
| –                    | instanceof   | 实例                         |
| –                    | return       | 返回                         |
| –                    | switch       | 根据值选择执行               |
| –                    | while        | 循环                         |
| 变量引用             | super        | 父类，超类                   |
| –                    | this         | 本类                         |
| –                    | void         | 无返回值                     |
| 包相关               | import       | 引入                         |
| –                    | package      | 包                           |
| 错误处理             | assert       | 断言表达式是否为真           |
| –                    | catch        | 捕捉异常                     |
| –                    | finally      | 有没有异常都执行             |
| –                    | throw        | 抛出一个异常对象             |
| –                    | throws       | 声明一个异常可能被抛出       |
| –                    | try          | 捕获异常                     |
| 保留关键字           | goto         | 是关键字但不能使用           |
| –                    | const        | 是关键字但不能使用           |
| –                    | null         | 空                           |



# 变量

## 1、字面值（=后面的）

| **数据类型**           | **默认值** |
| :--------------------- | :--------- |
| byte                   | 0          |
| short                  | 0          |
| int                    | 0          |
| long                   | 0L         |
| float                  | 0.0f       |
| double                 | 0.0d       |
| char                   | 'u0000'    |
| String (or any object) | null       |
| boolean                | false      |

| 基本类型            | 所占字节 | 最大值和最小值（二进制） | 最大值和最小值（十进制）                  |
| ------------------- | -------- | ------------------------ | ----------------------------------------- |
| byte（数值类型）    | 1        | -2^7到2^7 -1             | -128到127                                 |
| short（数值类型）   | 2        | -2^15到2^15 -1           | -32768到32767                             |
| int（数值类型）     | 4        | -2^31到2^31-1            | -2147483648到2147483647                   |
| long（数值类型）    | 8        | -2^63到2^63 -1           | -9223372036854775808到9223372036854775807 |
| float（浮点类型）   | 4        | 单精度                   |                                           |
| double（浮点类型）  | 8        | 双精度                   |                                           |
| char（字符类型）    | 2        | 0到2^16-1                | 0到65535                                  |
| boolean（布尔类型） | 1        | true或者false            |                                           |

**使用例子**

long型: long i = 10L;(l或L结尾)

int型: int i = 10; (int为默认类型)

16进制hex型: int hexVal = 0x2f;

8进制ox型: int oxVal = 012;

2进制bin型: int binVal = 0b10110;

float型(f或F结尾)

double型：以d或D结尾，默认类型，可以不写

浮点型科学计数法: e或E表示，e2为10的二次方(即100)，1.2e2为1.2*100

字符: 单引号

字符串: 双引号

转义字符: 以\表示, \r(回车), \n(换行), \t(制表)

## 2、简单类型判断

```java
public class TypeIns {
    public static void main(String[] args) {
        Object object = 9;// Object类
        System.out.println("是否是String:" + TypeConversion.isString(object));// 判断是否是|String类型
        System.out.println("是否是Int:" + TypeConversion.isInt(object));
        System.out.println("获取当前Object类型：" + TypeConversion.getClassType(object));
        Class<?> clazz = TypeConversion.getClassType(object);
        if (TypeConversion.isInt(clazz)) {// 判断是否是int
            System.out.println("是Integer类型");
        } else if (TypeConversion.isString(object)) {// 判断是否是string
            System.out.println("是String类型");

        }
    }
}
```

## 3、类型转换

![类型转换](F:\java学习\java notebook.assets\类型转换.png)

容量大的转换容量小的需要加上强制类型转换符

```java
byte a = 128  // 可以
byte b = 129  // 超过范围
byte b = (byte)129  // 强制转换，值超出
```

编译和运算，编译和运行不能搞混淆

```java
int i = 3;
byte n = i/3  // 正确
/*
*等号左边是byte类型，右边是int类型【(byte)(int)10=>byte类型，除3,3是int,结果是int类型】，属于大容量转为小容量，报错可能损失*精度
*/
byte m = (byte)(int)10/3 // 错误
    
byte m = (byte)(int)(10/3)  // 正确
```

## 4、局部变量、成员变量、类变量

静态变量：由static修饰的变量为静态变量 本质为全局变量
成员变量、类变量区别：
1、成员变量随着对象创建存在 对象回收而释放
2、静态变量随着类加载而存在 类消失而消失

3、成员变量只能被对象调用
4、静态变量可以被对象和类调用

5、成员变量也称实例变量、数据存储在堆内存的对象中 称对象的特有数据
6、静态变量也称类变量、数据存储在方法区 称对象的共享数据

7、类变量声明在类中、方法体之外 但必须声明为static类型
8、静态方法不能使用`this `因为`this`代表对象

举例如下：
局部变量：在方法、构造方法、语句块中定义的变量。其声明和初始化在方法中实现，在方法结束后自动销毁

```java
public class  ClassName{
    public void printNumber(){
        int a;
    }
    // 其他代码
}
```



成员变量：定义在类中，方法体之外。变量在创建对象时实例化。成员变量可被类中的方法、构造方法以及特定类的语句块访问。

```java
public class  ClassName{
    int a;
    public void printNumber(){
        // 其他代码
    }
}
```



类变量：定义在类中，方法体之外，但必须要有 static 来声明变量类型。静态成员属于整个类，可通过对象名或类名来调用。

```java
public class  ClassName{
    static int a;
    public void printNumber(){
        // 其他代码
    }
}
```



二、类构造方法
1、构造方法名字和类相同 没有返回值
2、不能直接调用构造方法 要通过`new`关键字来自动调用、从而创建类的实例
3、Java类必须要有构造方法 如果没有Java编译器会自动提供不带参数的构造方法
4、New关键字的作用：为对象分配内存空间 引起对象构造方法的调用 
5、使用java类实例化一个对象的时候，如果在类中不显式的声明其构造函数，则会使用一个默认的构造函数来初始化对象。
实例：

```java
//一个没有显式声明构造函数的类
public class People{
  int age = 23;
  public void getAge(){
      System.out.print("the age is "+age);
  }
}
```



//用这个类来实例化一个对象
`People xiaoMing = new People(); // People() 是People类的默认构造函数，它什么也不干
xiaoMing.getAge();//打印年龄`

可以在声明类的时候显式的声明一个构造函数：

```java
//一个带显式构造函数的类
public class People{
  int age = 23;
      public void getAge(){
      System.out.print("the age is "+ age);
  }
  // 显式声明一个带参数的构造函数，用于初始化年龄
  public People(int a){
      this.age = a;
  }
}

//用这个类来实例化一个对象
People xiaoMing = new People(20); // 使用带参数的构造函数来实例化对象
xiaoMing.getAge(); // 打印出来的年龄变为20
```



三、成员变量与局部变量的区别
1、声明位置不同
成员变量也就是属性，在类中声明的。
局部变量，在方法中声明或代码块中声明。

2、初始值不同
成员变量如果没有赋值则是有默认值的，数据类型不同则默认值不同。
局部变量是没有默认值，也就是说必须先声明，再赋值，最后才使用。

3、在一个类中，局部变量可以与成员变量同名，但是局部变量优先,如果非要访问成员变量的属性，则必须使用 `this.color`
`this` 代表当前这个对象，也就是当前谁调用这个方法则这个对象就是谁。
对象与引用的区别
对象是具体的一个实例，如：`new Student(); new `表示创建一个对象，并在堆内存中开辟一块空间。
用名称是存放的对象的地址。

# 运算符

## 1、算术运算符

算术运算符用于在数学表达式中，他们是在代数中使用的方法相同。假设整型变量a=20，b=10，则：

![算数运算符](F:\java学习\java notebook.assets\算数运算符.png)

++在变量前：先进行自加1，在赋值，--，同理

```java
int a = 10;
int b = ++ a  // b = 11, a =11
```

++在变量后：先赋值，在进行自加1，--，同理

```java
int a = 10;
int b =  a ++ // b = 10, a=11
```

+=等同于：a = (强制类型转换)(a+b)，不等同于a = a + b

```java
byte a = 10;
a = a + 10  // 错误
a += 10 // 正确  等同于a = （byte）(a+10)
```

+如果两侧都是数字，执行求和，如果有一个是字符串，那么执行拼接，结果也是字符串

```java
int a = 10;
int b = 20;
System.out.println(a+b);  // 30
System.out.println(a+b+"30");  // 3030
System.out.println("10+20="+(a+b));  // 10+20=30
System.out.println(a+"+"+b+"="+(a+b)); // 10+20=30,动态的
```

## 2、关系运算符

关系运算符用来比较操作数，结果一定是布尔类型，比较的是变量中的值，不是内存地址，假设变量a=20，b=10，则：

![关系运算符](F:\java学习\java notebook.assets\关系运算符.png)



## 3、逻辑运算符

逻辑运算符用来描述与、或、非逻辑关系，假设变量a=true，b=false，则：

![逻辑运算符](F:\java学习\java notebook.assets\逻辑运算符.png)

>  &&为取假运算，从左到右依次判断，如果遇到一个假值，就返回假值，以后不再执行，否则返回最后一个真值；
>
>  || 为取真运算，从左到右依次判断，如果遇到一个真值，就返回真值，以后不再执行，否则返回最后一个假值。

## 4、位运算符

位运算符可以应用到整数类型，长型，整型，短整型，字符和字节。它作用于位，并执行逐位操作。二进制位操作具体看：[二进制是怎样做位运算的](http://blog.csdn.net/ooppookid/article/details/51009508)
假设整型变量A=60（0011 1100）和变量B=13（0000 1101），则：

![位运算符](F:\java学习\java notebook.assets\位运算符.png)

## 5、赋值运算符

赋值运算符是为变量赋值所使用，如下：

![逻辑运算符](F:\java学习\java notebook.assets\逻辑运算符-1610376131929.png)

## 6、其它运算符_三元运算符

条件运算符也被称为三元运算符，可以作为赋值运算符种很特殊的一种，此运算符是确定哪些值应分配给变量。语法：

```java
value n = 布尔表达式
		？表达式1
		：表达式2
```

布尔表达式为true，选择表达式1作为整个表达式的执行结果，布尔表达式为false时，选择表达式2作为整个表达式的执行结果

"?"号左侧为条件表达式ture或false，如果true则将":"左侧值赋值给"="左侧的变量；如果false则将":"右侧值赋值给"="左侧的变量。

## 7、短路与和逻辑与

```java
// 逻辑与
int a = 1;
int b = 3;
System.out.println(a > b & ++a >2);   //false
System.out.println(a);  // a = 2,后续的代码被执行了


// 短路与
int a = 1;
int b = 3;
System.out.println(a > b && ++a >2);   //false
System.out.println(a);  // a = 1，后续的代码没有执行
```

# 控制语句

## 选择结构

### if ,if else语句

```java
if(布尔表达式) {
    // 表达式为true执行
}


///////////
if(布尔表达式) {
    // 表达式为true执行
}else {
    // 表达式为false执行
}


///////////
if(布尔表达式) {
    // 表达式为true执行
}else if(布尔表达式) {
    // 表达式为true执行
}else{
    // 表达式为false执行
}
```



### switch语句

**switch case 执行时，一定会先进行匹配，匹配成功返回当前 case 的值，再根据是否有 break，判断是否继续输出，或是跳出判断**

case 后面的value必须是String或者int类型，char类型会转为int

```java
switch(expression){
    case value :
       //语句
       break; //可选
    case value :
       //语句
       break; //可选
    //你可以有任意数量的case语句
    default : //可选
       //语句
}

// 例子
public class Test {
   public static void main(String args[]){
      //char grade = args[0].charAt(0);
      char grade = 'C';
 
      switch(grade)
      {
         case 'A' :
            System.out.println("优秀"); 
            break;
         case 'B' :
         case 'C' :
            System.out.println("良好");
            break;
         case 'D' :
            System.out.println("及格");
            break;
         case 'F' :
            System.out.println("你需要再努力努力");
            break;
         default :
            System.out.println("未知等级");
      }
      System.out.println("你的等级是 " + grade);
   }
}


// 简单的计算器
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
```

## 循环语句

### for循环

初始化变量可以多个，三个值可以省略不写，但是分号必须保留

```java
for(初始化; 布尔表达式; 更新) {
    //代码语句
}

// 例子
public class forxunhuan {
    public static void main(String[] args) {
        for(int x = 10; x < 20; x++) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
    }
}


```

```java
// continue
public class forxunhuan {
    public static void main(String[] args) {
        for(int x = 10; x < 20; x++) {
            if (x == 15 ){
                continue;   //  x == 15的时候不再执行后续代码，进入下一次循环
            }
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
    }
}

// result
value of x : 10
value of x : 11
value of x : 12
value of x : 13
value of x : 14
value of x : 16
value of x : 17
value of x : 18
value of x : 19
```

```java
// break
public class forxunhuan {
    public static void main(String[] args) {
        for(int x = 10; x < 20; x++) {
            if (x == 15 ){
                break;   //  x == 15的时候不再执行后续代码，进入下一次循环
            }
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
    }
}

//result
value of x : 10
value of x : 11
value of x : 12
value of x : 13
value of x : 14
```

计算质素

```java
public class forxunhuan {
    public static void main(String[] args) {
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
```



### while循环

```java
while(布尔表达式){
    //java语句；
}

//例子
public class whilexunhuan {
    public static void main(String[] args) {
        int a = 1;
        while (a<10){
            System.out.println("while执行");
            a++;
            System.out.println(a);
        }
    }
}
```



### do……while循环

```java
do {
       //代码语句
}while(布尔表达式);

// 例子
public class dowhile {
    public static void main(String[] args) {
        int a =0;
        do{
            System.out.println(a);
            a++;
        }while (a<10);
    }
    
//result
1
2
3
4
5
6
7
8
9
```

# 用户键盘输入

![java源文件](F:\java学习\java notebook.assets\java源文件.jpg)

```java
public class input {
    public static void main(String[] args) {
        // java.util是java sun公司的包名
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("请输入内容：");
        String userInput=in.next();
        System.out.println("用户输入的是："+userInput);
    }
}

// or
import java.util.Scanner

public class input {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入内容：");
        String userInput=in.next();
        System.out.println("用户输入的是："+userInput);
    }
}

```

# 方法（函数）

## 方法是什么

能够完成独立功能的重复利用的代码段

定义在类体中，没有先后顺序（原因java是先编译在执行）

方法体中不能在定义方法

方法体中的代码是自上而下执行

方法不被调用不会分配内存【栈内存】，方法调用的时候，会给该方法执行push压栈动作，调用完毕后执行pop弹栈动作，释放空间

```java
public class function {
    //主方法，入口，main函数有jvm负责调用,最先被调用，也是最后结束
    public static void main(String[] args) {
         int result = getSum(1,3);
         System.out.println(result);
    }

    // 方法
    public static int getSum(int a, int b){
        return  a+b;
    }
}


// result
4
```

## 方法的定义

```java
[修饰符列表] 返回值类型 方法名(形式参数){
	方法体：
}
```

## 返回值类型

定义返回值类型为`void`，则方法内部不能有任何返回值，但是return需要写，虽然可以省略，但是一般都写上，（mian函数中除外），同理在定义没有返回值的函数是，必须写`void`

定义返回值类型，与方法内部的返回值必须相同，否则编译报错

返回类型：byte,short,int,long,falot,double,true,false,void

- 基本数据类型
- 引用类型



```java
 // 方法  正确的
    public static int getSum(int a, int b){
        return  a+b;
    }

 // 方法  错误的 方法定义返回类型是int,但是返回的是Boolean类型
    public static int getSum(int a, int b){
        return  true;
    }
```

## 方法的调用

类名.方法名，当前类中的调用可以省略类名

```java
public class function {
    // 方法
    public static int getSum(int a, int b){
        return  a+b;
    }
    //主方法，入口
    public static void main(String[] args) {
         int result = getSum(1,3);  // 或 int result = function.getSum(1,3)
         System.out.println(result);
         int result1 = sub.subs(6,1);  // 类名.方法名
         System.out.println(result1);
    }

};



class sub {
    public  static int subs(int x,int y){
        return x-y;
    }
}
```

## 方法重载overload

**不使用重载**，功能相似的需要些多个

```java
public class overLoad {
    //方法不使用重载，功能相似的需要些多个
    public static void main(String[] args) {
        int resInt = sumInt(1, 2);
        double resDouble = sumDouble(1.0, 2.0);
        long resLong = sumLong(1L, 2L);
        System.out.println(resInt + "\t" + resDouble + "\t" + resLong);
		int resMore = sumMore(1, 2, 3)
        System.out.println(resMore)
    }

    public static int sumInt(int a, int b) {
        return a + b;
    }

    public static double sumDouble(double a, double b) {
        return a + b;
    }

    public static long sumLong(long a, long b) {
        return a + b;
    }
    
    public static int sumMore(int a, int b, int c) {
        return a + b + c;
    }
}
```

**使用方法重载**，相似的功能的函数名称相同，调用函数名称相同，根据穿入的列表不同自动调动对应的方法

不需要记忆更多的方法名，更加美观

```java
public class overLoad {
//    使用方法重载,方法名相同，参数类型或者数量不同
public static void main(String[] args) {
    int resInt = sum(1, 2);
    double resDouble = sum(1.0, 2.0);
    long resLong = sum(1L, 2L);
    System.out.println(resInt + "\t" + resDouble + "\t" + resLong);
    // 多个参数的
	System.out.println(sum(1,2,3));
}

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }
    
    //多个参数
    public static long sum(int a, int b, int c) {
        return a + b + c;
    }
}
```

## 方法递归调用

```java
public class recursion {
    // 计算1~n的和
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    //    求和
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

}
```

# java面向对象

**面向过程**：面向过程，你得先分析出解决问题的步骤，然后用函数把这些步骤一步一步地实现，解决的时候就是一个一个函数地调用，都是以因果关系构成，只要其中的因果关系断裂，导致整个程序奔溃

优点：性能比面向对象高，因为类调用时需要实例化，开销比较大，比较消耗资源;比如单片机、嵌入式开发、 Linux/Unix等一般采用面向过程开发，性能是最重要的因素。
缺点：没有面向对象易维护、易复用、易扩展，耦合度高

洗衣机例子：

> 1 执行加洗衣粉方法；
>
> 2.执行放洗涤剂方法
>
> 3.执行加水方法；
>
> 4.执行放衣服，洗衣服方法；
>
> 5.执行清洗方法；
>
> 6.执行烘干方法；

**面向对象**：类中某个具体的实例，独立体（比如独立显卡），比如人类张三，李四就是类的某个对象，他们有自己独特的个性。

优点：易维护、易复用、易扩展，由于面向对象有封装、继承、多态性的特性，可以设计出低耦合的系统，使系统 更加灵活、更加易于维护
缺点：性能比面向过程低

洗衣机例子：

> 我先搞个洗衣机对象和人对象 
>
> 洗衣机： 加入一些属性和方法 洗衣服方法 清洗方法 烘干方法    
>
> 人：加洗衣粉方法 加水方法 
>
> 然后 人.加洗衣粉 人.加水  洗衣机.洗衣服 洗衣机.清洗 洗衣机.烘干

## 面向对象三个特点

封装性

继承性

多态性

在整个生命周期中包含

> 面向对象发行：OOA
>
> 面向对象设计：OOD
>
> 面向对象编程：OOP

## 类Class

代表代表一类具有共同特征的事物，比如汽车设计图

类所描述的是多个对象的共同特征（属性），例如身高，年龄

同时类也有共同的动作（函数or方法）

要访问类内部特征需要创建对象

类的定义:一个类文件中`public class`只能有一个

```java
[标识符] class 类名{
    //类的属性
    //类的方法
}
```



## 对象Instance

通过类生成的独立个体，比汽车轮胎、汽车发动机 ，将这些对象组装起来就形成汽车（程序）

`new className（）`存入堆内存中 

## 面向对象例子

```java
package 面向对象;

public class Addr {
    String city;
    String email;
    int postcode;
}
```

```java
package 面向对象;

public class Student {
    String name;  // 引用类型，java自带，不用new
    int age;  // 基本数据类型
    double height;
    Addr addr;  // 引用类型，指向Addr类，使用需要new 意义：语意明确，相互关联
}
```

```java
package 面向对象;

public class User {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 18;
        s.name = "张三";
        s.addr = new Addr();
        s.addr.city="北京";
        s.addr.email = "837850238@qq.com";
        s.addr.postcode = 8712314;
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.addr.city);
        System.out.println(s.addr.email);
        System.out.println(s.addr.postcode);
    }
}
```

### 空指针异常

`Exception in thread “main” java.lang.NullPointerException`空指针异常

空实例对象访问属性时候报错

```java
public class B{
	int a;
}
```

```java
public class A{
	public static void main(String[] args){
        B value = new B();
        value = null   // 对象赋值为空
        System.out.printlb(Value)  // 报错
    }
}
```

# **封装

封装优点：

① 类的成员变量可以成为只读或者只写的。

② 类可以对储存在其中的成员变量中的内容有一个整体的控制。

③类的用户不需要知道类是如何储存数据的。

## Getter和Setter方法

注意：需不要static修饰

```java
package com.minsusu.面向对象01;

public class Student {
    private String name;
    private int age;
    private double height;

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public double getHeight() {
          return height;
     }

     public void setHeight(double height) {
          this.height = height;
     }
}
```

调用引用.Getter或Setter

```java
package com.minsusu.面向对象01;

public class User {
    public static void main(String[] args) {
        Student s = new Student();
        // Setter方法
        s.setAge(18);
        s.setName("张三丰");
        s.setHeight(1.80);
        // Getter方法
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println(s.getHeight());
    }
}
```

## 构造方法

### 作用

> 1、构造方法名字和类相同 返回值类型就是该类，不写返回值和返回类型
> 2、不能直接调用构造方法 要通过new关键字来自动调用、从而创建类的实例
> 3、Java类必须要有构造方法，如果没有Java编译器会自动提供不带参数的构造方法，称为缺省构造器` new Student()`，如果定义了构造方法，那么系统不再提供默认的缺省构造器
> 4、New关键字的作用：为对象分配内存空间 引起对象构造方法的调用 
> 5、使用java类实例化一个对象的时候，如果在类中不显式的声明其构造函数，则会使用一个默认的构造函数来初始化对象。

### 调用：

` new Student("张三丰", 18, 1.80)`

格式：

> 构造方法名和类名保持一致
>
> 构造方法：构造函数、初始化方法、构造器、Constructor

```java
[修饰符列表] 构造方法名(形式参数列表){
	构造方法体；
    没有返回值
}

// 生成Student类的构造方法（构造函数、初始化方法、构造器）
public Student(String name, int age, double height) {
          this.name = name;
          this.age = age;
          this.height = height;
     }
```

### 使用

```java
package com.minsusu.面向对象02.构造方法;

public class User {
    public static void main(String[] args) {
        Student s = new Student("王小二", 18, 1.65);  // 自动调用Setter方法
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println(s.getHeight());
    }
}
```

```java
package com.minsusu.面向对象02.构造方法;

public class Student {
    private String name;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public double getHeight() {
          return height;
     }

     public void setHeight(double height) {
          this.height = height;
     }
}
```

### 构造方法重载

```java
package com.minsusu.面向对象03.构造方法重载;

public class Student {
    private String name;
    private int age = 18;
    private double height;

    // 手动创建缺省构造器
    public Student() {

    }
    // 一个参数的构造器，可以用于方法重载，可以使用默认值
    public Student(String name) {
        this.name = name;
    }
    // 一个参数的构造器，可以用于方法重载，可以使用默认值
    public Student(int age) {
        this.age = age;
    }
    

    // 一个参数的构造器，可以用于方法重载，可以使用默认值
    public Student(double height) {
        this.height = height;
    }
    // 两个参数的构造器，可以用于方法重载，可以使用默认值
    public Student(String name, double height) {
        this.name = name;
        this.height = height;
    }
	// 三个参数的构造器，可以用于方法重载
    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
	
    // Getter和Setter
    public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public double getHeight() {
          return height;
     }

     public void setHeight(double height) {
          this.height = height;
     }
}
```

```java
package com.minsusu.面向对象03.构造方法重载;

public class User {
    public static void main(String[] args) {
        Student s = new Student("王小二", 18, 1.65);
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println(s.getHeight());
        Student s1 = new Student("王小二", 1.65);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getHeight());

    }
}
```

### static静态方法和非静态方法的调用

```java
package com.minsusu.面向对象04.静态方法和非静态方法;

public class User {
    public static void main(String[] args) {
        // 调用static修饰的静态方法：类名.方法名()  或者 方法名()
        User.sum();
        // or
        //sum();

        // 调用不带static修饰的静态方法:需要new 构造方法(参数列表)
        User u = new User();
        u._sum();

    }

    /*
    * 这是static修饰符的方法
    */
    public static void sum(){
        System.out.println("static方法");
    }

    /*
     * 这是不带static修饰符的方法
     */
    public void _sum(){
        System.out.println("不带static方法");
    }
}
```

### 函数的传递参数

传递基本类型的参数不会修改原来的值

```java
package com.minsusu.面向对象05.变量类型;

public class User {
    public static void main(String[] args) {
		// 传递基本类型的参数
        int i = 10;
        increment(i);   
        System.out.println("main1:" + i);  // 10        
    }

  

    public static void increment(int i) {
        i++;
        System.out.println("increment:" + i);  // 11
    }
}
```

传递引用类型的参数，会修改原来变量中的值，传递的是引用地址

```java
package com.minsusu.面向对象05.变量类型;

public class User {
    public static void main(String[] args) {
        // 传递引用类型参数
        Student s = new Student();
        s.age = 10;
        increment(s);  //10
        System.out.println("main2:" + s.age);  // 11
    }

    public static void increment(Student s) {
        s.age++;
        System.out.println("increment:" + s.age);  // 11 
    }
}
```

## this关键字

类中带有static的方法（静态方法）中没有this

类中不带static的方法（实例方法），this指向当前对象

实例方法可以直接方法类成员变量和类成员方法

this（参数）：通过本类中调用本类中另一种形式的构造函数（应该为构造函数中的第一条语句）。

```java
package com.minsusu.面向对象06.this的使用;


public class User {
    String name = "java";  // 实例属性
    static String _name;  // 类属性
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
        String names = this.name;
        // or
        // String names = name;
        System.out.println("这是在实例方法中访问实例属性"+names);
    }

}
```

`this()`

```java
class B extends A {
    public B() {
        this("周杰伦");  // 调用本类中的另一个构造器
        System.out.println("B的无参数构造方法");
    }


    public B(String s) {
        System.out.println("B的有参数构造方法");
    }
}
```

## super关键字

`super`关键字能够出现在实例方法和构造方法中

`super`不能出现在static静态方法中

`super.`大部分情况下可以省略

`super.` 什么情况下不可省略：

`super()`只能出现在构造方法的第一行，通过当前的构造方法调用父类的构造放过，实现代码复用

`super（参数）`：调用父类中的某一个构造函数（应该为构造函数中的第一条语句）。

`super()`和`this()`，只能有一个，没有`this()`，系统会默认调用`super()`

`super()`默认先执行父类的构造方法，无论什么情况父类的构造方法一定会执行

super的语法：

```java
super();
super(参数); // 调用某一个有参数的构造方法
// or
super.
```

例子

```java
package com.minsusu.面向对象13.super关键字;


public class SuperTest {
    public static void main(String[] args) {
        new B();
    }
}


class A {
    // 建议写上无参构造，防止子类继承时候默认调用super()，无参数构造方法
    public A() {
        System.out.println("A的无参数构造方法");
    }

    public A(int a) {
        System.out.println("A的有参数构造方法");
    }
}


class B extends A {
    public B() {
        // super(); // 默认的
        // super(1);  // 调用父类中的有参数的构造器
        this("周杰伦");  // 调用本类中的另一个构造器
        System.out.println("B的无参数构造方法");
    }


    public B(String s) {
        System.out.println("B的有参数构造方法");
    }
}
```

# **继承

作用：代码复用和多态

java中是单继承，但是也可以间接多继承，比如C类继承B继承，B继承A类，所以C类间接继承B类和A类

如果一个类没有显示的继承某一个类，那么该类继承默认继承祖宗类java.lang.Object

## 语法格式

```java
[修饰符列表] class 类名 extends 父类名{
    类体;
}
```

## 常见术语

B继承A类：

> A类：称为父类，基类，超类，superclass
>
> B类：称为子类、派生类subclass

## 限制

> 私有的属性和方法不支持继承
>
> 构造方法不支持继承
>
> 其他数据都可以继承

## 例子

```java
package com.minsusu.面向对象07.继承;

public class C {
    private String cname;
    private int cage;
    double cheight = 1.80;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }
}
```

```java
package com.minsusu.面向对象07.继承;

public class B extends C{
    private String bname = "B";
    int age;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBname(){
        return this.bname;
    }



}
```

```java
package com.minsusu.面向对象07.继承;

public class A extends B{
    public static void main(String[] args) {
        A a= new A();
        System.out.println(a.cheight);  // 访问c
        a.setCname("a传递的cname");
        System.out.println(a.getCname());


        System.out.println(a.getBname()); // 访问B
    }
}
```

### 方法重写override

父类的方法无法满足子类需要重写，子类在调用重写方法时调用重写后的方法

注意：

> 尽量去父类中复制粘贴，防止方法名写错
>
> 重写的方法名相同，返回类型相同，参数列表相同
>
> 访问权限不能更低，只能更高，父类使用public（最高权限），子类只能为最高public
>
> 抛出异常可以更少，不能更多
>
> 静态方法不能重写
>
> 覆盖只针对方法不针对属性

重载：发生在同一个类中

重写:在继承关系中

### 例子

```java
package com.minsusu.面向对象08.方法重写;


import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 猫类
 */
public class Cat extends Animal{
    public static void main(String[] args) {
        Cat c = new Cat();
        // c.go();   // 动物在跑
        c.go();  // 重写=》猫在睡觉
    }

    /**
     * 方法重写
     */
    @Override
    public void go() {
//        super.go();
        System.out.println("猫在睡觉");
    }
}

```

```java
package com.minsusu.面向对象08.方法重写;

/**
 * 动物类
 */
public class Animal {
    public void go(){
        System.out.println("动物在跑");
    }
}
```

# **多态

## 涉及概念

**向上转型** upcasting：又称自动转型

> 子类型=>父类型

**向下转型**：又称强制类型转换（需要加强制类型转换符）

> 父类型=>子类型

## 条件

> 一、要有继承；
> 二、要有重写；
> 三、父类引用指向子类对象。

## 例子1

```java
package com.minsusu.面向对象09.多态;

/**
 * 动物类
 */
public class Animal {
    public void go(){
        System.out.println("动物在跑");
    }
}
```

```java
package com.minsusu.面向对象09.多态;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 鸟类
 */
public class Brid extends Animal{
    /**
     * 重写父类方法
     */
    @Override
    public void go() {
        // super.go();
        System.out.println("鸟会飞");
    }


    public void fly(){
        System.out.println("鸟儿飞行中");
    }
}

```

```java
package com.minsusu.面向对象09.多态;


/**
 * 猫类
 */
public class Cat extends Animal {


    /**
     * 方法重写
     */
    @Override
    public void go() {
//        super.go();
        System.out.println("猫在睡觉");
    }

    public void arrest(){
        System.out.println("猫抓老鼠");
    }
}
```

```java
package com.minsusu.面向对象09.多态;

import com.minsusu.面向对象07.继承.B;

public class Test {
    public static void main(String[] args) {
        // 过去的写法
        Cat c  = new Cat();
        c.go();       // 猫在睡觉
        c.arrest();   // 猫抓老鼠

        Brid b = new Brid();
        b.go();  // 鸟会飞

        Animal a = new Animal();
        a.go(); // 动物在跑
        System.out.println("***************************");
        /*
         *  1、cat与animal是继承关系，cat是子类，animal是父类
         *  2、cat类型转为animal属于向上转型upcasting
         *  3、java中允许父类型引用指向子类型对象
         */
        Animal s = new Cat();

        /*
         * 多态：
         *  1、程序在编译阶段：检测的变量s的类型是Animal，只有go()方法，称之为静态绑定
         *  2、程序在运行阶段：s变量指向的是一个Cat类型的对象，调用Cat中的go()方法，称之为动态绑定
         */
        s.go();


        /*
        *编译期报错，Animal类型没有arrest()方法
         */
        // s.arrest()


        /*
         * 向下转型：当子类型中的方法时是特有的，父类中没有，那么需要将Animal型转为Cat型
         * 需要添加强制类型转换符
         */
        Cat s1 = (Cat) s;
        s1.arrest();
        // or
        ((Cat) s).arrest();



        Animal s2 = new Brid();
        /**
         * 报错：java.lang.ClassCastException：类型转换异常，强制类型转换会发生异常
         * 1、编译阶段：可以通过  Animal类型变量s2指向Brid类型的引用，s2（Animal）和s3(Cat)两者之间存在继承关系
         * 2、运行阶段：无法运行，检测到s2变量指向的是Brid引用，但是Brid类型转换为Cat类型，出现报错
         * 3、向上转型一般不会出现错误
         * 4、向下转型可能出现类型转换错误的异常
         * 5、如何避免：
         *  5.1、语法格式
         *      (引用 instanceof 数据类型名)=>Boolean
         */
         // Cat s3 = (Cat) s2;  // 不安全的写法

         // 安全的写法
        if (s2 instanceof Cat){  // s2是一个Cat的对象？
            Cat s3 = (Cat) s2;
            s3.arrest();
        }else if (s2 instanceof Brid){  // s2是一个Brid的对象？
            Brid s3 = (Brid) s2;
            s3.fly();
        }

    }
}

```

## 例子2（不用多态）

不使用多态

扩展能力弱，程序耦合度太高

```java
package com.minsusu.面向对象10.多态02;

/**
 * 鸟类
 */
public class Brid {

    public void eat() {
        // super.go();
        System.out.println("鸟吃稻谷");
    }


    public void fly(){
        System.out.println("鸟儿飞行中");
    }
}
```

```java
package com.minsusu.面向对象10.多态02;


/**
 * 猫类
 */
public class Cat  {

    public void eat() {
//
        System.out.println("小猫爱吃鱼");
    }

}
```

```java
package com.minsusu.面向对象10.多态02;

/**
 * 主人类
 */
public class Master {

    // 喂养猫的方法
    public void feed(Cat c){
        c.eat();
    }

    // 喂养鸟的方法
    public void feed(Brid b){
        b.eat();
    }

}
```

```java
package com.minsusu.面向对象10.多态02;


/**
 * 不使用更多态
 * 扩展能力不强，如果在加一个Dog类，则需要在Master类中添加feed(Dog d)方法
 * 耦合度太高，master类与cat、brid、dog类关联度太高
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();  // 创建猫对象
        Brid b = new Brid();  // 创建鸟对象
        Master m = new Master(); // 创建主人对象
        m.feed(c);
        m.feed(b);
    }
}
```

## 例子3（升级版）

```java
package com.minsusu.面向对象11.多态03升级版;

/**
 * 鸟类
 */
public class Brid extends Pet{

    @Override
    public void eat() {
        // super.go();
        System.out.println("鸟吃稻谷");
    }


    public void fly(){
        System.out.println("鸟儿飞行中");
    }
}
```

```java
package com.minsusu.面向对象11.多态03升级版;


/**
 * 猫类
 */
public class Cat extends Pet {

    @Override
    public void eat() {
        System.out.println("小猫爱吃鱼");
    }

}
```

```java
package com.minsusu.面向对象11.多态03升级版;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Dog extends Pet{
    @Override
    public void eat(){
        System.out.println("小狗爱吃骨头");
    }
}
```

```java
package com.minsusu.面向对象11.多态03升级版;


import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 主人类
 */
public class Master {

    // 传入pet类
    public void feed(Pet p){
        p.eat();
    }

}
```

```java
package com.minsusu.面向对象11.多态03升级版;


import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 宠物类：抽象的类abstract修饰
 */
abstract class Pet {
    abstract void eat();
}

```

```java
package com.minsusu.面向对象11.多态03升级版;


/**
 * 使用多态
 *  master类与抽象的Pet类关联
 * 降低程序耦合度，提高了程序的扩展力
 */
public class Test {
    public static void main(String[] args) {
        Pet c = new Cat();  // 创建猫对象,向上转型
        Pet b = new Brid();  // 创建鸟对象,向上转型
        Pet d = new Dog();  // 创建鸟对象,向上转型
        Master m = new Master(); // 创建主人对象
        m.feed(c);
        m.feed(b);
        m.feed(d);
    }
}
```

# final修饰符

final表示最终的

> final修饰的类无法被继承
>
> final修饰的方法无法被重写
>
> final修饰的变量赋值后不可以修改
>
> final修饰的实例变量必须手动赋值，final只能保证这个引用类型变量所引用的地址不会改变,即一直引用同一个对象,但这个对象完全可以改变
>
> final修饰的引用final只能保证这个引用的地址不会改变,即一直引用同一个对象,但这个对象完全可以改变

```java
package com.minsusu.面向对象12.final修饰符;

public class StringChrild extends String{
}


// 异常
java: 无法从最终java.lang.String进行继承
```

final修饰的实例变量不可变

```java
package com.minsusu.面向对象12.final修饰符;

public class FinalTest {
    // final int a;  // 错误
    final int a = 123;  // 正确
    
}
```

final修饰的引用类型，引用对象地址不可变，但是引用的内部可以修改

```java
package com.minsusu.面向对象12.final修饰符;

public class FinalTest {
    // final int a;  // 错误
    final int a = 123;  // 正确

    public static void main(String[] args) {
        final  A s  = new A();
        // s = new A();   //无法将值赋给 final 变量 's', 内存无法回收
        s.b= 18;
        System.out.println(s.b);   // 18
    }
}


class A {
    int b;
    public static final String GUO_JI = "中国";  // 常量
}
```

final和static结合使用=>常量，公开使用，但是不能修改

```java
public static final String GUO_JI = "中国"
```

# abstract抽象类（半抽象）

![抽象类abstract](F:\java学习\java notebook.assets\抽象类abstract.jpg)

具体类进一步抽象形成抽象类，抽象类再次抽象可以形成更高级的抽象类

抽象类本身不存在的，抽象类无法被实例化，存在的意义用来被子类继承，抽象类中有构造方法

`final`和`abstract`不能联合使用，不能同时出现

抽象类的数据类型：引用类型

抽象类中可以包含抽象方法和非抽象方法，抽象类中不一定有抽象方法，但是抽象方法必须出现在抽象类中

> 对象→类：抽象过程
>
> 类→对象：实例化
>
> 接口→类：实现implements

基本语法

```java
[修饰列表] abstract class 类名{
    类体;
}
```

抽象方法：必须在抽象类中

> 表示没有实现的方法，没有方法体
>
> `public abstract  void  sum();`
>
> 父类的抽象方法被子类继承时，必须将抽象方法实现

子类非抽象类，继承抽象父类，报错

```java
package com.minsusu.面向对象14.abstract抽象类;

public class AbstractTest {
    public static void main(String[] args) {
        new Dog();
    }
}


abstract class Animal{
    /**
     * 抽象方法
     */
    public abstract void run();
}

class Dog extends Animal{
    // 子类中不对父类的抽象方法实现会报错
    // java: com.minsusu.面向对象14.abstract抽象类.Dog不是抽象的, 并且未覆盖com.minsusu.面向对象14.abstract抽象类.Animal中的抽象方法run()
}
```

实现父类的抽象方法

```java
package com.minsusu.面向对象14.abstract抽象类;

public class AbstractTest {
    public static void main(String[] args) {
        new Dog();
    }
}


abstract class Animal{
    /**
     * 抽象方法
     */
    public abstract void run();
}

class Dog extends Animal{
    /**
     * 实现/重写父类的抽象方法
     */
    @Override
    public void run() {
        System.out.println("实现父类的抽象方法");
    }
}
```

# interface抽象类（完全抽象）

接口是完全抽象的类（抽象类是半抽象），接口属于抽象类的特殊形式

接口是引用数据类型

接口→类：实现implements

弥补java中的单一继承

基础语法

```java
[修饰列表] interface 接口名{
    类体;
} 
```

接口可以被多继承，一个接口可以继承多个接口

```java
package com.minsusu.面向对象15.interfaceTest;

public class InterfaceTest {
    public static void main(String[] args) {
        
    }
}


interface A{
    
}
interface B{
    
}
interface C extends A,B{
    //继承多个
}
```

接口的组成

> 1、常量，所有定义的变量都是常量，必须初始化
>
> 2、抽象方法

接口的所有元素都被`public`修饰，都是公开的，子类实现时权限只能为`public`

接口内部的`public abstract`可以省略不写，因为都是抽象的

```java
interface A{
    // 定义常量
    public static final double PI = 3.14; 
    // or 
    double PI = 3.14;
    // double PI;  // 错误的，没有初始化
    
    // 定义方法
    public abstract int sum(int a,int b);  // 没有方法体
    // or
    int a sum(int a, int b);  // 没有方法体
}
```

当一个非抽象类实现接口时，必须将接口中的多有接口方法实现

```java
package com.minsusu.面向对象15.interfaceTest;

public class InterfaceTest {
    public static void main(String[] args) {
        D d  = new D();
        d.sum();

    }
}


interface A{

}
interface B{
    void sumB();
}
interface C extends A,B{
    //继承多个
    int a = 10;
    void sum();
}

class D implements C{
    @Override
    public void sum() {
        System.out.println("通过D类实现C接口");
    }

    @Override
    public void sumB() {
        System.out.println("通过D类实现B接口");
    }
}
```

通过接口实现多态

```java
package com.minsusu.面向对象15.interfaceTest;

public class InterfaceTest {
    public static void main(String[] args) {
        // 多态
        A a = new D();
        if (a instanceof C){
            C c = (C) a;
            c.sum();
        }else if (a instanceof D){
            D f = (D) a;
            f.sumB();
        }

    }
}


interface A{

}
interface B{
    void sumB();
}
interface C extends A,B{
    //继承多个
    int a = 10;
    void sum();
}

class D implements C{
    @Override
    public void sum() {
        System.out.println("通过D类实现C接口");
    }

    @Override
    public void sumB() {
        System.out.println("通过D类实现B接口");
    }
}
```

类实现多个接口

```JAVA
interface A{

}
interface B{
    void sumB();
}
interface C {
    //继承多个
    int a = 10;
    void sum();
}

class D implements A,B,C{  //实现多个接口
    @Override
    public void sum() {
        System.out.println("通过D类实现C接口");
    }

    @Override
    public void sumB() {
        System.out.println("通过D类实现B接口");
    }
}
```

interface中类型转换和一般类继承不同

无关系的接口直接强制转换编译阶段不会报错（一般的继承会报错），运行阶段会抛出异常：`java.lang.ClassCastException`类型转换错误

```java
package com.minsusu.面向对象16.interfaceTest02;

public class interfaceTest02 {
    public static void main(String[] args) {
        B m = new C();
        /**
         * B类型和A类型无任何关系
         * B类型强制转换A类型，编译阶段不会报错，和一般的多态有区别
         * 运行阶段会抛出异常： java.lang.ClassCastException
         */
        A m1 = (A) m;
    }
}


interface A {

}

interface B {

}

class C implements B{

}
```

继承extends和实现implements同时存在

```java
package com.minsusu.面向对象17.interfaceTest03;


import com.minsusu.面向对象07.继承.A;

public class InterfaceTest03 {
    public static void main(String[] args) {
        Flyable n = new Cat();
        n.fly();  // 猫咪会飞

        Flyable s = new snake();
        s.fly();  // 会飞的蛇

    }
}


class Animal {

}

interface Flyable {
    void fly();
}

//继承和接口同时存在
class Cat extends Animal implements Flyable {
    public void fly() {
        System.out.println("猫咪会飞");
    }
}


class snake extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("会飞的蛇");
    }
}
```

接口在开发中的作用

接口可以插拔，增加程序的扩展性，面向抽象编程，不面向具体编程，符合OCP规范

接口可以让调用者和实现着解耦和

接口可以让调用者面向接口调用，实现着可以面向接口实现，下面案例中，厨师面向FoodMenu菜单接口实现，只关心FoodMenu菜单接口中有哪些才要做，顾客面向FoodMenu调用，只关心点什么菜，可以实现厨师、顾客围绕FoodMenu接口开发，厨师不存在，不会影响顾客点菜，顾客不存在也不会影响厨师做菜

例子：点菜

```java
package com.minsusu.面向对象18.interfaceTest04;


/**
 * 美国厨师类
 */
public class AmericaCookie implements FoodMenu{
    public void tomatoOmelette(){
        System.out.println("America西红柿鸡蛋");
    }

    public void shredded(){
        System.out.println("America鱼香肉丝");
    }
}

```

```java
package com.minsusu.面向对象18.interfaceTest04;


/**
 * 中国厨师类
 */
public class ChinaCookie implements FoodMenu{
    public void tomatoOmelette(){
        System.out.println("china西红柿鸡蛋");
    }

    public void shredded(){
        System.out.println("china鱼香肉丝");
    }
}
```

```java
package com.minsusu.面向对象18.interfaceTest04;

/**
 * 菜单接口
 */
public interface FoodMenu {
    /**
     * 西红柿鸡蛋
     */
    void tomatoOmelette();

    /**
     * 鱼香肉丝
     */
    void shredded();
}
```

```java
package com.minsusu.面向对象18.interfaceTest04;


/**
 * 顾客
 */
public class Customer {

    /**
     * 顾客有一份菜单,所以定义为属性
     * 这是解耦合
     */
    private FoodMenu foodMenu;


    /*
     * 错误的，偶额度太高

    ChinaCookie chinaCookie;
    AmericaCookie americaCookie;

    // 点中国厨师
    public void _oder(ChinaCookie chinaCookie){
        chinaCookie.shredded();
        chinaCookie.tomatoOmelette();
    }

    // 点美国厨师
    public void _oder(AmericaCookie americaCookie){
        americaCookie.shredded();
        americaCookie.tomatoOmelette();
    }
    */



    /**
     * 无参构造
     */
    public Customer() {
    }

    /**
     * 有参数的构造方法，防止foodMenu.属性 空指针异常
     * @param foodMenu 菜单
     */
    public Customer(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }

    /**
     * 顾客点菜的方法
     */
    public void oder(FoodMenu foodMenu){
        foodMenu.tomatoOmelette();
        foodMenu.shredded();
    }

    /*
     * Setter
     */
    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    /*
     * Getter
     */
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }
}
```

```java
package com.minsusu.面向对象18.interfaceTest04;


/**
 * 餐馆订餐案例
 */
public class InterfaceTest04 {
    public static void main(String[] args) {
        // FoodMenu cookie = new ChinaCookie();// 创建一个中国厨师
        FoodMenu cookie = new AmericaCookie();// 创建一个美国厨师

        Customer c = new Customer(cookie);// 创建顾客对象,并且入一个厨师对象，调用的是有参数的构造方法
        c.oder(cookie);
    }
}
```

# 抽象类abstract和interface区别

| abstract                               | interface      |
| -------------------------------------- | -------------- |
| 半抽象                                 | 完全抽象       |
| 有构造方法                             | 无构造方法     |
| 单继承                                 | 多继承         |
| 成员变量/方法、实例变量/方法、抽象方法 | 常量、抽象方法 |
| 可以抽象行为、数据                     | 一般抽象行为   |

# 继承关系、属性关系、实现关系

`is a`：继承，

> `Cat is a Animal`：猫属于动物
>
> ```java
> classA extends classB{
> 
> }
> ```

`has a`：属性关系， 

> `Student has a Pen`:学生有一只笔
>
> ```java
> class Student{
>  private Pen pen;
> }
> ```

`like a`：实现关系，`class`与`interface`

> `cooker like a FoodMenu`：厨师可以实现菜单
>
> ```java
> cooker implements FoodMenu{
> 
> }
> ```

# 内部类

> 局部内部类（包含匿名内部类）
>
> 静态内部类 static修饰
>
> 实例内部类

```java
package com.minsusu.面向对象19.内部类;


/**
 * 内部类
 * 局部内部类（包含匿名内部类）
 * 静态内部类 static修饰
 * 实例内部类
 */
public class InClass {
    /**
     * 静态内部类 static修饰
     */
    static class Inner1{}
    
    /**
     * 实例内部类
     */
    class Inner2{}

    public void doSome(){
        /**
         * 局部内部类
         */
        class Inner3{}
    }
    
    
    public void use(){
        // Inner3不能使用，是局部的
        new InClass().new Inner2();  // 访问实例内部类
    }
}
```

匿名内部类案例

```java
package com.minsusu.面向对象20.内部类02;

public class InnerClass {
    public static void main(String[] args) {

        /* 方式一：使用InterfaceComputer类实现接口
        MyMath mm = new MyMath();
        mm.mySum(new InterfaceComputer(),100,300);  //100+300=400
         */

        // 方式二：使用匿名内部类实现
        MyMath mm = new MyMath();
        // new Computer()本身接口不能new,后面的{}，是对接口内的抽象方法实现
        mm.mySum(new Computer(){
            // 接口内的抽象方法实现
            public int sum(int a, int b) {
                return a + b;
            }
        },100,300);  // 100+300=400
        // or 使用映射
        mm.mySum((a, b) -> a + b,100,300);  //100+300=400
    }

}


/**
 * 接口
 */
interface Computer{
    int sum(int a, int b);
}


/**
 * Computer接口的实现
 */
class InterfaceComputer implements Computer{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}


/**
 * MyMath类
 */
class MyMath{
    public void mySum(Computer c ,int x, int y) {
        System.out.println(x+"+"+y+"="+ c.sum(x,y));
    }
}
```

# Package包

## java中的包机制

java中引入package这种机制，是对不同的类分们别类，放到不同的包中，方便使用和管理

## Package的使用

在java文件的第一行编写

语法结构：

```java
package 包名;
```

## 命名规范

必须要小写，与标识符一致，一个包对应一个目录

```java
企业域名倒序+项目名称+模块名+功能名;
// 例如
package com.baidu.oa.user.service;
```

# import

## 规范

> 写在package之下，class之上

## 格式

不在java.lang（java语言包）下，或者不在同一个目录下，需要导入包

- 单类型导入(single-type-import) 
  （例:import java.util.ArrayList; ）
- 按需类型导入(type-import-on-demand) 
  （例:import java.util.*;）

```
import com.minsusu.面向对象00.Student;
```

# java中判断类型

基本数据类型判断相当使用`==`

判断字符串否相等，非地址比较，使用`equals`方法，java内部对String类已经重写`equals`方法

# java数组

> java数组继承Object类
>
> 其长度是确定的。数组一旦被创建，它的大小就是不可以改变的。 
>
> 其元素必须是相同类型,不允许出现混合类型。
>
> 数组中的元素可以是任何数据类型 ，包括基本类型和引用类型。
>
> 数组变量属引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量
>
> 数组本身就是对象，Java中对象是在堆中的，因此数组无论保存原始类型还是其他对象类型，数组对象本身是在堆中的
>
> 优点：数据的检索效率高数组的收个元素的内存地址作为数组的内存地址，后续的元素可以推出
>
> 缺点：对数组增加或者删除时候，后续的元素或者之前的元素位置需要变动（最后一个元素除外），不能存放过大的数据

## 数组的定义和遍历(基本数据类型)

```java
package com.minsusu.数组01;

import java.lang.reflect.Array;

public class ArrayTest {
    public static void main(String[] args) {
        // 定义数组
        int[] a = new int[5];  // 动态初始化，int默认值每个元素==0
        // or
        int ab[] = new int[3];  // c++ 方式定义赋值

        a[0]=4564;
        System.out.println(a);
        // 正向遍历
        for (int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("**************");
        // 逆向遍历
        for (int i = a.length-1; i>=0;i--){
            System.out.println(a[i]);
        }
        System.out.println("**************");

        int[] c = {1,2,3,4};
        ArrayTest.arraylist(c);

        String[] name = {"张三","李四","王五"};  // 静态初始化
        System.out.println(name[1]);  //李四
        System.out.println(name[name.length-1]);  // 最后一个元素
        name[0]="发发发";
        // System.out.println(name[5]);  //java.lang.ArrayIndexOutOfBoundsException:数组越界
    }


    public static void arraylist(int[] args){
        //foreach
        int i = 0;
        for (int data:args) {
            System.out.printf("args[%d]=%d\n",i++,data);
        }
    }
}
```

main方法的参数`string[] args`使用

![array](F:\java学习\java notebook.assets\array.jpg)

```java
package com.minsusu.数组02;

public class ArrayTest02 {
    public static void main(String[] args) {
        System.out.println("main函数的参数arg长度："+args.length);
        // args用于获取用户控制台输入  参数以空格隔开  abc xyz
        for (String data:args) {
            int i = 0;
            System.out.printf("args[%d] = %s\n",i++,data);
        }

        if (args.length !=2){
            System.out.println("请输入用户名和密码");
            return;
        }

        // if (args[0].equals("zhangsan")  && args[1].equals("123456")){
        if ("zhangsan".equals(args[0])  && "123456".equals(args[1])){  //防止空指针异常
            System.out.println("用户登录成功");
            System.out.println("欢迎"+args[0]+"回来！");  // 欢迎zhangsan回来！
        }else {
            System.out.println("登录失败请检查用户名和密码");
        }


    }
}
```



## 数组的定义和遍历(引用数据类型)

```java
package com.minsusu.数组03;

import com.minsusu.面向对象10.多态02.Brid;

public class ArrayTest03 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Animal();
        Animal[] animals = {a, b};
        System.out.println(animals[0].run());  //动物在跑
        animals[1].eat();  //动物吃东西


        Animal c1 = new Cat();
        Animal c2 = new Bird();

        Animal[] animals1 = {c1, c2};

        for (int i = 0; i < animals1.length; i++) {
            if (animals1[i] instanceof Cat) {
                Cat n = (Cat) animals1[i];
                n.eat(); //猫在吃东西
                n.seize(); //猫抓老鼠
            } else if (animals1[i] instanceof Bird) {
                Bird m = (Bird) animals1[i] ;
                m.eat(); //小鸟吃东西
                m.fly(); // 鸟儿在飞
            }
        }


    }
}


class Animal {
    public String run() {
        return "动物在跑";
    }

    public void eat() {
        System.out.println("动物吃东西");
    }
}


class Cat extends Animal {
    public void eat() {
        System.out.println("猫在吃东西");
    }


    // cat类中特有的方法
    public void seize() {
        System.out.println("猫抓老鼠");
    }
}


class Bird extends Animal {
    public void eat() {
        System.out.println("小鸟吃东西");
    }


    // cat类中特有的方法
    public void fly() {
        System.out.println("鸟儿在飞");
    }
}
```

## 数组扩容

java中数组是固定长度，扩容是新建一个大的数组，将小数组的数据拷贝进去，所以数组扩容效率低，开发中尽可能对数组的容量预估准确

## 多维数组

```java
package com.minsusu.数组05;


/**
 * 二维数组
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = {55,88,99};
        int[] a3 = {55,88,99,111};
        int[][] arr = {a1,a2,a3}; // 二维数组
        int[][] arr1 = {a1,a2}; // 二维数组
        int[][] arr2 = new int[2][3];//表示新建一个数组，有两个长度为3的数组

        // 遍历二位数组
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("--第"+(i+1)+"个数组---");
        }
        System.out.println(arr[0][2]);  //3

        // 三维数组
        int[][][] b = {
                {{1,2,3},{1,2,3}},
                {{3,4,1},{2,3,4}}
        };
        System.out.println(b[1][1][2]);//4
        int[][][] ss = {arr,arr1};
    }
}

```

多维数组的使用案例

```java
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
```

```java
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
```

```java
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
```

## Array工具类

`java.util.Arrays`

```java
Arrays.sort(arr)
```



# String类

string在定义的时候会在方法区创建字符串常量池，字符串一旦创建不可修改，直至程序运行完成，才被销毁，占用内存空间大

```java
/**
 * 系统会新建三个String对象存入方法区的字符串常量池中 "abc"/"hxk"/"abchxk"
 */
String str1 = "abc";
String str2 = str1 + "hxk"
```

````java
String s1 = "Runoob";              // String 直接创建
String s2 = "Runoob";              // String 直接创建
String s3 = s1;                    // 相同引用
String s4 = new String("Runoob");   // String 对象创建
String s5 = new String("Runoob");   // String 对象创建
````

![string01](F:\java学习\java notebook.assets\string01.png)

关于`String`类中的构造方法。

第一个：`String s = new String("")`;

第二个：`String s ="";`

第三个：` String s= new String(char[])`;

第四个：`String  s  =  new  String(char[],起始下标，长度);`

第五个：`String s = new String(byte[]);`

第六个：`String s = new String(byte[]，起始下标,长度)`

# StringBuffer

```java
package com.minsusu.StringBufferAndStringBuilder;


/**
 * StringBuffer字符串缓冲区，append方法底层会执行Arrays.copyOf()方法，对原数组进行拷贝扩容，释放源数组
 * 包含synchronized多线程使用安全
 */
public class StringBufferTest {
    public static void main(String[] args) {
        // 默认是16个字节
        StringBuffer _stringBuffer = new StringBuffer();
        _stringBuffer.append("abc");
        _stringBuffer.append("efg");
        _stringBuffer.append(false);
        _stringBuffer.append(100);
        _stringBuffer.append(2.5);
        System.out.println(_stringBuffer);  //abcefgfalse1002.5

    }

}

```

# StringBuilder

```java
package com.minsusu.StringBufferAndStringBuilder;

/**
 * StringBuilder 字符串构建
 * 非多线程使用安全
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(123);
        stringBuilder.append("sagas");
        System.out.println(stringBuilder);
    }

}
```

# 8中基本数据类型的包装类

```java
public class PrimitiveTypeTest {  
    public static void main(String[] args) {  
        // byte  
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
        System.out.println("包装类：java.lang.Byte");  
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
        System.out.println("包装类：java.lang.Short");  
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("包装类：java.lang.Integer");  
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
        System.out.println("包装类：java.lang.Long");  
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
        System.out.println("包装类：java.lang.Float");  
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
        System.out.println("包装类：java.lang.Double");  
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("包装类：java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最小值：Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
    }  
}


// 输出结果 
基本类型：byte 二进制位数：8
包装类：java.lang.Byte
最小值：Byte.MIN_VALUE=-128
最大值：Byte.MAX_VALUE=127

基本类型：short 二进制位数：16
包装类：java.lang.Short
最小值：Short.MIN_VALUE=-32768
最大值：Short.MAX_VALUE=32767

基本类型：int 二进制位数：32
包装类：java.lang.Integer
最小值：Integer.MIN_VALUE=-2147483648
最大值：Integer.MAX_VALUE=2147483647

基本类型：long 二进制位数：64
包装类：java.lang.Long
最小值：Long.MIN_VALUE=-9223372036854775808
最大值：Long.MAX_VALUE=9223372036854775807

基本类型：float 二进制位数：32
包装类：java.lang.Float
最小值：Float.MIN_VALUE=1.4E-45
最大值：Float.MAX_VALUE=3.4028235E38

基本类型：double 二进制位数：64
包装类：java.lang.Double
最小值：Double.MIN_VALUE=4.9E-324
最大值：Double.MAX_VALUE=1.7976931348623157E308

基本类型：char 二进制位数：16
包装类：java.lang.Character
最小值：Character.MIN_VALUE=0
最大值：Character.MAX_VALUE=65535
```

## 拆箱、装箱

```java
public class A {
	public static void main(String[] args){
		
        //过时的
        //将100转为包中类型：装箱
		Integer x = new Integer(100);
        // 将Integer包装类型转为基本数据类型：拆箱
        float y = x.FloatValue(x)
        
		// 将“123”转为Integer类型：装箱
		Integer x = new Integer("123");
		
		//新版的，自动装箱，自动拆箱
        Integer x = 100; //自动装箱
        float y  = x;  //自动拆箱      
        
        
        Integer z = 1000;//自动装箱
        System.out.println(z+1);  // 引用类型+int类型，因为存在自动拆装箱，所以能够正常计算
        // parseInt转换为10进制数
        int a = Integer.parseInt("123456");   // a = 13256
        int b = Integer.parseInt("asdg");  // 异常：NumberFormatException如果字符串不包含可解析的整数。
	}
}
```

Date类

```java
package com.minsusu.DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date d = new Date(15588l);
        System.out.println(d.toString());  //Thu Jan 01 08:00:15 CST 1970
        Date dNow = new Date( );  //分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间为: " + ft.format(dNow));  //当前时间为: 2021-01-17 11:30:48
    }
}
```

# 数字格式化

```java
package com.minsusu.数字格式化;

import java.text.DecimalFormat;

public class Shuzi {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.##");
        String aa  = df.format(12345.12);
        System.out.println(aa);  //12,345.12

        DecimalFormat df2 = new DecimalFormat("###,###.000");
        String bb = df2.format(456444.4);
        System.out.println(bb);  //456,444.400

    }
}

```

# Math数学类

## BigDecimal

```java
package com.minsusu.Math包高精度;

import java.math.BigDecimal;

/**
 * BigDecimal高精度的数字,适用于财务类的软件
 */
public class MathTest {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal(100);
        BigDecimal b1 = new BigDecimal(200);
        BigDecimal b2 = b.add(b1);  //求和
        System.out.println(b2);


    }
}

```

## 随机数

```java
package com.minsusu.RandomTest;


import java.util.Arrays;
import java.util.Random;

/**
 * 随机数
 */
public class RandomTest01 {
    public static void main(String[] args) {
        Random r = new Random();
        int ss = r.nextInt();  //产生int范围内的随机数
        System.out.println(ss);

        int ss1 = r.nextInt(101);  //产生 1-100的随机数
        System.out.println("*****"+ss1);//18


        //插入不相同的数字放入数组
        int[] m = new int[5];
        for (int j = 0; j < m.length; j++) {
            m[j] = -1;
        }
        int i = 0;
        while (true) {
            int n = r.nextInt(101);
            System.out.println("生成的随机数"+n);
            if (!bs(m,n)){
                m[i]=n;
                i++;
                if (i==m.length){
                    break;
                }
            }
        }
        for (int data:m) {
            System.out.println(data);
        }
    }


    /**
     * 判断是否在数组中
     * @param arr  int[]
     * @param key  int
     * @return  int,大于-1则表示找到
     */
    public static boolean bs(int[] arr,int key){
        for (int data:arr) {
            if (data == key) return true; // 包含
        }
        return false;  // 不包含


    }
}

```

# 枚举(enum)

ava 枚举是一个特殊的类，一般表示一组常量，比如一年的 4 个季节，一个年的 12 个月份，一个星期的 7 天，方向有东南西北等。

Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 **,** 来分割。

定义：

```java
// 外部声明
enum Color 
{ 
    RED, GREEN, BLUE; 
} 

//实例

public class Test { 
    // 内部声明
    enum Color { 
    RED, GREEN, BLUE; 
} 
    // 执行输出结果
    public static void main(String[] args) 
    { 
        Color c1 = Color.RED; 
        System.out.println(c1); 
    } 
}
```

# 异常

finally 关键字用来创建在 try 代码块后面执行的代码块。

无论是否发生异常，finally 代码块中的代码总会被执行。

在 finally 代码块中，可以运行清理类型等收尾善后性质的语句，比如关闭文件资源。

finally 代码块出现在 catch 代码块最后，语法如下

```java
// catch语句中必须先小后大
try{
  // 程序代码
}catch(异常类型1 异常的变量名1){
  // 程序代码
}catch(异常类型2 异常的变量名2){
  // 程序代码
}finally{
  // 程序代码，这里一定会执行
}
```

## 使用`throws`上报异常/使用`try…catch`

如果希望调用者知道异常，则使用`throws`，其他使用`try……catch`

`throw`手动抛异常

```java
package com.minsusu.异常;


/**
 * 使用异常上报,或者使用try catch
 */
public class ExceptionTest02 {
   /* public static void main(String[] args) throws ClassNotFoundException {
        ExceptionTest02.divide();  // 未处理异常会报错

    }*/

    public static void main(String[] args)  {
        try {
            ExceptionTest02.divide();  
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static int divide() throws ClassNotFoundException{
         return 1;
    }


}


```

## getMessage()和printStackTrace()

```java
package com.minsusu.异常;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

/**
 * 获取异常信息：异常对象.getMessage()
 * 获取异常推栈信息：异常对象.printStackTrace()程序调试阶段
 */
public class ExceptionTest03 {
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException("空指针异常");
        // throw new NullPointerException("空指针异常"); //手动抛异常
        //e.getMessage();  //获取异常信息
        e.printStackTrace();  // 适合程序调试阶段，异步线程执行
        System.out.println("hello world!");
    }
}
```

finally使用

```java
package com.minsusu.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * finally使用，关闭文件输入流
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("E:\\暂时存放\\毕业证和学位证.jpg");
            System.out.println("hello world");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("hello finally");
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

```

## try和finally使用

```java
package com.minsusu.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * try直接和finally使用
 *
 */
public class ExceptionTest05 {
    public static void main(String[] args) {
        /**
         * 以下代码先执行try
         * 在执行finally
         * 最后执行return
         */
        try{
            System.out.println("hello try");
            return;
            // System.exit(0);  //如果使用这条代码，finally中的代码不会再执行
        }finally {
            System.out.println("hello finally");
        }

        //System.out.println("hello end");  //这里不会执行
    }
}
```

## 自定义异常

```java
package com.minsusu.异常;


/**
 * 自定义异常
 *
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        MyException e = new MyException("这是自定义异常");
        e.printStackTrace();

        String s = e.getMessage();
        System.out.println(s);
    }
}

/**
 * 继承Exception编译时异常
 */
class MyException extends Exception{
    public MyException() {
        super();
    }

    public MyException(String s){
        super(s);
    }
}

/**
 * 继承RuntimeException运行时异常
 */
class MyException1 extends RuntimeException{
    public MyException1() {
        super();
    }

    public MyException1(String s){
        super(s);
    }
}
```

# 综合案例

```java
package com.minsusu.异常.综合案例;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 自定义异常对象
 */
public class AddWeaponException extends Exception{
    public AddWeaponException()
    {
        super();
    }

    public AddWeaponException(String s){
        super(s);
    }
}
```

```java
package com.minsusu.异常.综合案例;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 货物运输机
 */
public class Airfreighter extends Weapon implements Movieable{
    @Override
    public void movie() {
        System.out.println("货物运输机在飞行");
    }

    @Override
    public String toString(){
        return "货物运输机";
    }
}
```

```java
package com.minsusu.异常.综合案例;

/**
 * 高射炮
 */
public class Archibald extends Weapon implements Shootable{
    @Override
    public void shoot() {
        System.out.println("高射炮开火");
    }

    @Override
    public String toString() {
        return "高射炮";
    }
}
```

```java
package com.minsusu.异常.综合案例;

/**
 * 军队
 */
public class Army {
    private Weapon[] weapons; // 军队有多种武器

    public Army() {

    }

    public Army(int count) {
        // 初始化武器数组的数量
        this.weapons = new Weapon[count];
    }


    /**
     * 添加武器
     *
     * @param weapon
     */
    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for (int i = 0; i < this.weapons.length; i++) {
            if (null == this.weapons[i]) {
                this.weapons[i] = weapon;
                System.out.println(weapon+"：添加成功");
                return;
            }
        }
        // 添加满了，抛出异常提示信息
        throw new AddWeaponException("武器已达上限");
    }

    /**
     * 让所有可以攻击的武器攻击
     */
    public void attackAll() {
        for (int i = 0; i < this.weapons.length; i++) {
            if (this.weapons[i] instanceof Shootable) {
                ((Shootable) this.weapons[i]).shoot(); //向下转型
            }
        }
    }


    /**
     * 让所有可以移动的武器移动
     */
    public void movieAll() {
        for (int i = 0; i < this.weapons.length; i++) {
            if (this.weapons[i] instanceof Movieable) {
                ((Movieable) this.weapons[i]).movie(); //向下转型
            }
        }
    }
}
```

```java
package com.minsusu.异常.综合案例;

/**
 * 测试入口
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        // 创建武器
        Weapon tank = new Tank();
        Weapon tank1 = new Tank();
        Weapon tank2 = new Tank();
        Weapon tank3 = new Tank();
        Weapon archibald = new Archibald();
        Weapon airfreighter = new Airfreighter();
        // 创建军队
        Army army = new Army(6);
        try {
            army.addWeapon(tank);
            army.addWeapon(tank1);
            army.addWeapon(tank2);
            army.addWeapon(tank3);
            army.addWeapon(archibald);
            army.addWeapon(airfreighter);
        } catch (AddWeaponException e) {
            String ex = e.getMessage();
            System.out.println(ex);
        }

        army.attackAll();
        army.movieAll();

    }
}
```

```java
package com.minsusu.异常.综合案例;


/**
 * 接口：可移动的
 */
public interface Movieable {
    void movie();
}
```

```java
package com.minsusu.异常.综合案例;

/**
 * 接口：射击
 */
public interface Shootable {

    void shoot();
}
```

```java
package com.minsusu.异常.综合案例;


/**
 * 新建坦克类
 */
public class Tank extends Weapon implements Movieable,Shootable{
    public static int count = 0;
    @Override
    public void movie() {
        System.out.println("坦克在移动");
    }

    @Override
    public void shoot() {
        count ++;
        System.out.println("坦克"+count+"攻击");
    }

    @Override
    public String toString() {
        return "坦克";
    }
}
```

```java
package com.minsusu.异常.综合案例;

/**
 * 武器类
 */
public class Weapon {
}
```

# 集合

集合中不能直接存储基本数据类型（基本数据类型会自动装箱），集合中存储的是引用

![ArrayList](F:\java学习\java notebook.assets\ArrayList.jpg)

java中不同类型的集合对应不同的数据结构，例如数组、哈希表、二叉树、链表

```java
new ArrayList(); // 底层是数组
new LinkList(); // 底层是链表
new TreeSet(); // 底层是二叉树
```

 集合都在`java.util`包下

![2243690-9cd9c896e0d512ed](F:\java学习\java notebook.assets\2243690-9cd9c896e0d512ed.gif)



## `collection`集合

```java
package com.minsusu.集合.Collection01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.collection
 * 1、collection中存放什么元素：
 * 没有泛型之前，collection中可以存放Object的所有类型
 * 使用泛型之后，collection种只可以存放某个具体的类型
 * collection中值存放对象的地址
 * 2、常用方法
 * boolean add(Object e)向集合中添加元素
 * int size()获取集合元素个数
 * boolean contains(Object o)判断集合中是否包含某个元素
 * boolean remove(object o)移除某个元素
 * boolean isEmpty()判断集合是否为空
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection c = new ArrayList();
        // 添加元素
        c.add(123);//123自动装箱 Integer i = new Integer(123)
        c.add("sags");
        c.add(true);
        c.add(3.141);
        c.add(new AA());
        //判断集合中是否包含某个元素
        System.out.println("collection结合中是否包含sags元素：" + c.contains("sags"));  //true

        // 查询集合长度
        System.out.println("collection长度：" + c.size());
        //删除某个元素
        c.remove(123);
        //contains底层调用equals方法，判断的是字符串内容
        System.out.println("collection结合中是否包含123元素：" + c.contains(123));  //false

        Object[] d = c.toArray();
        for (int i = 0; i <  d.length; i++) {
            System.out.println("第"+i+"个元素是："+d[i]);

        }

        //清空集合
        c.clear();
        System.out.println("集合是否为空：" + c.isEmpty());
        // 查询集合长度
        System.out.println("清空后collection长度：" + c.size());


    }

}


class AA{
    public String toString(){
        return "AA对象重写toString方法";
    }
}
```

## 迭代器(Iterator)

放在集合中的元素要重写equals方法，才会判断内容，否则将判断内存地址

集合发生改变，迭代器必须重新获取

迭代过程中，不能修改集合的结构，比如：`集合.remove(Object o)`方法，必须使用迭代器的`remove()`方法

![Snipaste_2021-01-19_17-50-39](F:\java学习\java notebook.assets\Snipaste_2021-01-19_17-50-39-1611049966680.jpg)

```java
package com.minsusu.集合.Collection01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 迭代器
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();  // 存入和迭代取出顺序一致
        c.add(123);
        c.add("sdf");
        c.add(new Object());
        c.add(new int[5]);

        Iterator iterator = c.iterator(); //迭代器
        while (iterator.hasNext()){
            // 存入什么类型返回的就是什么类型
            // 这里可以使用instanceof做类型判断
            /*if (iterator.next() instanceof Integer){
                System.out.println(iterator.next());
            }*/
            System.out.println(iterator.next());
        };
        System.out.println("");
        Collection hashSet = new HashSet();  // 迭代无序，不重复
        hashSet.add(899);
        hashSet.add(45);
        hashSet.add(45);
        hashSet.add("1122");

        Iterator iterator2 = c.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
```

## `list`集合(继承collection)

```java
package com.minsusu.集合.List01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * List集合包含索引，列表通常允许重复的元素
 * boolean add(E e)将指定的元素追加到此列表的末尾（可选操作）:效率高。
 * void    add(int index, E element)将指定的元素插入此列表中的指定位置（可选操作）：相对上面效率低。
 * E   get(int index)返回此列表中指定位置的元素。
 * int indexOf(Object o) 返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
 * int lastIndexOf(Object o)  返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
 *  E  set(int index, E element)  用指定元素替换列表中指定位置的元素（可选操作）。返回以前在指定位置的元素
 *
 *
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(456);
        list.add("sdsd");
        list.add(1);


        Iterator iterator =list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Object item = list.get(1);
        System.out.println("索引1的值："+item);
        //indexOf
        int firstIndex = list.indexOf(456);
        System.out.println("第一次出现的索引："+firstIndex);
        //lastIndexOf
        int lastIndex = list.lastIndexOf(1);
        System.out.println("最后一次出现的索引："+lastIndex);
        //set
        Object _item = list.set(3,"hello");
        System.out.println(_item);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
```



## `list`集合的子类

使用 for 、foreach、迭代器来迭代数组列表中的元素

### 1、ArrayList

ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素。

ArrayList 继承了 AbstractList ，并实现了 List 接口。

ArrayList 类位于 java.util 包中，使用前需要引入它，语法格式如下：

```java
import java.util.ArrayList; // 引入 ArrayList 类

ArrayList<E> objectName =new ArrayList<>();　 // 初始化
```

**以下情况使用 ArrayList :**

- 频繁访问列表中的某一个元素。
- 只需要在列表末尾进行添加和删除元素操作

### 2、LinkedList

链表（Linked list）是一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，而是在每一个节点里存到下一个节点的地址。

与 ArrayList 相比，LinkedList 的增加和删除对操作效率更高，而查找和修改的操作效率较低。

**以下情况使用 LinkedList :**

- 你需要通过循环迭代来访问列表中的某些元素。
- 需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。

LinkedList 类位于 java.util 包中，使用前需要引入它，语法格式如下：

```java
// 引入 LinkedList 类
import java.util.LinkedList; 

LinkedList<E> list = new LinkedList<E>();   // 普通创建方法
或者
LinkedList<E> list = new LinkedList(Collection<? extends E> c); // 使用集合创建链表
```





## set集合（继承collection）

### hashset集合

HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。

HashSet 允许有 null 值。

HashSet 是无序的，即不会记录插入的顺序。

HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。

HashSet 类位于 java.util 包中，使用前需要引入它，语法格式如下：

```java
import java.util.HashSet; // 引入 HashSet 类
HashSet<String> sites = new HashSet<>();
```

```java
package com.minsusu.集合.HashSet01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet集合，无序不重复
 */
public class HashTest01 {
    public static void main(String[] args) {
        Set<String> set  = new HashSet<>();
        set.add("123");
        set.add("hhh");
        set.add("hhh");
        set.add("koko");
        System.out.println("集合的内容长度"+set.size());
         Iterator<String> nn =set.iterator();
        while (nn.hasNext()){
            String s = nn.next();
            System.out.println(s);
            /*123
            hhh
            koko*/
        }


    }
}

```

## Map集合

### HashMap

HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。

HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。

HashMap 是无序的，即不会记录插入的顺序。

HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。

HashMap 类位于 java.util 包中，使用前需要引入它，语法格式如下：

```java
import java.util.HashMap; // 引入 HashMap 类
HashMap<Integer, String> Sites = new HashMap<Integer, String>();
```

```java
package com.minsusu.集合.MapTest01;


import java.util.*;


/**
 * V put(K key, V value) 将指定的值与此映射中的指定键关联（可选操作）。
 * Set<Map.Entry<K,V>>	entrySet() 返回此映射中包含的映射关系的 Set 视图。
 *  Collection<V>	values() 返回此映射中包含的值的 Collection 视图。
 *   Set<K>	keySet() 返回此映射中包含的键的 Set 视图。
 *
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        // 添加键值对
        m.put(1,"a");
        m.put(2,"b");
        m.put(3,"c");
        m.put(4,"d");
        m.put(5,"c");
        // 获取制定key的value
        String ss = m.get(3);
        System.out.println(ss);


        Collection<String> S1 = m.values();
        for (String data:S1) {
            System.out.println(data);
        }


        // 循环遍历
        // 1、使用迭代器遍历
        Set<Integer> keys= m.keySet();  // 返回Set集合
        Iterator<Integer> PP=keys.iterator();  // 创建迭代器
        while (PP.hasNext()){
            Integer key = PP.next();
            String value  = m.get(key);
            System.out.println("键："+key+"--值："+value);

        }
        //2、使用foreach
        for (Integer key:keys) {
            System.out.println("键"+key+"值："+m.get(key));
        }

        //3、使用entrySet
        Set<Map.Entry<Integer,String>> s =  m.entrySet();
        Iterator<Map.Entry<Integer,String>> it = s.iterator();
        while (it.hasNext()){
             Map.Entry<Integer,String> entry = it.next();
             Integer key = entry.getKey();
             String value = entry.getValue();
            System.out.println("键："+key+",值："+value);
        }

    }
}

```

# 泛型

优点：集合中的元素类型统一了，不需要强制类型转换

缺点：缺乏多样性

没有使用泛型

```java
package com.minsusu.泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 没有使用泛型
 */
public class Fanxing {
    public static void main(String[] args) {
        List list = new ArrayList();
        Animal cat = new Cat();
        Animal bird = new Bird();
        list.add(cat);
        list.add(bird);

        for (int i = 0; i <list.size() ; i++) {
           Object o =list.get(i);  //不使用泛型，只能用Object接收
           if (o instanceof Animal){
               ((Animal)o).move();
           }
        }
    }
}


class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}


class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在跑");
    }
}


class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿在飞");
    }
}
```

使用泛型

```java
package com.minsusu.泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fanxing02 {
    public static void main(String[] args) {
        List<Animal1> list = new ArrayList<Animal1>();
        Animal1 cat = new Cat1();
        Animal1 bird = new Bird1();
        list.add(cat);
        list.add(bird);
        // list.add("123");  使用泛型，只能存储一类的数据


        Iterator<Animal1> JJ = list.iterator();
        while (JJ.hasNext()) {
            Animal1 a = JJ.next();
            a.move();
        }
    }
}

class Animal1 {
    public void move() {
        System.out.println("动物在移动");
    }
}


class Cat1 extends Animal1 {
    @Override
    public void move() {
        System.out.println("猫在跑");
    }
}


class Bird1 extends Animal1 {
    public void move() {
        System.out.println("鸟儿在飞");
    }
}
```

## 自定义泛型

- 所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前。
- 每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
- 类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
- 泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。
- 泛型标识符可以随便写，一般<E>代表element，<T>代表type

```java
package com.minsusu.泛型;

/*public class ZidingyiFanxing<泛型标识符> {

    public  void sum(泛型标识符 o){
        // do some thing
    }
}*/


public class ZidingyiFanxing<T> {
    public static void main(String[] args) {
        ZidingyiFanxing<String> zdy = new ZidingyiFanxing<>();
        zdy.sum("sngg");
        // zdy.sum(123); //错误的，只能传递String类型

        ZidingyiFanxing<Animals> animals = new ZidingyiFanxing<>();
        Animals b = animals._sum();

        // 定义泛型，但是未使用泛型，sum（）方法需要传入Object类型
        ZidingyiFanxing animals1 = new ZidingyiFanxing();
        animals1.sum(new Animals());


    }

    public  void sum(T o){
        // do some thing
    }

    /**
     *
     * @return <T>
     */
    public T _sum(){
        return null;
    }
}

class Animals{
    // <E>是定义泛型
    public <E> E dosome(E p){
        return p;

    }
}
```

# IO

I指input输入，从硬盘中读取，inputStream输入流

O指output输出，从内存往硬盘中写入，outputStream输出流

java中IO流的四大家族

字节流：可以读取任意文件

字符流：读取一般文件，字符型的

![io](F:\java学习\java notebook.assets\io.png)

所有的输出流输入流都有close方法，关闭流。

所有的输出流都有flush方法，用于刷新管道

常用的流：

![io1](F:\java学习\java notebook.assets\io1.jpg)



## FileInputStream文件字节输入流

```java
package com.minsusu.IO流.InputStreamTest01;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream文件输入流
 * 一次读取一个字节
 */
public class InputStreamTest01 {
    public static void main(String[] args) {
        // 放到外面。防止try执行报异常，finally中无法调用close方法
        FileInputStream fs = null;

        try {
            // 创建FileInputStream对象
            fs =  new FileInputStream("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\InputStreamTest01\\file");

            // 循环读取
            /*while (true){
                //read()下一个数据字节；如果已到达文件末尾，则返回 -1。
                int s = fs.read();
                //如果fs.read方法返回-1,表示读取到最后，跳出循环
                if (s == -1) break;
                // 执行到这里说明正常读取
                System.out.println(s);
            }*/

            // 循环读取，升级版
            int conount = 0;
            while ((conount = fs.read()) != -1){
                System.out.println(conount);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            // 判断输入流是否为空，不为空则执行关闭
            if (fs!=null){
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

```java
package com.minsusu.IO流.InputStreamTest01;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream文件输入流
 *  read(byte[] b) 从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中
 */
public class InputStreamTest02 {
    public static void main(String[] args) {
        // 放到外面。防止try执行报异常，finally中无法调用close方法
        FileInputStream fs = null;


        // 创建FileInputStream对象
        try {
            fs = new FileInputStream("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\InputStreamTest01\\file");

            int count = 0;
            // read(byte[] b) 从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中
            byte[] bytes = new byte[4];
            while ((count = fs.read(bytes))!=-1){
                //String(byte[] bytes, int offset, int length) 通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
                System.out.print(new String(bytes,0, count));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fs!=null) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}

```

## FileOutputStream文件字节输出流

```java
package com.minsusu.IO流.outputStreamTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream文件字节输出流
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fs = null;
        //FileOutputStream(String name) 创建一个向具有指定名称的文件中写入数据的输出文件流。
        try {
            fs = new FileOutputStream("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\outputStreamTest\\add",true);
            // void    write(byte[] b) 将 b.length 个字节从指定 byte 数组写入此文件输出流中。
            byte[] bytes = {97, 98, 99, 100,101,127};
            fs.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fs != null) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

## FileRead

读取文本文件

```java
package com.minsusu.IO流.FileReadTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * FileReader以字符的方式读取文本文件
 */
public class FileReadTest {
    public static void main(String[] args) {
        FileReader fs = null;
        try {
            fs = new FileReader("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\FileReadTest\\fileread.txt");
            char[] chars =new char[8];
            int count =0;
            while ((count= fs.read(chars))!=-1){
                System.out.print(new String(chars,0,count)); //aijgbdjsangkja你空间大姑娘抗空间大
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fs!=null){
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
```

## FileWrite

文本写入

```java
package com.minsusu.IO流.FileWriteTest;

import java.io.FileWriter;
import java.io.IOException;


/**
 * FileWriter写入文本
 */
public class FileWriteTest01 {
    public static void main(String[] args) {
        FileWriter fs = null;
        try {
            fs = new FileWriter("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\FileWriteTest\\fs.txt");
            /*char[] chars = {'我','是','中','国','人'};
            fs.write(chars);*/
            String s ="张三李四网技术国家安定高考大捷萨克高科技啊";
            fs.write(s);
            fs.flush();
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            if (fs!=null){
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
```

## BufferedReader

```java
package com.minsusu.IO流.BufferFileReadTest;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 自带缓冲，读取时不需要定义byte[]或者char[]
 */
public class BufferedReaderTest {
    public static void main(String[] args)  throws Exception{
        BufferedReader bf = null;
        FileReader fs = new FileReader("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\BufferFileReadTest\\bs.txt");

        bf =new BufferedReader(fs);
       String s= null;
        while ((s= bf.readLine())!=null){
            System.out.println(s);
        }
        
        //会自动关闭传入的其他流
        bf.close();

    }
}
```

# File

```java
package com.minsusu.File文件;

import java.io.File;
import java.io.IOException;

/**
 * File文件目录的抽象形式
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\File文件\\new");
        if (!f.exists()){ // 不存在则创建
            f.createNewFile();  //创建文件
        }
        File f1 = new File("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\File文件\\news");

        if (!f1.exists()){
            f1.mkdir();  // 创建文件夹
        }
        File f2 = new File("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\File文件\\a\\b\\c");

        if (!f2.exists()){
            f2.mkdirs();  // 创建文件夹
            System.out.println(f2.getPath());
            System.out.println(f2.getAbsolutePath());
        }
    }
}
```

## 文件拷贝

```java
package com.minsusu.File文件.文件及目录拷贝;


import java.io.*;
import java.util.Scanner;

/**
 * 文件夹及其内容拷贝
 */
public class FileCopyTo {
    public static void main(String[] args) {
        // 用户输出
        Scanner s = new Scanner(System.in);
        System.out.print("请输入源目录：");
        String _srcPath = s.next();
        System.out.println("**************");
        System.out.print("请输入目标目录：");
        String _discPath = s.next();

        // 目标源
        File srcFiles = new File(_srcPath);
        // 文件源
        File discFiles = new File(_discPath);
        // 文件拷贝
        fileCopy(srcFiles, discFiles);

    }

    /**
     * 文件拷贝
     *
     * @param srcFiles  拷贝的源
     * @param discFiles 拷贝的目标
     */
    private static void fileCopy(File srcFiles, File discFiles) {
        // 递归结束的条件，文件对象时一个文件，不是一个目录时候
        if (srcFiles.isFile()) {
            FileInputStream inFiles = null;
            FileOutputStream outFiles = null;
            try {
                inFiles = new FileInputStream(srcFiles);  //新建字节流输入对象
                String path = (discFiles.getAbsolutePath().endsWith("\\") ? discFiles.getAbsolutePath() : discFiles.getAbsolutePath() + "\\") + srcFiles.getAbsolutePath().substring(3);
                System.out.println(path);
                outFiles = new FileOutputStream(path);
                byte[] bytes = new byte[1024 * 1024]; //每次读1M
                int cout = 0;
                while ((cout = inFiles.read(bytes)) != -1) {
                    outFiles.write(bytes, 0, cout);
                }

                outFiles.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (inFiles != null) {
                    try {
                        inFiles.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (outFiles != null) {
                    try {
                        outFiles.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }

        //获取所有的目录
        File[] files = srcFiles.listFiles();
        for (File file : files) {
            // 如果file对象是文件夹,需要继续获取路径
            if (file.isDirectory()) {
                // 源文件夹的路径
                String srcPath = file.getAbsolutePath();
                //System.out.println(srcPath);
                // 目标文件夹路径
                String discPath = (discFiles.getAbsolutePath().endsWith("\\") ? discFiles.getAbsolutePath() : discFiles.getAbsolutePath() + "\\") + srcPath.substring(3);
                //System.out.println(discPath);
                File newFile = new File(discPath);
                //新的目录不存在的话，新建目录
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }

            // 不是一个文件夹
            fileCopy(file, discFiles); // 递归
        }

    }
}
```

# 序列化Serualize

序列化：内存中的java对象拆分放入文件中

反序列号：将文件中对象转化为内存中的java对象

序列化`ObjectOutputStream`

反序列化：`ObjectInputStream`

```java
// transient瞬时的，不会被序列化
//private static final long serialVersionUID=5646545646554654L;  //手动指定序列化版本号,防止在再次修改文件反序列错误stream classdesc serialVersionUID = -7288032601271739955,
```

```java
package com.minsusu.序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化
 */
public class Student implements Serializable {
    private static final long serialVersionUID=5646545646554654L;  //手动指定序列化版本号
    private int no;
    // transient瞬时的，不会被序列化
    private transient boolean b;
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    private static String name;


    public Student() {
    }

    public Student(int no) {
        this.no = no;
    }

    public String toString(){
        return Student.name+"**"+this.no;
    }

    public static void main(String[] args) throws IOException {
        Student s = new Student();
        s.no=123;
        Student.name = "张三";
        ObjectOutputStream o;
        o =new ObjectOutputStream(new FileOutputStream("D:\\ddd"));
        o.writeObject(s);  //序列化
        o.flush();
        o.close();
    }
}

```

序列化单个对象

```java
package com.minsusu.序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化
 */
public class Student implements Serializable {
    private int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    private static String name;


    public Student() {
    }

    public Student(int no) {
        this.no = no;
    }

    public String toString(){
        return Student.name+"**"+this.no;
    }

    public static void main(String[] args) throws IOException {
        Student s = new Student();
        s.no=123;
        Student.name = "张三";
        ObjectOutputStream o;
        o =new ObjectOutputStream(new FileOutputStream("D:\\ddd"));
        o.writeObject(s);  //序列化
        o.flush();
        o.close();
    }
}
```

反序列化单个对象

```java
package com.minsusu.序列化;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化
 */
public class Student01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\ddd"));
        Object o = in.readObject();
        System.out.println(o);
    }
}
```

序列化多个对象

```java
package com.minsusu.序列化;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 序列化多个
 */
public class Student02 {
    public static void main(String[] args) throws  Exception{
        List<Student> list = new ArrayList<>();
        list.add(new Student(456));
        list.add(new Student(789));
        list.add(new Student(101));

        // 创建对象输出流对象
        ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("D:\\sss"));
        out.writeObject(list);  // 序列化
        out.flush();
        out.close();

    }
}
```

反序列化多个对象

```java
package com.minsusu.序列化;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 反序列化多个
 */
public class Student03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\sss"));
        //Object o = in.readObject();
        //System.out.println(o instanceof List);
        List<Student> o =(List<Student>) in.readObject();
        for(Student s:o){
            System.out.println(s);

        }

    }
}
```

## io+properties

```java
package com.minsusu.IO流;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties专门配置属性配置的类
 */
public class ioProperties {
    public static void main(String[] args) throws IOException {
        // 读取info文件到对象中
        FileReader fs =new FileReader("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\info.properties");

        //新建map集合
        Properties properties =new Properties();
        // 加载数据到map集合，等号左边做key,右边做value
        properties.load(fs);

        // 通过key获取value
        String userName = properties.getProperty("uerName");  // 获取用户名
        String passwd = properties.getProperty("password");  // 获取密码
        String Birthday = properties.getProperty("Birthday");  // 获取生日
        System.out.println("用户名："+userName+" 密码："+passwd+" 生日："+Birthday);  //用户名：admin 密码：123456 生日："asgas"

    }

}

```

```properties
uerName=admin
password=123456
Birthday:"asgas"
```

