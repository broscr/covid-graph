package com.ridvan.covidgraph.restapi;

import com.ridvan.covidgraph.models.CovidModel;
import com.ridvan.covidgraph.models.DailyReport;

import retrofit2.Call;

public class ManagerAll extends BaseManager {

    private static final ManagerAll ourgetInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance() {

        return ourgetInstance;
    }

    public Call<CovidModel> getirLV() {

        return getRestApiClient().getirAll();
    }
}
