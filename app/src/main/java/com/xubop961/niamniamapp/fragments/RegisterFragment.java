package com.xubop961.niamniamapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.xubop961.niamniamapp.R;

import org.jetbrains.annotations.Nullable;

public class RegisterFragment  extends Fragment {
    public RegisterFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedIndtancesState){
        return inflater.inflate(R.layout.fragment_register, container, false);
    }
}
