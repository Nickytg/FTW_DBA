package com.example.tb.dobizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import adapter.service_wanted_adapter;
import dto.service_wanted_request;

/**
 * Created by thaib on 10/6/2015.
 */
public class Tab3Fragment extends ListFragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    public ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> liste;
    private int mPage;

    public static Tab3Fragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        Tab3Fragment fragment = new Tab3Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_3, container, false);
        service_wanted_request service1[] = new service_wanted_request[]
                {
                        new service_wanted_request("A1"),
                        new service_wanted_request("Showers"),
                        new service_wanted_request("Snow"),
                        new service_wanted_request("Storm"),
                        new service_wanted_request("Sunny")
                };
        service_wanted_adapter adapter = new service_wanted_adapter(view.getContext(), R.layout.service_wanted_screen_profile,service1);
        listView = (ListView) view.findViewById(android.R.id.list);;
        listView.setAdapter(adapter);
        return view;
    }
}
