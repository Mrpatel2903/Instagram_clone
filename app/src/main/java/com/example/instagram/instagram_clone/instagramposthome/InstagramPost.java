package com.example.instagram.instagram_clone.instagramposthome;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.instagram_clone.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class InstagramPost extends Fragment {
    /*// TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;*/
    DatabaseReference mInstaPostDatabase, mDatabaseLikes;
    FirebaseDatabase mAuth;
    private boolean mlikeProcess = false;
    RecyclerView firebaseListRecyclerview;

    public InstagramPost() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static InstagramPost newInstance() {
        InstagramPost fragment = new InstagramPost();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_instagram_post, container, false);

        mInstaPostDatabase = FirebaseDatabase.getInstance().getReference().child("Instagram post");
        mAuth= FirebaseDatabase.getInstance();

        mDatabaseLikes = FirebaseDatabase.getInstance().getReference().child("Likes");
        firebaseListRecyclerview = (RecyclerView) rootView.findViewById(R.id.recyclerInstaPost);
        firebaseListRecyclerview.setHasFixedSize(true);
        firebaseListRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));

       /* FirebaseRecyclerAdapter firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Post,PostViewHolder>{
            Post.class,
            R.layout.post_card,
            PostViewHolder.class,
            mInstaPostDatabase
    }*/

        return rootView;
    }

}
