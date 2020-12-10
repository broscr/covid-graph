package com.ridvan.covidgraph.restapi;


import com.ridvan.covidgraph.models.CovidModel;
import com.ridvan.covidgraph.models.DailyReport;

import retrofit2.Call;
import retrofit2.http.GET;
public interface RestApi {

//https://raw.githubusercontent.com/maxMaxineChen/COVID-19-worldwide-json-data-script/master/data/data.json

    @GET("/maxMaxineChen/COVID-19-worldwide-json-data-script/master/data/data.json")
    Call<CovidModel> getirAll();
}
