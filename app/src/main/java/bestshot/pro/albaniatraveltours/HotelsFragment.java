package bestshot.pro.albaniatraveltours;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    final public ArrayList<Albania> AlbaniaDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    private Context mContext;

    public HotelsFragment() {
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
        AlbaniaDatabase.add(new Albania(getString(R.string.hotel_name_1), getString(R.string.city_name_1), getString(R.string.tirana__hotel_rogner_info), R.drawable.hotel_rogner, R.drawable.ic_location,getString(R.string.hotel_name_1_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.hotel_name_2), getString(R.string.city_name_2), getString(R.string.berat__hotel_mangalemi_info), R.drawable.hotel_mangalemi, R.drawable.ic_location,getString(R.string.hotel_name_2_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.hotel_name_3), getString(R.string.city_name_3), getString(R.string.durres__hotel_ylli_i_detit_info), R.drawable.hotel_ylli_i_detit, R.drawable.ic_location,getString(R.string.hotel_name_3_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.hotel_name_4), getString(R.string.city_name_4), getString(R.string.gjirokaster__hotel_gjirokastra_info), R.drawable.hotel_gjirokastra, R.drawable.ic_location,getString(R.string.hotel_name_4_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.hotel_name_5), getString(R.string.city_name_5), getString(R.string.kruja_hotel_panorama_info), R.drawable.hotel_panorama, R.drawable.ic_location,getString(R.string.hotel_name_5_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.hotel_name_6), getString(R.string.city_name_6), getString(R.string.pogradec__hotel_perla_info), R.drawable.hotel_perla, R.drawable.ic_location,getString(R.string.hotel_name_6_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.hotel_name_7), getString(R.string.city_name_7), getString(R.string.vlora_hotel_regina_info), R.drawable.hotel_regina, R.drawable.ic_location,getString(R.string.hotel_name_7_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.hotel_name_8), getString(R.string.city_name_8), getString(R.string.saranda_hotel_brilant_info), R.drawable.hotel_brilant, R.drawable.ic_location,getString(R.string.hotel_name_8_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.hotel_name_9), getString(R.string.city_name_9), getString(R.string.shkoder_hotel_tradita_info), R.drawable.hotel_tradita, R.drawable.ic_location,getString(R.string.hotel_name_9_map)));

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
