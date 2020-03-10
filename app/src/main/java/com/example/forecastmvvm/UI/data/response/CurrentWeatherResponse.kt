package com.example.forecastmvvm.UI.data.response


data class CurrentWeatherResponse(
    val current: CurrentWeatherEntry,
    val location: Location,
    val request: Request
)