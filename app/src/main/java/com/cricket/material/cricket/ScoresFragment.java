package com.cricket.material.cricket;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.cricket.material.cricket.LiveScore.LiveScoreService;
import com.cricket.material.cricket.News.CricketNewsService;

/**
 * A placeholder fragment containing a simple view.
 */
public class ScoresFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private static final String includes_live = "select * from cricket.scorecard.live.summary";
    private ScoresAdapter mScoresAdapter;


    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ScoresFragment newInstance(int sectionNumber) {
        ScoresFragment fragment = new ScoresFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScoresFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mScoresAdapter = new ScoresAdapter(getActivity());
        loadLiveScoreData(includes_live);
    }

    protected void loadLiveScoreData(String includes) {
        LiveScoreService service = new LiveScoreService();
        service.loadLiveScoreData(mScoresAdapter, includes);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_scores, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_scores);
        listView.setAdapter(mScoresAdapter);


//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                // CursorAdapter returns a cursor at the correct position for getItem(), or null
//                // if it cannot seek to that position.
//                Cursor cursor = (Cursor) adapterView.getItemAtPosition(position);
//                if (cursor != null) {
//                    //do nothing
//                }
//            }
//        });

        return rootView;
    }
}
