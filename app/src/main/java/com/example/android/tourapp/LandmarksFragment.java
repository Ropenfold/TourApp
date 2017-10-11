package com.example.android.tourapp;


import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.media.AudioManager.AUDIOFOCUS_GAIN;
import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT;
import static android.media.AudioManager.STREAM_MUSIC;

/**
 * A simple {@link Fragment} subclass.
 */
public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //ArrayList for the attractions
        final ArrayList <Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction("Aston Hall", "Aston Hall Trinity Road | Aston, Birmingham B6 6JD, England", "http://www.birminghammuseums.org.uk/aston", R.drawable.astonhall,  52.506495, -1.884516 ));
        attractions.add(new Attraction("Rotunda", "New St., Birmingham B2 4PA, England", R.drawable.rotunda, 52.478293, -1.895490 ));
        attractions.add(new Attraction("Back to Backs","50 - 54 Inge St / 55 - 63 Hurst St, Birmingham B5 4TE, England", "https://www.nationaltrust.org.uk/birmingham-back-to-backs", R.drawable.backtobacks, 52.474289, -1.897079 ));
        attractions.add(new Attraction("Botanical Gardens", "Westbourne Road | Edgbaston, Birmingham B15 3TR, England", "http://www.birminghambotanicalgardens.org.uk/", R.drawable.botanicalgardens, 52.467226, -1.929562));
        attractions.add(new Attraction("Bullring", "Bullring Shopping Centre, Birmingham B5 4BU, England", "https://www.bullring.co.uk/",R.drawable.bullring, 52.477157, -1.895538 ));
        attractions.add(new Attraction("Cadbury World", "84 Linden Road | Bournville, Birmingham B30 1LA, England", "https://www.cadburyworld.co.uk/", R.drawable.cadburyworld, 52.430171, -1.932170));
        attractions.add(new Attraction("Library of Birmingham", "Library of Birmingham 4 Centenary Square | Broad Street, Birmingham B1 2ND, England", "http://www.libraryofbirmingham.com/", R.drawable.centrallibrary,  52.479741, -1.908484));
        attractions.add(new Attraction("Hall of Memory", "Centenary Sq., Birmingham B1 2DY, England", "http://www.hallofmemory.co.uk/", R.drawable.hallofmemory,  52.479440, -1.907059));
        attractions.add(new Attraction("The Mailbox", "Wharfside Street, Birmingham B1 1RD, England", "https://www.mailboxlife.com/", R.drawable.mailbox,  52.475978, -1.904934));
        attractions.add(new Attraction("Birmingham Wildlife Conservation Park", "Pershore Road | Edgbaston, Birmingham B5 7RL, England", "https://www.birmingham.gov.uk/info/50042/birmingham_wildlife_conservation_park/329/birmingham_wildlife_conservation_park", R.drawable.naturecentre,  52.450437, -1.910306));
        attractions.add(new Attraction("Sarehole Mill", "Cole Bank Road, Birmingham B13 0BD, England", "http://www.birminghammuseums.org.uk/sarehole", R.drawable.sareholemill, 52.434386, -1.856056));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), attractions, R.color.category_landmarks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(itemsAdapter);

        return rootView;
    }





}
