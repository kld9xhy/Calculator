package com.cornk.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnMul,btnDiv,btnBS,btnDot,btnResult,btnCE,btnC,btnDoidau;
    TextView tvResult,tvMath;
    Float temp;
    private final char cong = '+';
    private final char tru = '-';
    private final char nhan = '*';
    private final char chia = '/';
    private final char bang = '0';
    private double gtri1 = Double.NaN;
    private double gtri2 = Double.NaN;
    private char lenh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calculator);
        AllBtn();
        BtnPress();
    }

    public void AllBtn()
    {
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnBS = (Button) findViewById(R.id.btnBS);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnResult = (Button) findViewById(R.id.btnResult);
        btnCE = (Button) findViewById(R.id.btnCE);
        btnC = (Button) findViewById(R.id.btnC);
        btnDoidau = (Button) findViewById(R.id.btnDoidau);
        tvMath = (TextView) findViewById(R.id.tvMath);
        tvResult= (TextView) findViewById(R.id.tvResult);
    }

    public void BtnPress()
    {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText(tvMath.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText(tvMath.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText(tvMath.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText(tvMath.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText(tvMath.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText(tvMath.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText(tvMath.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText(tvMath.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText(tvMath.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText(tvMath.getText().toString() + "9");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhtoan();
                lenh = cong;
                tvResult.setText(String.valueOf(gtri1) + "+");
                tvMath.setText(null);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhtoan();
                lenh = chia;
                tvResult.setText(String.valueOf(gtri1) + "/");
                tvMath.setText(null);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhtoan();
                lenh = tru;
                tvResult.setText(String.valueOf(gtri1) + "-");
                tvMath.setText(null);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhtoan();
                lenh = nhan;
                tvResult.setText(String.valueOf(gtri1) + "*");
                tvMath.setText(null);
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhtoan();
                lenh = bang;
                tvMath.setText(tvMath.getText().toString() + String.valueOf(gtri2) + "=" + String.valueOf(gtri1));
                tvResult.setText(null);
            }
        });
        btnBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvMath.getText().length()>0){
                    CharSequence name = tvMath.getText().toString();
                    tvMath.setText(name.subSequence(0,name.length()-1));

                }else{
                    gtri1 = Double.NaN;
                    gtri2 = Double.NaN;
                    tvMath.setText(null);
                    tvResult.setText(null);
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText("");
                tvResult.setText("");
            }
        });
        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMath.setText("");
            }
        });
    }

    public void tinhtoan()
    {
        if(!Double.isNaN(gtri1)){
            gtri2 =  Double.parseDouble(tvMath.getText().toString());
            switch (lenh){
                case cong:
                    gtri1 = gtri1 + gtri2;
                    break;
                case tru:
                    gtri1 = gtri1 - gtri2;
                    break;
                case nhan:
                    gtri1 = gtri1 * gtri2;
                    break;
                case chia:
                    gtri1 = gtri1 / gtri2;
                    break;
                case bang:
                    break;

            }

        }else{
            gtri1 = Double.parseDouble(tvMath.getText().toString());
        }
    }
}