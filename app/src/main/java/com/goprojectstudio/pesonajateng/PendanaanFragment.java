package com.goprojectstudio.pesonajateng;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PendanaanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PendanaanFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PendanaanFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PendanaanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PendanaanFragment newInstance(String param1, String param2) {
        PendanaanFragment fragment = new PendanaanFragment();
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
//        return inflater.inflate(R.layout.fragment_pendanaan, container, false);

        View view = getLayoutInflater().inflate(R.layout.fragment_pendanaan,
                container, false);

        ImageButton btn_pendanaan;
        btn_pendanaan = view.findViewById(R.id.btn_pendanaan);
        btn_pendanaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MulaiMendanaiFragment fragment = new MulaiMendanaiFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), fragment, "findThisFragment")
                        .addToBackStack(null).commit();
            }
        });

        Button btn_back;
        btn_back = view.findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        return view;
    }
}
