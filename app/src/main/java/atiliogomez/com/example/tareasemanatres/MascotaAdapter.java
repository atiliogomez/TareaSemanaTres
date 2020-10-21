package atiliogomez.com.example.tareasemanatres;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static androidx.recyclerview.widget.RecyclerView.*;



public class MascotaAdapter extends RecyclerView.Adapter <MascotaAdapter.MascotaViewHolder> {
    ArrayList<Mascota> mascotas;
    private Context context;
    private boolean perfil;

    public MascotaAdapter(ArrayList<Mascota> mascotas, Context context) {
        this.mascotas = mascotas;
        this.context = context;
        this.perfil=false;
    }
    public MascotaAdapter(ArrayList<Mascota> mascotas, Context context, boolean perfil) {
        this.mascotas = mascotas;
        this.context = context;
        this.perfil = perfil;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder MascotaViewholder, int position) {
        final Mascota mascota = mascotas.get(position);
        MascotaViewholder.imgMascota.setImageResource(mascota.getFoto());
        MascotaViewholder.tvNombre.setText(mascota.getNombre());
        MascotaViewholder.tvLikes.setText(mascota.getLike());


        MascotaViewholder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Diste Like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });

        if(perfil){
            MascotaViewholder.btnLike.setVisibility(View.GONE);
            MascotaViewholder.tvNombre.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    public static class MascotaViewHolder extends ViewHolder{

        private ImageView imgMascota;
        private TextView tvNombre;
        private TextView tvLikes;
        private ImageButton btnLike;


        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMascota = (ImageView) itemView.findViewById(R.id.imgMascota);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
            tvLikes= (TextView) itemView.findViewById(R.id.tvLikes);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnLike);

        }
    }

}
