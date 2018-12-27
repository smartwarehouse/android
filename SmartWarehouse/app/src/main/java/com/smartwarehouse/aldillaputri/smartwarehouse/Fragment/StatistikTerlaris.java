package com.smartwarehouse.aldillaputri.smartwarehouse.Fragment;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.smartwarehouse.aldillaputri.smartwarehouse.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StatistikTerlaris extends Fragment {
    public StatistikTerlaris(){};

    public ListView lv1;
    public com.github.mikephil.charting.charts.BarChart chrt1;

    public static StatistikTerlaris newInstance() { return new StatistikTerlaris(); }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }

    BarChart barChart;
    ArrayList<String> dates;
    Random random;
    ArrayList<BarEntry> barEntries;
    //String[] data={"ASP","C#","C++","HTML5","Javascript","Java","Objective-C","Perl","PHP","Python","Swift",};
    ListView listView;
    ArrayList<String> list = new ArrayList<String>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void setContentView(int activity_statistik_terlaris_fragment) {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_statistik_terlaris_fragment, container, false);

        barChart = (com.github.mikephil.charting.charts.BarChart) rootview.findViewById(R.id.chart_1);
        createRandomBarGraph("2016/05/01", "2016/05/5");

        ListView listView= (ListView) rootview.findViewById(R.id.list_view);
        listView.setAdapter(new ArrayAdapter<String>(rootview.getContext(), android.R.layout.simple_list_item_1 , list));
        list.add("List Satu");
        list.add("List Dua");
        list.add("List Tiga");
        list.add("List Empat");
        list.add("List Lima");

        return rootview;
    }

    private void createRandomBarGraph(String Date1, String Date2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date date1 = simpleDateFormat.parse(Date1);
            Date date2 = simpleDateFormat.parse(Date2);

            Calendar mDate1 = Calendar.getInstance();
            Calendar mDate2 = Calendar.getInstance();
            mDate1.clear();
            mDate2.clear();

            mDate1.setTime(date1);
            mDate2.setTime(date2);

            dates = new ArrayList<>();
            dates = getList(mDate1,mDate2);

            barEntries = new ArrayList<>();
            float max = 0f;
            float value = 0f;
            random = new Random();
            for(int j = 0; j< dates.size();j++){
                max = 100f;
                value = random.nextFloat()*max;
                barEntries.add(new BarEntry(value,j));
            }

        }catch(ParseException e){
            e.printStackTrace();
        }

        BarDataSet barDataSet = new BarDataSet(barEntries,"Dates");
        BarData barData = new BarData(dates,barDataSet);
        barChart.setData(barData);
        barChart.setDescription("My First Bar Graph!");

    }

    public ArrayList<String> getList(Calendar startDate, Calendar endDate){
        ArrayList<String> list = new ArrayList<String>();
        while(startDate.compareTo(endDate)<=0){
            list.add(getDate(startDate));
            startDate.add(Calendar.DAY_OF_MONTH,1);
        }
        return list;
    }

    public String getDate(Calendar cld){
        String curDate = cld.get(Calendar.YEAR) + "/" + (cld.get(Calendar.MONTH) + 1) + "/"
                +cld.get(Calendar.DAY_OF_MONTH);
        try{
            Date date = new SimpleDateFormat("yyyy/MM/dd").parse(curDate);
            curDate =  new SimpleDateFormat("yyy/MM/dd").format(date);
        }catch(ParseException e){
            e.printStackTrace();
        }
        return curDate;
    }
}
