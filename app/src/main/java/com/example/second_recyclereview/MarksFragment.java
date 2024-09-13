package com.example.second_recyclereview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.second_recyclereview.databinding.FragmentRecycleReviewBinding;

import java.util.ArrayList;


public class MarksFragment extends Fragment implements OnItemClick {
    private FragmentRecycleReviewBinding binding;

    private ArrayList<Marks> marks = new ArrayList<>();

    private CarMarksAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRecycleReviewBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new CarMarksAdapter(marks, this);
        binding.rvSecond.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        marks.add(new Marks("BMW", "https://www.google.com/imgres?q=bmw%20logo&imgurl=https%3A%2F%2Fi.pinimg.com%2Foriginals%2F76%2F43%2F8a%2F76438aa6935c40af8abba922aea42013.png&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F722124121486472788%2F&docid=gO_B5k7XUhdcyM&tbnid=fCGrSkYSG_uLgM&vet=12ahUKEwipubXHo7uIAxUGJRAIHcUnB90QM3oECFoQAA..i&w=600&h=900&hcb=2&ved=2ahUKEwipubXHo7uIAxUGJRAIHcUnB90QM3oECFoQAA"));
        marks.add(new Marks("Mercedes", "https://www.google.com/imgres?q=mercedes%20logo&imgurl=https%3A%2F%2Fi.pinimg.com%2Foriginals%2Fb9%2F2b%2Ff1%2Fb92bf19612e524ac1f9d5e998770eba7.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F304555993545324673%2F&docid=1IzZDxdvf39kkM&tbnid=wKq9uXPq69vkIM&vet=12ahUKEwiR5PXuo7uIAxWbU1UIHQj5CpQQM3oECB0QAA..i&w=5000&h=4444&hcb=2&ved=2ahUKEwiR5PXuo7uIAxWbU1UIHQj5CpQQM3oECB0QAA"));
        marks.add(new Marks("Audi", "https://www.google.com/imgres?q=audi%20logo%20with%20black%20background%20in%20square&imgurl=https%3A%2F%2Fi.pinimg.com%2F736x%2F14%2Fff%2Ff8%2F14fff8ee9be6ac46215edddf9d0685d4.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fpin%2Faudi-usa-on-twitter--715227984544273188%2F&docid=Mw6QwQ0no_4MFM&tbnid=m0uNqAd2___vaM&vet=12ahUKEwj3w8eXpLuIAxXOFxAIHctpBg0QM3oECBAQAA..i&w=400&h=400&hcb=2&ved=2ahUKEwj3w8eXpLuIAxXOFxAIHctpBg0QM3oECBAQAA"));
        marks.add(new Marks("Tesla", "https://www.pinterest.com/pin/302093087497797021/"));
        marks.add(new Marks("Ferrari", "https://www.pinterest.com/pin/59039445110065587/"));
        marks.add(new Marks("Lamborghini", "https://www.pinterest.com/pin/579908889549763411/"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putString("key", marks.get(position).getName());
        ModelsFragment modelsFragment = new ModelsFragment();
        modelsFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, modelsFragment).addToBackStack(null).commit();
    }
}