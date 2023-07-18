package com.example.currencyconverter;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {
    Button btnClc,btnCalulate;
    EditText editInput;
    RadioButton rdUSDtoBDT,rdBDTtoUSD,rdTNRtoUSD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btnCalulate=findViewById(R.id.btnCalculate);
        btnClc=findViewById(R.id.btnClc);
        editInput=findViewById(R.id.editInput);
        rdBDTtoUSD=findViewById(R.id.rdBDTtoUSD);
        rdUSDtoBDT=findViewById(R.id.rdUSDtoBDT);
        rdTNRtoUSD=findViewById(R.id.rdTNRtoUSD);

        btnCalulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double input=new Double(editInput.getText().toString());
                if(rdBDTtoUSD.isChecked()){
                    double result=currencyshifter.bdttoUSD(input);
                    editInput.setText(new Double(result).toString());
                }

                else if(rdUSDtoBDT.isChecked()){
                    double result=currencyshifter.usdtoBDT(input);
                    editInput.setText(new Double(result).toString());
                }
                else if(rdTNRtoUSD.isChecked()){
                    double result=currencyshifter.inrtousd(input);
                    editInput.setText(new Double(result).toString());
                }
            }
        });

    }

}







