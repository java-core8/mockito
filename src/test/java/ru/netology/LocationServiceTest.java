package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocationServiceTest {

    @Test
    @DisplayName("test locale method return russian greeting")
    void localeMethodTestingReturnsRus() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, localizationService.locale(Country.RUSSIA));
    }

    @Test
    @DisplayName("test locale method return english greeting")
    void localeMethodTestingReturnsEng() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String expected = "Welcome";
        Assertions.assertEquals(expected, localizationService.locale(Country.USA));
    }

}
