package com.cmh.bmobim.receiver;

import cn.bmob.im.util.BmobLog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyMessageReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		String json = intent.getStringExtra("msg");
		BmobLog.i("ÊÕµ½µÄmessage" + json);
	}

	
}
