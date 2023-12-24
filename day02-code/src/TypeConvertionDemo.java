public class TypeConvertionDemo {
    public static void main(String[] args) {
        byte b1 = 3;
        byte b2 = 4;
        // byte b3 = b1 + b2;  // 这里是错误的，byte、short、char 在运算的时候会被提升为 int 类型，运算的结果为 int 类型，赋值给 byte 类型的变量 b3，属于大给小，不能直接给；
        byte b3 = (byte) (b1 + b2);  // 或：int b3 = b1 + b2;

        byte b = 3 + 4;  // 这行语句没有错误是因为：java 的常量优化机制，在编译期间（javac）就会将 3 和 4 两个字面量进行运算，产生的字节码文件：byte b = 7;
    }
}
