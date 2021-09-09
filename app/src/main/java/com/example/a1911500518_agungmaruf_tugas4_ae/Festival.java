package com.example.a1911500518_agungmaruf_tugas4_ae;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1911500518_agungmaruf_tugas4_ae.JavaFest.BgrArtFest;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaFest.BgrFest;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaFest.BgrStreetFest;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaFest.FestivalBudaya;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaFest.PestaRayaBgr;

public class Festival extends Fragment implements View.OnClickListener {

    private CardView fest1, fest2, fest3, fest4, fest5;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_festival, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        fest1 = (CardView) view.findViewById(R.id.fest1_card);
        fest2 = (CardView) view.findViewById(R.id.fest2_card);
        fest3 = (CardView) view.findViewById(R.id.fest3_card);
        fest4 = (CardView) view.findViewById(R.id.fest4_card);
        fest5 = (CardView) view.findViewById(R.id.fest5_card);

        fest1.setOnClickListener(this);
        fest2.setOnClickListener(this);
        fest3.setOnClickListener(this);
        fest4.setOnClickListener(this);
        fest5.setOnClickListener(this);
    }

    private void changeFest1() {
        getFragmentManager().beginTransaction().replace(R.id.frame_festival, new BgrStreetFest()).addToBackStack(null).commit();
    }

    private void changeFest2() {
        getFragmentManager().beginTransaction().replace(R.id.frame_festival, new BgrFest()).addToBackStack(null).commit();
    }

    private void changeFest3() {
        getFragmentManager().beginTransaction().replace(R.id.frame_festival, new BgrArtFest()).addToBackStack(null).commit();
    }

    private void changeFest4() {
        getFragmentManager().beginTransaction().replace(R.id.frame_festival, new PestaRayaBgr()).addToBackStack(null).commit();
    }

    private void changeFest5() {
        getFragmentManager().beginTransaction().replace(R.id.frame_festival, new FestivalBudaya()).addToBackStack(null).commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fest1_card:
                changeFest1();
                break;
            case R.id.fest2_card:
                changeFest2();
                break;
            case R.id.fest3_card:
                changeFest3();
                break;
            case R.id.fest4_card:
                changeFest4();
                break;
            case R.id.fest5_card:
                changeFest5();
                break;
        }
    }
}