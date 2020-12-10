
package com.ridvan.covidgraph.models;

import androidx.annotation.NonNull;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country implements Serializable
{

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("confirmed")
    @Expose
    private Integer confirmed;
    @SerializedName("recovered")
    @Expose
    private Integer recovered;
    @SerializedName("deaths")
    @Expose
    private Integer deaths;
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
    private final static long serialVersionUID = -5056032658423428958L;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
        return "Country{" +
                "country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", confirmed=" + confirmed +
                ", recovered=" + recovered +
                ", deaths=" + deaths +
                ", confirmedGrowth=" + confirmedGrowth +
                ", recoveredGrowth=" + recoveredGrowth +
                ", deathsGrowth=" + deathsGrowth +
                ", confirmedGrowthRate=" + confirmedGrowthRate +
                ", recoveredGrowthRate=" + recoveredGrowthRate +
                ", deathsGrowthRate=" + deathsGrowthRate +
                '}';
    }
}
