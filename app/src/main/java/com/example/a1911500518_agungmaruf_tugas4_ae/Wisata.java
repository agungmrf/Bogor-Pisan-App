package com.example.a1911500518_agungmaruf_tugas4_ae;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.a1911500518_agungmaruf_tugas4_ae.JavaWisata.Devoyage;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaWisata.Gede;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaWisata.Pancar;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaWisata.Rayabgr;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaWisata.Rayacbd;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaWisata.Safari;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaWisata.TheRanch;

public class Wisata extends Fragment implements View.OnClickListener {

    private CardView rayabgr, rayacbd, safari, theranch, devoyage, gede, pancar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_wisata, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        rayabgr = (CardView) view.findViewById(R.id.rayabgr_card);
        rayacbd = (CardView) view.findViewById(R.id.rayacbd_card);
        safari = (CardView) view.findViewById(R.id.safari_card);
        theranch = (CardView) view.findViewById(R.id.theranch_card);
        devoyage = (CardView) view.findViewById(R.id.devoyage_card);
        gede = (CardView) view.findViewById(R.id.pangrango_card);
        pancar = (CardView) view.findViewById(R.id.pancar_card);

        rayabgr.setOnClickListener(this);
        rayacbd.setOnClickListener(this);
        safari.setOnClickListener(this);
        theranch.setOnClickListener(this);
        devoyage.setOnClickListener(this);
        gede.setOnClickListener(this);
        pancar.setOnClickListener(this);
    }

    private void changeKebunRayaBgr() {
        getFragmentManager().beginTransaction().replace(R.id.frame_wisata, new Rayabgr()).addToBackStack(null).commit();
    }

    private void changeKebunRayaCbd() {
        getFragmentManager().beginTransaction().replace(R.id.frame_wisata, new Rayacbd()).addToBackStack(null).commit();
    }

    private void changeSafari() {
        getFragmentManager().beginTransaction().replace(R.id.frame_wisata, new Safari()).addToBackStack(null).commit();
    }

    private void changeTheRanch() {
        getFragmentManager().beginTransaction().replace(R.id.frame_wisata, new TheRanch()).addToBackStack(null).commit();
    }

    private void changeDevoyage() {
        getFragmentManager().beginTransaction().replace(R.id.frame_wisata, new Devoyage()).addToBackStack(null).commit();
    }

    private void changeGede() {
        getFragmentManager().beginTransaction().replace(R.id.frame_wisata, new Gede()).addToBackStack(null).commit();
    }

    private void changePancar() {
        getFragmentManager().beginTransaction().replace(R.id.frame_wisata, new Pancar()).addToBackStack(null).commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rayabgr_card:
                changeKebunRayaBgr();
                break;
            case R.id.rayacbd_card:
                changeKebunRayaCbd();
                break;
            case R.id.safari_card:
                changeSafari();
                break;
            case R.id.theranch_card:
                changeTheRanch();
                break;
            case R.id.devoyage_card:
                changeDevoyage();
                break;
            case R.id.pangrango_card:
                changeGede();
                break;
            case R.id.pancar_card:
                changePancar();
                break;
        }
    }
}