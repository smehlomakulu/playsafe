package com.playsafe.service.impl;

import com.playsafe.service.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class ConversionServiceImpl implements ConversionService {

    private final Double BASE_K2C = 273.15;
    private final float BASE_M2KM = (float) 1.609344;

    public double kelvinToCelcius(double kelvin) {
        return (kelvin - BASE_K2C);
    }

    public double celciusToKelvin(double celcius) {
        return (celcius + BASE_K2C);
    }

    public float milesToKm(double miles) {
        return (float) (miles * BASE_M2KM);
    }

    public float kmToMiles(double km) {
        return (float) (km/BASE_M2KM);
    }
}
