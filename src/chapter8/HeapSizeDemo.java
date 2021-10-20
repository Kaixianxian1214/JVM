package chapter8;

public class HeapSizeDemo {
    public static void main(String[] args) {
        // 堆内存总量
        System.out.println("-Xms:" + Runtime.getRuntime().totalMemory() / 1024 / 1024);

        // 最大堆内存大小
        System.out.println("-Xmx:" + Runtime.getRuntime().maxMemory() / 1024 / 1024);
    }
}
