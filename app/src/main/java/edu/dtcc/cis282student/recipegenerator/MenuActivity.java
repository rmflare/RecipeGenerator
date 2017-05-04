package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton btnSearch = (ImageButton) findViewById(R.id.btn_menu_search);
        ImageButton btnFavorite = (ImageButton) findViewById(R.id.btn_menu_favorite);

        btnSearch.setOnClickListener(this);
        btnFavorite.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_menu_search:
                startActivity(new Intent(this, CategoryListActivity.class));
                break;

            case R.id.btn_menu_favorite:
                break;
        }
    }
}
