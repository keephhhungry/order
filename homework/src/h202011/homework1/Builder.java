package h202011.homework1;

public class Builder {

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

    public Builder(String cpu,String ram){
        this.cpu = cpu;
        this.ram = ram;
    }

    public Builder setUseCount(int usbCount){
        this.usbCount = usbCount;
        return this;
    }

    public Builder setKeyboard(String keyboard){
        this.keyboard = keyboard;
        return this;
    }

    public Builder setDisplay(String display){
        this.display = display;
        return this;
    }

    public Computer build(){
        return new Computer(this);
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getDisplay() {
        return display;
    }
}
