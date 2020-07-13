package com.bobocode.factory;

import com.bobocode.data.FlightDao;
import com.bobocode.service.FlightService;

/**
 * {@link FlightServiceFactory} is used to create an instance of {@link FlightService}
 * <p>
 */
public class FlightServiceFactory {

    /**
     * Create a new instance of {@link FlightService}
     *
     * @return FlightService
     */
    public FlightService creteFlightService() {
        return new FlightService(new FlightDao());
    }
}
