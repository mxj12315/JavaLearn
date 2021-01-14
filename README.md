# java笔记

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
javac 包名.xxx   // xxx代表xxx.class文件 
# or
java xxx   // xxx代表xxx.class文件
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
| 访问控制             | private      | 私有的                       |
| –                    | protected    | 受保护的                     |
| –                    | public       | 公共的                       |
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

整数型：默认值0

byte	short	int	long

浮点型：默认值 0.0 

float	double

布尔型：默认值false

false	true

字符型（字符串不属于基本数据类型，属于应引用类型）：默认值 \u0000

char

引用数据类型

默认值 null

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

```java
public class input {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
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

# 类封装

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

### this关键字

类中带有static的方法（静态方法）中没有this

类中不带static的方法（实例方法），this指向当前对象

实例方法可以直接方法类成员变量和类成员方法

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

### 继承

作用：代码复用和多态

java中是单继承，但是也可以间接多继承，比如C类继承B继承，B继承A类，所以C类间接继承B类和A类

如果一个类没有显示的继承某一个类，那么该类继承默认继承祖宗类java.lang.Object

#### 语法格式

```java
[修饰符列表] class 类名 extends 父类名{
    类体;
}
```

#### 常见术语

B继承A类：

> A类：称为父类，基类，超类，superclass
>
> B类：称为子类、派生类subclass

### 限制

> 私有的属性和方法不支持继承
>
> 构造方法不支持继承
>
> 其他数据都可以继承

