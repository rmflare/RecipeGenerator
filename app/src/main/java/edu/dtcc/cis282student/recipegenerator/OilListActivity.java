package edu.dtcc.cis282student.recipegenerator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Map;

public class OilListActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sharedPref;
    private Button[] buttons;
    private static final int[] BUTTON_ID = {
            R.id.btn_oil_1, R.id.btn_oil_2, R.id.btn_oil_3,
            R.id.btn_oil_4, R.id.btn_oil_5, R.id.btn_oil_6,
            R.id.btn_oil_7, R.id.btn_oil_8, R.id.btn_oil_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil);

        buttons = new Button[BUTTON_ID.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = (Button) findViewById(BUTTON_ID[i]);
            buttons[i].setOnClickListener(this);
        }

        ImageButton btnBack = (ImageButton) findViewById(R.id.btn_all_back);
        ImageButton btnClear = (ImageButton) findViewById(R.id.btn_all_clear);

        btnBack.setOnClickListener(this);
        btnClear.setOnClickListener(this);

        getButtonState();
    }

    @Override
    public void onClick(View view) {
        SharedPreferences.Editor editor = sharedPref.edit();
        String tagString = (String) view.getTag();

        switch (view.getId()){
            case R.id.btn_oil_1:
                if (CategoryListActivity.ingredientsList[72] == null) {
                    CategoryListActivity.ingredientsList[72] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[72] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_oil_2:
                if (CategoryListActivity.ingredientsList[73] == null) {
                    CategoryListActivity.ingredientsList[73] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[73] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_oil_3:
                if (CategoryListActivity.ingredientsList[74] == null) {
                    CategoryListActivity.ingredientsList[74] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[74] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_oil_4:
                if (CategoryListActivity.ingredientsList[75] == null) {
                    CategoryListActivity.ingredientsList[75] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[75] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_oil_5:
                if (CategoryListActivity.ingredientsList[76] == null) {
                    CategoryListActivity.ingredientsList[76] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[76] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_oil_6:
                if (CategoryListActivity.ingredientsList[77] == null) {
                    CategoryListActivity.ingredientsList[77] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[77] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_oil_7:
                if (CategoryListActivity.ingredientsList[78] == null) {
                    CategoryListActivity.ingredientsList[78] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[78] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_oil_8:
                if (CategoryListActivity.ingredientsList[79] == null) {
                    CategoryListActivity.ingredientsList[79] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[79] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_oil_9:
                if (CategoryListActivity.ingredientsList[80] == null) {
                    CategoryListActivity.ingredientsList[80] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[80] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_all_back:
                Intent bIntent = new Intent(this, CategoryListActivity.class);
                startActivity(bIntent);
                break;

            case R.id.btn_all_clear:
                for (int i = 72; i < 81; i++){
                    CategoryListActivity.ingredientsList[i] = null;
                }
                for (Button btn : buttons) {
                    btn.setSelected(false);
                }
                Toast.makeText(getApplicationContext(), "Oil ingredients deselected",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }

    void getButtonState() {
        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }

    void clearButtonState(SharedPreferences.Editor editor) {
        for (int i = 72; i < 81; i++){
            CategoryListActivity.ingredientsList[i] = null;
            buttons[i].setSelected(false);
        }
        editor.clear().commit();
        Toast.makeText(getApplicationContext(), "Oil ingredients deselected",
                Toast.LENGTH_SHORT).show();

        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }
}
