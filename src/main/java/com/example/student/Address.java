package com.example.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class Address {

    @Value( "${streetnames}" )
    private List<String> street;

    @Value( "${streetno}" )
    private List<Integer> HNo;

    @Value( "${cities}" )
    private List<String> cities;

    @Value( "${provinces}" )
    private List<String> provinces;

    @Value( "${zips}" )
    private List<Integer> zipCode;



    public String getStreet() {
        return street.get( new Random().nextInt(street.size()-1)+1 );
    }

    public Integer getHouseNo() {
        return HNo.get(new Random().nextInt(HNo.size()-1)+1);
    }

    public String getCity() {
        return cities.get(new  Random().nextInt(cities.size()-1)+1 );
    }

    public String getProvince() {
        return provinces.get(new Random().nextInt(street.size()-1)+1);
    }

    public Integer getZipCode() {
        return zipCode.get( new Random().nextInt(zipCode.size()-1)+1 );
    }

    @Override
    public String toString() {
        return "Address{" +
                "street=" + getStreet() +
                ", HNo=" + getHouseNo() +
                ", cities=" + getCity() +
                ", provinces=" + getProvince() +
                ", zipCode=" + getZipCode() +
                '}';
    }
}
