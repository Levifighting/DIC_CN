package com.stone.common;

/*
 * 回调接口
 */
public interface ICallback<T> {
	void onSuccess(T t);

	void onError(Exception ex);
}
