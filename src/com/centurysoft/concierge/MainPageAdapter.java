package com.centurysoft.concierge;

import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MainPageAdapter extends BaseAdapter {
	 
      private List<Img> list;
 
     private LayoutInflater inflater;
      
     private MainActivity context;
 
      public MainPageAdapter(Context context,List<Img> list) {
 
          this.list=list;
 
          this.inflater=LayoutInflater.from(context);
          
          this.context = (MainActivity)context;
 
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
              convertView=inflater.inflate(R.layout.concierge_dining_img, null);
              
             
             
 }
 else if(position == 1)
 {
     convertView=inflater.inflate(R.layout.concierge_guestservice_img, null);
    
     
 }
 else if(position == 2)
 {
     convertView=inflater.inflate(R.layout.concierge_localattractions_img, null);
    
    
 }
 else if(position == 3)
 {
     convertView=inflater.inflate(R.layout.concierge_expresscheckout_img, null);
     
    
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
 
          
 
      }

	
 
  } 

