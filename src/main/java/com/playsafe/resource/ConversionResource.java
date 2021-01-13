package com.playsafe.resource;

import com.playsafe.service.ConversionService;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Path("/conversions")
@Component
public class ConversionResource {
    
    @Autowired
    private ConversionService conversionService;
    
    @POST
    @Path("/ktoc")
    @Produces(MediaType.APPLICATION_JSON)
    public Response kelvinToCelcius(@PathParam("kelvin") double kelvin) {
        return Response.ok(conversionService.kelvinToCelcius(kelvin)).build();
    }
    
    @POST
    @Path("/ctok")
    @Produces(MediaType.APPLICATION_JSON)
    public Response celciusToKelvin(@PathParam("celcius") double celcius) {
        return Response.ok(conversionService.celciusToKelvin(celcius)).build();
    }
    
    @POST
    @Path("/mtok")
    @Produces(MediaType.APPLICATION_JSON)
    public Response milesToKms(@PathParam("miles") double miles) {
        return Response.ok(conversionService.milesToKm(miles)).build();
    }
    
    @POST
    @Path("/ktom")
    @Produces(MediaType.APPLICATION_JSON)
    public Response kmToMiles(@PathParam("km") double km) {
        return Response.ok(conversionService.kmToMiles(km)).build();
    }
}
