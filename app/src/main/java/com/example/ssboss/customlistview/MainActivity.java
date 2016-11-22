package com.example.ssboss.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Samplepojo> als;
    Customadaptor ca;
    String[] s1={"Sath","Riyan"};
    String[] s2={"Friend","Enemy"};
    int [] s3={R.drawable.jellyfish,R.drawable.style};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listView);
        als=method();
        ca=new Customadaptor(this,als);
        lv.setAdapter(new Customadaptor(this,als));
    }

    private ArrayList<Samplepojo> method() {
        ArrayList<Samplepojo> als_als=new ArrayList<>();
        for(int i=0;i<s1.length;i++)
        {
            Samplepojo sp=new Samplepojo();
            sp.setS1(s1[i]);
            sp.setS2(s2[i]);
            sp.setI(s3[i]);
            als_als.add(sp);
        }
        return als_als;
    }

}
