package com.stone.models;

import java.io.Serializable;
import java.util.List;

/*
 * OCR识别结果
 */
public class OcrResult implements Serializable {
	private static final long serialVersionUID = 3113578300009705492L;

	public String errNum;
	public String errMsg;
	public String querySign;
	public List<OcrContent> retData;

	public class OcrContent {
		public String word;
		public OcrRect rect;
	}

	class OcrRect {
		public String left;
		public String top;
		public String width;
		public String height;
	}
}