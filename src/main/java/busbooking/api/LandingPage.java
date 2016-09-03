package busbooking.api;

import busbooking.domain.Passenger;
import busbooking.domain.PassengerAddress;
import busbooking.factory.AddressFactory;
import busbooking.factory.PassengerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by student on 2016/09/02.
 */
@RestController
@RequestMapping("/")
public class LandingPage {
    @RequestMapping(method = RequestMethod.GET)
    public Passenger getCustomer(){
        PassengerAddress passengerAddress = AddressFactory.createPassangerAddress("streetTest", "CityTest", "1000");
        Passenger passenger = PassengerFactory.createPassenger("admin", "testlastname", passengerAddress);
        return passenger;
    }
}

