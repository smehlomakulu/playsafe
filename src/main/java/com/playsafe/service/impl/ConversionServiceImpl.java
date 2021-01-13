package com.playsafe.service.impl;

import com.playsafe.service.ConversionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ConversionServiceImpl implements ConversionService {
    
    private static final Logger log = LogManager.getLogger(ConversionServiceImpl.class);
    
    private final Double BASE_K2C = 273.15;
    private final float BASE_M2KM = (float) 1.609344;
    private long startTime = 0L;
    private long endTime = 0L;
    private long duration = 0L;
    private double doubleVal = 0;
    private float floatVal = 0;
    

    public double kelvinToCelcius(double kelvin) {
        try{
            startTime = System.currentTimeMillis();
            doubleVal = (kelvin - BASE_K2C);
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            log.debug("Kelvin to Celcius execution duration: {}",duration);
            return doubleVal;
        }catch(Exception e) {
            log.error("Failed to convert Kelvin to Celcius", e);
        }
        return 0;
    }

    public double celciusToKelvin(double celcius) {
        try{
            startTime = System.currentTimeMillis();
            doubleVal = (celcius + BASE_K2C);
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            log.debug("Celcius to Kelvin execution duration: {}",duration);
            return doubleVal;
        }catch(Exception e) {
            log.error("Failed to convert Celcius to Kelvin", e);
        }
        return 0;
    }

    public float milesToKm(double miles) {
        try{
            startTime = System.currentTimeMillis();
            floatVal = (float) (miles * BASE_M2KM);
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            log.debug("Miles to Km execution duration: {}",duration);
            return floatVal;
        }catch(Exception e) {
            log.error("Failed to convert Miles to KM", e);
        }
        return 0;
    }

    public float kmToMiles(double km) {
        try{
            startTime = System.currentTimeMillis();
            floatVal = (float) (km/BASE_M2KM);
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            log.debug("Km to Miles execution duration: {}",duration);
            return floatVal;
        }catch(Exception e) {
            log.error("Failed to convert KM to Miles", e);           
        }
        return 0;
    }
}
