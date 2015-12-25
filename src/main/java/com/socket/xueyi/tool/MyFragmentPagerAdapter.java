package com.socket.xueyi.tool;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.socket.xueyi.config.Consts;
import com.socket.xueyi.fragment.MyFragment1;
import com.socket.xueyi.fragment.MyFragment2;
import com.socket.xueyi.fragment.MyFragment3;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGER_COUNT = 3;
    private MyFragment1 myFragment1 = null;
    private MyFragment2 myFragment2 = null;
    private MyFragment3 myFragment3 = null;



    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        myFragment1 = new MyFragment1();
        myFragment2 = new MyFragment2();
        myFragment3 = new MyFragment3();
    }


    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        System.out.println("position Destory" + position);
        super.destroyItem(container, position, object);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case Consts.PAGE_ONE:
                fragment = myFragment1;
                break;
            case Consts.PAGE_TWO:
                fragment = myFragment2;
                break;
            case Consts.PAGE_THREE:
                fragment = myFragment3;
                break;
        }
        return fragment;
    }
}