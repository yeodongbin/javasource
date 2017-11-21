package laptop;

public interface Laptop extends Usb, Bluetooth, GraphicCard {
	public static final String company = "Samsung";
}

interface Usb {
	public static final String usbType = "usb";
	public static final String version = "3.0";
	public static final String capacity = "16GB";
	
	public abstract void getUsbType();
	public abstract void getVersion();
	public abstract void getCapacity();
}

interface Bluetooth {
	public static final String bluetoothType = "bluetooth";
	public static final String bluetoothVersion = "4.0";
	public static final String connDevice = "Laptop";
	
	public abstract void getBluetoothType();
	public abstract void getBluetoothVersion();
	public abstract void getConnDevice();
}

interface GraphicCard {
	public static final String GCType = "PCI";
	public static final String GCVersion = "16.0";
	
	public abstract void getGCType();
	public abstract void getGCVersion();
}