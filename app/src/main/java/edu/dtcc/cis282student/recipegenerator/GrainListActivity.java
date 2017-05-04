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

public class GrainListActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sharedPref;
    private Button[] buttons;
    private static final int[] BUTTON_ID = {
            R.id.btn_grain_1, R.id.btn_grain_2, R.id.btn_grain_3,
            R.id.btn_grain_4, R.id.btn_grain_5, R.id.btn_grain_6,
            R.id.btn_grain_7, R.id.btn_grain_8, R.id.btn_grain_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grain);

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
            case R.id.btn_grain_1:
                if (CategoryListActivity.ingredientsList[45] == null) {
                    CategoryListActivity.ingredientsList[45] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[45] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_grain_2:
                if (CategoryListActivity.ingredientsList[46] == null) {
                    CategoryListActivity.ingredientsList[46] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[46] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_grain_3:
                if (CategoryListActivity.ingredientsList[47] == null) {
                    CategoryListActivity.ingredientsList[47] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[47] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_grain_4:
                if (CategoryListActivity.ingredientsList[48] == null) {
                    CategoryListActivity.ingredientsList[48] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[48] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_grain_5:
                if (CategoryListActivity.ingredientsList[49] == null) {
                    CategoryListActivity.ingredientsList[49] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[49] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_grain_6:
                if (CategoryListActivity.ingredientsList[50] == null) {
                    CategoryListActivity.ingredientsList[50] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[50] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_grain_7:
                if (CategoryListActivity.ingredientsList[51] == null) {
                    CategoryListActivity.ingredientsList[51] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[51] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_grain_8:
                if (CategoryListActivity.ingredientsList[52] == null) {
                    CategoryListActivity.ingredientsList[52] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[52] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_grain_9:
                if (CategoryListActivity.ingredientsList[53] == null) {
                    CategoryListActivity.ingredientsList[53] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[53] = null;
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
        for (int i = 45; i < 54; i++){
            CategoryListActivity.ingredientsList[i] = null;
            buttons[i].setSelected(false);
        }
        editor.clear().commit();
        Toast.makeText(getApplicationContext(), "Grain ingredients deselected",
                Toast.LENGTH_SHORT).show();

        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }
}
