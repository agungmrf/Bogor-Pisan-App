package com.example.a1911500518_agungmaruf_tugas4_ae;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1911500518_agungmaruf_tugas4_ae.JavaKuliner.Cungkring;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaKuliner.LumpiaBasah;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaKuliner.MartabakEncek;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaKuliner.SotoMieOhim;
import com.example.a1911500518_agungmaruf_tugas4_ae.JavaKuliner.SotoPakYusuf;


public class Kuliner extends Fragment implements View.OnClickListener {

    private CardView martabak, cungkring, sotokuning, sotomie, lumpia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_kuliner, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        martabak = (CardView) view.findViewById(R.id.encek_card);
        cungkring = (CardView) view.findViewById(R.id.cungkring_card);
        sotokuning = (CardView) view.findViewById(R.id.yusuf_card);
        sotomie = (CardView) view.findViewById(R.id.ohim_card);
        lumpia = (CardView) view.findViewById(R.id.lumpia_card);

        martabak.setOnClickListener(this);
        cungkring.setOnClickListener(this);
        sotokuning.setOnClickListener(this);
        sotomie.setOnClickListener(this);
        lumpia.setOnClickListener(this);
    }

    private void changeMartabak() {
        getFragmentManager().beginTransaction().replace(R.id.frame_kuliner, new MartabakEncek()).addToBackStack(null).commit();
    }

    private void changeCungkring() {
        getFragmentManager().beginTransaction().replace(R.id.frame_kuliner, new Cungkring()).addToBackStack(null).commit();
    }

    private void changeSotoKuning() {
        getFragmentManager().beginTransaction().replace(R.id.frame_kuliner, new SotoPakYusuf()).addToBackStack(null).commit();
    }

    private void changeSotoMie() {
        getFragmentManager().beginTransaction().replace(R.id.frame_kuliner, new SotoMieOhim()).addToBackStack(null).commit();
    }

    private void changeLumpia() {
        getFragmentManager().beginTransaction().replace(R.id.frame_kuliner, new LumpiaBasah()).addToBackStack(null).commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.encek_card:
                changeMartabak();
                break;
            case R.id.cungkring_card:
                changeCungkring();
                break;
            case R.id.yusuf_card:
                changeSotoKuning();
                break;
            case R.id.ohim_card:
                changeSotoMie();
                break;
            case R.id.lumpia_card:
                changeLumpia();
                break;
        }
    }
}