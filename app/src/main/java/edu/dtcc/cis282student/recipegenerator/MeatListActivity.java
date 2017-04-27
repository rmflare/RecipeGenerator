package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MeatListActivity extends AppCompatActivity implements View.OnClickListener {
    boolean[] bolArray = new boolean[9];
    private List<Button> buttons = new ArrayList<>(BUTTON_IDS.length);
    private static final int[] BUTTON_IDS = {
            R.id.btn_meat_1, R.id.btn_meat_2, R.id.btn_meat_3,
            R.id.btn_meat_4, R.id.btn_meat_5, R.id.btn_meat_6,
            R.id.btn_meat_7, R.id.btn_meat_8, R.id.btn_meat_9,
            R.id.btn_all_back, R.id.btn_all_clear
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);

        for(int id : BUTTON_IDS) {
            Button button = (Button)findViewById(id);
            button.setOnClickListener(this);
            buttons.add(button);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_meat_1:
                if (CategoryListActivity.ingredientsList[0] == null) {
                    CategoryListActivity.ingredientsList[0] = "chicken breast";
                    bolArray[0] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[0] = null;
                    bolArray[0] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_2:
                if (CategoryListActivity.ingredientsList[1] == null) {
                    CategoryListActivity.ingredientsList[1] = "ground beef";
                    bolArray[1] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[1] = null;
                    bolArray[1] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_3:
                if (CategoryListActivity.ingredientsList[2] == null) {
                    CategoryListActivity.ingredientsList[2] = "pork chop";
                    bolArray[2] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[2] = null;
                    bolArray[2] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_4:
                if (CategoryListActivity.ingredientsList[3] == null) {
                    CategoryListActivity.ingredientsList[3] = "lamb";
                    bolArray[3] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[3] = null;
                    bolArray[3] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_5:
                if (CategoryListActivity.ingredientsList[4] == null) {
                    CategoryListActivity.ingredientsList[4] = "turkey";
                    bolArray[4] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[4] = null;
                    bolArray[4] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_6:
                if (CategoryListActivity.ingredientsList[5] == null) {
                    CategoryListActivity.ingredientsList[5] = "beef steak";
                    bolArray[5] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[5] = null;
                    bolArray[5] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_7:
                if (CategoryListActivity.ingredientsList[6] == null) {
                    CategoryListActivity.ingredientsList[6] = "sausage";
                    bolArray[6] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[6] = null;
                    bolArray[6] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_8:
                if (CategoryListActivity.ingredientsList[7] == null) {
                    CategoryListActivity.ingredientsList[7] = "bacon";
                    bolArray[7] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[7] = null;
                    bolArray[7] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_meat_9:
                if (CategoryListActivity.ingredientsList[8] == null) {
                    CategoryListActivity.ingredientsList[8] = "veal";
                    bolArray[8] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[8] = null;
                    bolArray[8] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_all_back:
                Intent bIntent = new Intent(this, CategoryListActivity.class);
                startActivity(bIntent);
                break;

            case R.id.btn_all_clear:
                for (int i = 0; i < 9; i++){
                    CategoryListActivity.ingredientsList[i] = null;
                }
                for (int i = 0; i < bolArray.length; i++) {
                    bolArray[i] = false;
                }
                for (Button btn : buttons) {
                    btn.setSelected(false);
                }
                Toast.makeText(getApplicationContext(), "Meat ingredients deselected",
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
