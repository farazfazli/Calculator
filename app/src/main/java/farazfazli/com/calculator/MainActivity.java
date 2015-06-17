package farazfazli.com.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;


public class MainActivity extends ActionBarActivity {
    EditText num1;
    EditText num2;
    Button Add;
    Button Subtract;
    Button Multiply;
    Button Divide;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if ((EditText) findViewById(R.id.num1) != null) {
            num1 = (EditText) findViewById(R.id.num1);
            num2 = (EditText) findViewById(R.id.num2);
        }
        Add = (Button) findViewById(R.id.Add);
        Subtract = (Button) findViewById(R.id.Subtract);
        Multiply = (Button) findViewById(R.id.Multiply);
        Divide = (Button) findViewById(R.id.Divide);
        result = (TextView) findViewById(R.id.result);
            Add.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty()) {
                        float oper1 = Float.parseFloat(num1.getText().toString());
                        float oper2 = Float.parseFloat(num2.getText().toString());
                        float theResult = oper1 + oper2;
                        result.setText(Float.toString(theResult));
                    } else {
                        result.setText("Please enter two valid numbers!");
                    }
                }
            });
            Subtract.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty()) {
                    if (num1 != null && num2 != null) {
                        float oper1 = Float.parseFloat(num1.getText().toString());
                        float oper2 = Float.parseFloat(num2.getText().toString());
                        float theResult = oper1 - oper2;
                        result.setText(Float.toString(theResult));
                    } else {
                        result.setText("Please enter two valid numbers!");
                    }
                }
                }
            });
            Multiply.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty()) {
                        if (num1 != null && num2 != null) {
                            float oper1 = Float.parseFloat(num1.getText().toString());
                            float oper2 = Float.parseFloat(num2.getText().toString());
                            float theResult = oper1 * oper2;
                            result.setText(Float.toString(theResult));
                        } else {
                            result.setText("Please enter two valid numbers!");
                        }
                    }
                }
            });
            Divide.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (num1 != null && num2 != null) {
                        if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty()) {
                            float oper1 = Float.parseFloat(num1.getText().toString());
                            float oper2 = Float.parseFloat(num2.getText().toString());
                            float theResult = oper1 / oper2;
                            result.setText(Float.toString(theResult));
                        } else {
                            result.setText("Please enter two valid numbers!");
                        }
                    }
                }
            });
        }
    }