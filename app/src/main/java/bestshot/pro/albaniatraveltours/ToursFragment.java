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
public class ToursFragment extends Fragment {

    final public ArrayList<Albania> AlbaniaDatabase = new ArrayList<>();
    RecyclerView recyclerView;


    private Context mContext;

    public ToursFragment() {
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
        AlbaniaDatabase.add(new Albania("Tirana City Break", "3 nights / 4 days", getString(R.string.tour_info), R.drawable.tirana_city_break));
        AlbaniaDatabase.add(new Albania("Fly and drive Albania", "10 nights/11 days", getString(R.string.tour_info), R.drawable.fly_and_drive_albania));
        AlbaniaDatabase.add(new Albania("Albania Culture and Heritage", "7 nights / 8 days", getString(R.string.tour_info), R.drawable.albania_culture_and_heritage));
        AlbaniaDatabase.add(new Albania("Explore Albania", "5 nights / 6 days", getString(R.string.tour_info), R.drawable.explore_albania));
        AlbaniaDatabase.add(new Albania("Albania Trekking Tour", "10 nights/11 days", getString(R.string.tour_info), R.drawable.albania_trekking_tour));
        AlbaniaDatabase.add(new Albania("Saranda weekend break from Corfu", "2 nights / 3 days", getString(R.string.tour_info), R.drawable.saranda_weekend_break));
        AlbaniaDatabase.add(new Albania("ALBANIA, MACEDONIA, KOSOVO", "Balkan in 12 days", getString(R.string.tour_info), R.drawable.albania_macedonia_kosovo));
        AlbaniaDatabase.add(new Albania("Albania Culinary Delights", "7 nights / 8 days", getString(R.string.tour_info), R.drawable.discover_albania));


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
