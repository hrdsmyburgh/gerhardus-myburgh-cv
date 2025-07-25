public class Test {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        System.out.println("Testing Mouse functionality:");
        mouse.connect();
        mouse.write("Hello, World!");
        mouse.read();
        mouse.disconnect();
        System.out.println();

        Mouse mouseWithDeviceMethods = new Mouse();
        System.out.println("Testing Mouse connect and disconnect with IODevice methods:");
        mouseWithDeviceMethods.connect();
        mouseWithDeviceMethods.write("Hello, World!");
        mouseWithDeviceMethods.read();
        mouseWithDeviceMethods.disconnect();
    }
}