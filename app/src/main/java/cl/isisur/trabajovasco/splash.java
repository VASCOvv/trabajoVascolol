package cl.isisur.trabajovasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    private final int duracion=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent intent = new Intent(this, MapsActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override          public void run() {
                startActivity(intent);
                finish();
            }
        }, duracion);
    }
}