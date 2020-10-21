package atiliogomez.com.example.tareasemanatres;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ReciclerViewFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private View view;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) view.findViewById(R.id.rvmascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdpatador();
        return view;
    }
    public MascotaAdapter adaptador;
    private void inicializarAdpatador (){
        adaptador = new MascotaAdapter(mascotas, getActivity());
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

}

