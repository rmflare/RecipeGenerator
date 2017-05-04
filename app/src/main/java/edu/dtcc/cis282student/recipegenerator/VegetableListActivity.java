package edu.dtcc.cis282student.recipegenerator;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Map;

public class VegetableListActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sharedPref;
    private Button[] buttons;
    private static final int[] BUTTON_ID = {
            R.id.btn_veg_1, R.id.btn_veg_2, R.id.btn_veg_3,
            R.id.btn_veg_4, R.id.btn_veg_5, R.id.btn_veg_6,
            R.id.btn_veg_7, R.id.btn_veg_8, R.id.btn_veg_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

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
            case R.id.btn_veg_1:
                if (CategoryListActivity.ingredientsList[9] == null) {
                    CategoryListActivity.ingredientsList[9] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[9] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_2:
                if (CategoryListActivity.ingredientsList[10] == null) {
                    CategoryListActivity.ingredientsList[10] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[10] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_3:
                if (CategoryListActivity.ingredientsList[11] == null) {
                    CategoryListActivity.ingredientsList[11] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[11] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_4:
                if (CategoryListActivity.ingredientsList[12] == null) {
                    CategoryListActivity.ingredientsList[12] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[12] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_5:
                if (CategoryListActivity.ingredientsList[13] == null) {
                    CategoryListActivity.ingredientsList[13] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[13] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_6:
                if (CategoryListActivity.ingredientsList[14] == null) {
                    CategoryListActivity.ingredientsList[14] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[14]=null;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_7:
                if (CategoryListActivity.ingredientsList[15] == null) {
                    CategoryListActivity.ingredientsList[15] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[15] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_8:
                if (CategoryListActivity.ingredientsList[16] == null) {
                    CategoryListActivity.ingredientsList[16] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[16] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_9:
                if (CategoryListActivity.ingredientsList[17] == null) {
                    CategoryListActivity.ingredientsList[17] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[17] = null;
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
        for (int i = 9; i < 18; i++){
            CategoryListActivity.ingredientsList[i] = null;
            buttons[i].setSelected(false);
        }
        editor.clear().commit();
        Toast.makeText(getApplicationContext(), "Vegetable ingredients deselected",
                Toast.LENGTH_SHORT).show();

        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }
}
