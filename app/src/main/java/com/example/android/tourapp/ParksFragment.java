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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //ArrayList for the attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction("Cannon Hill Park", "Cannon Hill Park | Moseley, Birmingham B12 9QH, England", "http://www.cannonhillpeoplespark.net/", R.drawable.cannonhillpark, 52.450820, -1.899928));
        attractions.add(new Attraction("Cofton Park", "Lowhill Ln, Rednal, Birmingham B45 8UN, England", "https://www.birmingham.gov.uk/coftonpark", R.drawable.coftonpark, 50.612733, -3.460556));
        attractions.add(new Attraction("Highbury Park", "4 Yew Tree Road | Moseley, Birmingham B13 8QG, England", R.drawable.highburypark, 52.439392, -1.900644));
        attractions.add(new Attraction("Kings Heath Park", "Kings Heath Park Vicarage Road | Kings Heath, Birmingham B14 7TQ, England", R.drawable.kingsheathpark, 52.432600,  -1.901800));
        attractions.add(new Attraction("Lickey Hills Country Park", "Warren Lane | Rednal, Birmingham B45 8ER, England", "https://www.birmingham.gov.uk/lickeyhills", R.drawable.lickeyhillspark, 52.376144, -2.004380));
        attractions.add(new Attraction("Moseley Park and Pool", "172, Alcester Road, Birmingham B13 8DD, England", "http://www.moseleypark.co.uk/free-day-keys/", R.drawable.moseleypark, 52.447626, -1.890735));
        attractions.add(new Attraction("Sheldon Country Park", "Old Rectory Farm Ragley Drive | Ragley Drive, Sheldon, Birmingham B26 3TU, England", "https://www.birmingham.gov.uk/sheldonpark", R.drawable.sheldoncountrypark, 52.460225, -1.774705));
        attractions.add(new Attraction("Sutton Park National Nature Reserve", "National Nature Reserve Park Road, Sutton Coldfield B73 6BU, England", "https://www.birmingham.gov.uk/suttonpark", R.drawable.suttonpark, 52.576072, -1.855481));
        attractions.add(new Attraction("Waseley Hills Country Park", "Gannow Green Lane | Rubery, Birmingham B47 1SG, England", "http://www.worcestershire.gov.uk/cms/countryside/explore/countryside-service-sites/waseley-hills-country-park.aspx", R.drawable.waseleyhillpark, 52.402386, -2.043639));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), attractions, R.color.category_parks);

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
