package org.uncle.lee.chainof.responsibility.pipeline.Handler;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;
import org.uncle.lee.chainof.responsibility.pipeline.request.Request.CurrentBoss;
import org.uncle.lee.utils.LogUtils;

public class OtherManHandler extends BaseHandler {
	private static final String TAG = OtherManHandler.class.getSimpleName();

	public OtherManHandler(int priority) {
		super(priority);
	}
	
	@Override
	public void doHandle(Request request) {
		LogUtils.d(TAG, request.getRequestContent() + " | pass");
	}

	@Override
	public CurrentBoss initCurrentBoss() {
		return CurrentBoss.otherMan;
	}
}
