package com.adithyasairam.tba4j;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;

/**
 * Created by AdiSai on 7/19/16.
 */

@Deprecated public class RetrofitBuilder{
    public Retrofit buildRetrofit() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();
        return new Retrofit.Builder()
                .baseUrl(Constants.TBA_URL)
                /* .addConverterFactory(GsonConverterFactory.create(gson)) */
                .build();
    }

}
