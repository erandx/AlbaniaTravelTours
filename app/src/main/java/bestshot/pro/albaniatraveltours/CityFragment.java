package bestshot.pro.albaniatraveltours;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CityFragment extends Fragment {

    final public ArrayList<Albania> AlbaniaDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    private Context mContext;


    public CityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.albania_list, container, false);

        //ArrayList data
        AlbaniaDatabase.add(new Albania("Tirana", "Albania", getString(R.string.tirana_city_info), R.drawable.tirana1, R.drawable.ic_location,"https://goo.gl/maps/kb6iRJaQnkabpWVR8"));
        AlbaniaDatabase.add(new Albania("Berat", "Albania", getString(R.string.berat_city_info), R.drawable.berat, R.drawable.ic_location,"https://goo.gl/maps/rWSsEAV7P3rfUGNQA"));
        AlbaniaDatabase.add(new Albania("Durres", "Albania", getString(R.string.durres_city_info), R.drawable.durres, R.drawable.ic_location,"https://goo.gl/maps/S3g6S6gvUkuCxjWF9"));
        AlbaniaDatabase.add(new Albania("Gjirokaster", "Albania", getString(R.string.gjirokaster_city_info), R.drawable.gjirokaster, R.drawable.ic_location,"https://goo.gl/maps/ziNAwyi8sYQu81W46"));
        AlbaniaDatabase.add(new Albania("Kruja", "Albania", getString(R.string.kruja_city_info), R.drawable.kruja, R.drawable.ic_location,"https://goo.gl/maps/bk6eZV24RRugZno48"));
        AlbaniaDatabase.add(new Albania("Pogradec", "Albania", getString(R.string.pogradec_city_info), R.drawable.pogradec, R.drawable.ic_location,"https://goo.gl/maps/ycF4MqnpbiiUmPKs5"));
        AlbaniaDatabase.add(new Albania("Vlora", "Albania", getString(R.string.vlora_city_info), R.drawable.vlora,R.drawable.ic_location, "https://goo.gl/maps/SDrpV6BrzLxH13Yd9"));
        AlbaniaDatabase.add(new Albania("Saranda", "Albania", getString(R.string.saranda_city_info), R.drawable.saranda, R.drawable.ic_location,"https://goo.gl/maps/X49kY8zHn7NWGizD9"));
        AlbaniaDatabase.add(new Albania("Shkoder", "Albania", getString(R.string.shkoder_city_info), R.drawable.shkodra, R.drawable.ic_location,"https://goo.gl/maps/4r9FL8nx7J59zMGH9"));


        //Create a standard LinearLayout Manager to control how the recycler works
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        //Create an adapter based on the custom class we created
        AlbaniaAdapter adapter = new AlbaniaAdapter(mContext, AlbaniaDatabase);

        //Find your Recycler and set your layoutManger and adapter to it
        recyclerView = rootView.findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


        return rootView;

    }

}