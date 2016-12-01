package com.example.androidhello;

import com.example.entity.User;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends Activity{
	EditText userName;
	EditText userPwd;
	Button btnLogin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstlayout);
		
		//��ʼ��
		userName=(EditText) findViewById(R.id.userName);
		userPwd=(EditText) findViewById(R.id.userPwd);
		btnLogin=(Button) findViewById(R.id.btnLogin);
		
		
		btnLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//��ò���������
				String userNamestr=userName.getText().toString();
				String userPwdstr=userPwd.getText().toString();
	/*			
				//1.intent����     startActivity(intent);
				Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
//				intent.putExtra("uname", userNamestr);
//				intent.putExtra("upwd", userPwdstr);
				
				User user=new User(userNamestr,userPwdstr);
				intent.putExtra("user", user);
				startActivity(intent);//��ת
				
	*/		
				
	/*			
				//2.ComponentName
				ComponentName cn=new ComponentName(FirstActivity.this, SecondActivity.class);
				Intent intent=new Intent();
				intent.setComponent(cn);
				User user=new User(userNamestr,userPwdstr);
				intent.putExtra("user", user);
				startActivity(intent);
				*/
				
				
				//3.action����Ӧ;������activityʹ����ͬ��action������ѡ����Թ�ѡ��
				
				Intent intent=new Intent("my.action");
				intent.addCategory("my.category");
				User user=new User(userNamestr,userPwdstr);
				intent.putExtra("user", user);
				startActivity(intent);
				
				
				
			}
		});
	}
	

}
