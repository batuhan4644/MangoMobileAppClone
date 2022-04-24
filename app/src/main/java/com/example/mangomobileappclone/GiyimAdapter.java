package com.example.mangomobileappclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mangomobileappclone.databinding.CardTasarimBinding;

import java.util.List;

public class GiyimAdapter extends RecyclerView.Adapter<GiyimAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Giyim> giyimlistesi;

    public GiyimAdapter(Context mContext, List<Giyim> giyimlistesi) {
        this.mContext = mContext;
        this.giyimlistesi = giyimlistesi;
    }


    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardTasarimBinding tasarim;

        public CardTasarimTutucu(CardTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }
    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        CardTasarimBinding tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false);
        return new CardTasarimTutucu(tasarim);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Giyim giyim = giyimlistesi.get(position);
        CardTasarimBinding t = holder.tasarim;

        t.imageViewGiyimResim.setImageResource(
                mContext.getResources().getIdentifier(giyim.getGiyimResimAdi(),"drawable",mContext.getPackageName()));
        t.textViewGiyimAdi.setText(giyim.getGiyimAdi());
        t.textViewGiyimFiyat.setText("₺"+giyim.getGiyimFiyat());
    }

    @Override
    public int getItemCount() {
        return giyimlistesi.size();
    }

}
