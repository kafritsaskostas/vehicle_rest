package pl.lsnova.vehiclerest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lsnova.vehiclerest.model.Vehicle;
import pl.lsnova.vehiclerest.repositories.VehicleRepository;

@Service
public class VehicleServiceImp implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) throws Exception{
        Vehicle newVehicle = vehicleRepository.save(vehicle);

        if (newVehicle == null) {
            throw new Exception("Vehicle already exist.");
        }
        return newVehicle;
    }

    @Override
    public Vehicle getVehicle(Long vehicleId) throws  Exception{
        Vehicle newVehicle = vehicleRepository.getVehicleByVehicleId(vehicleId);

        if (newVehicle == null) {
            throw new Exception("Vehicle not found.");
        }
        return newVehicle;
    }

    @Override
    public Vehicle updateVehicle(Long vehicleId, Vehicle vehicle) throws  Exception {
        Vehicle newVehicle = vehicleRepository.save(vehicle);

        if (newVehicle == null) {
            throw new Exception("Vehicle not found.");
        }
        return newVehicle;
    }

    @Override
    public void removeVehicle(Long vehicleId) throws  Exception {
       vehicleRepository.removeByVehicleId(vehicleId);
    }
}
