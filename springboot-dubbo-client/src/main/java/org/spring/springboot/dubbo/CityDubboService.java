package org.spring.springboot.dubbo;

import org.spring.springboot.domain.City;

public interface CityDubboService {
    public City findCityByName(String cityName);
}
