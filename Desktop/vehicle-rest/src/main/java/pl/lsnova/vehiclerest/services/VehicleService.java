package pl.lsnova.vehiclerest.services;

import org.springframework.stereotype.Service;
import pl.lsnova.vehiclerest.model.Vehicle;

public interface VehicleService {

    Vehicle saveVehicle(Vehicle vehicle) throws  Exception;

    Vehicle updateVehicle(Long vehicleId, Vehicle vehicle) throws  Exception;

    void removeVehicle(Long vehicleId) throws  Exception;

    Vehicle getVehicle(Long Vehicle) throws  Exception;
}
