package com.example.foodexpress.screen.main.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodexpress.R
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.example.foodexpress.databinding.ActivityMapsBinding
import com.example.foodexpress.model.AddressModel
import org.greenrobot.eventbus.EventBus

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        binding.btncnfaddress.setOnClickListener {
            val addressModel = AddressModel("", mMap.cameraPosition.target.latitude, mMap.cameraPosition.target.longitude)
            EventBus.getDefault().post(addressModel)
            finish()
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
    }
}