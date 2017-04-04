package edu.dtcc.cis282student.recipegenerator.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import edu.dtcc.cis282student.recipegenerator.R;

public class IngredientListActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "IngredientListActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
        Log.d(TAG, "====== onCreate() called ======");

        // Buttons
        Button btnIng1 = (Button) findViewById(R.id.btn_ingredients_ing1);
        Button btnIng2 = (Button) findViewById(R.id.btn_ingredients_ing2);
        Button btnIng3 = (Button) findViewById(R.id.btn_ingredients_ing3);
        Button btnIng4 = (Button) findViewById(R.id.btn_ingredients_ing4);
        Button btnIng5 = (Button) findViewById(R.id.btn_ingredients_ing5);
        Button btnIng6 = (Button) findViewById(R.id.btn_ingredients_ing6);
        Button btnIng7 = (Button) findViewById(R.id.btn_ingredients_ing7);
        Button btnIng8 = (Button) findViewById(R.id.btn_ingredients_ing8);
        Button btnIng9 = (Button) findViewById(R.id.btn_ingredients_ing9);
        Button btnBack = (Button) findViewById(R.id.btn_all_back);
        Button btnClear = (Button) findViewById(R.id.btn_all_clear);

        // Button listeners
        btnIng1.setOnClickListener(this);
        btnIng2.setOnClickListener(this);
        btnIng3.setOnClickListener(this);
        btnIng4.setOnClickListener(this);
        btnIng5.setOnClickListener(this);
        btnIng6.setOnClickListener(this);
        btnIng7.setOnClickListener(this);
        btnIng8.setOnClickListener(this);
        btnIng9.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnClear.setOnClickListener(this);
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
            case R.id.btn_ingredients_ing1:
                break;

            case R.id.btn_ingredients_ing2:
                break;

            case R.id.btn_ingredients_ing3:
                break;

            case R.id.btn_ingredients_ing4:
                break;

            case R.id.btn_ingredients_ing5:
                break;

            case R.id.btn_ingredients_ing6:
                break;

            case R.id.btn_ingredients_ing7:
                break;

            case R.id.btn_ingredients_ing8:
                break;

            case R.id.btn_ingredients_ing9:
                break;

            case R.id.btn_all_back:
                Intent bIntent = new Intent(this, CategoryListActivity.class);
                startActivity(bIntent);
                break;

            case R.id.btn_all_clear:
                break;

            default:
                break;
        }
    }
}
