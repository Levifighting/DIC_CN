package com.stone.common;

import android.util.DisplayMetrics;
import com.stone.models.DeviceScreenInfo;

public class DeviceSingleton {
	private volatile static DeviceSingleton _instance;

	private DeviceSingleton() {
	}

	public static DeviceSingleton getInstance() {
		if (_instance == null) {
			synchronized (DeviceSingleton.class) {
				if (_instance == null) {
					_instance = new DeviceSingleton();
				}
			}
		}
		return _instance;
	}

	// 获取设备info
	public DeviceScreenInfo getDeviceScreenInfo() {
		// DisplayMetrics metic = new DisplayMetrics();
		// activity.getWindowManager().getDefaultDisplay().getMetrics(metic);
		DisplayMetrics metic = DicApp.getDisplayMetrics();
		DeviceScreenInfo info = new DeviceScreenInfo();
		info.setWidth(metic.widthPixels);
		info.setHeight(metic.heightPixels);
		info.setDensity(metic.density);
		info.setDensityDPI(metic.densityDpi);
		return info;
	}
}
