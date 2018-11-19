package com.example.gzdekaya.task;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tablayout);
        appBarLayout=(AppBarLayout)findViewById(R.id.appbar);
       viewPager=(ViewPager)findViewById(R.id.viewpager);
         ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
         adapter.AddFragment(new Frag_signin(),"Sign In");
         adapter.AddFragment(new Frag_signup(),"Sign Up");

         viewPager.setAdapter(adapter);
         tabLayout.setupWithViewPager(viewPager);
    }
}
