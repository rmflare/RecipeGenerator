package edu.dtcc.cis282student.recipegenerator.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import edu.dtcc.cis282student.recipegenerator.R;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MenuActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Log.d(TAG, "====== onCreate() called ======");

        // Buttons
        Button btnFind = (Button) findViewById(R.id.btn_menu_findRecipes);
        Button btnSaved = (Button) findViewById(R.id.btn_menu_savedRecipes);

        // Button listeners
        btnFind.setOnClickListener(this);
        btnSaved.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "====== onStart() called ======");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "====== onResume() called ======");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "====== onPause() called ======");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "====== onStop() called ======");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "====== onDestroy() called ======");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_menu_findRecipes:
                Intent cIntent = new Intent(this, CategoryListActivity.class);
                startActivity(cIntent);
                break;

            case R.id.btn_menu_savedRecipes:
                Intent fIntent = new Intent(this, FavRecipeListActivity.class);
                startActivity(fIntent);
                break;

            default:
                break;
        }
    }
}
