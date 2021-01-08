package com.example.binusezyfoody;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class maps extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap mapAPI;
    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        mapFragment =(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapAPI);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mapAPI = googleMap;
        LatLng binusezyfoodalsut = new LatLng(-6.224843, 106.650219);

        mapAPI.addMarker(new MarkerOptions().position(binusezyfoodalsut).title("BinusEzyFOOD Alam Sutera"));

        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(binusezyfoodalsut));
    }
}