package com.mimishi.mimishi.api;

import com.mimishi.mimishi.model.ResourcesVideo;
import com.mimishi.mimishi.model.SignedUsers;
import com.mimishi.mimishi.model.VerifyingUsers;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by chen on 17-2-6.
 */
public interface ApiService {

    @GET("resources/resource_main")
    Observable<ResourcesVideo> getMainData();

    @GET("users/users_signed")
    Observable<VerifyingUsers> getVerifyingUsers();

    @GET("users/users_signed")
    Observable<SignedUsers> getSignedUsers();

    @GET("resources/resource_uncensored")
    Observable<ResourcesVideo> getUncensoredData();

    @GET("resources/resource_high_difinition")
    Observable<ResourcesVideo> getHDData();

}
