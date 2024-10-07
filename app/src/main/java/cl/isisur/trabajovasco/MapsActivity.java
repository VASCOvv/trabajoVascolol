package cl.isisur.trabajovasco;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.isisur.trabajovasco.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Lider = new LatLng(-36.59035811580276, -72.08497106452597);
        LatLng Tottus = new LatLng(-36.599545032703055, -72.09883190300555);
        LatLng Cugat = new LatLng(-36.60400493843885, -72.09252587102407);
        LatLng Jumbo = new LatLng(-36.590754375954475, -72.0834475697947);
        LatLng Vasco =new LatLng(37.76951402835579, -122.45187840653746);


        mMap.addMarker(new MarkerOptions().position(Lider).title("Lider Exxpres"));
        mMap.addMarker(new MarkerOptions().position(Tottus).title("Tottus"));
        mMap.addMarker(new MarkerOptions().position(Jumbo).title("Jumbo Vicente Mendez"));
        mMap.addMarker(new MarkerOptions().position(Vasco).title("Vasco"));
        mMap.addMarker(new MarkerOptions().position(Cugat).title("Cugat"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(Vasco));
        mMap.setMinZoomPreference(4.0F);
        mMap.setMaxZoomPreference(18.0f);
    }
}