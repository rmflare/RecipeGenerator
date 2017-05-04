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

public class FruitListActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sharedPref;
    private static final String TAG = "FruitListActivity";
    private Button[] buttons;
    private static final int[] BUTTON_ID = {
            R.id.btn_fruit_1, R.id.btn_fruit_2, R.id.btn_fruit_3,
            R.id.btn_fruit_4, R.id.btn_fruit_5, R.id.btn_fruit_6,
            R.id.btn_fruit_7, R.id.btn_fruit_8, R.id.btn_fruit_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

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

        switch (view.getId()) {
            case R.id.btn_fruit_1:
                if (CategoryListActivity.ingredientsList[18] == null) {
                    CategoryListActivity.ingredientsList[18] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[18] = null;
                    view.setSelected(false);
                }
                break;

            case R.id.btn_fruit_2:
                if (CategoryListActivity.ingredientsList[19] == null) {
                    CategoryListActivity.ingredientsList[19] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[19] = null;
                    view.setSelected(false);
                }
                break;
            case R.id.btn_fruit_3:
                if (CategoryListActivity.ingredientsList[20] == null) {
                    CategoryListActivity.ingredientsList[20] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[20] = null;
                    view.setSelected(false);
                }
                break;

            case R.id.btn_fruit_4:
                if (CategoryListActivity.ingredientsList[21] == null) {
                    CategoryListActivity.ingredientsList[21] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[21] = null;
                    view.setSelected(false);
                }
                break;

            case R.id.btn_fruit_5:
                if (CategoryListActivity.ingredientsList[22] == null) {
                    CategoryListActivity.ingredientsList[22] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[22] = null;
                    view.setSelected(false);
                }
                break;

            case R.id.btn_fruit_6:
                if (CategoryListActivity.ingredientsList[23] == null) {
                    CategoryListActivity.ingredientsList[23] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[23] = null;
                    view.setSelected(false);
                }
                break;

            case R.id.btn_fruit_7:
                if (CategoryListActivity.ingredientsList[24] == null) {
                    CategoryListActivity.ingredientsList[24] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[24] = null;
                    view.setSelected(false);
                }
                break;

            case R.id.btn_fruit_8:
                if (CategoryListActivity.ingredientsList[25] == null) {
                    CategoryListActivity.ingredientsList[25] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[25] = null;
                    view.setSelected(false);
                }
                break;

            case R.id.btn_fruit_9:
                if (CategoryListActivity.ingredientsList[26] == null) {
                    CategoryListActivity.ingredientsList[26] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[26] = null;
                    view.setSelected(false);
                }
                break;

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
            Log.d(TAG, tagString);
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
        for (int i = 18; i < 27; i++){
            CategoryListActivity.ingredientsList[i] = null;
            buttons[i].setSelected(false);
        }
        editor.clear().commit();
        Toast.makeText(getApplicationContext(), "Fruit ingredients deselected",
                Toast.LENGTH_SHORT).show();

        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }
}
