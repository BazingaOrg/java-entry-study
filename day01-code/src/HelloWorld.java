public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Bazinga");  // 姓名
        System.out.println(25);  // 年龄
        System.out.println("男");  // 性别
        System.out.println(175);  // 身高
        System.out.println(false);  // 婚姻状况
    }
}

/*
    JVM、JRE和JDK三者之间的关系：
    1. JVM 是 Java 的运行环境，负责将字节码文件（.class，由 .java 文件编译而来的）翻译成机器语言（二进制）；
    2. JRE 是包括 JRE 和 Java 的核心类库；
    3. JDK 则是包含 JRE 和编译器（javac）、调试器、Java文档生成器（javadoc）等开发工具；
    4. 总结：JVM 提供了 Java 程序的运行环境，JRE 包含了 JVM 和运行 Java 程序所需的库，而 JDK 则是 Java 开发者进行应用程序开发所需的工具和环境，包括 JRE。
*/