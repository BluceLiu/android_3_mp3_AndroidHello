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
		//�ؼ����г�ʼ��
		editShenGao=(EditText) findViewById(R.id.editShenGao);
		editTiZhong=(EditText) findViewById(R.id.editTiZhong);
		btnJiSuan=(Button) findViewById(R.id.btnJiSuan);
		txtResult=(TextView) findViewById(R.id.txtResult);
		
		//���ð�ť�¼�
		btnJiSuan.setOnClickListener(new JiSuanListener());
	}

	class JiSuanListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			//��ÿؼ���ֵ
			float shenGao=Float.parseFloat(editShenGao.getText().toString());
			float tiZhong=Float.parseFloat(editTiZhong.getText().toString());
			float result=tiZhong/(shenGao*shenGao);
			/*
			 * ���᣺����18.5    ������18.5-24.99     ���أ�25-28    ���֣�28-32    �ǳ�����, ����32
			 * */
			String str="";
			if(result<18.5){
				str="����";
			}else if(result>=18.5 && result<=24.99){
				str="����";
			}else if(result>=25 && result<=27.99){
				str="����";
			}else if(result>=28 && result<=31.99){
				str="����";
			}else{
				str="�ǳ�����";
			}
			txtResult.setText("�����"+result+","+str);
		}
		
	}
}
