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
        AlbaniaDatabase.add(new Albania("Hotel Rogner", "Tirana", getString(R.string.tirana__hotel_rogner_info), R.drawable.hotel_rogner, R.drawable.ic_location,"https://goo.gl/maps/Etv4PrkmXF2Vm5LQ8"));
        AlbaniaDatabase.add(new Albania("Hotel Mangalemi", "Berat", getString(R.string.berat__hotel_mangalemi_info), R.drawable.hotel_mangalemi, R.drawable.ic_location,"https://goo.gl/maps/FPQ2wR6qe3VzDrUu9"));
        AlbaniaDatabase.add(new Albania("Hotel Ylli i Detit", "Durres", getString(R.string.durres__hotel_ylli_i_detit_info), R.drawable.hotel_ylli_i_detit, R.drawable.ic_location,"https://goo.gl/maps/5MriBW9tPYhcMgNi6"));
        AlbaniaDatabase.add(new Albania("Hotel Gjirokastra", "Gjirokaster", getString(R.string.gjirokaster__hotel_gjirokastra_info), R.drawable.hotel_gjirokastra, R.drawable.ic_location,"https://goo.gl/maps/k8tEKfCExCoRzANT9"));
        AlbaniaDatabase.add(new Albania("Hotel Panorama", "Kruja", getString(R.string.kruja_hotel_panorama_info), R.drawable.hotel_panorama, R.drawable.ic_location,"https://goo.gl/maps/8M8mkN4ibozhnZNw8"));
        AlbaniaDatabase.add(new Albania("Hotel Perla", "Pogradec", getString(R.string.pogradec__hotel_perla_info), R.drawable.hotel_perla, R.drawable.ic_location,"https://goo.gl/maps/oQ6twYWLE2W3ZBPb6"));
        AlbaniaDatabase.add(new Albania("Hotel Regina", "Vlora", getString(R.string.vlora_hotel_regina_info), R.drawable.hotel_regina, R.drawable.ic_location,"https://goo.gl/maps/fQJBoMYw5gL7TNCu6"));
        AlbaniaDatabase.add(new Albania("Hotel Brilant", "Saranda", getString(R.string.saranda_hotel_brilant_info), R.drawable.hotel_brilant, R.drawable.ic_location,"https://goo.gl/maps/get2PS64YnHi84xr9"));
        AlbaniaDatabase.add(new Albania("Hotel Tradita", "Shkoder", getString(R.string.shkoder_hotel_tradita_info), R.drawable.hotel_tradita, R.drawable.ic_location,"https://goo.gl/maps/N3UXwyDy6jso1NLa8"));

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
