package com.thumninh.thumninh.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Toolbar;

import com.mancj.materialsearchbar.MaterialSearchBar;
import com.thumninh.thumninh.R;
import com.thumninh.thumninh.fragment.base.BaseFragment;

import butterknife.BindView;

public class HomeFragment extends BaseFragment implements MaterialSearchBar.OnSearchActionListener {

    @BindView(R.id.searchBar)
    MaterialSearchBar mSearchBar;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mSearchBar.setOnSearchActionListener(this);
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void onSearchStateChanged(boolean enabled) {

    }

    @Override
    public void onSearchConfirmed(CharSequence text) {
        Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onButtonClicked(int buttonCode) {

    }
}
