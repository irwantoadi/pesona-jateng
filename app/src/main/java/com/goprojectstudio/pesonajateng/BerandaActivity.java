package com.goprojectstudio.pesonajateng;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
//        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setSelectedItemId(R.id.btn_beranda);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

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
            case R.id.btn_favorit:
                fragment = new FavoritFragment();
                break;
            case R.id.btn_akun:
                fragment = new AkunFragment();
                break;
//            case R.id.btn_profil:
//                fragment = new ProfilFragment();
//                break;
        }
        return loadFragment(fragment);
    }


    @Override
    public void onBackPressed() {
        int count = getSupportFragmentManager().getBackStackEntryCount();
        if (count == 0){
            myAlert(BerandaActivity.this);
        }else{
            getSupportFragmentManager().popBackStack();
        }

    }
    private void myAlert(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("Keluar?")
                .setMessage("Apakah yakin akan keluar aplikasi?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }
}
