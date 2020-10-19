package atiliogomez.com.example.tareasemanatres;

import android.app.Activity;
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
    Activity activity;

    public MascotaAdapter(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder MascotaViewholder, int position) {
        final Mascota mascota = mascotas.get(position);
        MascotaViewholder.imgMascota.setImageResource(mascota.getFoto());
        MascotaViewholder.tvNombre.setText(mascota.getNombre());
        MascotaViewholder.tvLikes.setText(mascota.getLike());
        MascotaViewholder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(activity, "Diste Like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });{

        };
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
