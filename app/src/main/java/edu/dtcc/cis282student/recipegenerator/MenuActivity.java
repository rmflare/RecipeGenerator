package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Buttons
        Button btnFind = (Button) findViewById(R.id.btn_menu_find);
        Button btnSaved = (Button) findViewById(R.id.btn_menu_saved);

        // Button listeners
        btnFind.setOnClickListener(this);
        btnSaved.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_menu_find:
                startActivity(new Intent(this, CategoryListActivity.class));
                break;

            case R.id.btn_menu_saved:
                startActivity(new Intent(this, FavRecipeListActivity.class));
                break;
        }
    }
}
