package org.uncle.lee.strategy.demo;

import org.uncle.lee.utils.LogUtils;

public class BaiduMapService implements MapService {
	private static final String TAG = BaiduMapService.class.getSimpleName();

	@Override
	public void locate() {
		LogUtils.d(TAG, "locate");
	}

	@Override
	public void getPois() {
		LogUtils.d(TAG, "getPois");
	}

	@Override
	public void startNavi() {
		LogUtils.d(TAG, "startNavi");
	}

	@Override
	public void otherFunction() {
		LogUtils.d(TAG, "otherFunction");
	}
}
