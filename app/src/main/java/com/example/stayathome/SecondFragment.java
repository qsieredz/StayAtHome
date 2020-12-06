package com.example.stayathome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_second, container, false);
        ImageView imgExample = (ImageView) view.findViewById(R.id.imageViewer);

        // FIXME: Global Variable for time
        int days = 15;

        if (days > 31)
            days = 31;
        if (days < 0)
            days = 0;

        // FIXME: Fix images
        switch (days) {
            case 1:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 2:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 3:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 4:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 5:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 6:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 7:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 8:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 9:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 10:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 11:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 12:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 13:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 14:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 15:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 16:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 17:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 18:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 19:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 20:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 21:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 23:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 24:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 25:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 26:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 27:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 28:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 29:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 30:
                imgExample.setImageResource(R.drawable.starone);
                break;
            case 31:
                imgExample.setImageResource(R.drawable.starone);
                break;
            default:
                imgExample.setImageResource(R.drawable.starone);
        }
        if (days <= 8) {
            imgExample.setImageResource(R.drawable.starone);
        }
        else if (days <= 16){
            imgExample.setImageResource(R.drawable.startwo);
        }
        else {
            imgExample.setImageResource(R.drawable.starthree);
        }


        // Displays the amount of hours
        String totalAmountOfDays = Integer.toString(days);
        String ending = " Total Days";
        if (days == 1)
            ending = " Total Day";
        TextView text = (TextView) view.findViewById(R.id.textview_Progress);
        text.setText(totalAmountOfDays + ending);

        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }
}