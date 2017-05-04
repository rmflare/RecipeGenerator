package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.Toast;

public class CategoryListActivity extends AppCompatActivity implements View.OnClickListener {
    static String[] ingredientsList = new String[81];
    /*private String[] meatList = {"chicken breast", "ground beef", "pork chop", "lamb",
            "turkey", "beef steak", "sausage", "bacon", "veal"};
    private String[] vegetableList = {"garlic", "lettuce", "carrot", "tomato", "bell pepper",
            "corn", "potato", "onion", "kidney beans"};
    private String[] fruitList = {"cherry", "watermelon", "cantaloupe", "grape", "orange",
            "lemon", "strawberry", "banana", "apple"};
    private String[] dairyList = {"egg", "milk", "heavy cream", "butter", "sour cream",
            "cheddar", "cream cheese", "yogurt", "cream"};
    private String[] nutList = {"peanut", "cashew", "walnut", "pistachio", "almond",
            "peanut butter", "hazelnut", "macadamia", "pecan"};
    private String[] grainList = {"flour", "rice", "corn tortilla", "bread", "pasta",
            "semolina", "cereal", "bagel", "pita"};
    private String[] seafoodList = {"salmon", "trout", "sea bass", "shrimp", "tuna",
            "tilapia", "halibut", "mackerel", "anchovy"};
    private String[] spiceList = {"salt", "black pepper", "basil", "parsley", "oregano",
            "ground cumin", "chili powder", "garlic powder", "onion powder"};
    private String[] oilList = {"olive oil", "canola oil", "vegetable oil", "peanut oil",
            "cooking spray", "shortening", "red pepper sauce", "tomato paste", "tomato sauce"};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        ImageButton btnMeat = (ImageButton) findViewById(R.id.btn_categories_meat);
        ImageButton btnVeg = (ImageButton) findViewById(R.id.btn_categories_veg);
        ImageButton btnFruit = (ImageButton) findViewById(R.id.btn_categories_fruit);
        ImageButton btnDairy = (ImageButton) findViewById(R.id.btn_categories_dairy);
        ImageButton btnNut = (ImageButton) findViewById(R.id.btn_categories_nut);
        ImageButton btnGrain = (ImageButton) findViewById(R.id.btn_categories_grain);
        ImageButton btnSea = (ImageButton) findViewById(R.id.btn_categories_sea);
        ImageButton btnSeasoning = (ImageButton) findViewById(R.id.btn_categories_seasoning);
        ImageButton btnOil = (ImageButton) findViewById(R.id.btn_categories_oil);
        ImageButton btnBack = (ImageButton) findViewById(R.id.btn_all_back);
        ImageButton btnClear = (ImageButton) findViewById(R.id.btn_all_clear);
        ImageButton btnFind = (ImageButton) findViewById(R.id.btn_categories_find);

        btnMeat.setOnClickListener(this);
        btnVeg.setOnClickListener(this);
        btnFruit.setOnClickListener(this);
        btnDairy.setOnClickListener(this);
        btnNut.setOnClickListener(this);
        btnGrain.setOnClickListener(this);
        btnSea.setOnClickListener(this);
        btnSeasoning.setOnClickListener(this);
        btnOil.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnFind.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_categories_meat:
                Intent meatIntent = new Intent(this, MeatListActivity.class);
                startActivity(meatIntent);
                break;

            case R.id.btn_categories_veg:
                Intent vegIntent = new Intent(this, VegetableListActivity.class);
                startActivity(vegIntent);
                break;

            case R.id.btn_categories_fruit:
                Intent fruitIntent = new Intent(this, FruitListActivity.class);
                startActivity(fruitIntent);
                break;

            case R.id.btn_categories_dairy:
                Intent dairyIntent = new Intent(this, DairyListActivity.class);
                startActivity(dairyIntent);
                break;

            case R.id.btn_categories_nut:
                Intent nutIntent = new Intent(this, NutListActivity.class);
                startActivity(nutIntent);
                break;

            case R.id.btn_categories_grain:
                Intent grainIntent = new Intent(this, GrainListActivity.class);
                startActivity(grainIntent);
                break;

            case R.id.btn_categories_sea:
                Intent seafoodIntent = new Intent(this, SeafoodListActivity.class);
                startActivity(seafoodIntent);
                break;

            case R.id.btn_categories_seasoning:
                Intent seasoningIntent = new Intent(this, SeasoningListActivity.class);
                startActivity(seasoningIntent);
                break;

            case R.id.btn_categories_oil:
                Intent oilIntent = new Intent(this, OilListActivity.class);
                startActivity(oilIntent);
                break;

            case R.id.btn_all_back:
                Intent menuIntent = new Intent(this, MenuActivity.class);
                startActivity(menuIntent);
                break;

            case R.id.btn_all_clear:
                for (int i = 0; i < ingredientsList.length; i++){
                    ingredientsList[i] = null;
                }
                Toast.makeText(this, "All ingredients deselected",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_categories_find:
                Intent findIntent = new Intent(this, MenuActivity.class);
                startActivity(findIntent);
                break;
        }
    }
}
