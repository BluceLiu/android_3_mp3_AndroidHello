package com.example.androidhello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends Activity{

	EditText editShenGao;
	EditText editTiZhong;
	Button btnJiSuan;
	TextView txtResult;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tablelayout_main);
		//控件进行初始化
		editShenGao=(EditText) findViewById(R.id.editShenGao);
		editTiZhong=(EditText) findViewById(R.id.editTiZhong);
		btnJiSuan=(Button) findViewById(R.id.btnJiSuan);
		txtResult=(TextView) findViewById(R.id.txtResult);
		
		//设置按钮事件
		btnJiSuan.setOnClickListener(new JiSuanListener());
	}

	class JiSuanListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			//获得控件的值
			float shenGao=Float.parseFloat(editShenGao.getText().toString());
			float tiZhong=Float.parseFloat(editTiZhong.getText().toString());
			float result=tiZhong/(shenGao*shenGao);
			/*
			 * 过轻：低于18.5    正常：18.5-24.99     过重：25-28    肥胖：28-32    非常肥胖, 高于32
			 * */
			String str="";
			if(result<18.5){
				str="过轻";
			}else if(result>=18.5 && result<=24.99){
				str="正常";
			}else if(result>=25 && result<=27.99){
				str="过重";
			}else if(result>=28 && result<=31.99){
				str="肥胖";
			}else{
				str="非常肥胖";
			}
			txtResult.setText("结果："+result+","+str);
		}
		
	}
}
