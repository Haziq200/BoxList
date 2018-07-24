package sg.edu.rp.dmsd.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColour;
    ArrayList<ImageColour> alColour;
    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.ListViewColour);

        alColour = new ArrayList<>();

        ImageColour colour1 = new ImageColour("","",true,false,false);
        ImageColour colour2 = new ImageColour("","",false,false,true);
        ImageColour colour3 = new ImageColour("","",false,true,false);
        alColour.add(colour1);
        alColour.add(colour2);
        alColour.add(colour3);

        caColour = new CustomAdapter(this,R.layout.image_colour,alColour);
        lvColour.setAdapter(caColour);
    }
}
