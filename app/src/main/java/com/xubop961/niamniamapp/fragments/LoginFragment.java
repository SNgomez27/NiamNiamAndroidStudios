package com.xubop961.niamniamapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.xubop961.niamniamapp.R;

import org.jetbrains.annotations.Nullable;

public class LoginFragment  extends Fragment {
    public LoginFragment (){}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

}
