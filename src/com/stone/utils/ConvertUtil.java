package com.stone.utils;

import java.net.URLEncoder;
import com.stone.common.GlobalValues;
import android.util.Base64;

/*
 * 转换类
 */
public class ConvertUtil {
	/*
	 * 将byte[]转成字符串
	 */
	public static String toBase64(byte[] binaryData) {
		String rtn = null;
		try {
			// 保证编编后的字符串在一行（不能用Base64.DEFAULT）
			rtn = new String(Base64.encode(binaryData, Base64.NO_WRAP), GlobalValues.EncodingUTF8);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtn;
	}

	/*
	 * 将base64字符串转成byte[]
	 */
	public static byte[] fromBase64(String sourceData) {
		try {
			return Base64.decode(sourceData, Base64.NO_WRAP);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * url encoding
	 */
	public static String Urlencode(String strSource) {
		return Urlencode(strSource, GlobalValues.EncodingUTF8);
	}

	public static String Urlencode(String strSource, String strEncoding) {
		String rtn = null;
		try {
			rtn = URLEncoder.encode(strSource, strEncoding);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtn;
	}

	/*
	 * unicode 转中文
	 */
	public static String unicode2cn(String unicode) {
		String ret = null;
		try {
			byte[] convert = unicode.getBytes(GlobalValues.EncodingUTF8);
			ret = new String(convert, GlobalValues.EncodingUTF8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}
}
