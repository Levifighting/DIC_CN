package com.stone.adapters;

import java.util.List;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.stone.services.BitmapCache;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * list adapter基类，getView在子类中需要重写
 * 
 * @author levi.li
 *
 * @param <T>
 */
public class BaseListAdapter<T> extends BaseAdapter {

	private RequestQueue _mQueue;
	protected List<T> _entityList;
	protected Context _context;
	protected ImageLoader _imageLoader;

	public BaseListAdapter(Context context, List<T> entityList) {
		this._context = context;
		this._entityList = entityList;
	}

	public BaseListAdapter(Context context, List<T> entityList, RequestQueue mQueue, boolean isLoadImages) {
		this._context = context;
		this._entityList = entityList;
		this._mQueue = mQueue;

		if (isLoadImages) {// 加载图片
			this._imageLoader = new ImageLoader(this._mQueue, new BitmapCache());
		}
	}

	public void onDataChanged(List<T> newsList) {
		this._entityList = newsList;
		this.notifyDataSetChanged();
	}

	public void addAllItems(List<T> newsList) {
		this._entityList.addAll(newsList);
		this.notifyDataSetChanged();
	}

	public void clearAllItems() {
		this._entityList.clear();
		this.notifyDataSetChanged();
	}

	public void removeItemAt(int position) {
		this._entityList.remove(position);
		this.notifyDataSetChanged();
	}

	@Override
	public int getCount() {
		return this._entityList.size();
	}

	@Override
	public Object getItem(int position) {
		return this._entityList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return null;
	}

}
