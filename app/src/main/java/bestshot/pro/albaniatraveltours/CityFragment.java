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
        AlbaniaDatabase.add(new Albania(getString(R.string.city_name_1), getString(R.string.city_name), getString(R.string.tirana_city_info), R.drawable.tirana1, R.drawable.ic_location,getString(R.string.city_name_1_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.city_name_2), getString(R.string.city_name), getString(R.string.berat_city_info), R.drawable.berat, R.drawable.ic_location,getString(R.string.city_name_2_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.city_name_3), getString(R.string.city_name), getString(R.string.durres_city_info), R.drawable.durres, R.drawable.ic_location,getString(R.string.city_name_3_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.city_name_4), getString(R.string.city_name), getString(R.string.gjirokaster_city_info), R.drawable.gjirokaster, R.drawable.ic_location,getString(R.string.city_name_4_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.city_name_5), getString(R.string.city_name), getString(R.string.kruja_city_info), R.drawable.kruja, R.drawable.ic_location,getString(R.string.city_name_5_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.city_name_6), getString(R.string.city_name), getString(R.string.pogradec_city_info), R.drawable.pogradec, R.drawable.ic_location,getString(R.string.city_name_6_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.city_name_7), getString(R.string.city_name), getString(R.string.vlora_city_info), R.drawable.vlora,R.drawable.ic_location, getString(R.string.city_name_7_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.city_name_8), getString(R.string.city_name), getString(R.string.saranda_city_info), R.drawable.saranda, R.drawable.ic_location,getString(R.string.city_name_8_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.city_name_9), getString(R.string.city_name), getString(R.string.shkoder_city_info), R.drawable.shkodra, R.drawable.ic_location,getString(R.string.city_name_9_map)));


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