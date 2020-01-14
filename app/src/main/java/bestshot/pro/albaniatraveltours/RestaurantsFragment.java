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
public class RestaurantsFragment extends Fragment {


    final public ArrayList<Albania> AlbaniaDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    private Context mContext;

    public RestaurantsFragment() {
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
        AlbaniaDatabase.add(new Albania(getString(R.string.restaurant_1), getString(R.string.city_name_1), getString(R.string.tirana_restaurant_bujtina_e_gjelit), R.drawable.restorant_bujtina_e_gjelit,R.drawable.ic_location, getString(R.string.restaurant_1_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.restaurant_2), getString(R.string.city_name_2), getString(R.string.berat__hotel_mangalemi_info), R.drawable.hotel_mangalemi, R.drawable.ic_location,getString(R.string.restaurant_2_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.restaurant_3), getString(R.string.city_name_3), getString(R.string.durres_restaurant_rifat_peshkatari), R.drawable.restorant_rifat_peshkatari, R.drawable.ic_location, getString(R.string.restaurant_3_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.restaurant_4), getString(R.string.city_name_4), getString(R.string.gjirokaster_restaurant_taverna_tradicionale), R.drawable.restorant_taverna_tradicionale, R.drawable.ic_location,getString(R.string.restaurant_4_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.restaurant_5), getString(R.string.city_name_5), getString(R.string.kruje_restaurant_bardhi), R.drawable.restorant_bardhi, R.drawable.ic_location,getString(R.string.restaurant_5_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.restaurant_6), getString(R.string.city_name_6), getString(R.string.pogradec_restaurant_rosa_e_tymosur), R.drawable.restorant_rosa_e_tymosur,R.drawable.ic_location, getString(R.string.restaurant_6_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.restaurant_7), getString(R.string.city_name_7), getString(R.string.berat_city_info), R.drawable.restorant_joni, R.drawable.ic_location,getString(R.string.restaurant_7_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.restaurant_8), getString(R.string.city_name_8), getString(R.string.saranda_restaurant_demi), R.drawable.restorant_demi, R.drawable.ic_location,getString(R.string.restaurant_8_map)));
        AlbaniaDatabase.add(new Albania(getString(R.string.restaurant_9), getString(R.string.city_name_9), getString(R.string.shkoder_hotel_tradita_info), R.drawable.hotel_tradita, R.drawable.ic_location,getString(R.string.restaurant_9_map)));

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
