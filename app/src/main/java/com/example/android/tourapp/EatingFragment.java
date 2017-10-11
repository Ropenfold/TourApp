package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EatingFragment extends Fragment {

    public EatingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //ArrayList for the attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction("Adam's", "16 Waterloo Street, Birmingham B2 5UG, England", "http://www.adamsrestaurant.co.uk/", R.drawable.adams, 52.479844, -1.901385));
        attractions.add(new Attraction("Buonissimo", "1 Albany Road, Birmingham B17 9JX, England", "http://www.buonissimouk.com/", R.drawable.buonissimo, 52.458560, -1.950431));
        attractions.add(new Attraction("Carters of Moseley", "St Mary's 2C Wake Green Road | Wake Green Road, Birmingham B13 9EZ, England", "http://cartersofmoseley.co.uk/", R.drawable.cartersofmoseley, 52.445729, -1.883893));
        attractions.add(new Attraction("Del Villaggio", "175 Broad Street | Next to Cineworld, Birmingham B15 1DT, England", "http://del-villaggio.co.uk/", R.drawable.delvillaggio, 52.474065, -1.915951));
        attractions.add(new Attraction("Harborne Kitchen", "175-179 High Street | Harborne, Birmingham B17 9QE, England", "https://www.harbornekitchen.com/", R.drawable.harbornekitchen, 52.458578, -1.949959));
        attractions.add(new Attraction("Modu", "113 Bishop Street, Birmingham B5 6JL, England", "https://www.facebook.com/MODU.Restaurant/", R.drawable.modu, 52.470941, -1.893401));
        attractions.add(new Attraction("Original Patty Men", "9 Shaws Passage | Digbeth, Birmingham B5 5JG, England", "http://originalpattymen.com/", R.drawable.originalpattymen, 52.478419, -1.890413));
        attractions.add(new Attraction("Purnells", "55 Cornwall Street, Birmingham B3 2DH, England", "http://www.purnellsrestaurant.com/", R.drawable.purnells, 52.482733, -1.901663));
        attractions.add(new Attraction("The Grove", "Grove lane | Handsworth, Birmingham, England", "https://www.facebook.com/pages/The-Grove-Pub-and-Restaurant-Handsworth/414735621906783", R.drawable.thegrove, 52.513522, -1.933944));
        attractions.add(new Attraction("The Warehouse Cafe", "54-57 Allison Street | Digbeth, Birmingham B5 5TH, England", "http://www.thewarehousecafe.com/", R.drawable.thewarehousecafe,52.478341, -1.889630));
        attractions.add(new Attraction("The Wilderness", "1 Dudley Street, Birmingham B5 4EG, England", "http://thewilderness.restaurantwebx.com/", R.drawable.thewilderness, 52.476539, -1.897305));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), attractions, R.color.category_eating);

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
