package com.example.coolweather;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.coolweather.db.City;
import com.example.coolweather.db.County;
import com.example.coolweather.db.Province;

import java.util.ArrayList;
import java.util.List;

public class ChooseAreaFragment extends Fragment {

    private static final String TAG="ChooseAreaFragment";

    public static final int LEVEL_PROVICE =0;

    public static final int LEVEL_CITY =1;

    public static final int LEVEL_COUNTY=2;

    private ProgressDialog progressDialog;

    private TextView titleText;

    private Button backButton;

    private ListView listView;

    private ArrayAdapter<String> adapter;

    private List<String> dataList =new ArrayList<>();

    /**
     * 省列表
     */
    private List<Province> provinceList;

    /**
     * 市列表
     */
    private List<City> cityList;

    /**
     * 县列表
     */
    private List<County> countyList;

    /**
     * 选中的省份
     */
    private Province selectedOrovince;

    /**
     * 选中的城市
     */
    private City selectedCity;

    /**
     * 当前选中的级别
     */

    private int currentLevel;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.choose_area,container,false);
        titleText=(TextView) view.findViewById(R.id.title_text);
        backButton=(Button) view.findViewById(R.id.back_button);
        listView =(ListView) view.findViewById(R.id.list_view);
        adapter =new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,dataList);
        listView.setAdapter(adapter);
        return view;
    }

}
