package com.example.androidhello;

import com.example.entity.User;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity{

	TextView txtUserName;
	TextView txtUserPwd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondlayout);
		txtUserName=(TextView) findViewById(R.id.txtUserName);
		txtUserPwd=(TextView) findViewById(R.id.txtUserPwd);
		
		Intent in=this.getIntent();
//		txtUserName.setText(in.getExtras().get("uname").toString());
//		txtUserPwd.setText(in.getExtras().get("upwd").toString());
		
		User u=(User) in.getExtras().get("user");
		txtUserName.setText(u.getUserName());
		txtUserPwd.setText(u.getUserPwd());
	}

}
