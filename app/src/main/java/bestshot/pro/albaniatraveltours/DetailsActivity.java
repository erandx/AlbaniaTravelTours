package bestshot.pro.albaniatraveltours;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class DetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get the intent that was used to start this activity
        Intent albaniaDetailsIntent = getIntent();

        final String link = albaniaDetailsIntent.getStringExtra("LINK");
        // Find the views on the play.xml
        TextView placeTextView = findViewById(R.id.albania_text_view);
        TextView infoTextView = findViewById(R.id.info_text_view);
        TextView infoLocationTextView = findViewById(R.id.location_info);
        ImageView placeImageView = findViewById(R.id.albania_image);
        ImageView mapImageView = findViewById(R.id.place_map);


        //Sets the views from the intent
        placeTextView.setText(albaniaDetailsIntent.getStringExtra("PLACE"));
        infoTextView.setText(albaniaDetailsIntent.getStringExtra("INFO"));
        infoLocationTextView.setText(albaniaDetailsIntent.getStringExtra("LOCATION_INFO"));
        placeImageView.setImageResource(albaniaDetailsIntent.getIntExtra("PICTURE", 0));
        mapImageView.setImageResource(albaniaDetailsIntent.getIntExtra("MAP", 0));

        // Launch website in browser when url button is clicked
        findViewById(R.id.agency_website).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.traditionandadventure.com/");

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(String.valueOf(uri)));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        // Launch maps when map button is clicked
        findViewById(R.id.place_map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri mapUri = Uri.parse(link);

                Intent intent = new Intent(Intent.ACTION_VIEW, mapUri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }

}