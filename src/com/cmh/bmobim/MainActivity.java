package com.cmh.bmobim;

import org.w3c.dom.UserDataHandler;

import cn.bmob.im.BmobChat;
import cn.bmob.v3.Bmob;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	public static final String APP_ID = "902bf48d8c087bf42e916e5dd0c7170d";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		BmobChat.DEBUG_MODE = true;

		BmobChat.getInstance(this).init(APP_ID);
		

	}

}
