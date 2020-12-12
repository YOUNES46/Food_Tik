package com.example.otmani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int val =2;

    public void sumbi(View veiw){
        display(val);
        display2(val *5);
        nchofo();

        displaymess();

    }
    public void display(int num){

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + num);
    }
    public void display2(int num2){

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_vieww);
        quantityTextView.setText("$" + num2);
    }
    public void incriment(View view){
        val = val +1;
        display(val);
        display2(val *5);

    }
    public void deccriment(View view){
        val = val -1;
        display(val);
        display2(val *5);


    }


    public String change(String message){
        message = "Quantity :="+val;
        message = message + "\nprice :=" + val*5;
        message = message + "\n tank you !!!! ";
        message = message + "\n From Younes Otmani";
        return message;
    }
    public void displaymess(){
        TextView priceText = (TextView)findViewById(R.id.quantity_text_vieww);
        priceText.setText(change("price"));


    }
    public void nchofo(){
        CheckBox creamo = (CheckBox)findViewById(R.id.cream);
        CheckBox creamoo = (CheckBox)findViewById(R.id.choco);
        boolean test = creamo.isChecked();
        boolean test2 = creamoo.isChecked();
        int plus =1;
        int pluss =0;
        if (test == true){
          pluss = val+plus ;

        }
        int plus2= 2;
        int pluse;
        if (test2 == true){
            pluse = val +plus2;
        }

    }

}
