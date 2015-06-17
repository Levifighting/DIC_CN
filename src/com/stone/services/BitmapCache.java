package com.stone.services;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.toolbox.ImageLoader.ImageCache;

public class BitmapCache implements ImageCache {
	private LruCache<String, Bitmap> mCache;

	public BitmapCache() {
		int maxSize = 10 * 1024 * 1024;

		this.mCache = new LruCache<String, Bitmap>(maxSize);

	}

	@Override
	public Bitmap getBitmap(String url) {
		return this.mCache.get(url);
	}

	@Override
	public void putBitmap(String url, Bitmap bitmap) {
		this.mCache.put(url, bitmap);

	}
}
