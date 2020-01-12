package bestshot.pro.albaniatraveltours;

import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;


public class CategoryFragmentAdapter extends FragmentPagerAdapter {

    public CategoryFragmentAdapter(FragmentManager fm) {
        super(fm, CategoryFragmentAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new ToursFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else {
            return new RestaurantsFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        if (position >= getCount()) {
            FragmentManager manager = ((Fragment) object).getFragmentManager();
            FragmentTransaction trans = manager.beginTransaction();
            trans.remove((Fragment) object);
            trans.commit();
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;

    }
}
