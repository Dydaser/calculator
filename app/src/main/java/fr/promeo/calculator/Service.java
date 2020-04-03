package fr.promeo.calculator;


import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Service extends AppCompatActivity {
    double nb_one;
    double nb_two;
    public Service(String nb_one, String nb_two) {
        this.nb_one = Double.parseDouble(nb_one);
        this.nb_two = Double.parseDouble(nb_two);
    }

    public double addition (){
        double result = this.nb_one + this.nb_two;
        return result;
    }
    public double substract (){
        double result = this.nb_one - this.nb_two;
        return result;
    }
    public double divide (){
        double result = this.nb_one / this.nb_two;
        return result;
    }
    public double multiple(){
        double result = this.nb_one * this.nb_two;
        return result;
    }
}
