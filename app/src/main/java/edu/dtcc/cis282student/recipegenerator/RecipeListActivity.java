package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;

public class RecipeListActivity extends AppCompatActivity implements View.OnClickListener {
    private Button[] buttons;
    private static final int[] BUTTON_ID = {
            R.id.btn_output_1, R.id.btn_output_2, R.id.btn_output_3,
            R.id.btn_output_4, R.id.btn_output_5, R.id.btn_output_6,
            R.id.btn_output_7, R.id.btn_output_8, R.id.btn_output_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        buttons = new Button[BUTTON_ID.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = (Button) findViewById(BUTTON_ID[i]);
            buttons[i].setOnClickListener(this);
        }

        ImageButton btnBack = (ImageButton) findViewById(R.id.btn_all_back);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_output_1:
                Intent aIntent = new Intent(this, PopupActivity.class);
                startActivity(aIntent);
                break;

            case R.id.btn_output_2:
                Intent bIntent = new Intent(this, PopupActivity.class);
                startActivity(bIntent);
                break;

            case R.id.btn_output_3:
                Intent cIntent = new Intent(this, PopupActivity.class);
                startActivity(cIntent);
                break;

            case R.id.btn_output_4:
                Intent dIntent = new Intent(this, PopupActivity.class);
                startActivity(dIntent);
                break;

            case R.id.btn_output_5:
                Intent eIntent = new Intent(this, PopupActivity.class);
                startActivity(eIntent);
                break;

            case R.id.btn_output_6:
                Intent fIntent = new Intent(this, PopupActivity.class);
                startActivity(fIntent);
                break;

            case R.id.btn_output_7:
                Intent gIntent = new Intent(this, PopupActivity.class);
                startActivity(gIntent);
                break;

            case R.id.btn_output_8:
                Intent hIntent = new Intent(this, PopupActivity.class);
                startActivity(hIntent);
                break;

            case R.id.btn_output_9:
                Intent iIntent = new Intent(this, PopupActivity.class);
                startActivity(iIntent);
                break;

            case R.id.btn_all_back:
                Intent jIntent = new Intent(this, CategoryListActivity.class);
                startActivity(jIntent);
                break;
        }
    }
}
