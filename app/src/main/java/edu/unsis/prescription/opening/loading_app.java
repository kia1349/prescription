package edu.unsis.prescription.opening;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.unsis.prescription.MainActivity;

public class loading_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
