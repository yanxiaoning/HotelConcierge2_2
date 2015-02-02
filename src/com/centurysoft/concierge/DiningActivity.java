package com.centurysoft.concierge;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.LinearLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TimePicker;

public class DiningActivity  extends Activity {
	 
    private Gallery gallery;
	private Calendar c = null;
	
	private Context context;



    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        context = this;
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.concierge_dining);

        gallery = (Gallery) findViewById(R.id.gallery2);

        List<Img> list=new ArrayList<Img>();

        Img img;

        for (int i = 0; i < 2; i++) {

            img=new Img();


            list.add(img);

        }

      DiningPageAdapter pageAdapter=new DiningPageAdapter(DiningActivity.this, list);

       gallery.setAdapter(pageAdapter);
       gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       	
			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				
				if(position == 0)
				{
					LayoutInflater inflater = getLayoutInflater();
					   LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.concierge_timepickerlayout,
					     (ViewGroup) findViewById(R.id.dialog));
					   
					   TimePicker timePicker = new TimePicker(context);
					   timePicker.setIs24HourView(true);
					 
					   
					   layout.addView(timePicker, new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
					  
					  new AlertDialog.Builder(context).setTitle("Service Time").setView(layout)
					     .setPositiveButton("OK", new OnClickListener() {

					    	    @Override
					    	    public void onClick(DialogInterface dialog, int which) {
					    	     // TODO Auto-generated method stub
					    	    //»∑»œœÏ”¶
					    	    	
					    	    	Intent intent = new Intent();
					    	    	intent.setClass(context, InRoomDiningMainMenuActivity.class);
					    	    	startActivity(intent);
					    	    	finish();
					    	    	
					    	    	
					    	    	
					    	    	
					    	    }
					    	   }

					     ).setNegativeButton("Cancel", null).show();
					  
					  


				}
				else if(position == 1)
				{
				
				}
				
				
			}

			
		});

       

    }
    
    @Override

	public boolean onKeyDown(int keyCode, KeyEvent event) {

	

		if(keyCode == KeyEvent.KEYCODE_BACK){
			Intent intent = new Intent();
			intent.setClass(DiningActivity.this, MainActivity.class);
			startActivity(intent);
			finish();

			

			return true;

		}else{		

			return super.onKeyDown(keyCode, event);

		}

	}

    
    
   
} 
