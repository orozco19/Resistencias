package com.orozcoh.santiago.resistencias;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView edit1;
    LinearLayout llinea1, llinea2, llinea3, llineap;
    Button blinea1, blinea2, blinea3, blineap;
    LinearLayout F1, F2, F3, F4, F5, F6, F7, F8, F9, G1, G2, G3, G4, G5, G6, G7, G8, G9, G10;
    LinearLayout H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, J1, J2, J3, J4;
    int l1, l2;
    String lp;
    double l3, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llinea1 = findViewById(R.id.llinea1);
        llinea2 = findViewById(R.id.llinea2);
        llinea3 = findViewById(R.id.llinea3);
        llineap = findViewById(R.id.llineap);
        edit1 = findViewById(R.id.edittext1);
        F1 = findViewById(R.id.F1);
        F2 = findViewById(R.id.F2);
        F3 = findViewById(R.id.F3);
        F4 = findViewById(R.id.F4);
        F5 = findViewById(R.id.F5);
        F6 = findViewById(R.id.F6);
        F7 = findViewById(R.id.F7);
        F8 = findViewById(R.id.F8);
        F9 = findViewById(R.id.F9);
        G1 = findViewById(R.id.G1);
        G2 = findViewById(R.id.G2);
        G3 = findViewById(R.id.G3);
        G4 = findViewById(R.id.G4);
        G5 = findViewById(R.id.G5);
        G6 = findViewById(R.id.G6);
        G7 = findViewById(R.id.G7);
        G8 = findViewById(R.id.G8);
        G9 = findViewById(R.id.G9);
        G10 = findViewById(R.id.G10);
        H1 = findViewById(R.id.H1);
        H2 = findViewById(R.id.H2);
        H3 = findViewById(R.id.H3);
        H4 = findViewById(R.id.H4);
        H5 = findViewById(R.id.H5);
        H6 = findViewById(R.id.H6);
        H7 = findViewById(R.id.H7);
        H8 = findViewById(R.id.H8);
        H9 = findViewById(R.id.H9);
        H10 = findViewById(R.id.H10);
        J1 = findViewById(R.id.J1);
        J2 = findViewById(R.id.J2);
        J3 = findViewById(R.id.J3);
        J4 = findViewById(R.id.J4);
        l1 = 10;
        l2= 0;
        l3 = 1;
        res = 10;
        lp= "+/- 1%";
        edit1.setText("R = " + res + " \u03A9 "+ lp);
    }

    public void onClick1(View v) {
        llinea1.setBackground(v.getBackground());
        if (v.getId() == F1.getId())
            l1 = 10;
        if (v.getId() == F2.getId())
            l1 = 20;
        if (v.getId() == F3.getId())
            l1 = 30;
        if (v.getId() == F4.getId())
            l1 = 40;
        if (v.getId() == F5.getId())
            l1 = 50;
        if (v.getId() == F6.getId())
            l1 = 60;
        if (v.getId() == F7.getId())
            l1 = 70;
        if (v.getId() == F8.getId())
            l1 = 80;
        if (v.getId() == F9.getId())
            l1 = 90;
        res = (l1 +l2)*l3;
        edit1.setText("R = " + res + " \u03A9 "+ lp);
    }       //procedimineto de primera linea de colores

    public void onClick2(View v) {
        llinea2.setBackground(v.getBackground());
        if (v.getId() == G1.getId())
            l2 = 0;
        if (v.getId() == G2.getId())
            l2 = 1;
        if (v.getId() == G3.getId())
            l2 = 2;
        if (v.getId() == G4.getId())
            l2 = 3;
        if (v.getId() == G5.getId())
            l2 = 4;
        if (v.getId() == G6.getId())
            l2 = 5;
        if (v.getId() == G7.getId())
            l2 = 6;
        if (v.getId() == G8.getId())
            l2 = 7;
        if (v.getId() == G9.getId())
            l2 = 8;
        if (v.getId() == G10.getId())
            l2 = 9;
        res = (l1 +l2)*l3;
        edit1.setText("R = " + res + " \u03A9 "+ lp);
    }       //procedimineto de segunda linea de colores

    public void onClick3(View v) {
        llinea3.setBackground(v.getBackground());
        if (v.getId() == H1.getId())
            l3 = 1;
        if (v.getId() == H2.getId())
            l3 = 10;
        if (v.getId() == H3.getId())
            l3 = 100;
        if (v.getId() == H4.getId())
            l3 = 1000;
        if (v.getId() == H5.getId())
            l3 = 10000;
        if (v.getId() == H6.getId())
            l3 = 100000;
        if (v.getId() == H7.getId())
            l3 = 1000000;
        if (v.getId() == H8.getId())
            l3 = 0.1;
        if (v.getId() == H9.getId())
            l3 = 0.01;
        res = (l1 +l2)* l3;
        edit1.setText("R = " + res + " \u03A9 "+ lp);
    }       //procedimineto de tercera linea de colores

    public void onClickp(View v) {
        llineap.setBackground(v.getBackground());
        if (v.getId() == J1.getId())
            lp = "+/- 1%";
        if (v.getId() == J2.getId())
            lp = "+/- 2%";
        if (v.getId() == J3.getId())
            lp = "+/- 5%";
        if (v.getId() == J4.getId())
            lp = "+/- 10%";
        res = (l1 +l2)* l3;
        edit1.setText("R = " + res + " \u03A9 "+ lp);
    }
}
