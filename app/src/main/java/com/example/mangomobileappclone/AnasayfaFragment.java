package com.example.mangomobileappclone;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mangomobileappclone.databinding.FragmentAnasayfaBinding;

import java.util.ArrayList;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false);


        //tasarim.toolbarAnasayfa.setTitle("Mango");
        tasarim.rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        ArrayList<Giyim> giyimListesi = new ArrayList<>();
        Giyim g1 = new Giyim(1,"Dar kesimli keten takım blazer ceket","erkekresim1_200x300",1799.99);
        Giyim g2 = new Giyim(2,"Sırtı cut-out kesimli tulum","kadinresim1_200x300",749.99);
        Giyim g3 = new Giyim(3,"Siyah keten gömlek elbise","kadinresim2_200x300",449.99);
        Giyim g4 = new Giyim(4,"Dar kesim yünlü takım blazer ceket","erkekresim2_200x300",1799.99);
        Giyim g5 = new Giyim(5,"Kısa örgü üst","erkekresim3_200x300",249.99);
        Giyim g6 = new Giyim(6,"%100 pamuklu tişört","kadinresim3_200x300",149.99);
        giyimListesi.add(g1);
        giyimListesi.add(g2);
        giyimListesi.add(g3);
        giyimListesi.add(g4);
        giyimListesi.add(g5);
        giyimListesi.add(g6);

        GiyimAdapter adapter = new GiyimAdapter(requireContext(),giyimListesi);
        tasarim.rv.setAdapter(adapter);


        return tasarim.getRoot();
    }
}