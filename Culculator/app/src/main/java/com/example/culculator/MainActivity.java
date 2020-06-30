package com.example.culculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button eql;
    private Button clear;
    private TextView operation;
    private TextView results;
    private final char ADDITION ='+';
    private final char SUBSTRACTION ='-';
    private final char MULTIPLICATION ='*';
    private final char DIVISION ='/';
    private final char EQUL ='O';
    private double val1 =Double.NaN;
    private double val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_main);
        setupUlViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() +"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            operation.setText(operation.getText().toString() +"1");
        }
    });

       two.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            operation.setText(operation.getText().toString() +"2");
        }
    });

      three.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            operation.setText(operation.getText().toString() +"3");
        }
    });

       four.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            operation.setText(operation.getText().toString() +"4");
        }
    });

        five.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            operation.setText(operation.getText().toString() +"5");
        }
    });

         six.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            operation.setText(operation.getText().toString() +"6");
        }
    });

          seven.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            operation.setText(operation.getText().toString() +"7");
        }
    });

           eight.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            operation.setText(operation.getText().toString() +"8");
        }
    });

           nine.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            operation.setText(operation.getText().toString() +"9");
        }
    });
           add.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   compute();
                   ACTION=ADDITION;
                   results.setText(String.valueOf(val1)+"+");
                   operation.setText(null);
               }
           });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=ADDITION;
                results.setText(String.valueOf(val1)+"+");
                operation.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=SUBSTRACTION;
                results.setText(String.valueOf(val1)+"-");
                operation.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=MULTIPLICATION;
                results.setText(String.valueOf(val1)+"*");
                operation.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=DIVISION;
                results.setText(String.valueOf(val1)+"/");
                operation.setText(null);
            }
        });


        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=EQUL;
                results.setText(results.getText().toString()+String.valueOf(val2)+'='+String.valueOf(val1));
                operation.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.getText().length()>0){
                    CharSequence name=operation.getText().toString();
                    operation.setText(name.subSequence(0,name.length()-1));
                }else{
                    val1=Double.NaN;
                    val2=Double.NaN;
                    operation.setText(null);
                    results.setText(null);
                }
            }
        });
    }
    public void setupUlViews(){
        zero=(Button)findViewById(R.id.btn0);
        one=(Button)findViewById(R.id.btn1);
        two=(Button)findViewById(R.id.btn2);
        three=(Button)findViewById(R.id.btn3);
        four=(Button)findViewById(R.id.btn4);
        five=(Button)findViewById(R.id.btn5);
        six=(Button)findViewById(R.id.btn6);
        seven=(Button)findViewById(R.id.btn7);
        eight=(Button)findViewById(R.id.btn8);
        nine=(Button)findViewById(R.id.btn9);
        add=(Button)findViewById(R.id.btnadd);
        sub=(Button)findViewById(R.id.btnsub);
        mul=(Button)findViewById(R.id.btnmul);
        div=(Button)findViewById(R.id.btndiv);
        eql=(Button)findViewById(R.id.btneq);
        clear=(Button)findViewById(R.id.btnc1);
        operation=(TextView) findViewById(R.id.operation);
        results=(TextView) findViewById(R.id.results);
    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(operation.getText().toString());
            switch (ACTION){
                case ADDITION:
                    val1=val1+val2;
                    break;
                case SUBSTRACTION:
                    val1=val1-val2;
                    break;
                case MULTIPLICATION:
                    val1=val1*val2;
                    break;
                case DIVISION:
                    val1=val1/val2;
                    break;
                case EQUL:
                    break;
            }
        } else {
            val1=Double.parseDouble(operation.getText().toString());
        }
    }
}