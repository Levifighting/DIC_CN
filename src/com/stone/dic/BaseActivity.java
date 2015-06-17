package com.stone.dic;

import android.app.Activity;
import android.os.Bundle;

/*
 * 作为activity的基类
 */
public class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}
