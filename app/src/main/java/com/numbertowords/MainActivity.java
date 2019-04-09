package com.numbertowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etnumber;
    private Button btnconvert;
    private TextView tvOutput;




    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnumber = findViewById(R.id.etnumber);
        btnconvert = findViewById(R.id.btnconvert);
        tvOutput = findViewById(R.id.tvOutput);

        btnconvert.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnconvert) {
            if (validation()) {
                String numberz =etnumber.getText().toString();
                final long number = Long.parseLong(numberz);
                String returnz = Converter.convert(number);
                tvOutput.setText(returnz);

            }
        }



    }

    public boolean validation(){
        boolean flag = true;
        if (TextUtils.isEmpty(etnumber.getText().toString())){
            etnumber.setError("Please enter Height");
            etnumber.requestFocus();
            flag = false;
        }

        return flag;
    }

}















