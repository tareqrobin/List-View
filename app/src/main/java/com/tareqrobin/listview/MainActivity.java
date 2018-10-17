package com.tareqrobin.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.lv);
        tv=findViewById(R.id.textView);
        final List<ModelStudent> sList=new ArrayList<>();

        sList.add(new ModelStudent("Amim",3,"A Section"));
        sList.add(new ModelStudent("Tareq",23,"B Section"));
        sList.add(new ModelStudent("Shan",24,"A Section"));
        sList.add(new ModelStudent("Robin",73,"C Section"));
        sList.add(new ModelStudent("Ehshan",63,"A Section"));
        sList.add(new ModelStudent("Amimul",23,"A Section"));
        sList.add(new ModelStudent("Rifat",25,"C Section"));
        sList.add(new ModelStudent("Tareq",28,"C Section"));
        sList.add(new ModelStudent("Reza",7,"B Section"));
        sList.add(new ModelStudent("Amim",5,"B Section"));


        CustomAdapter adptr=new CustomAdapter(getApplicationContext(),sList);
        lv.setAdapter(adptr);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(),"name is: "+sList.get(i).getRoll(),Toast.LENGTH_SHORT).show();
                tv.setText("name is:"+sList.get(i).getName());

            }
        });


    }
}




