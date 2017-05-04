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

public class MeatListActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sharedPref;
    private static final String TAG = "MeatListActivity";
    private Button[] buttons;
    //String[] meatList = getResources().getStringArray(R.array.meat_list);
    private static final int[] BUTTON_ID = {
            R.id.btn_meat_1, R.id.btn_meat_2, R.id.btn_meat_3,
            R.id.btn_meat_4, R.id.btn_meat_5, R.id.btn_meat_6,
            R.id.btn_meat_7, R.id.btn_meat_8, R.id.btn_meat_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);

        sharedPref = this.getPreferences(0);

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
            case R.id.btn_meat_1:
                if (CategoryListActivity.ingredientsList[0] == null) {
                    CategoryListActivity.ingredientsList[0] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[0] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_2:
                if (CategoryListActivity.ingredientsList[1] == null) {
                    CategoryListActivity.ingredientsList[1] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[1] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_3:
                if (CategoryListActivity.ingredientsList[2] == null) {
                    CategoryListActivity.ingredientsList[2] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[2] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_4:
                if (CategoryListActivity.ingredientsList[3] == null) {
                    CategoryListActivity.ingredientsList[3] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[3] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_5:
                if (CategoryListActivity.ingredientsList[4] == null) {
                    CategoryListActivity.ingredientsList[4] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[4] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_6:
                if (CategoryListActivity.ingredientsList[5] == null) {
                    CategoryListActivity.ingredientsList[5] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[5] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_7:
                if (CategoryListActivity.ingredientsList[6] == null) {
                    CategoryListActivity.ingredientsList[6] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[6] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_8:
                if (CategoryListActivity.ingredientsList[7] == null) {
                    CategoryListActivity.ingredientsList[7] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[7] = null;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_9:
                if (CategoryListActivity.ingredientsList[8] == null) {
                    CategoryListActivity.ingredientsList[8] = tagString;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[8] = null;
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
        for (int i = 0; i < 9; i++){
            CategoryListActivity.ingredientsList[i] = null;
            buttons[i].setSelected(false);
        }
        editor.clear().commit();
        Toast.makeText(getApplicationContext(), "Meat ingredients deselected",
                Toast.LENGTH_SHORT).show();

        Map<String,?> keys = sharedPref.getAll();

        for (Map.Entry<String,?> entry : keys.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue());
        }
    }
}
