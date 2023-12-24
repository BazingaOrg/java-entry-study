public class DataTypeDemo {
    /*
        数据类型：
            1. 基本数据类型
                （1）整数
                    · byte 1个字节 -128 ～ 127
                    · short 2个字节
                    · int 4个字节
                    · long 8个字节
                （2）小数
                    · float（单精度） 4个字节
                    · double（双精度） 8个字节
                （3）字符
                    · char 2个字节
                （4）布尔
                    · boolean 1个字节
            2. 引用数据类型

        ----------------------------------

        使用思路：
            1. 整数类型：首选 int，如果发现 int 装不下了，将类型换成 long，定义 long 类型变量需要加入 L 的标识。
            2. 小数类型：首选 double，非要用 float 类型，需要加入 F 的标识。
    */
    public static void main(String[] args) {
        long total = 31415926535897L;
        float height = 175.99F;
        char gender = '男';
        boolean flag = true;
    }
}
