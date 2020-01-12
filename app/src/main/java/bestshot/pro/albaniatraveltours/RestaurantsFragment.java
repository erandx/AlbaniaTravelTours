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
        AlbaniaDatabase.add(new Albania("Bujtina Gjelit", "City: Tirana", getString(R.string.tirana_restaurant_bujtina_e_gjelit), R.drawable.restorant_bujtina_e_gjelit,R.drawable.ic_location, "https://g.page/Gjeli?share"));
        AlbaniaDatabase.add(new Albania("Restorant Mangalemi", "City: Berat", getString(R.string.berat__hotel_mangalemi_info), R.drawable.hotel_mangalemi, R.drawable.ic_location,"https://goo.gl/maps/FPQ2wR6qe3VzDrUu9"));
        AlbaniaDatabase.add(new Albania("Rifat Peshkatari", "City: Durres", getString(R.string.durres_restaurant_rifat_peshkatari), R.drawable.restorant_rifat_peshkatari, R.drawable.ic_location,"https://goo.gl/maps/m1QbXEe6wcSBg6WU7"));
        AlbaniaDatabase.add(new Albania("Taverna Tradicionale", "City: Gjirokaster", getString(R.string.gjirokaster_restaurant_taverna_tradicionale), R.drawable.restorant_taverna_tradicionale, R.drawable.ic_location,"https://goo.gl/maps/EKbYHRFjYgTE7vFN9"));
        AlbaniaDatabase.add(new Albania("Restorant Bardhi", "City: Kruja", getString(R.string.kruje_restaurant_bardhi), R.drawable.restorant_bardhi, R.drawable.ic_location,"https://goo.gl/maps/enKe1bUAzYsyRmQz5"));
        AlbaniaDatabase.add(new Albania("Rosa e Tymosur", "City: Pogradec", getString(R.string.pogradec_restaurant_rosa_e_tymosur), R.drawable.restorant_rosa_e_tymosur,R.drawable.ic_location, "https://goo.gl/maps/1MMqV3PaADfNrzwe6"));
        AlbaniaDatabase.add(new Albania("Restorant Joni", "City: Vlora", getString(R.string.berat_city_info), R.drawable.restorant_joni, R.drawable.ic_location,"https://goo.gl/maps/HkUeJigMwDAHrRUE8"));
        AlbaniaDatabase.add(new Albania("Restorant Demi", "City: Saranda", getString(R.string.saranda_restaurant_demi), R.drawable.restorant_demi, R.drawable.ic_location,"https://goo.gl/maps/4D56WnZr1TTz8ouN6"));
        AlbaniaDatabase.add(new Albania("Restorant Tradita", "City: Shkoder", getString(R.string.shkoder_hotel_tradita_info), R.drawable.hotel_tradita, R.drawable.ic_location,"https://goo.gl/maps/N3UXwyDy6jso1NLa8"));

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
