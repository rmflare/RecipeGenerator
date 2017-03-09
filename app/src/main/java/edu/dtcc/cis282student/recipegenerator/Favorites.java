package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Favorites extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        // Buttons
        Button btnFav1 = (Button) findViewById(R.id.btn_favorites_fav1);
        Button btnFav2 = (Button) findViewById(R.id.btn_favorites_fav2);
        Button btnFav3 = (Button) findViewById(R.id.btn_favorites_fav3);
        Button btnFav4 = (Button) findViewById(R.id.btn_favorites_fav4);
        Button btnFav5 = (Button) findViewById(R.id.btn_favorites_fav5);
        Button btnFav6 = (Button) findViewById(R.id.btn_favorites_fav6);
        Button btnFav7 = (Button) findViewById(R.id.btn_favorites_fav7);
        Button btnFav8 = (Button) findViewById(R.id.btn_favorites_fav8);
        Button btnFav9 = (Button) findViewById(R.id.btn_favorites_fav9);
        Button btnBack = (Button) findViewById(R.id.btn_all_back);
        Button btnRemove = (Button) findViewById(R.id.btn_favorites_remove);

        // Button listeners
        btnFav1.setOnClickListener(this);
        btnFav2.setOnClickListener(this);
        btnFav3.setOnClickListener(this);
        btnFav4.setOnClickListener(this);
        btnFav5.setOnClickListener(this);
        btnFav6.setOnClickListener(this);
        btnFav7.setOnClickListener(this);
        btnFav8.setOnClickListener(this);
        btnFav9.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnRemove.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_favorites_fav1:
                break;

            case R.id.btn_favorites_fav2:
                break;

            case R.id.btn_favorites_fav3:
                break;

            case R.id.btn_favorites_fav4:
                break;

            case R.id.btn_favorites_fav5:
                break;

            case R.id.btn_favorites_fav6:
                break;

            case R.id.btn_favorites_fav7:
                break;

            case R.id.btn_favorites_fav8:
                break;

            case R.id.btn_favorites_fav9:
                break;

            case R.id.btn_all_back:
                Intent bIntent = new Intent(getApplicationContext(), Menu.class);
                startActivity(bIntent);
                break;

            case R.id.btn_favorites_remove:
                break;

            default:
                break;
        }
    }
}
