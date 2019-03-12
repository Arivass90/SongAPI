package com.example.songapi;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter Adapter;
    private ViewPager Pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        Pager = findViewById(R.id.container);
        Pager.setAdapter(Adapter);
        TabLayout tabLayout = findViewById(R.id.tabs);
        Pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(Pager));
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new TabSong1();
                case 1: return new TabSong2();
                case 2: return new TabSong3();
            }
            return null;
    }
        @Override
        public int getCount() {
            return 3;
        }}
}
