package com.example.androidhello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MP3Activity extends Activity{

	Button btnbofang;
	Button btntingzhi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mp3);
		
		btnbofang=(Button) findViewById(R.id.btnbofang);
		btntingzhi=(Button) findViewById(R.id.btntingzhi);
		
		mp3listener mpl=new mp3listener();		
		btnbofang.setOnClickListener(mpl);
		btntingzhi.setOnClickListener(mpl);
	}
	
	class mp3listener implements OnClickListener{

		@Override
		public void onClick(View v) {
			Intent intent=new Intent(MP3Activity.this, MyService.class);
			if(v.getId()==R.id.btnbofang){
				//≤•∑≈“Ù¿÷
				startService(intent);
				
			}else if(v.getId()==R.id.btntingzhi){
				//Õ£÷π“Ù¿÷
				stopService(intent);
			}
			
		}
		
	}

}
