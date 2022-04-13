package com.permission.countries.model

import com.permission.countries.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountriesApi {

    @GET("DevTides/countries/master/countriesV2.json")
    fun getCountries() : Single<List<Country>>

    @GET("endpoint2")
    fun getEndpoint2Data()

}