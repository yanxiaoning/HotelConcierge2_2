package com.centurysoft.concierge;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Gallery;

public class GuestServiceActivity  extends Activity {
	 
    private Gallery gallery;



    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.concierge_guestservice);

        gallery = (Gallery) findViewById(R.id.gallery3);

        List<Img> list=new ArrayList<Img>();

        Img img;

        for (int i = 0; i < 4; i++) {

            img=new Img();


            list.add(img);

        }

        GuestServicePageAdapter pageAdapter=new GuestServicePageAdapter(GuestServiceActivity.this, list);

       gallery.setAdapter(pageAdapter);
       gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       	
			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				
				if(position == 0)
				{
				
				}
				else if(position == 1)
				{
				
				}
				else if(position == 2)
				{
				
				}
				else if(position == 3)
				{
				
				}
				
				
			}

			
		});

       

    }
    
    @Override

	public boolean onKeyDown(int keyCode, KeyEvent event) {

	

		if(keyCode == KeyEvent.KEYCODE_BACK){
			Intent intent = new Intent();
			intent.setClass(GuestServiceActivity.this, MainActivity.class);
			startActivity(intent);
			finish();

			

			return true;

		}else{		

			return super.onKeyDown(keyCode, event);

		}

	}

} 
