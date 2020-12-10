package com.ridvan.covidgraph;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.ridvan.covidgraph.formater.MyDayFormater;
import com.ridvan.covidgraph.models.Country;
import com.ridvan.covidgraph.models.CovidModel;
import com.ridvan.covidgraph.models.DailyDeath;
import com.ridvan.covidgraph.models.DailyReport;
import com.ridvan.covidgraph.restapi.ManagerAll;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.lineChartR)
    BarChart lineChartR;
    @BindView(R.id.mainZoomIn)
    ImageButton mainZoomIn;
    @BindView(R.id.mainZoomOut)
    ImageButton mainZoomOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        dailyDeathList();
    }

    public List<DailyDeath> dailyDeathList() {

        List<DailyDeath> dailyDeaths = new ArrayList<>();
        List<BarEntry> entryList = new ArrayList<>();

        Call<CovidModel> dailyReportCall = ManagerAll.getInstance().getirLV();
        dailyReportCall.enqueue(new Callback<CovidModel>() {
            @Override
            public void onResponse(Call<CovidModel> call, Response<CovidModel> response) {
                if (response.isSuccessful()) {

                    for (DailyReport ds : response.body().getDailyReports()) {
                        DailyDeath dailyDeath = new DailyDeath(ds.getUpdatedDate(), (float) ds.getDeaths());
                        dailyDeaths.add(dailyDeath);
                    }
                    for (int a = 0; a < dailyDeaths.size(); a++) {
                        entryList.add(new BarEntry(a + 1f, dailyDeaths.get(a).getDayDeaths()));
                    }

                    BarDataSet barDataSet = new BarDataSet(entryList, "Toplam Ölüm Sayısı");
                    BarData barData = new BarData(barDataSet);
                    barData.setBarWidth(0.9f);
                    lineChartR.setData(barData);
                    Description ds = new Description();
                    ds.setText("Dünya Geneli");
                    lineChartR.setDescription(ds);
                    lineChartR.setFitBars(true);
                    lineChartR.animateXY(2000, 2000);
                    lineChartR.invalidate();

                }
            }

            @Override
            public void onFailure(Call<CovidModel> call, Throwable t) {

            }
        });


        return dailyDeaths;
    }

    private void getApiRes() {

        Call<CovidModel> covidModelCall = ManagerAll.getInstance().getirLV();
        List<Country> countries = new ArrayList<>();

        covidModelCall.enqueue(new Callback<CovidModel>() {
            @Override
            public void onResponse(Call<CovidModel> call, Response<CovidModel> response) {
                if (response.isSuccessful()) {
                    for (DailyReport ds : response.body().getDailyReports()) {
                        if (ds.getUpdatedDate().equals("2020-04-17")) {
                            for (int a = 0; a < ds.getCountries().size(); a++) {
                                countries.add(ds.getCountries().get(a));
                            }
                        }
                    }

                    for (Country ct : countries) {
                        if (ct.getCountry().equals("Turkey")) {
                            System.out.println("RidoS: " + ct.toString());
                        }
                    }
                } else {
                    System.out.println("Rido: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<CovidModel> call, Throwable t) {
                Log.e("RidoS", t.getLocalizedMessage());
            }
        });

    }

    @OnClick({R.id.mainZoomIn, R.id.mainZoomOut})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mainZoomIn:
                lineChartR.zoomIn();
                break;
            case R.id.mainZoomOut:
                lineChartR.zoomOut();
                break;
        }
    }
}
