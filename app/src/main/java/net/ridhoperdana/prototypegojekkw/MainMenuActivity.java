package net.ridhoperdana.prototypegojekkw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import android.view.View;

import java.io.File;


public class MainMenuActivity extends AppCompatActivity {

    static final LatLng TutorialsPoint = new LatLng(-7.2796472 , 112.7976606);
    private GoogleMap googleMap;
    private static final int REQUEST_PATH = 1;
    String curFileName;
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button tombolKirim = (Button)findViewById(R.id.sendRequest);

        try {
            if (googleMap == null) {
                ((MapFragment) getFragmentManager().
                        findFragmentById(R.id.map)).getMap();
            googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            Marker TP = googleMap.addMarker(new MarkerOptions().
                    position(TutorialsPoint).title("TutorialsPoint"));
        }}
        catch (Exception e) {
            e.printStackTrace();
        }

        tombolKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this, MainMenuUserActivity.class);
                //intent.putExtra(RegisterActivity.KEY_EXTRA, yourDataObject);
                startActivity(intent);
            }
        });
    }

        public void getfile(View view){
            Intent intent1 = new Intent(this, FilePicker.class);
            startActivityForResult(intent1,REQUEST_PATH);
        }
        // Listen for results.
        protected void onActivityResult(int requestCode, int resultCode, Intent data){
            // See which child activity is calling us back.
            if (requestCode == REQUEST_PATH){
                if (resultCode == RESULT_OK) {
                    curFileName = data.getStringExtra("GetFileName");
                    edittext.setText(curFileName);
                }
            }
        }
}
