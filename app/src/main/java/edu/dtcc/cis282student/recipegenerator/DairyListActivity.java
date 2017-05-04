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

public class DairyListActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sharedPref;
    private Button[] buttons;
    private static final int[] BUTTON_ID = {
            R.id.btn_dairy_1, R.id.btn_dairy_2, R.id.btn_dairy_3,
            R.id.btn_dairy_4, R.id.btn_dairy_5, R.id.btn_dairy_6,
            R.id.btn_dairy_7, R.id.btn_dairy_8, R.id.btn_dairy_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

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
            case R.id.btn_dairy_1:
                if (CategoryListActivity.ingredientsList[27] == null) {
                    CategoryListActivity.ingredientsList[27] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[27] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_2:
                if (CategoryListActivity.ingredientsList[28] == null) {
                    CategoryListActivity.ingredientsList[28] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[28] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_3:
                if (CategoryListActivity.ingredientsList[29] == null) {
                    CategoryListActivity.ingredientsList[29] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[29] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_4:
                if (CategoryListActivity.ingredientsList[30] == null) {
                    CategoryListActivity.ingredientsList[30] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[30] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_5:
                if (CategoryListActivity.ingredientsList[31] == null) {
                    CategoryListActivity.ingredientsList[31] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[31] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_6:
                if (CategoryListActivity.ingredientsList[32] == null) {
                    CategoryListActivity.ingredientsList[32] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[32] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_7:
                if (CategoryListActivity.ingredientsList[33] == null) {
                    CategoryListActivity.ingredientsList[33] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[33] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_8:
                if (CategoryListActivity.ingredientsList[34] == null) {
                    CategoryListActivity.ingredientsList[34] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[34] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_9:
                if (CategoryListActivity.ingredientsList[35] == null) {
                    CategoryListActivity.ingredientsList[35] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[35] = null;
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
        for (int i = 27; i < 36; i++){
            CategoryListActivity.ingredientsList[i] = null;
            buttons[i].setSelected(false);
        }
        editor.clear().commit();
        Toast.makeText(getApplicationContext(), "Dairy ingredients deselected",
                Toast.LENGTH_SHORT).show();

        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }
}
