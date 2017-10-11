package com.example.android.tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //ArrayList for the attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction("Barber Institute of Fine Arts", "University of Birmingham | Edgbaston, Birmingham B15 2TS, England", "http://barber.org.uk/", R.drawable.barberinstitute, 52.450278, -1.927818));
        attractions.add(new Attraction("Birmingham Museum & Art Gallery", "Congreve Passage | Chamberlain Square, Birmingham B3 3DH, England", "http://www.birminghammuseums.org.uk/bmag", R.drawable.birminghammuseum, 52.480111, -1.903462));
        attractions.add(new Attraction("Blakesley Hall", "Blakesley Road | Yardley, Birmingham B25 8RN, England", "http://www.birminghammuseums.org.uk/blakesley", R.drawable.blakesleyhall, 52.473446, -1.809410));
        attractions.add(new Attraction("Coffin Works", "13-15 Fleet Street | Jewellery Quarter, Birmingham B3 1JP, England", "http://www.coffinworks.org/",R.drawable.coffinworks, 52.481959, -1.907377));
        attractions.add(new Attraction("Lapworth Museum of Geology","Aston Webb Building | Birmingham University, Birmingham B15 2TT, England","http://www.birmingham.ac.uk/facilities/lapworth-museum/index.aspx", R.drawable.lapworthmusuem, 52.449203, -1.932231));
        attractions.add(new Attraction("National Motorcycle Museum", "Coventry Road | Bickenhill, Solihull, Birmingham B92 0EJ, England", "http://www.nationalmotorcyclemuseum.co.uk/", R.drawable.motorbikemuseum, 52.444416, -1.707100));
        attractions.add(new Attraction("The Pen Museum", "The Argent Centre 60 Frederick Street | Hockley, Birmingham B1 3HS, England", "https://penmuseum.org.uk/", R.drawable.penmuseum, 52.484539, -1.911664));
        attractions.add(new Attraction("Selly Manor", "Maple Road | Bournville, Birmingham B30 2AE, England", "http://www.sellymanormuseum.org.uk/", R.drawable.sellymanor, 52.430789, -1.934208));
        attractions.add(new Attraction("Museum of the Jewellery Quarter", "75-80 Vyse Street | Hockley, Birmingham B18 6HA, England", "http://www.birminghammuseums.org.uk/jewellery", R.drawable.thejewelleryquartermuseum, 52.490597, -1.912187));
        attractions.add(new Attraction("Thinktank Science Museum", "Curzon Street | Curzon Street, Birmingham B4 7XG, England", "http://www.birminghammuseums.org.uk/thinktank", R.drawable.thinktank, 52.482531, -1.886773));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), attractions, R.color.category_museums);

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

