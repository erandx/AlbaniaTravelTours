package bestshot.pro.albaniatraveltours;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AlbaniaAdapter extends RecyclerView.Adapter<AlbaniaAdapter.AlbaniaHolder> {
    private LayoutInflater layoutInflater;
    private ArrayList<Albania> AlbaniaDatabase;


    //Method for the recycler
    public AlbaniaAdapter(Context context, ArrayList<Albania> AlbaniaDatabase) {
        this.layoutInflater = LayoutInflater.from(context);
        this.AlbaniaDatabase = AlbaniaDatabase;


    }

    @NonNull
    @Override
    public AlbaniaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new AlbaniaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbaniaHolder holder, int position) {
        //get the object located at position
        final Albania currentAlbania = AlbaniaDatabase.get(position);

        holder.placeTitle.setText(currentAlbania.getmPlaceName());
        holder.placeLocation.setText(currentAlbania.getmPlaceInfo());
        holder.placeImage.setImageResource(currentAlbania.getmPlaceImage());


        //Sets OnClick listener that goes to the details page for each category

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent albaniaDetailsIntent = new Intent(view.getContext(), DetailsActivity.class);
                // Add the Place name, Info and picture to the intent sent to Albania

                albaniaDetailsIntent.putExtra("PLACE", currentAlbania.getmPlaceName());
                albaniaDetailsIntent.putExtra("INFO", currentAlbania.getmPlaceInfo());
                albaniaDetailsIntent.putExtra("PICTURE", currentAlbania.getmPlaceImage());
                albaniaDetailsIntent.putExtra("LOCATION_INFO", currentAlbania.getmLocationInfo());
                albaniaDetailsIntent.putExtra("MAP", currentAlbania.getmCityMap());
                albaniaDetailsIntent.putExtra("LINK", currentAlbania.getLink());
                view.getContext().startActivity(albaniaDetailsIntent);


            }
        });

    }
    //Array data. Bind to a layout view

    //Returns your Array size
    @Override
    public int getItemCount() {
        return AlbaniaDatabase.size();
    }


    //Custom holder for our ID
    class AlbaniaHolder extends RecyclerView.ViewHolder {
        private TextView placeTitle;
        private TextView placeLocation;
        private ImageView placeImage;

        private AlbaniaHolder(View albaniaView) {
            super(albaniaView);
            placeTitle = albaniaView.findViewById(R.id.albania_text_view);
            placeLocation = albaniaView.findViewById(R.id.info_text_view);
            placeImage = albaniaView.findViewById(R.id.albania_image);
        }
    }


}
