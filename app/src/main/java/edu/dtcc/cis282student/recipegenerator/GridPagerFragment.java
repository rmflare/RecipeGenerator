package edu.dtcc.cis282student.recipegenerator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class GridPagerFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_grid_pager, container, false);
        ViewPager pager = (ViewPager) v.findViewById(R.id.fragment_grid_pager);
        pager.setAdapter(buildAdapter());
        pager.setOffscreenPageLimit(2);

        Button btn1 = (Button) v.findViewById(R.id.btn_grid_1);
        Button btn2 = (Button) v.findViewById(R.id.btn_grid_2);
        Button btn3 = (Button) v.findViewById(R.id.btn_grid_3);
        Button btn4 = (Button) v.findViewById(R.id.btn_grid_4);
        Button btn5 = (Button) v.findViewById(R.id.btn_grid_5);
        Button btn6 = (Button) v.findViewById(R.id.btn_grid_6);
        Button btn7 = (Button) v.findViewById(R.id.btn_grid_7);
        Button btn8 = (Button) v.findViewById(R.id.btn_grid_8);
        Button btn9 = (Button) v.findViewById(R.id.btn_grid_9);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        return v;
    }

    private GridPagerAdapter buildAdapter() {
        return(new GridPagerAdapter(getChildFragmentManager()));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_grid_1:
                break;

            case R.id.btn_grid_2:
                break;

            case R.id.btn_grid_3:
                break;

            case R.id.btn_grid_4:
                break;

            case R.id.btn_grid_5:
                break;

            case R.id.btn_grid_6:
                break;

            case R.id.btn_grid_7:
                break;

            case R.id.btn_grid_8:
                break;

            case R.id.btn_grid_9:
                break;
        }
    }
}