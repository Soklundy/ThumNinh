package com.thumninh.thumninh.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.thumninh.thumninh.R;
import com.thumninh.thumninh.activities.base.BaseActivity;
import com.thumninh.thumninh.adapter.TabLayoutAdapter;
import com.thumninh.thumninh.fragment.AccountFragment;
import com.thumninh.thumninh.fragment.HomeFragment;
import com.thumninh.thumninh.fragment.MoreFragment;
import com.thumninh.thumninh.fragment.ShoppingFragment;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    private static final int sTab1 = 0;
    private static final int sTab2 = 1;
    private static final int sTab3 = 2;
    private static final int sTab4 = 3;

    private static final int[] sTabIcons = {
            R.drawable.icon_home,
            R.drawable.icon_shopping_cart,
            R.drawable.icon_account,
            R.drawable.icon_more
    };

    private static final int[] sTabName = {
            R.string.txt_home,
            R.string.txt_cart,
            R.string.txt_my_account,
            R.string.txt_more
    };

    private TabLayoutAdapter mTabLayoutAdapter;

    @BindView(R.id.tabs)
    TabLayout mTabLayout;

    @BindView(R.id.viewpager)
    ViewPager mViewPager;

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViewPager();
    }

    private void initViewPager() {
        mTabLayoutAdapter = new TabLayoutAdapter(getSupportFragmentManager());
        mTabLayoutAdapter.addFrag(new HomeFragment());
        mTabLayoutAdapter.addFrag(new ShoppingFragment());
        mTabLayoutAdapter.addFrag(new AccountFragment());
        mTabLayoutAdapter.addFrag(new MoreFragment());
        mViewPager.setAdapter(mTabLayoutAdapter);
        mViewPager.setOffscreenPageLimit(4);
        initTabLayout();
    }

    private void initTabLayout() {
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(sTab1).setCustomView(getTabView(sTab1));
        mTabLayout.getTabAt(sTab2).setCustomView(getTabView(sTab2));
        mTabLayout.getTabAt(sTab3).setCustomView(getTabView(sTab3));
        mTabLayout.getTabAt(sTab4).setCustomView(getTabView(sTab4));
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case sTab1:
                        break;
                }
            }
        });
    }

    private View getTabView(int position) {
        View viewTab = LayoutInflater.from(this).inflate(R.layout.custom_tab_item, null);
        ImageView imageTab = viewTab.findViewById(R.id.image_view);
        TextView txtName = viewTab.findViewById(R.id.txt_name);
        imageTab.setImageResource(sTabIcons[position]);
        txtName.setText(getString(sTabName[position]));
        return viewTab;
    }
}
