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


public class RecycleReviewFragment extends Fragment {
    private FragmentRecycleReviewBinding binding;

    private ArrayList<Contacts> contacts = new ArrayList<>();

    private ContactAdapter adapter;


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
        adapter = new ContactAdapter(contacts);
        binding.rvSecond.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        contacts.add(new Contacts("Johan", "play chess", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Contacts("Alex", "love eating", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Contacts("Jake", "play football", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Contacts("William", "very smart", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Contacts("James", "cooking", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Contacts("Liam", "like donats", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Contacts("John", "very strong", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
    }
}