public class Mouse extends IODevice {

    public Mouse() {
        super("Mouse");
    }

    @Override
    public void read() {
        System.out.println("Data: " + getData());
    }

    @Override
    public void write(String data) {
        setData(getDeviceName() + ">" + data);
    }

    @Override
    public void connect() {
        System.out.println("--------Connecting Mouse--------");
        open();
        System.out.println("--------Mouse connected--------\n");
    }

    @Override
    public void disconnect() {
        System.out.println("\n--------Disconnecting Mouse--------");
        close();
        System.out.println("--------Mouse disconnected--------");
    }
}