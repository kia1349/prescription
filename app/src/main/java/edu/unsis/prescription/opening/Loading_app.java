package edu.unsis.prescription.opening;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.unsis.prescription.registration.RegisterActivity;

/**
 * @Author: Vicente Mendoza
 * @date: 28/10/2017
 * Clase que se ejecuta con el activity splash al abrir la aplicacion
 */
public class Loading_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //registramos el siguiente activity a mostrar
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }
}
