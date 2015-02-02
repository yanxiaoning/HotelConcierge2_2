package com.centurysoft.concierge;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GuestServicePageAdapter extends BaseAdapter {
	 
      private List<Img> list;
 
     private LayoutInflater inflater;
      
     private Context context;
 
      public GuestServicePageAdapter(Context context,List<Img> list) {
 
          this.list=list;
 
          this.inflater=LayoutInflater.from(context);
          
          this.context = context;
 
      }
 
  
 
      @Override
 
      public int getCount() {
 
          return list.size();
 
      }
 
  
 
      @Override
 
      public Object getItem(int position) {
 
          return list.get(position);
 
      }
 
  
 
      @Override
 
      public long getItemId(int position) {
 
          return position;
 
      }
 
  
 
      @Override
 
      public View getView(int position, View convertView, ViewGroup parent) {
 
          CacheView cacheView;
 
          if(convertView==null){
 if(position == 0)
 {
              convertView=inflater.inflate(R.layout.concierge_guestservice_housekeeping_img, null);
             
 }
 else if(position == 1)
 {
     convertView=inflater.inflate(R.layout.concierge_guestservice_washing_img, null);
    
 }
 else if(position == 2)
 {
     convertView=inflater.inflate(R.layout.concierge_guestservice_wakeupcall_img, null);
    
 }
 else if(position == 3)
 {
     convertView=inflater.inflate(R.layout.concierge_guestservice_spa_img, null);
    
 }
 
 

              cacheView=new CacheView();
 
              cacheView.tv_des=(TextView) convertView.findViewById(R.id.tv_des);
 
            
 
              convertView.setTag(cacheView);
 
          }else{
 
              cacheView=(CacheView) convertView.getTag();
 
          }
 
         
 
          
 
          return convertView;
 
      }
 
      
 
      private static class CacheView{
 
          TextView tv_des;
 
          //ImageView imgv_img;
 
      }

	
 
  } 

