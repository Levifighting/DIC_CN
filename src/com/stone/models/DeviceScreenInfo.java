package com.stone.models;

/*
 * �豸��Ϣ
 */
public class DeviceScreenInfo {
	// ��Ļ���
	private int _width;

	// ��Ļ�߶�
	private int _height;

	// ��Ļ�ܶ�
	private float _density;

	// ��Ļ�ܶ�dpi
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
