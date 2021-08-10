package com.example.teachexactly;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class Notification extends AppCompatActivity {
    TextView textView;
    ListView list;
    String name;
    public static final String USERNAME="USERNAME";
    String[] maintitle ={
            "Notification 1","Notification 2",
            "Notification 3","Notification 4",
            "Notification 5",
    };

    String[] subtitle ={
            "10th August","10th August",
            "10th August","10th August",
            "10th August",
    };

    Integer[] imgid={
            R.drawable.profile_icon,R.drawable.profile_icon,
            R.drawable.profile_icon,R.drawable.profile_icon,
            R.drawable.profile_icon,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        // calling the action bar
        ActionBar actionBar = getSupportActionBar();
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        MyListView adapter=new MyListView(this, maintitle, subtitle,imgid);
        list=findViewById(R.id.list);
        list.setAdapter(adapter);
        textView=findViewById(R.id.welcome);
        Intent intent=getIntent();
        name=intent.getStringExtra(USERNAME);

        textView.setText("Welcome"+ name);



    }
}