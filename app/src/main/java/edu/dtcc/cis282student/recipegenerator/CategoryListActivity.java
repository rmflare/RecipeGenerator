package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class CategoryListActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        // Buttons
        Button btnMeat = (Button) findViewById(R.id.btn_categories_meat);
        Button btnVeg = (Button) findViewById(R.id.btn_categories_veg);
        Button btnFruit = (Button) findViewById(R.id.btn_categories_fruit);
        Button btnDairy = (Button) findViewById(R.id.btn_categories_dairy);
        Button btnNut = (Button) findViewById(R.id.btn_categories_nut);
        Button btnGrain = (Button) findViewById(R.id.btn_categories_grain);
        Button btnSea = (Button) findViewById(R.id.btn_categories_sea);
        Button btnSpice = (Button) findViewById(R.id.btn_categories_spice);
        Button btnOil = (Button) findViewById(R.id.btn_categories_oil);
        Button btnBack = (Button) findViewById(R.id.btn_all_back);
        Button btnFind = (Button) findViewById(R.id.btn_all_find);
        Button btnClear = (Button) findViewById(R.id.btn_all_clear);

        // Button listeners
        btnMeat.setOnClickListener(this);
        btnVeg.setOnClickListener(this);
        btnFruit.setOnClickListener(this);
        btnDairy.setOnClickListener(this);
        btnNut.setOnClickListener(this);
        btnGrain.setOnClickListener(this);
        btnSea.setOnClickListener(this);
        btnSpice.setOnClickListener(this);
        btnOil.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnFind.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_categories_meat:
                Intent meatIntent = new Intent(this, CategoryListActivity.class);
                meatIntent.putExtra("category","meat");
                startActivity(meatIntent);
                break;

            case R.id.btn_categories_veg:
                Intent vegIntent = new Intent(this, CategoryListActivity.class);
                vegIntent.putExtra("category","vegetable");
                startActivity(vegIntent);
                break;

            case R.id.btn_categories_fruit:
                Intent fruitIntent = new Intent(this, CategoryListActivity.class);
                fruitIntent.putExtra("category","fruit");
                startActivity(fruitIntent);
                break;

            case R.id.btn_categories_dairy:
                Intent dairyIntent = new Intent(this, CategoryListActivity.class);
                dairyIntent.putExtra("category","dairy");
                startActivity(dairyIntent);
                break;

            case R.id.btn_categories_nut:
                Intent nutIntent = new Intent(this, CategoryListActivity.class);
                nutIntent.putExtra("category","nut");
                startActivity(nutIntent);
                break;

            case R.id.btn_categories_grain:
                break;

            case R.id.btn_categories_sea:
                break;

            case R.id.btn_categories_spice:
                break;

            case R.id.btn_categories_oil:
                break;

            case R.id.btn_all_back:
                Intent bIntent = new Intent(this, MenuActivity.class);
                startActivity(bIntent);
                break;

            case R.id.btn_all_find:
                break;

            case R.id.btn_all_clear:
                break;

            default:
                break;
        }
    }
}
