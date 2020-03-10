package com.example.forecastmvvm.UI.data

import com.example.forecastmvvm.UI.data.response.CurrentWeatherResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "4152bd647e180d6e340c893cf5eadd67"

//http://api.weatherstack.com/current?access_key=4152bd647e180d6e340c893cf5eadd67&query=New%20York&language=en
interface ApixuWeatherApiService {

    @GET ("current")
    fun getCurrentWeather (
        @Query("query") location: String,
        @Query("language") languageCode: String = "en"
    ): Deferred<CurrentWeatherResponse>

    companion object {
        operator fun invoke(): ApixuWeatherApiService {

        }
    }

}