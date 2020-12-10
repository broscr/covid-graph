package com.ridvan.covidgraph.restapi;

/**
 * Created by RIDVAN AKTEPE on 15.11.2018.
 */
class BaseManager {

    //RestApi Back
    RestApi getRestApiClient() {

        RestApiClient restApiClient = new RestApiClient(BaseUrl.BASE_URL);

        return restApiClient.getRestApi();
    }

}
