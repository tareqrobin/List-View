package com.tareqrobin.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    List<ModelStudent> studentInfo=new ArrayList<ModelStudent>();

    public CustomAdapter(Context cont, List<ModelStudent> std){
        super(cont,R.layout.custom_layout,std);
        studentInfo=std;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater infl =(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=infl.inflate(R.layout.custom_layout,parent,false);
        TextView tv=row.findViewById(R.id.tv1);
        tv.setText(studentInfo.get(position).getName()+"\n"+studentInfo.get(position).getRoll()+"\n"+studentInfo.get(position).getSection());
        return row;
    }
}








