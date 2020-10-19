package atiliogomez.com.example.tareasemanatres;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        androidx.appcompat.widget.Toolbar miActionBar=(androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvmascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdpatador();
    }

    public void irSegundaActividad (View view){
        Intent intent = new Intent(MainActivity.this, MascotaFavorita.class);
        startActivity(intent);

    }
    public MascotaAdapter adaptador;
    private void inicializarAdpatador (){
        adaptador = new MascotaAdapter(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }
    public  void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.mascota1,"Gizmo","3"));
        mascotas.add(new Mascota(R.drawable.mascota2,"Gremlin","5"));
        mascotas.add(new Mascota(R.drawable.mascota3,"Perrito","2"));
        mascotas.add(new Mascota(R.drawable.mascota4,"Gatito","1"));
        mascotas.add(new Mascota(R.drawable.mascota5,"Zuricata","6"));
        mascotas.add(new Mascota(R.drawable.mascota6,"Pato","4"));
        mascotas.add(new Mascota(R.drawable.mascota7,"Chancho","4"));
        mascotas.add(new Mascota(R.drawable.mascota8,"Hurón","6"));
        mascotas.add(new Mascota(R.drawable.mascota9,"Tortuga","7"));
        mascotas.add(new Mascota(R.drawable.mascota10,"Lagartija","2"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.mContacto:
                Intent intent1 = new Intent(this,ActivityContacto.class);
                startActivity(intent1);
                break;

        }


        return super.onOptionsItemSelected(item);
    }
}