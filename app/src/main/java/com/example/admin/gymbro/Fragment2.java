package com.example.admin.gymbro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2 extends Fragment { public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
    ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment2,container,false);

    Button button=(Button) rootView.findViewById(R.id.gymtime);
    button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent i = new Intent(getActivity(),GymTime.class);
            startActivity(i);
        }
    });


    return rootView;
}
}

