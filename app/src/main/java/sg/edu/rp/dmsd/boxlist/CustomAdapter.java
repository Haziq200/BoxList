package sg.edu.rp.dmsd.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010603 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ImageColour> imageColours;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource,  objects);
        parent_context = context;
        layout_id = resource;
        imageColours = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View rowView = inflater.inflate(layout_id,parent,false);

        ImageView ivImpt = rowView.findViewById(R.id.imageViewColour);

        ImageColour currentColour = imageColours.get(position);
        if(currentColour.isColourBrown()){
            ivImpt.setImageResource(R.drawable.brown_box);
        }else if(currentColour.isColourOrange()){
            ivImpt.setImageResource(R.drawable.orange_box);
        }else{
            ivImpt.setImageResource(R.drawable.blue_box);
        }

        return rowView;
    }
}
