package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

class Output extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        // Buttons
        Button btnRec1 = (Button) findViewById(R.id.btn_output_rec1);
        Button btnRec2 = (Button) findViewById(R.id.btn_output_rec2);
        Button btnRec3 = (Button) findViewById(R.id.btn_output_rec3);
        Button btnRec4 = (Button) findViewById(R.id.btn_output_rec4);
        Button btnRec5 = (Button) findViewById(R.id.btn_output_rec5);
        Button btnRec6 = (Button) findViewById(R.id.btn_output_rec6);
        Button btnRec7 = (Button) findViewById(R.id.btn_output_rec7);
        Button btnRec8 = (Button) findViewById(R.id.btn_output_rec8);
        Button btnRec9 = (Button) findViewById(R.id.btn_output_rec9);
        Button btnBack = (Button) findViewById(R.id.btn_all_back);
        Button btnSave = (Button) findViewById(R.id.btn_output_save);

        // Button listeners
        btnRec1.setOnClickListener(this);
        btnRec2.setOnClickListener(this);
        btnRec3.setOnClickListener(this);
        btnRec4.setOnClickListener(this);
        btnRec5.setOnClickListener(this);
        btnRec6.setOnClickListener(this);
        btnRec7.setOnClickListener(this);
        btnRec8.setOnClickListener(this);
        btnRec9.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_output_rec1:
                break;

            case R.id.btn_output_rec2:
                break;

            case R.id.btn_output_rec3:
                break;

            case R.id.btn_output_rec4:
                break;

            case R.id.btn_output_rec5:
                break;

            case R.id.btn_output_rec6:
                break;

            case R.id.btn_output_rec7:
                break;

            case R.id.btn_output_rec8:
                break;

            case R.id.btn_output_rec9:
                break;

            case R.id.btn_all_back:
                break;

            case R.id.btn_output_save:
                break;

            default:
                break;
        }
    }
}
