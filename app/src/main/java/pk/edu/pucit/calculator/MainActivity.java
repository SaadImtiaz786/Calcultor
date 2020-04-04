package pk.edu.pucit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity<btn> extends AppCompatActivity {
TextView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMul,btnDiv,btnDel;
TextView btnEqual,btnDot,btn00,btnPer,tvEq,tvRes,btnEq;
boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.One);
        btn2 = findViewById(R.id.Two);
        btn3 = findViewById(R.id.Three);
        btn4 = findViewById(R.id.Four);
        btn5 = findViewById(R.id.Five);
        btn6 = findViewById(R.id.Six);
        btn7 = findViewById(R.id.Seven);
        btn8 = findViewById(R.id.Eight);
        btn9 = findViewById(R.id.Nine);
        btn0 = findViewById(R.id.Zero);
        btn00 = findViewById(R.id.DoubleZero);
        btnAdd = findViewById(R.id.Plus);
        btnSub = findViewById(R.id.Sub);
        btnMul = findViewById(R.id.Mul);
        btnDiv = findViewById(R.id.Div);
        btnDel = findViewById(R.id.Del);
        btnPer = findViewById(R.id.percentage);
        btnDot = findViewById(R.id.Dot);
        tvEq =   findViewById(R.id.tv_equation);
        tvRes =  findViewById(R.id.tv_result);
        btnEq =  findViewById(R.id.EqualTo);
        btn00.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvEq.setText(tvEq.getText() + "00");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "9");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "+");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "-");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "*");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "/");
            }
        });

        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + "%");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEq.setText(tvEq.getText() + ".");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Equation = tvEq.getText().toString();
                String remainingEq =  Equation.substring(0,Equation.length()-1);
                tvEq.setText(remainingEq);
            }
        });

    }

    public void btn_AC(View view) {
        tvEq.setText("");
        tvRes.setText("");
    }
}
