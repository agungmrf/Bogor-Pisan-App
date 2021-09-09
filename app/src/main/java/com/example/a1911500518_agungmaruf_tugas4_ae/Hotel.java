package com.example.a1911500518_agungmaruf_tugas4_ae;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1911500518_agungmaruf_tugas4_ae.JavaHotel.AstonBogor;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaHotel.BogorIcon;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaHotel.GrandUssu;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaHotel.HarrisHotel;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaHotel.Rancamaya;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaHotel.RoyalPadjajaran;


public class Hotel extends Fragment implements View.OnClickListener {

    private CardView rancamaya, royal, aston, harris, horison, ussu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hotel, container, false);
        return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        rancamaya = (CardView) view.findViewById(R.id.rancamaya_card);
        royal = (CardView) view.findViewById(R.id.royal_card);
        aston = (CardView) view.findViewById(R.id.aston_card);
        harris = (CardView) view.findViewById(R.id.harris_card);
        horison = (CardView) view.findViewById(R.id.horison_card);
        ussu = (CardView) view.findViewById(R.id.ussu_card);

        rancamaya.setOnClickListener(this);
        royal.setOnClickListener(this);
        aston.setOnClickListener(this);
        harris.setOnClickListener(this);
        horison.setOnClickListener(this);
        ussu.setOnClickListener(this);
    }

    private void changeRancamaya() {
        getFragmentManager().beginTransaction().replace(R.id.frame_hotel, new Rancamaya()).addToBackStack(null).commit();
    }

    private void changeRoyal() {
        getFragmentManager().beginTransaction().replace(R.id.frame_hotel, new RoyalPadjajaran()).addToBackStack(null).commit();
    }

    private void changeAston() {
        getFragmentManager().beginTransaction().replace(R.id.frame_hotel, new AstonBogor()).addToBackStack(null).commit();
    }

    private void changeHarris() {
        getFragmentManager().beginTransaction().replace(R.id.frame_hotel, new HarrisHotel()).addToBackStack(null).commit();
    }

    private void changeHorison() {
        getFragmentManager().beginTransaction().replace(R.id.frame_hotel, new BogorIcon()).addToBackStack(null).commit();
    }

    private void changeUssu() {
        getFragmentManager().beginTransaction().replace(R.id.frame_hotel, new GrandUssu()).addToBackStack(null).commit();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rancamaya_card:
                changeRancamaya();
                break;
            case R.id.royal_card:
                changeRoyal();
                break;
            case R.id.aston_card:
                changeAston();
                break;
            case R.id.harris_card:
                changeHarris();
                break;
            case R.id.horison_card:
                changeHorison();
                break;
            case R.id.ussu_card:
                changeUssu();
                break;
        }
    }
}