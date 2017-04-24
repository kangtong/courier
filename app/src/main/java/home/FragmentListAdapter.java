package home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class FragmentListAdapter extends FragmentStatePagerAdapter{
  private ArrayList<Fragment> fragments;
  private List<String> tagList;
  private FragmentManager fm;
  public FragmentListAdapter(FragmentManager fm) {
    super(fm);
    this.fm=fm;
  }

  public FragmentListAdapter(FragmentManager fm,ArrayList<Fragment> fragments){
    super(fm);
    this.fragments=fragments;
  }

  @Override public Fragment getItem(int position) {
    return fragments.get(position);
  }

  @Override public int getCount() {
    return fragments.size();
  }
}
