package pl.lsnova.vehiclerest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lsnova.vehiclerest.model.Vehicle;
import pl.lsnova.vehiclerest.model.Wheel;
import pl.lsnova.vehiclerest.services.VehicleService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicle")
    public ResponseEntity<Vehicle> getVehicle () {
        Vehicle vehicle = new Vehicle();
        vehicle.setLicensePlate("352323");
        vehicle.setPostalCode("wewew");
        vehicle.setVehicleId(2l);
        vehicle.setVehicleName("bfgfjg");

        Wheel wheel1 = new Wheel(1l, "fdfw", new BigDecimal(12323212));
        Wheel wheel2 = new Wheel(2l, "fddfddfw", new BigDecimal(12323212));
        Wheel wheel3 = new Wheel(3l, "fdfedfw", new BigDecimal(12323212));
        Wheel wheel4 = new Wheel(4l, "fefdfw", new BigDecimal(12323212));

        List<Wheel> wheelList = new ArrayList<>();
        wheelList.add(wheel1);
        wheelList.add(wheel2);
        wheelList.add(wheel3);
        wheelList.add(wheel4);

        vehicle.setWheelList(wheelList);

        return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
    }
}
