package pl.lsnova.vehiclerest.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lsnova.vehiclerest.model.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

    Vehicle save(Vehicle vehicle);

    void removeByVehicleId(Long vehicleId);

    Vehicle getVehicleByVehicleId(Long vehicleId);
}
