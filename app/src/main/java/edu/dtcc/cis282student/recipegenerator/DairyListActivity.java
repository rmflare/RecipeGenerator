package edu.dtcc.cis282student.recipegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DairyListActivity extends AppCompatActivity implements View.OnClickListener {
    boolean[] bolArray = new boolean[9];
    private List<Button> buttons = new ArrayList<>(BUTTON_IDS.length);
    private static final int[] BUTTON_IDS = {
            R.id.btn_dairy_1, R.id.btn_dairy_2, R.id.btn_dairy_3,
            R.id.btn_dairy_4, R.id.btn_dairy_5, R.id.btn_dairy_6,
            R.id.btn_dairy_7, R.id.btn_dairy_8, R.id.btn_dairy_9,
            R.id.btn_all_back, R.id.btn_all_clear
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        for(int id : BUTTON_IDS) {
            Button button = (Button) findViewById(id);
            button.setOnClickListener(this);
            buttons.add(button);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_dairy_1:
                if (CategoryListActivity.ingredientsList[27] == null) {
                    CategoryListActivity.ingredientsList[27] = "egg";
                    bolArray[0] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[27] = null;
                    bolArray[0] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_2:
                if (CategoryListActivity.ingredientsList[28] == null) {
                    CategoryListActivity.ingredientsList[28] = "milk";
                    bolArray[1] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[28] = null;
                    bolArray[1] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_3:
                if (CategoryListActivity.ingredientsList[29] == null) {
                    CategoryListActivity.ingredientsList[29] = "heavy cream";
                    bolArray[2] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[29] = null;
                    bolArray[2] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_4:
                if (CategoryListActivity.ingredientsList[30] == null) {
                    CategoryListActivity.ingredientsList[30] = "butter";
                    bolArray[3] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[30] = null;
                    bolArray[3] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_5:
                if (CategoryListActivity.ingredientsList[31] == null) {
                    CategoryListActivity.ingredientsList[31] = "sour cream";
                    bolArray[4] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[31] = null;
                    bolArray[4] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_6:
                if (CategoryListActivity.ingredientsList[32] == null) {
                    CategoryListActivity.ingredientsList[32] = "cheddar";
                    bolArray[5] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[32] = null;
                    bolArray[5] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_7:
                if (CategoryListActivity.ingredientsList[33] == null) {
                    CategoryListActivity.ingredientsList[33] = "cream cheese";
                    bolArray[6] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[33] = null;
                    bolArray[6] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_8:
                if (CategoryListActivity.ingredientsList[34] == null) {
                    CategoryListActivity.ingredientsList[34] = "yogurt";
                    bolArray[7] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[34] = null;
                    bolArray[7] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_dairy_9:
                if (CategoryListActivity.ingredientsList[35] == null) {
                    CategoryListActivity.ingredientsList[35] = "cream";
                    bolArray[8] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[35] = null;
                    bolArray[8] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_all_back:
                Intent bIntent = new Intent(this, CategoryListActivity.class);
                startActivity(bIntent);
                break;

            case R.id.btn_all_clear:
                for (int i = 27; i < 36; i++){
                    CategoryListActivity.ingredientsList[i] = null;
                }
                for (int i = 0; i < bolArray.length; i++) {
                    bolArray[i] = false;
                }
                for (Button btn : buttons) {
                    btn.setSelected(false);
                }
                Toast.makeText(getApplicationContext(), "Dairy ingredients deselected",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putBooleanArray("counter_key", bolArray);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        bolArray = savedInstanceState.getBooleanArray("counter_key");
    }
}
