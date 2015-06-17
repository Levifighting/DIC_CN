package com.stone.utils;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import com.stone.common.DicApp;

/*
 * 对文件的操作
 */
public class FileUtil {

	/*
	 * 对assets文件夹中的文件
	 */
	public static byte[] getFile2Bytes(String filePath) throws IOException {
		InputStream inStream = null;
		byte[] data = null;
		ByteArrayOutputStream outputStream = null;
		try {
			inStream = DicApp.getContext().getAssets().open(filePath);
			outputStream = new ByteArrayOutputStream();
			int length = -1;
			byte[] buffer = new byte[1000];
			while ((length = inStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, length);
			}
			data = outputStream.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inStream != null) {
				inStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
		return data;
	}
}
