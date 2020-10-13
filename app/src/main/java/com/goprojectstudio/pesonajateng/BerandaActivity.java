package com.goprojectstudio.pesonajateng;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BerandaActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        bottomNavigationView = findViewById(R.id.buttom_nav);
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setSelectedItemId(R.id.btn_beranda);

        loadFragment(new BerandaFragment());
    }

    private boolean loadFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;

        switch (menuItem.getItemId()){
            case R.id.btn_beranda:
                fragment = new BerandaFragment();
                break;
            case R.id.btn_aktivitas:
                fragment = new AktivitasFragment();
                break;
//            case R.id.btn_kuis:
//                fragment = new KuisFragment();
//                break;
//            case R.id.btn_konsultan:
//                fragment = new KonsultanFragment();
//                break;
//            case R.id.btn_profil:
//                fragment = new ProfilFragment();
//                break;
        }
        return loadFragment(fragment);
    }
}
