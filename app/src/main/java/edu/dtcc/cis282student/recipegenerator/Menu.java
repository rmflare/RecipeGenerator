package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Buttons
        Button btnFind = (Button) findViewById(R.id.btn_menu_findRecipes);
        Button btnSaved = (Button) findViewById(R.id.btn_menu_savedRecipes);

        // Button listeners
        btnFind.setOnClickListener(this);
        btnSaved.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_menu_findRecipes:
                Intent cIntent = new Intent(getApplicationContext(), Categories.class);
                startActivity(cIntent);
                break;

            case R.id.btn_menu_savedRecipes:
                Intent fIntent = new Intent(getApplicationContext(), Favorites.class);
                startActivity(fIntent);
                break;

            default:
                break;
        }
    }
}
