
package com.example.calcproject;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText text1;
    private EditText text2;
    private TextView text;
    private int num1;
    private int num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*public void clearFirst(View view){
        text1.getText().clear();
    }
    public void clearSecond(View view){
        text2.getText().clear();
    }*/
    public void refreshAll(){
        text1 = findViewById(R.id.ekaluku);
        text2 = findViewById(R.id.tokaluku);
        text = findViewById(R.id.tulos);
        String input1 = text1.getText().toString();
        String input2 = text2.getText().toString();
        num1 = Integer.parseInt(input1);
        num2 = Integer.parseInt(input2);
    }
    public void calcPlus(View view){
        refreshAll();
        int sum = num1 + num2;
        text.setText(Integer.toString(sum));
    }
    public void calcMinus(View view) {
        refreshAll();
        int subtract = num1 - num2;
        text.setText(Integer.toString(subtract));
    }
    public void calcMultiply(View view){
        refreshAll();
        int multiplied = num1 * num2;
        text.setText(Integer.toString(multiplied));
    }
    public void calcDivision(View view){
        refreshAll();
        if(num2 != 0){
            int divided = num1 / num2;
            text.setText(Integer.toString(divided));
        } else{
            text.setText("Divider can't be zero!");
        }
    }
}