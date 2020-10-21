package atiliogomez.com.example.tareasemanatres;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PerfilFragment extends Fragment {

    private View view;


    public PerfilFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_perfil, container, false);
        inicializarFotosMascotas();
        return view;
    }

    private  void inicializarFotosMascotas () {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.mascota1,"Gizmo", "2"));
        mascotas.add(new Mascota(R.drawable.mascota1,"Gizmo","14"));
        mascotas.add(new Mascota(R.drawable.mascota1, "Gizmo","1"));
        mascotas.add(new Mascota(R.drawable.mascota1,"Gizmo","0"));
        mascotas.add(new Mascota(R.drawable.mascota1,"Gizmo","10"));
        mascotas.add(new Mascota(R.drawable.mascota1,"Gizmo","25"));
        mascotas.add(new Mascota(R.drawable.mascota1,"Gizmo","8"));
        mascotas.add(new Mascota(R.drawable.mascota1,"Gizmo","7"));
        mascotas.add(new Mascota(R.drawable.mascota1,"Gizmo","3"));
        mascotas.add(new Mascota(R.drawable.mascota1,"Gizmo","2"));

        RecyclerView recycler = view.findViewById(R.id.rvperfil);
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 2);
        recycler.setLayoutManager(grid);
        MascotaAdapter adapter = new MascotaAdapter(mascotas, getActivity(), true);
        recycler.setAdapter(adapter);
    }
}