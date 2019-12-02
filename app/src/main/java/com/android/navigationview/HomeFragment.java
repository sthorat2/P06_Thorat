package com.android.navigationview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment implements View.OnClickListener{

    Context context;
    Button bonsai;
    Button cac;
    Button succ;
    Button cont;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home,container, false);
        context = rootView.getContext();


        Button bonsai =(Button) rootView.findViewById(R.id.button1);
        Button cac =(Button) rootView.findViewById(R.id.button2);
        Button succ =(Button) rootView.findViewById(R.id.button3);
        Button cont =(Button)rootView.findViewById(R.id.button4) ;

        bonsai.setOnClickListener(this);
        cac.setOnClickListener(this);
        succ.setOnClickListener(this);


        return rootView;
    }




    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button1:

                Intent i = new Intent(context, bonsai.class);
                startActivity(i);
                break;

            case R.id.button2:

                Intent j = new Intent(context, cactus.class);
                startActivity(j);
                break;

            case R.id.button3:

                Intent k = new Intent(context, succulents.class);
                startActivity(k);
                break;

            case R.id.button4:

                Intent l = new Intent(context, contact.class);
                startActivity(l);
                break;





        }

    }
}
