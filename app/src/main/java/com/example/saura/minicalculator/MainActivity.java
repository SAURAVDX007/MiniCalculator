package com.example.saura.minicalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText input1;
    private EditText input2;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonMultiply;
    private Button buttonDivision;
    private Button buttonRemainder;
    private TextView result;
    private Button clrButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        input1 = (EditText) findViewById(R.id.editOperand1);
        input2 = (EditText) findViewById(R.id.editOperand2);
        result = (TextView) findViewById(R.id.result);
        clrButton = (Button) findViewById(R.id.btnClear);
        buttonAdd = (Button) findViewById(R.id.buttonPlus);
        buttonSub = (Button) findViewById(R.id.buttonMinus);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiplication);
        buttonRemainder = (Button) findViewById(R.id.buttonRemainder);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
                    Double op1 = Double.parseDouble(input1.getText().toString());
                    Double op2 = Double.parseDouble(input2.getText().toString());
                    Double answer = op1 + op2;
                    result.setText(Double.toString(answer));
                } else {
                    Toast.makeText(MainActivity.this, "Please input in either field", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
                    Double op1 = Double.parseDouble(input1.getText().toString());
                    Double op2 = Double.parseDouble(input2.getText().toString());
                    Double answer = op1 - op2;
                    result.setText(Double.toString(answer));
                } else {
                    Toast.makeText(MainActivity.this, "Please input in either field", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
                    Double op1 = Double.parseDouble(input1.getText().toString());
                    Double op2 = Double.parseDouble(input2.getText().toString());
//                    if (op2 != 0) {
                        Double answer = op1 / op2;
                        result.setText(Double.toString(answer));
//                    } else {
//                        Toast.makeText(MainActivity.this, "Can't divide with zero", Toast.LENGTH_SHORT).show();
//                    }
                } else {
                    Toast.makeText(MainActivity.this, "Please input in either field", Toast.LENGTH_SHORT).show();
                }
            }

        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
                    Double op1 = Double.parseDouble(input1.getText().toString());
                    Double op2 = Double.parseDouble(input2.getText().toString());
                    Double answer = op1 * op2;
                    result.setText(Double.toString(answer));
                } else {
                    Toast.makeText(MainActivity.this, "Please input in either field", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonRemainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
                    Double op1 = Double.parseDouble(input1.getText().toString());
                    Double op2 = Double.parseDouble(input2.getText().toString());
                    Double answer = op1 % op2;
                    result.setText(Double.toString(answer));
                } else {
                    Toast.makeText(MainActivity.this, "Please input in either field", Toast.LENGTH_SHORT).show();
                }
            }
        });
        clrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((input1.getText().length() == 0) && (input2.getText().length() == 0)) {
                    Toast.makeText(MainActivity.this, "Its already cleared", Toast.LENGTH_SHORT).show();
                }
                else {
                    input1.setText("");
                    input2.setText("");
                    result.setText("0.00");
                    input1.requestFocus();
                }

            }
        });

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
