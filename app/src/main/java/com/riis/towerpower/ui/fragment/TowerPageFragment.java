package com.riis.towerpower.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.riis.towerpower.R;
import com.riis.towerpower.models.eNetworkType;

/**
 * @author tkocikjr
 */
public class TowerPageFragment extends Fragment
{
    private RecyclerView mTowerList;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_tower_page, container, false);

        setUpViews(rootView);

        return rootView;
    }

    private void setUpViews(View rootView)
    {
        mTowerList = (RecyclerView) rootView.findViewById(R.id.data_list);
    }
}