package com.centurysoft.concierge;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Gallery;

public class MainActivity extends Activity {
	 
      private Gallery gallery;

  

      @Override

      public void onCreate(Bundle savedInstanceState) {

          super.onCreate(savedInstanceState);
          this.requestWindowFeature(Window.FEATURE_NO_TITLE);
          setContentView(R.layout.concierge_main);

          gallery = (Gallery) findViewById(R.id.gallery1);

          List<Img> list=new ArrayList<Img>();

          Img img;

          for (int i = 0; i < 4; i++) {

              img=new Img();

 
              list.add(img);

          }

         MainPageAdapter pageAdapter=new MainPageAdapter(MainActivity.this, list);

         gallery.setAdapter(pageAdapter);
         gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        	
			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				if(position == 0)
				{
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, DiningActivity.class);
				startActivity(intent);
				finish();
				}
				else if(position == 1)
				{
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, GuestServiceActivity.class);
				startActivity(intent);
				finish();
				}
				
			}

			
		});
         

         

      }

  } 
