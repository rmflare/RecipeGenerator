package edu.dtcc.cis282student.recipegenerator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GridFragment extends Fragment {
    int position;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        position = getArguments().getInt("position");
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_grid, container, false);

        return v;
    }

    static GridFragment newInstance(int position) {
        GridFragment frag = new GridFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        frag.setArguments(args);

        return frag;
    }

    static CharSequence getTitle(int position) {
        return "Page " + (position + 1);
    }
}