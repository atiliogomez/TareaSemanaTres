package atiliogomez.com.example.tareasemanatres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;


public class ActivityContacto extends AppCompatActivity {

    Button button;
    EditText nombre, email, mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        androidx.appcompat.widget.Toolbar miActionBar=(androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        findViewById(R.id.space).setVisibility(View.GONE);

        //Obtener elementos de la interface
        nombre = findViewById(R.id.etNombre);
        email = findViewById(R.id.etEmail);
        mensaje = findViewById(R.id.etMensaje);
        button = findViewById(R.id.btsiguiente);

        //accion del boton enviar
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                String enviarnombre = nombre.getText().toString();
                String enviaremail = email.getText().toString();
                String enviarmensaje = mensaje.getText().toString();

                // Definir Intent y uso del objeto ACTION_SEND
                Intent intent = new Intent(Intent.ACTION_SEND);

                // Defino los Strings Email, Nombre y Mensaje con la función putExtra
                intent.putExtra(Intent.EXTRA_EMAIL,
                        new String[] { "catalinafajardo54@hotmail.com" });
                intent.putExtra(Intent.EXTRA_SUBJECT, enviarnombre );
                intent.putExtra(Intent.EXTRA_TEXT, enviarmensaje +"\\\n" + "\\\n" + enviaremail);

                // Establezco el tipo de Intent
                intent.setType("message/rfc822");

                // Lanzo el selector de cliente de Correo
                startActivity(
                        Intent
                                .createChooser(intent,
                                        "Elije un cliente de Correo:"));
            }
        });
    }


}