package atiliogomez.com.example.tareasemanatres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;


public class ActivityContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        androidx.appcompat.widget.Toolbar miActionBar=(androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        findViewById(R.id.space).setVisibility(View.GONE);
        findViewById(R.id.fav).setVisibility(View.INVISIBLE);
    }

    public void enviarMensaje (View view) {
        Snackbar.make(view, "Mensaje Enviado!", Snackbar.LENGTH_SHORT).show();
    }

}