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

public class SeasoningListActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sharedPref;
    private Button[] buttons;
    private static final int[] BUTTON_ID = {
            R.id.btn_seasoning_1, R.id.btn_seasoning_2, R.id.btn_seasoning_3,
            R.id.btn_seasoning_4, R.id.btn_seasoning_5, R.id.btn_seasoning_6,
            R.id.btn_seasoning_7, R.id.btn_seasoning_8, R.id.btn_seasoning_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasoning);

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
            case R.id.btn_seasoning_1:
                if (CategoryListActivity.ingredientsList[63] == null) {
                    CategoryListActivity.ingredientsList[63] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[63] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seasoning_2:
                if (CategoryListActivity.ingredientsList[64] == null) {
                    CategoryListActivity.ingredientsList[64]  = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[64] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seasoning_3:
                if (CategoryListActivity.ingredientsList[65] == null) {
                    CategoryListActivity.ingredientsList[65] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[65] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seasoning_4:
                if (CategoryListActivity.ingredientsList[66] == null) {
                    CategoryListActivity.ingredientsList[66] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[66] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seasoning_5:
                if (CategoryListActivity.ingredientsList[67] == null) {
                    CategoryListActivity.ingredientsList[67] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[67] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seasoning_6:
                if (CategoryListActivity.ingredientsList[68] == null) {
                    CategoryListActivity.ingredientsList[68] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[68] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seasoning_7:
                if (CategoryListActivity.ingredientsList[69] == null) {
                    CategoryListActivity.ingredientsList[69] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[69] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seasoning_8:
                if (CategoryListActivity.ingredientsList[70] == null) {
                    CategoryListActivity.ingredientsList[70] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[70] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_seasoning_9:
                if (CategoryListActivity.ingredientsList[71] == null) {
                    CategoryListActivity.ingredientsList[71] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[71] = null;
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
        for (int i = 63; i < 72; i++){
            CategoryListActivity.ingredientsList[i] = null;
            buttons[i].setSelected(false);
        }
        editor.clear().commit();
        Toast.makeText(getApplicationContext(), "Seasoning ingredients deselected",
                Toast.LENGTH_SHORT).show();

        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }
}
