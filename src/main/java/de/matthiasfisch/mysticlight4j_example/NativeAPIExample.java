package de.matthiasfisch.mysticlight4j_example;

import de.matthiasfisch.mysticlight4j.api.DeviceInfo;
import de.matthiasfisch.mysticlight4j.api.LedInfo;
import de.matthiasfisch.mysticlight4j.api.MysticLightAPI;

public class NativeAPIExample {

	public static void main(final String[] args) {
		MysticLightAPI.initialize();
		
		final DeviceInfo[] devices = MysticLightAPI.getDeviceInfo();  
		for (final DeviceInfo device : devices) {  
		  final String deviceId = device.getDeviceType();
		  
		  final String deviceName = MysticLightAPI.getDeviceNameEx(deviceId, 0);
		  System.out.println(deviceName);
		 for (int i = 0; i < device.getLedCount(); i++) {  
		        final LedInfo led = MysticLightAPI.getLedInfo(device.getDeviceType(), i);  
		        System.out.println(String.format("\t%s", led.getName()));  
		  }  
		}
	}
}
