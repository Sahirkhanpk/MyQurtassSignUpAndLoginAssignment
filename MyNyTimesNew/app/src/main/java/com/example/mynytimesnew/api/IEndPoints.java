package com.example.mynytimesnew.api;


import com.example.mynytimesnew.model.ApiResponse;


import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;


/**
 * Created by Muhammad Hassan on 4/26/2017.
 */

public interface IEndPoints {

    // get token
/*    @NonNull
    @GET("agentloc.php?")
    //@GET("token.php")
    @Headers("Content-Type: application/json")
    Observable<sendLocation> sendLocation(

            @Query("lat") String lat,
            @Query("lon") String lon,
            @Query("uid") String id);*/

    @GET("mostpopular/v2/mostviewed/{section}/{period}.json")
    Observable<ApiResponse> getNewsDetails(@Path("section") String section, @Path("period") String period,
                                           @Query("api-key") String apiKey);






}
