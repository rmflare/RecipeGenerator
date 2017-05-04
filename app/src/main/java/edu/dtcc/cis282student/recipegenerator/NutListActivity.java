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

public class NutListActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sharedPref;
    private Button[] buttons;
    private static final int[] BUTTON_ID = {
            R.id.btn_nut_1, R.id.btn_nut_2, R.id.btn_nut_3,
            R.id.btn_nut_4, R.id.btn_nut_5, R.id.btn_nut_6,
            R.id.btn_nut_7, R.id.btn_nut_8, R.id.btn_nut_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut);

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
            case R.id.btn_nut_1:
                if (CategoryListActivity.ingredientsList[36] == null) {
                    CategoryListActivity.ingredientsList[36] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[36] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_nut_2:
                if (CategoryListActivity.ingredientsList[37] == null) {
                    CategoryListActivity.ingredientsList[37] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[37] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_nut_3:
                if (CategoryListActivity.ingredientsList[38] == null) {
                    CategoryListActivity.ingredientsList[38] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[38] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_nut_4:
                if (CategoryListActivity.ingredientsList[39] == null) {
                    CategoryListActivity.ingredientsList[39] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[39] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_nut_5:
                if (CategoryListActivity.ingredientsList[40] == null) {
                    CategoryListActivity.ingredientsList[40] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[40] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_nut_6:
                if (CategoryListActivity.ingredientsList[41] == null) {
                    CategoryListActivity.ingredientsList[41] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[41] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_nut_7:
                if (CategoryListActivity.ingredientsList[42] == null) {
                    CategoryListActivity.ingredientsList[42] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[42] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_nut_8:
                if (CategoryListActivity.ingredientsList[43] == null) {
                    CategoryListActivity.ingredientsList[43] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[43] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_nut_9:
                if (CategoryListActivity.ingredientsList[44] == null) {
                    CategoryListActivity.ingredientsList[44] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[44] = null;
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
        for (int i = 36; i < 45; i++){
            CategoryListActivity.ingredientsList[i] = null;
            buttons[i].setSelected(false);
        }
        editor.clear().commit();
        Toast.makeText(getApplicationContext(), "Nut ingredients deselected",
                Toast.LENGTH_SHORT).show();

        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }
}
