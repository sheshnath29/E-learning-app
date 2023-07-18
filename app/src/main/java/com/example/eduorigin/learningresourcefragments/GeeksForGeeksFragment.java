package com.example.eduorigin.learningresourcefragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.eduorigin.R;
import com.example.eduorigin.controllers.WebViewController;

public class GeeksForGeeksFragment extends Fragment {


    public GeeksForGeeksFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_geeks_for_geeks, container, false);

        WebView webView=view.findViewById(R.id.geeksForGeeksWebViewId);
        webView.loadUrl("https://www.geeksforgeeks.org/");
        webView.setWebViewClient(new WebViewController());

        return view;
    }
}