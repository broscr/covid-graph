
package com.ridvan.covidgraph.models;

import android.content.Intent;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DailyReport implements Serializable
{

    @SerializedName("errorStatus")
    @Expose
    private Boolean errorStatus;
    @SerializedName("updatedDate")
    @Expose
    private String updatedDate;
    @SerializedName("confirmed")
    @Expose
    private Integer confirmed;
    @SerializedName("recovered")
    @Expose
    private Integer recovered;
    @SerializedName("deaths")
    @Expose
    private Integer deaths;
    @SerializedName("countries")
    @Expose
    private List<Country> countries = null;
    @SerializedName("confirmedGrowth")
    @Expose
    private Integer confirmedGrowth;
    @SerializedName("recoveredGrowth")
    @Expose
    private Integer recoveredGrowth;
    @SerializedName("deathsGrowth")
    @Expose
    private Integer deathsGrowth;
    @SerializedName("confirmedGrowthRate")
    @Expose
    private Double confirmedGrowthRate;
    @SerializedName("recoveredGrowthRate")
    @Expose
    private Double recoveredGrowthRate;
    @SerializedName("deathsGrowthRate")
    @Expose
    private Double deathsGrowthRate;
    private final static long serialVersionUID = -1795695447448286897L;

    public Boolean getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(Boolean errorStatus) {
        this.errorStatus = errorStatus;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public Integer getConfirmedGrowth() {
        return confirmedGrowth;
    }

    public void setConfirmedGrowth(Integer confirmedGrowth) {
        this.confirmedGrowth = confirmedGrowth;
    }

    public Integer getRecoveredGrowth() {
        return recoveredGrowth;
    }

    public void setRecoveredGrowth(Integer recoveredGrowth) {
        this.recoveredGrowth = recoveredGrowth;
    }

    public Integer getDeathsGrowth() {
        return deathsGrowth;
    }

    public void setDeathsGrowth(Integer deathsGrowth) {
        this.deathsGrowth = deathsGrowth;
    }

    public Double getConfirmedGrowthRate() {
        return confirmedGrowthRate;
    }

    public void setConfirmedGrowthRate(Double confirmedGrowthRate) {
        this.confirmedGrowthRate = confirmedGrowthRate;
    }

    public Double getRecoveredGrowthRate() {
        return recoveredGrowthRate;
    }

    public void setRecoveredGrowthRate(Double recoveredGrowthRate) {
        this.recoveredGrowthRate = recoveredGrowthRate;
    }

    public Double getDeathsGrowthRate() {
        return deathsGrowthRate;
    }

    public void setDeathsGrowthRate(Double deathsGrowthRate) {
        this.deathsGrowthRate = deathsGrowthRate;
    }


    @NonNull
    @Override
    public String toString() {
        return "DailyReport{" +
                "errorStatus=" + errorStatus +
                ", updatedDate='" + updatedDate + '\'' +
                ", confirmed=" + confirmed +
                ", recovered=" + recovered +
                ", deaths=" + deaths +
                ", countries=" + countries +
                ", confirmedGrowth=" + confirmedGrowth +
                ", recoveredGrowth=" + recoveredGrowth +
                ", deathsGrowth=" + deathsGrowth +
                ", confirmedGrowthRate=" + confirmedGrowthRate +
                ", recoveredGrowthRate=" + recoveredGrowthRate +
                ", deathsGrowthRate=" + deathsGrowthRate +
                '}';
    }
}
