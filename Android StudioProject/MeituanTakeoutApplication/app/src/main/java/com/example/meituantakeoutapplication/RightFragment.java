package com.example.meituantakeoutapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.List;

public class RightFragment extends Fragment {
    private ListView lv_list;
    public RightFragment(){

    }
    public  RightFragment getInstance(List<FoodsBean> list){
        RightFragment rightFragment=new RightFragment();
        Bundle bundle=new Bundle();
        bundle.putSerializable("list", (Serializable) list);
        rightFragment.setArguments(bundle);
        return  rightFragment;
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_right,container,false);
        lv_list=view.findViewById(R.id.lv_list);
        if(getArguments()!=null){
            List<FoodsBean> list= (List<FoodsBean>) getArguments().getSerializable("list");
            RightAdapter adapter=new RightAdapter(getActivity(),list);
            lv_list.setAdapter(adapter);
        }
        return  view;
    }

}
