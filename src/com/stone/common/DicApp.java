package com.stone.common;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/*
 * DicApp为全局上下文，资源访问
 * TO DO ...
 */
public class DicApp extends Application {
	private static Context mContext;
	private static Resources mResources;
	private static DisplayMetrics mDisplayMetrics;
	private static RequestQueue mQueue;

	@Override
	public void onCreate() {
		// super.onCreate();
		mContext = this.getApplicationContext();
		mResources = mContext.getResources();
		mDisplayMetrics = mResources.getDisplayMetrics();
		mQueue = Volley.newRequestQueue(mContext);
	}

	public static Context getContext() {
		return mContext;
	}

	public static Resources getRes() {
		return mResources;
	}

	public static DisplayMetrics getDisplayMetrics() {
		return mDisplayMetrics;
	}
}
