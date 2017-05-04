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

public class SeafoodListActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sharedPref;
    private Button[] buttons;
    private static final int[] BUTTON_ID = {
            R.id.btn_seafood_1, R.id.btn_seafood_2, R.id.btn_seafood_3,
            R.id.btn_seafood_4, R.id.btn_seafood_5, R.id.btn_seafood_6,
            R.id.btn_seafood_7, R.id.btn_seafood_8, R.id.btn_seafood_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seafood);

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
            case R.id.btn_seafood_1:
                if (CategoryListActivity.ingredientsList[54] == null) {
                    CategoryListActivity.ingredientsList[54] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[54] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seafood_2:
                if (CategoryListActivity.ingredientsList[55] == null) {
                    CategoryListActivity.ingredientsList[55] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[55] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seafood_3:
                if (CategoryListActivity.ingredientsList[56] == null) {
                    CategoryListActivity.ingredientsList[56] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[56] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seafood_4:
                if (CategoryListActivity.ingredientsList[57] == null) {
                    CategoryListActivity.ingredientsList[57] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[57] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seafood_5:
                if (CategoryListActivity.ingredientsList[58] == null) {
                    CategoryListActivity.ingredientsList[58] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[58] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seafood_6:
                if (CategoryListActivity.ingredientsList[59] == null) {
                    CategoryListActivity.ingredientsList[59] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[59] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seafood_7:
                if (CategoryListActivity.ingredientsList[60] == null) {
                    CategoryListActivity.ingredientsList[60] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[60] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seafood_8:
                if (CategoryListActivity.ingredientsList[61] == null) {
                    CategoryListActivity.ingredientsList[61] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[61] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seafood_9:
                if (CategoryListActivity.ingredientsList[62] == null) {
                    CategoryListActivity.ingredientsList[62] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[62] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_all_back:
                Intent bIntent = new Intent(this, CategoryListActivity.class);
                startActivity(bIntent);
                break;

            case R.id.btn_all_clear:
                clearButtonState(editor);
                break;
        }
    }

    void saveButtonState(View view, SharedPreferences.Editor editor){
        String tagString = (String) view.getTag();
        view.setSelected(!view.isSelected());
        if (view.isSelected()) {
            editor.putBoolean(tagString, true);
            editor.apply();
        } else {
            view.setSelected(false);
            editor.putBoolean(tagString, false);
            editor.apply();
        }
    }

    void getButtonState() {
        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }

    void clearButtonState(SharedPreferences.Editor editor) {
        for (int i = 54; i < 63; i++){
            CategoryListActivity.ingredientsList[i] = null;
            buttons[i].setSelected(false);
        }
        editor.clear().commit();
        Toast.makeText(getApplicationContext(), "Seafood ingredients deselected",
                Toast.LENGTH_SHORT).show();

        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }
}
