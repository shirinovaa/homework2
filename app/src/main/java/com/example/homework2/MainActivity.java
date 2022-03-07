package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework2.adapter.UserNameAdapter;
import com.example.homework2.data.UserData;
import com.example.homework2.databinding.ActivityMainBinding;
import com.example.homework2.model.UserModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private UserNameAdapter userNameAdapter;
    private ActivityMainBinding binding;
    private ArrayList<UserModel> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialisation();

    }

    private void initialisation() {
        names = UserData.getNames();
        userNameAdapter = new UserNameAdapter(names);
        binding.recycler.setAdapter(userNameAdapter);
    }


}