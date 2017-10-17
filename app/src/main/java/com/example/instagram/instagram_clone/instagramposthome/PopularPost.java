package com.example.instagram.instagram_clone.instagramposthome;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.instagram_clone.R;


public class PopularPost extends Fragment {


    public PopularPost() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static PopularPost newInstance() {
        PopularPost fragment = new PopularPost();

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular_post, container, false);
    }


}
