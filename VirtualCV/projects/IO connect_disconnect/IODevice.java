public abstract class IODevice implements IO {
    private String data;
    private String deviceName;

    public IODevice() {
        this("<io device>");
    }

    public IODevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    @Override
    public void write(String data) {
        this.data = data;
    }

    @Override
    public void read() {
        System.out.println("Data: " + data);
    }

    @Override
    public void open() {
        System.out.println("\tOpening " + this.getDeviceName());
    }

    @Override
    public void close() {
        System.out.println("\tClosing " + this.getDeviceName());
    }

    public abstract void connect();
    public abstract void disconnect();
}