package pl.lsnova.vehiclerest.repositories;


import org.springframework.data.repository.CrudRepository;
import pl.lsnova.vehiclerest.model.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

    Vehicle save(Long vehicleId, Vehicle vehicle);

    void removeById(Long vehicleId);

    Vehicle getVehicleById(Long vehicleId);
}
