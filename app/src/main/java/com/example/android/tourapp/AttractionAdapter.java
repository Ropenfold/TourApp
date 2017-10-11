package com.example.android.tourapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.media.AudioManager.AUDIOFOCUS_GAIN;
import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT;
import static android.media.AudioManager.STREAM_MUSIC;

/**
 * Created by Stuart on 15/09/2017.
 */

public class AttractionAdapter extends ArrayAdapter {
    private static final String LOG_TAG = AttractionAdapter.class.getSimpleName();
    private int mColorResourceID;

    Context mContext;
    TextView audioDescriptionTextView;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context     The current context. Used to inflate the layout file.
     * @param attractions A List of AndroidFlavor objects to display in a list
     */
    public AttractionAdapter(Context context, ArrayList<Attraction> attractions, int colorResourceID) {
        super(context, 0, attractions);
        mContext = context;
        mColorResourceID = colorResourceID;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link currentAttraction} object located at this position in the list
        final Attraction currentAttraction = (Attraction) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        // Get the version name from the current Attraction object and
        // set this text on the name TextView
        nameTextView.setText(currentAttraction.getAttractionName());

        ImageView imagePointer = (ImageView) listItemView.findViewById(R.id.address_pointer);

        imagePointer.setImageResource(R.mipmap.iconpointer);

        imagePointer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("attraction Address", "The address is: " + currentAttraction.getAddress());

                double latitude = currentAttraction.getLatitude();
                double longitude = currentAttraction.getLongtitude();
                String name = currentAttraction.getAttractionName();

                Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr="+ latitude+ "," + longitude));
                mContext.startActivity(intent);

            }
        });

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView attractionAddress = (TextView) listItemView.findViewById(R.id.attraction_address);
        // Get the version number from the current Attraction object and
        // set this text on the number TextView
        attractionAddress.setText(currentAttraction.getAddress());

        attractionAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("attraction Address", "The address is: " + currentAttraction.getAddress());

                double latitude = currentAttraction.getLatitude();
                double longitude = currentAttraction.getLongtitude();
                String name = currentAttraction.getAttractionName();

                Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr="+ latitude+ "," + longitude));
                mContext.startActivity(intent);
            }
        });

        TextView attractionURL = (TextView) listItemView.findViewById(R.id.attraction_URL);

        if (currentAttraction.hasURL()) {

            attractionURL.setText("Website");

            //make the image view visible
            attractionURL.setVisibility(View.VISIBLE);
        } else {
            attractionURL.setVisibility(View.GONE);
        }

        attractionURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Web Address", "The web address is: " + currentAttraction.getWebsiteAddress());


                //it works
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(currentAttraction.getWebsiteAddress()));
                mContext.startActivity(intent);


            }

        });

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView attractionView = (ImageView) listItemView.findViewById(R.id.attraction_photo);
        // Get the image resource ID from the current currentAttraction object and
        // set the image to iconView

        //get the imageResource get and set it as source of the image view
        attractionView.setImageResource(currentAttraction.getImageResourceID());

        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        //find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);

        //set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


    @Override
    public boolean isEnabled(int position) {

            return false;
        }

}



