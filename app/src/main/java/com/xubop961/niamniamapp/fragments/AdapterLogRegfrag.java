package com.xubop961.niamniamapp.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterLogRegfrag  extends FragmentStateAdapter {
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return position == 0 ? new LoginFragment() : new RegisterFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
