package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class StadiumTheatresFragment extends Fragment {

    public StadiumTheatresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //ArrayList for the attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction("Alexander Stadium", "Perry Barr, Birmingham, England", "https://www.birmingham.gov.uk/alexander", R.drawable.alexanderstadium, 52.530909, -1.904921));
        attractions.add(new Attraction("New Alexandra Theatre","Suffolk Street Queensway, Birmingham B5 4DS, England", "http://www.atgtickets.com/venues/new-alexandra-theatre-birmingham/", R.drawable.alexandratheatre, 52.476126, -1.901285));
        attractions.add(new Attraction("Edgbaston Cricket Ground", "County Ground Edgbaston Road | County Ground, Birmingham B5 7QU, England", "http://www.edgbaston.com/", R.drawable.edgbastonstadium, 52.455833, -1.902676));
        attractions.add(new Attraction("The Hawthorns", "Birmingham Road, West Bromwich, Sandwell B71 4LF, England", "https://www.wba.co.uk/", R.drawable.hawthorns, 52.509038, -1.963938));
        attractions.add(new Attraction("The Hippodrome", "Hurst Street | Southside, Birmingham B5 4TB, England", "https://www.birminghamhippodrome.com/", R.drawable.hippodrome, 52.474557, -1.897496));
        attractions.add(new Attraction("National Exhibition Centre (NEC)", "Bickenhill Parkway, Birmingham B40 1NT, England", "http://www.thenec.co.uk/", R.drawable.necbirmingham, 51.557480, -0.403535));
        attractions.add(new Attraction("Barclaycard Arena", "King Edwards Road, Birmingham B1 2AA, England", "http://www.arenabham.co.uk/", R.drawable.nia, 52.479777, -1.915044));
        attractions.add(new Attraction("Birmingham City Football Club", "Cattell Rd, Birmingham B9 4RL, England", "https://www.bcfc.com/", R.drawable.standrews, 52.475722, -1.868061));
        attractions.add(new Attraction("The Old Rep Theatre", "Station Street, Birmingham B5 4DY, England", "http://www.oldreptheatre.co.uk/", R.drawable.theoldrep, 52.476763, -1.898451));
        attractions.add(new Attraction("Aston Villa Football Club", "Trinity Road, Birmingham B6 6HE, England", "https://www.avfc.co.uk/", R.drawable.villapark, 52.509112, -1.884783));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), attractions, R.color.category_stadium_theatres);

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
