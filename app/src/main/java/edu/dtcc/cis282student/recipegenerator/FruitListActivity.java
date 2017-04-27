package edu.dtcc.cis282student.recipegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FruitListActivity extends AppCompatActivity implements View.OnClickListener {
    boolean[] bolArray = new boolean[9];
    private List<Button> buttons = new ArrayList<>(BUTTON_IDS.length);
    private static final int[] BUTTON_IDS = {
            R.id.btn_fruit_1, R.id.btn_fruit_2, R.id.btn_fruit_3,
            R.id.btn_fruit_4, R.id.btn_fruit_5, R.id.btn_fruit_6,
            R.id.btn_fruit_7, R.id.btn_fruit_8, R.id.btn_fruit_9,
            R.id.btn_all_back, R.id.btn_all_clear
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        for(int id : BUTTON_IDS) {
            Button button = (Button) findViewById(id);
            button.setOnClickListener(this);
            buttons.add(button);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_fruit_1:
                if (CategoryListActivity.ingredientsList[18] == null) {
                    CategoryListActivity.ingredientsList[18] = "cherry";
                    bolArray[0] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[18] = null;
                    bolArray[0] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_fruit_2:
                if (CategoryListActivity.ingredientsList[19] == null) {
                    CategoryListActivity.ingredientsList[19] = "watermelon";
                    bolArray[1] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[19] = null;
                    bolArray[1] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_fruit_3:
                if (CategoryListActivity.ingredientsList[20] == null) {
                    CategoryListActivity.ingredientsList[20] = "cantaloupe";
                    bolArray[2] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[20] = null;
                    bolArray[2] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_fruit_4:
                if (CategoryListActivity.ingredientsList[21] == null) {
                    CategoryListActivity.ingredientsList[21] = "grape";
                    bolArray[3] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[21] = null;
                    bolArray[3] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_fruit_5:
                if (CategoryListActivity.ingredientsList[22] == null) {
                    CategoryListActivity.ingredientsList[22] = "orange";
                    bolArray[4] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[22] = null;
                    bolArray[4] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_fruit_6:
                if (CategoryListActivity.ingredientsList[23] == null) {
                    CategoryListActivity.ingredientsList[23] = "lemon";
                    bolArray[5] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[23] = null;
                    bolArray[5] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_fruit_7:
                if (CategoryListActivity.ingredientsList[24] == null) {
                    CategoryListActivity.ingredientsList[24] = "strawberry";
                    bolArray[6] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[24] = null;
                    bolArray[6] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_fruit_8:
                if (CategoryListActivity.ingredientsList[25] == null) {
                    CategoryListActivity.ingredientsList[25] = "banana";
                    bolArray[7] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[25] = null;
                    bolArray[7] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_fruit_9:
                if (CategoryListActivity.ingredientsList[26] == null) {
                    CategoryListActivity.ingredientsList[26] = "apple";
                    bolArray[8] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[26] = null;
                    bolArray[8] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_all_back:
                Intent bIntent = new Intent(this, CategoryListActivity.class);
                startActivity(bIntent);
                break;

            case R.id.btn_all_clear:
                for (int i = 18; i < 27; i++){
                    CategoryListActivity.ingredientsList[i] = null;
                }
                for (int i = 0; i < bolArray.length; i++) {
                    bolArray[i] = false;
                }
                for (Button btn : buttons) {
                    btn.setSelected(false);
                }
                Toast.makeText(getApplicationContext(), "Fruit ingredients deselected",
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
