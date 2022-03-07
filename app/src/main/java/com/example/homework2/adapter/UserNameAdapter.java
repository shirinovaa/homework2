package com.example.homework2.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework2.databinding.ListHolderBinding;
import com.example.homework2.model.UserModel;

import java.util.ArrayList;

public class UserNameAdapter extends RecyclerView.Adapter<UserNameAdapter.UserHolder> {
    ArrayList<UserModel> names;

    public UserNameAdapter(ArrayList<UserModel> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserHolder(ListHolderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }



    @Override
    public void onBindViewHolder(@NonNull UserNameAdapter.UserHolder holder, int position) {
        holder.onBind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        ListHolderBinding binding;

        public UserHolder(@NonNull ListHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(UserModel userModel) {
            binding.tvValue.setText(userModel.getName());

        }
    }
}