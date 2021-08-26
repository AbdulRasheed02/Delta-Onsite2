package com.example.deltaonsite2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class fragment2 extends Fragment {
    private SharedViewModel viewModel;
    private TextView tv_result,tv_resultText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment2, container, false);
        viewModel = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        tv_result=v.findViewById(R.id.tv_result);
        tv_resultText=v.findViewById(R.id.tv_textresult);
        tv_resultText.setText("Result");

        viewModel.item.observe(getActivity(), new Observer<String>(){
            @Override
            public void onChanged(@Nullable String updatedObject) {
                if (updatedObject != null) {
                    tv_result.setText(updatedObject);
                }
            }
        });

        return v;
    }
}