package com.example.bharatmk257.guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class KakariyaFragment extends Fragment {

    private RecyclerView recyclerView;
    private PlaceAdapter adapter;
    private List<Places> placesList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//View view = inflater.inflate(R.layout.fragment_kakariya,container,false);
        return inflater.inflate(R.layout.fragment_kakariya, null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        photos();
    }

    private void initViews() {
        recyclerView = getActivity().findViewById(R.id.recyclerViewPlace);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setHasFixedSize(true);

    }

//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }

    private void photos() {
        int[] covers = new int[]{
                R.drawable.tajmahal,
                R.drawable.tajmahal,
                R.drawable.tajmahal,
                R.drawable.tajmahal,
                R.drawable.tajmahal,
                R.drawable.tajmahal,
                R.drawable.tajmahal,
                R.drawable.tajmahal,
                R.drawable.tajmahal,
                R.drawable.tajmahal
        };

        Places
                a = new Places("tajmahal", covers[0], "Location");
        placesList.add(a);
        a = new Places("chali", covers[1], "Loction");
        placesList.add(a);
        a = new Places("whatsapp", covers[2], "Loction");
        placesList.add(a);
        a = new Places("samsung", covers[3], "Loction");
        placesList.add(a);
        a = new Places("gmail", covers[4], "Loction");
        placesList.add(a);
        a = new Places("motorola", covers[5], "Loction");
        placesList.add(a);
        a = new Places("phone", covers[6], "Loction");
        placesList.add(a);
        a = new Places("photo", covers[7], "Loction");
        placesList.add(a);
        a = new Places("sony", covers[8], "Loction");
        placesList.add(a);
        a = new Places("gionee", covers[9], "Loction");
        placesList.add(a);

        //adapter = new PlaceAdapter();
        recyclerView.setAdapter(adapter);

    }
//    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
//        private int spanCount;
//        private int spacing;
//        private boolean includeEdge;
//
//        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
//            this.spanCount = spanCount;
//            this.spacing = spacing;
//            this.includeEdge = includeEdge;
//        }
//    }
//    private int dpToPx(int dp) {
//        Resources r = getResources();
//        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
//    }
}
