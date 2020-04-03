package fr.promeo.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String nb_one = "";
    String operator = "";
    String nb_two = "";
    int nb_bool = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button0 = findViewById(R.id.button11);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + "0";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + "0";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button1 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + "1";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + "1";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + "2";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + "2";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button3 = findViewById(R.id.button4);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + "3";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + "3";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button4 = findViewById(R.id.button5);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + "4";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + "4";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button5 = findViewById(R.id.button6);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + "5";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + "5";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button6 = findViewById(R.id.button7);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + "6";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + "6";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button7 = findViewById(R.id.button8);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + "7";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + "7";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button8 = findViewById(R.id.button9);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + "8";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + "8";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button9 = findViewById(R.id.button10);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + "9";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + "9";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button_hundred_divide = findViewById(R.id.button);
        button_hundred_divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView);
                Service calcul = new Service(nb_one, Integer.toString(100));
                double result = calcul.divide();
                recup.setText(Double.toString(result));
            }
        });
        final Button button_coma = findViewById(R.id.button13);
        button_coma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    nb_one = nb_one + ".";
                }
                else if (nb_bool == 1){
                    nb_two = nb_two + ".";
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button_cancel = findViewById(R.id.button22);
        button_cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                final TextView recup2 = (TextView) findViewById(R.id.textView);
                operator = "";
                nb_bool = 0;
                nb_one = "";
                nb_two = "";
                recup.setText("");
                recup2.setText("");
            }
        });
        final Button button_divide = findViewById(R.id.button23);
        button_divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                operator = "/";
                nb_bool = 1;
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button_multiple = findViewById(R.id.button21);
        button_multiple.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                operator = "x";
                nb_bool = 1;
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button_return = findViewById(R.id.button19);
        button_return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0){
                    if (nb_one.length()>0){
                        nb_one = nb_one.substring(0, nb_one.length()-1);
                    }
                }
                else if (nb_bool == 1){
                    if (nb_two.length()>0){
                        nb_two = nb_two.substring(0, nb_two.length()-1);
                    }
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button_mile_divide = findViewById(R.id.button17);
        button_mile_divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView);
                Service calcul = new Service(nb_one, Integer.toString(1000));
                double result = calcul.divide();
                recup.setText(Double.toString(result));
            }
        });
        final Button button_substract = findViewById(R.id.button16);
        button_substract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0 && nb_one == ""){
                    nb_one = "-" + nb_one;
                }
                else if (nb_bool == 1 && operator != "" && nb_two == ""){
                    nb_two = "-" + nb_two;
                }
                else if (nb_bool == 0 && nb_one.length() == 1 && (nb_one.charAt(0) == '+' || nb_one.charAt(0) == '-')){

                }
                else {
                    operator = "-";
                    nb_bool = 1;
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button_addition = findViewById(R.id.button15);
        button_addition.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView2);
                if (nb_bool == 0 && nb_one == ""){
                    nb_one = "+" + nb_one;
                }
                else if (nb_bool == 1 && operator != "" && nb_two == ""){
                    nb_two = "+" + nb_two;
                }
                else if (nb_bool == 0 && nb_one.length() == 1 && (nb_one.charAt(0) == '+' || nb_one.charAt(0) == '-')){

                }
                else{
                    operator = "+";
                    nb_bool = 1;
                }
                recup.setText(nb_one + "" + operator + "" + nb_two);
            }
        });
        final Button button_equal = findViewById(R.id.button14);
        button_equal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView recup = (TextView) findViewById(R.id.textView);
                Service calcul = new Service(nb_one, nb_two);
                double result;
                switch (operator){
                    case "+":
                        result = calcul.addition();
                        break;
                    case "-":
                        result = calcul.substract();
                        break;
                    case "/":
                        if (Double.parseDouble(nb_one) != Double.parseDouble("0") || Double.parseDouble(nb_two) != Double.parseDouble("0")){
                            result = calcul.divide();
                        }
                        else {
                            result = 0;
                        }
                        break;
                    case "x":
                        result = calcul.multiple();
                        break;
                    default:
                        result = 0;
                }
                recup.setText(Double.toString(result));
            }
        });

    }
}
