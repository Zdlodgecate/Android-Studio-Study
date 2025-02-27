package com.example.application102;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentPage1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page1, container, false);
        TextView textView = view.findViewById(R.id.fragment_text);
        textView.setText("页面一");
        textView.setTextColor(Color.WHITE);
        view.setBackgroundColor(Color.parseColor("#ff2277"));
        return view;
    }
}

