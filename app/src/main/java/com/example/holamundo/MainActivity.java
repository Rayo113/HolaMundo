package com.example.holamundo;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
//en este bloque van todas las carpetas que importamos para poder crear los objetos

public class MainActivity extends AppCompatActivity { // se crea la clase y se le agrega la extencion para que se vinvulen con los paquetes que importamos
    private static ImageView imgview;
    private static Button buttonsbm;
    private int current_image;
    // se declaran las variebles y sus atributos

    int [] images={R.drawable.imagen,R.drawable.imagen2,R.drawable.imagen3,R.drawable.imagen4,R.drawable.imagen5,R.drawable.imagen6,
            R.drawable.imagen7,R.drawable.imagen8,R.drawable.imagen9,};
    // se mandan a llamar las imagenes
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick();
    }
    public void buttonclick()
    {
        imgview=(ImageView)findViewById(R.id.imageView);
        buttonsbm=(Button)findViewById(R.id.button);
        buttonsbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image++;
                        current_image=current_image % images.length;
                        imgview.setImageResource(images[current_image]);
                    }
                }
        );
    }
}
// se conecta el boton con las imagenes y se le designa  que accion va a realizar el boton