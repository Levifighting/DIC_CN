package com.stone.common;

/*
 * �ص��ӿ�
 */
public interface ICallback<T> {
	void onSuccess(T t);

	void onError(Exception ex);
}
