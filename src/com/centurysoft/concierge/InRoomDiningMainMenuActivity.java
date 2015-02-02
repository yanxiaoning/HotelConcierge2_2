package com.centurysoft.concierge;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class InRoomDiningMainMenuActivity extends Activity {
	@Override
	public void onCreate(Bundle saveInstanceState)
	{
		super.onCreate(saveInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.concierge_inroomdiningmainmenu);
		
		
		
		
		
	}

}
