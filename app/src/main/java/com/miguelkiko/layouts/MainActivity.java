package com.miguelkiko.layouts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btn_mas, btn_igual, btn_c, btn_reset;
    TextView lbl_lcd, lbl_aux;

    String res = "0";
    String aux = "";

    int numero = 0;
    int numero1 = 0;
    int resultado = 0;
    boolean flag = false;

    /**
     * Y que comience la función!! Sobreescritura del Método onCreate
     * @param savedInstanceState Los datos de la instancia grabados
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CAPTURAMOS NUESTRAS VISTAS
        btn0 = (Button) findViewById(R.id.btn_0);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);

        btn_mas = (Button) findViewById(R.id.btn_mas);
        btn_igual = (Button) findViewById(R.id.btn_igual);
        btn_c = (Button) findViewById(R.id.btn_c);
        btn_reset = (Button) findViewById(R.id.btn_reset);

        lbl_lcd = (TextView) findViewById(R.id.lbl_lcd);
        lbl_aux = (TextView) findViewById(R.id.lbl_auxiliar2);

        // HACEMOS ALGO CON EL COLOR DEL LCD (TextView)
        lbl_lcd.setTextColor(Color.DKGRAY);

        /**
         * PONEMOS EL LCD A 0 AL PULSAR EL BOTON C
         */
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lbl_lcd.setTextColor(Color.DKGRAY);
                lbl_lcd.setText("0");
                res = "0";
            }
        });

        /**
         * LISTENERS PARA LOS EVENTOS ONCLICK DE LOS BOTONES
         * COMPROBAMOS SI LO QUE HAY ES CERO PARA EVITAR CONCATENAR CEROS
         * ENTONCES.. SI NO ES CERO, CONCATENA, SI ES CERO SUSTITUYE...
         */
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (res.equalsIgnoreCase("0")) {
                    lbl_lcd.setText(btn0.getText().toString());
                } else {
                    lbl_lcd.setText(res + btn0.getText().toString());

                }
                res = lbl_lcd.getText().toString();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.equalsIgnoreCase("0")) {
                    lbl_lcd.setText(btn1.getText().toString());

                } else {
                    lbl_lcd.setText(res + "1");
                }
                res = lbl_lcd.getText().toString();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.equalsIgnoreCase("0")) {
                    lbl_lcd.setText(btn2.getText().toString());

                } else {
                    lbl_lcd.setText(res + "2");
                }
                res = lbl_lcd.getText().toString();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.equalsIgnoreCase("0")) {
                    lbl_lcd.setText(btn3.getText().toString());

                } else {
                    lbl_lcd.setText(res + "3");
                }
                res = lbl_lcd.getText().toString();

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.equalsIgnoreCase("0")) {
                    lbl_lcd.setText(btn4.getText().toString());

                } else {
                    lbl_lcd.setText(res + "4");
                }
                res = lbl_lcd.getText().toString();

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.equalsIgnoreCase("0")) {
                    lbl_lcd.setText(btn5.getText().toString());

                } else {
                    lbl_lcd.setText(res + "5");
                }
                res = lbl_lcd.getText().toString();

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.equalsIgnoreCase("0")) {
                    lbl_lcd.setText(btn6.getText().toString());

                } else {
                    lbl_lcd.setText(res + "6");
                }
                res = lbl_lcd.getText().toString();

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.equalsIgnoreCase("0")) {
                    lbl_lcd.setText(btn7.getText().toString());

                } else {
                    lbl_lcd.setText(res + "7");
                }
                res = lbl_lcd.getText().toString();

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.equalsIgnoreCase("0")) {
                    lbl_lcd.setText(btn8.getText().toString());

                } else {
                    lbl_lcd.setText(res + "" + btn8.getText().toString());
                }
                res = lbl_lcd.getText().toString();

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.equalsIgnoreCase("0")) {
                    lbl_lcd.setText(btn9.getText().toString());

                } else {
                    lbl_lcd.setText(res + "9");
                }
                res = lbl_lcd.getText().toString();
            }
        });

        btn_mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(lbl_lcd.getText().toString().length() > 10)) {
                    if (flag) {
                        resultado = 0;
                        numero = Integer.parseInt(lbl_lcd.getText().toString());
                        resultado += numero;
                        res = "0";
                        Log.i("info", "n1: " + numero1 + " | RESULT: " + resultado + " | lbl_lcd. " + lbl_lcd.getText().toString());
                        lbl_lcd.setText("0");
                        lbl_aux.setText(resultado + "+");
                        flag = false;
                    } else {
                        if (!lbl_lcd.getText().toString().equalsIgnoreCase("LCD")) {
                            numero = Integer.parseInt(res);
                            resultado += numero;
                            res = "0";
                            Log.i("info", "n1: " + numero1 + " | RESULT: " + resultado + " | lbl_lcd. " + lbl_lcd.getText().toString());
                            lbl_lcd.setText("0");
                            lbl_aux.setText(resultado + "+");
                        }
                    }
                } else {
                    lbl_lcd.setText("ERR : NUMBER IS TOO LONG!");
                    lbl_lcd.setTextColor(Color.RED);
                }

            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(lbl_lcd.getText().toString().length() > 10)) {
                    if (resultado != 0 && !flag) {
                        numero1 = Integer.parseInt(res);
                        resultado += numero1;
                        lbl_lcd.setText(String.valueOf(resultado));
                        flag = true;
                        lbl_aux.setText("");
                    }
                } else {
                    lbl_lcd.setText("ERR : TOO LONG!!");
                    lbl_lcd.setTextColor(Color.RED);
                }
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = 0;
                numero1 = 0;
                res = "";
                lbl_lcd.setText("LCD");
                lbl_aux.setText("");
                lbl_lcd.setTextColor(Color.DKGRAY);

            }
        });

    }
}
