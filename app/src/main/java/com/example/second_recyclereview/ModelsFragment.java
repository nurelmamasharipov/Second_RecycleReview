package com.example.second_recyclereview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.second_recyclereview.databinding.FragmentModelsBinding;
import com.example.second_recyclereview.databinding.FragmentRecycleReviewBinding;

import java.util.ArrayList;

public class ModelsFragment extends Fragment {
    private FragmentModelsBinding binding;

    private ArrayList<Models> models = new ArrayList<>();

    private CarModelsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentModelsBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new CarModelsAdapter(models);
        binding.rvModels.setAdapter(adapter);
        if (data == "BMW") {
            loadDataBmw();
        } else if (data == "Mercedes") {
            loadDataMercedes();
        } else if (data == "Audi") {
            loadDataAudi();
        } else if (data == "Tesla") {
            loadDataTesla();
        } else if (data == "Ferrari") {
            loadDataFerrari();
        } else if (data == "Lamborghini") {
            loadDataLamborghini();
        }
    }
    String data = getArguments().getString("key");

    private void loadDataMercedes() {
        models.add(new Models("https://www.pinterest.com/pin/926897167057800571/", "Amg gt 63s", "2195","11.3 l", "63 675$"));
        models.add(new Models("https://www.pinterest.com/pin/926897167057800571/", "Amg gt 63s", "2195","11.3 l", "63 675$"));
        models.add(new Models("https://www.pinterest.com/pin/926897167057800571/", "Amg gt 63s", "2195","11.3 l", "63 675$"));
        models.add(new Models("https://www.pinterest.com/pin/926897167057800571/", "Amg gt 63s", "2195","11.3 l", "63 675$"));
        models.add(new Models("https://www.pinterest.com/pin/926897167057800571/", "Amg gt 63s", "2195","11.3 l", "63 675$"));
        models.add(new Models("https://www.pinterest.com/pin/926897167057800571/", "Amg gt 63s", "2195","11.3 l", "63 675$"));
        models.add(new Models("https://www.pinterest.com/pin/926897167057800571/", "Amg gt 63s", "2195","11.3 l", "63 675$"));
    }

    private void loadDataBmw() {
        models.add(new Models("https://www.pinterest.com/pin/572801646369409428/", "M4 Competion", "1815 kg", "8.8 l", "96544$"));
        models.add(new Models("https://www.pinterest.com/pin/572801646369409428/", "M4 Competion", "1815 kg", "8.8 l", "96544$"));
        models.add(new Models("https://www.pinterest.com/pin/572801646369409428/", "M4 Competion", "1815 kg", "8.8 l", "96544$"));
        models.add(new Models("https://www.pinterest.com/pin/572801646369409428/", "M4 Competion", "1815 kg", "8.8 l", "96544$"));
        models.add(new Models("https://www.pinterest.com/pin/572801646369409428/", "M4 Competion", "1815 kg", "8.8 l", "96544$"));
        models.add(new Models("https://www.pinterest.com/pin/572801646369409428/", "M4 Competion", "1815 kg", "8.8 l", "96544$"));
    }
    private void loadDataAudi() {
        models.add(new Models("https://www.pinterest.com/pin/303922674875854673/", "R8", "1525 kg", "12.9 l", "130000$"));
        models.add(new Models("https://www.pinterest.com/pin/303922674875854673/", "R8", "1525 kg", "12.9 l", "130000$"));
        models.add(new Models("https://www.pinterest.com/pin/303922674875854673/", "R8", "1525 kg", "12.9 l", "130000$"));
        models.add(new Models("https://www.pinterest.com/pin/303922674875854673/", "R8", "1525 kg", "12.9 l", "130000$"));    }
    private void loadDataTesla() {
        models.add(new Models("https://www.pinterest.com/pin/9851692929333703/", "Cyber Truck", "2700 kg", "250 кВт", "60990$"));
        models.add(new Models("https://www.pinterest.com/pin/9851692929333703/", "Cyber Truck", "2700 kg", "250 кВт", "60990$"));
        models.add(new Models("https://www.pinterest.com/pin/9851692929333703/", "Cyber Truck", "2700 kg", "250 кВт", "60990$"));
        models.add(new Models("https://www.pinterest.com/pin/9851692929333703/", "Cyber Truck", "2700 kg", "250 кВт", "60990$"));    }
    private void loadDataFerrari() {
        models.add(new Models("https://www.pinterest.com/pin/1028017052436000191/", "F40", "1235 kg", "12.6 l", "1500000$"));
        models.add(new Models("https://www.pinterest.com/pin/1028017052436000191/", "F40", "1235 kg", "12.6 l", "1500000$"));
        models.add(new Models("https://www.pinterest.com/pin/1028017052436000191/", "F40", "1235 kg", "12.6 l", "1500000$"));
        models.add(new Models("https://www.pinterest.com/pin/1028017052436000191/", "F40", "1235 kg", "12.6 l", "1500000$"));
        models.add(new Models("https://www.pinterest.com/pin/1028017052436000191/", "F40", "1235 kg", "12.6 l", "1500000$"));
        models.add(new Models("https://www.pinterest.com/pin/1028017052436000191/", "F40", "1235 kg", "12.6 l", "1500000$"));
    }
    private void loadDataLamborghini() {
        models.add(new Models("https://www.pinterest.com/pin/73605775150112312/", "Venero", "1490 kg", "15.7 l", "3800000$"));
        models.add(new Models("https://www.pinterest.com/pin/73605775150112312/", "Venero", "1490 kg", "15.7 l", "3800000$"));        models.add(new Models("https://www.pinterest.com/pin/572801646369409428/", "M4 Competion", "1815 kg", "8.8 l", "96544$"));
        models.add(new Models("https://www.pinterest.com/pin/73605775150112312/", "Venero", "1490 kg", "15.7 l", "3800000$"));        models.add(new Models("https://www.pinterest.com/pin/572801646369409428/", "M4 Competion", "1815 kg", "8.8 l", "96544$"));
        models.add(new Models("https://www.pinterest.com/pin/73605775150112312/", "Venero", "1490 kg", "15.7 l", "3800000$"));    }
}