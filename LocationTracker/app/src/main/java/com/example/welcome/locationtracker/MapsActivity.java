package com.example.welcome.locationtracker;

import android.graphics.Camera;
import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.yogita.locationtracker.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.io.IOException;
import java.util.*;
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    public void onSearch(View view)
    {
        EditText location1=(EditText)findViewById(R.id.editText);
        String location= location1.getText().toString();
        List<Address> addressList=null;
        if (location !=null || !location.equals(""))
        {
            Geocoder geocoder=new Geocoder(this);
            try {
                addressList= geocoder.getFromLocationName(location, 1);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            Address address=addressList.get(0);
            LatLng latLng=new LatLng(address.getLatitude(),address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latLng).title(location));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        }
    }
public void onZoom(View view)
{
    if(view.getId()==R.id.Bzoomin)
    {
      mMap.animateCamera(CameraUpdateFactory.zoomIn());


    }
    if(view.getId()==R.id.Bzoomout)
    {
        mMap.animateCamera(CameraUpdateFactory.zoomOut());
    }
}
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(0,  0);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.setMyLocationEnabled(true);//enable gprs
    }
}
