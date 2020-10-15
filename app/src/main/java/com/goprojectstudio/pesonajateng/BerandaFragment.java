package com.goprojectstudio.pesonajateng;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BerandaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BerandaFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BerandaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BerandaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BerandaFragment newInstance(String param1, String param2) {
        BerandaFragment fragment = new BerandaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_beranda, container, false);

        View view = getLayoutInflater().inflate(R.layout.fragment_beranda,
                container, false);

        ImageButton icon_destinasi, icon_desa, icon_oleh, icon_penginapan,
                icon_pelatihan, icon_pemesanan, icon_edukasi, icon_pendanaan;

        icon_destinasi = view.findViewById(R.id.icon_destinasi);
        icon_desa = view.findViewById(R.id.icon_desa);
        icon_oleh = view.findViewById(R.id.icon_oleh_oleh);
        icon_penginapan = view.findViewById(R.id.icon_penginapan);
        icon_pelatihan = view.findViewById(R.id.icon_pelatihan);
        icon_pemesanan = view.findViewById(R.id.icon_pemesanan);
        icon_edukasi = view.findViewById(R.id.icon_edukasi);
        icon_pendanaan = view.findViewById(R.id.icon_pendanaan);
        icon_destinasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DestinasiFragment destinasiFragment = new DestinasiFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), destinasiFragment, "findThisFragment")
                        .addToBackStack(null).commit();
            }
        });
        icon_desa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DesaFragment desaFragment = new DesaFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), desaFragment, "findThisFragment")
                        .addToBackStack(null).commit();
            }
        });
        icon_oleh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OlehOlehFragment olehOlehFragment = new OlehOlehFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), olehOlehFragment, "findThisFragment")
                        .addToBackStack(null).commit();
            }
        });
        icon_penginapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CariPenginapanFragment fragment = new CariPenginapanFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), fragment, "findThisFragment")
                        .addToBackStack(null).commit();
            }
        });
        icon_pelatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PelatihanFragment fragment = new PelatihanFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), fragment, "findThisFragment")
                        .addToBackStack(null).commit();
            }
        });
        icon_pemesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PemesananFragment fragment = new PemesananFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), fragment, "findThisFragment")
                        .addToBackStack(null).commit();
            }
        });
        icon_edukasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EdukasiFragment fragment = new EdukasiFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), fragment, "findThisFragment")
                        .addToBackStack(null).commit();
            }
        });
        icon_pendanaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PendanaanFragment fragment = new PendanaanFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), fragment, "findThisFragment")
                        .addToBackStack(null).commit();
            }
        });


        // after you've done all your manipulation, return your layout to be shown
        return view;
    }

//    @Override
//    public void onBackPressed() {
//        myAlert(getContext());
//    }
//    private void myAlert(Context context) {
//        new AlertDialog.Builder(context)
//                .setTitle("Keluar?")
//                .setMessage("Apakah yakin akan keluar aplikasi?")
//                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        System.exit(0);
//                    }
//                })
//                .setNegativeButton("Tidak", null)
//                .show();
//    }
}
