package h202011.homework1;

public class Computer {

    //必选
    private String cpu;
    //必选
    private String ram;
    //可选
    private int usbCount;
    //可选
    private String keyboard;
    //可选
    private String display;

    public Computer(Builder builder){
        this.cpu = builder.getCpu();
        this.ram = builder.getRam();
        this.usbCount = builder.getUsbCount();
        this.keyboard = builder.getKeyboard();
        this.display = builder.getDisplay();
    }

}
