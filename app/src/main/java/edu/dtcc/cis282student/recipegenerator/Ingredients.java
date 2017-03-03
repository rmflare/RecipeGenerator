package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

class Ingredients extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);

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
                break;

            case R.id.btn_all_clear:
                break;

            default:
                break;
        }
    }
}
