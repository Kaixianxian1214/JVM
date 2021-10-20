package chapter1;

public class ClassLoaderTest {
    public static void main(String[] args) {

        // 获取系统类加载器
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader);

        // 获取其上层加载类
        ClassLoader extClassLoader = loader.getParent();
        System.out.println(extClassLoader);

        // 获取不到引导类加载器 // null
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        // 对于用户自定义类来说 --> 默认使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        // 获取String类的类加载器， --> Java的核心内部都是使用引导类加载器进行加载的
        ClassLoader stringLoader = String.class.getClassLoader();
        System.out.println(stringLoader);
    }
}
