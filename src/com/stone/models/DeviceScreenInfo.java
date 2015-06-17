package com.stone.models;

/*
 * 设备信息
 */
public class DeviceScreenInfo {
	// 屏幕宽度
	private int _width;

	// 屏幕高度
	private int _height;

	// 屏幕密度
	private float _density;

	// 屏幕密度dpi
	private int _densityDPI;

	public int getWidth() {
		return _width;
	}

	public void setWidth(int _width) {
		this._width = _width;
	}

	public int getHeight() {
		return _height;
	}

	public void setHeight(int _height) {
		this._height = _height;
	}

	public float getDensity() {
		return _density;
	}

	public void setDensity(float _density) {
		this._density = _density;
	}

	public int getDensityDPI() {
		return _densityDPI;
	}

	public void setDensityDPI(int _densityDPI) {
		this._densityDPI = _densityDPI;
	}
}
