package com.goprojectstudio.pesonajateng;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CariTransportasiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CariTransportasiFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CariTransportasiFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CariTransportasiFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CariTransportasiFragment newInstance(String param1, String param2) {
        CariTransportasiFragment fragment = new CariTransportasiFragment();
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
//        return inflater.inflate(R.layout.fragment_cari_transportasi, container, false);

        View view = getLayoutInflater().inflate(R.layout.fragment_pemesanan,
                container, false);


        ImageButton btn_cari, btn_cari_penginapan;
        btn_cari = view.findViewById(R.id.btn_cari);
        btn_cari_penginapan = view.findViewById(R.id.btn_cari_penginapan);
        btn_cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListTransportasiFragment fragment = new ListTransportasiFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), fragment, "findThisFragment")
                        .addToBackStack(null).commit();
            }
        });
        btn_cari_penginapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CariPenginapanFragment fragment = new CariPenginapanFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), fragment, "findThisFragment")
                        .commit();
            }
        });

        return view;
    }
}
