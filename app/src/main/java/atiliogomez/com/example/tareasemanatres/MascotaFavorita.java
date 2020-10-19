package atiliogomez.com.example.tareasemanatres;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Objects;
public class MascotaFavorita extends AppCompatActivity {
    ArrayList<Mascota> mascotasfav;
    private RecyclerView listaMascotasFav;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota_favorita);

        androidx.appcompat.widget.Toolbar miActionBar=(androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        findViewById(R.id.space).setVisibility(View.GONE);
        findViewById(R.id.fav).setVisibility(View.INVISIBLE);

        listaMascotasFav = (RecyclerView) findViewById(R.id.rvfavmascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotasFav.setLayoutManager(llm);
        inicializarListaMascotasFav();
        inicializarAdpatador();

    }
    public MascotaAdapter adaptador;
    private void inicializarAdpatador (){
        adaptador = new MascotaAdapter(mascotasfav, this);
        listaMascotasFav.setAdapter(adaptador);
    }
    public  void inicializarListaMascotasFav () {
        mascotasfav = new ArrayList<Mascota>();
        mascotasfav.add(new Mascota(R.drawable.mascota3,"Perrito","7"));
        mascotasfav.add(new Mascota(R.drawable.mascota2,"Gremlin","6"));
        mascotasfav.add(new Mascota(R.drawable.mascota5,"Zuricata","6"));
        mascotasfav.add(new Mascota(R.drawable.mascota6,"Pato","5"));
        mascotasfav.add(new Mascota(R.drawable.mascota1,"Gizmo","4"));
    }
}