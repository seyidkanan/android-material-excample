package az.kanan.materialshowcase.fragments;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import az.kanan.materialshowcase.R;
import az.kanan.materialshowcase.models.Car;
import az.kanan.materialshowcase.util.RVAdapter;

public class RVFragment extends Fragment {

    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_third, null);

        recyclerView = (RecyclerView) v.findViewById(R.id.recycle_view);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(llm);

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("bmw", "m5", "car"));
        carList.add(new Car("bmw", "m3", "car"));
        carList.add(new Car("bmw", "m4", "car"));
        carList.add(new Car("bmw", "m2", "car"));
        carList.add(new Car("bmw", "m", "car"));
        carList.add(new Car("bmw", "l1", "car"));
        carList.add(new Car("nissan", "sunny", "car"));
        carList.add(new Car("mercedes", "sls", "car"));
        carList.add(new Car("mercedes", "slk", "car"));
        carList.add(new Car("mercedes", "slr", "car"));
        carList.add(new Car("mercedes", "190", "car"));
        carList.add(new Car("toyoto", "prado", "car"));
        carList.add(new Car("toyoto", "camry", "car"));
        carList.add(new Car("toyoto", "corolla", "car"));
        carList.add(new Car("tesla", "x", "car"));
        carList.add(new Car("tesla", "3", "car"));
        carList.add(new Car("tesla", "s", "car"));

        recyclerView.setAdapter(new RVAdapter(carList));

        return v;
    }

}
