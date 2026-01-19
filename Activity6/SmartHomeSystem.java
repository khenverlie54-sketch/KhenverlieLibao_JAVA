class Device {

    protected boolean isOn;
    protected String deviceType;
    protected String deviceName;
    protected String location;

    public Device(String deviceType, String deviceName, String location) {
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.location = location;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isPowered() {
        return isOn;
    }

    public void status() {
        System.out.println("\n____________________");
        System.out.println("Device: " + deviceType);
        System.out.println("Name: " + deviceName);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
        System.out.println("Location: " + location);
        System.out.println("____________________");
    }

    public static void toggleAll(Device[] devices, boolean powerOn) {
        for (Device d : devices) {
            if (powerOn) d.turnOn();
            else d.turnOff();
            d.status();
        }
    }

 
    public static void countPowered(Device[] devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isPowered()) count++;
        }

        System.out.println("\n____________________");
        System.out.println("Devices Powered ON: " + count);
        System.out.println("____________________\n");
    }
}

class AirConditioner extends Device {

    private int fanSpeed;
    private int temperature;

    public AirConditioner(String name, String location) {
        super("Air Conditioner", name, location);
        this.fanSpeed = 3;
        this.temperature = 24;
    }

    public void setFanSpeed(int speed) {
        this.fanSpeed = speed;

    }

    public void setTemperature(int temp) {
        this.temperature = temp;
    }

    @Override
    public void status() {
        System.out.println("\n____________________");
        System.out.println("Device: " + deviceType);
        System.out.println("Name: " + deviceName);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));

        if (isOn) {
            System.out.println("Fan Speed: " + fanSpeed);
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Location: " + location);
        }

        System.out.println("____________________");
    }
}



class LampShade extends Device {

    private int brightness;
    private String lightColor;

    public LampShade(String name, String location) {
        super("Lamp Shade", name, location);
    }

    public void setBrightness(int b) {
        brightness = b;
        status();
    }

    public void setLightColor(String c) {
        lightColor = c;
        status();
    }

    public int getBrightness() {
        return brightness;
    }

    public String getLightColor() {
        return lightColor;
    }

    @Override
    public void status() {
        System.out.println("\n____________________");
        System.out.println("Device: " + deviceType);
        System.out.println("Name: " + deviceName);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));

        if (isOn) {
            System.out.println("Brightness: " + brightness);
            System.out.println("Light Color: " + lightColor);
            System.out.println("Location: " + location);
        }

        System.out.println("____________________");
    }
}


class Television extends Device {

    private int volume;
    private int channel;

    public Television(String name, String location) {
        super("Television", name, location);
    }

    public void setVolume(int v) {
        volume = v;
        status();
    }

    public void setChannel(int c) {
        channel = c;
        status();
    }

    @Override
    public void status() {
        System.out.println("\n____________________");
        System.out.println("Device: " + deviceType);
        System.out.println("Name: " + deviceName);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));

        if (isOn) {
            System.out.println("Volume: " + volume + "%");
            System.out.println("Channel: " + channel);
            System.out.println("Location: " + location);
        }

        System.out.println("____________________");
    }
}

class Microwave extends Device {

    private int timer;
    private int temperature;

    public Microwave(String name, String location) {
        super("Microwave Oven", name, location);
        this.temperature = 100;
        this.timer = 0;
    }

    public void setTimer(int t) {
        timer = t;
        status();
    }

    public void setTemperature(int temp) {
        temperature = temp;
        status();
    }

    @Override
    public void status() {
        System.out.println("\n____________________");
        System.out.println("Device: " + deviceType);
        System.out.println("Name: " + deviceName);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));

        if (isOn) {
            System.out.println("Timer: " + timer + " minutes");
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Location: " + location);
        }

        System.out.println("____________________");
    }
}


public class SmartHomeSystem {

    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner("Carrier Inverter", "Master Bedroom");

        LampShade lamp1 = new LampShade("Xiaomi Smart Lamp", "Study Room");
        LampShade lamp2 = new LampShade("Xiaomi Smart Lamp", "Bedroom");

        Television tv = new Television("LG OLED 65", "Living Room");

        Microwave mw = new Microwave("Sharp R-20A0", "Kitchen");

        Device[] devices = { ac, lamp1, lamp2, tv, mw };

       
        ac.turnOn();
        ac.status();

        Device.countPowered(devices);

        lamp1.turnOn();
        lamp1.setBrightness(100);
        lamp1.setLightColor("Yellow");

        Device.countPowered(devices);

        lamp2.turnOn();
        lamp2.setBrightness(lamp1.getBrightness());
        lamp2.setLightColor(lamp1.getLightColor());

        tv.turnOn();
        tv.setVolume(12);
        tv.setChannel(5);

        Device.countPowered(devices);

        System.out.println("\n--- Turning ALL devices OFF ---");
        Device.toggleAll(devices, false);
        Device.countPowered(devices);

        System.out.println("\n--- Turning ALL devices ON ---");
        Device.toggleAll(devices, true);
        Device.countPowered(devices);
    }
}
