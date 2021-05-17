package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;


public class GeoServiceTest {
    @Test
    @DisplayName("testing return value from GeoService.byIp method")
    void verifyingLocationMethod() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location locationGeoService = geoService.byIp("172.");
        Assertions.assertEquals(Country.RUSSIA, locationGeoService.getCountry());
    }

    /**
     * не совсем уверен что ещё нужно тестировать
     */
    @Test
    @DisplayName("testing return value from GeoService.byIp method return localhost Location")
    void verifyingLocationMethodReturnLocalHost() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location locationGeoService = geoService.byIp("127.0.0.1");
        Assertions.assertEquals(null, locationGeoService.getCity());
    }
}
