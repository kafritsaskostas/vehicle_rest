package pl.lsnova.vehiclerest.validator;

import pl.lsnova.vehiclerest.model.Wheel;

import java.util.List;

public class ValidateVehicle {

    private static final int LENGTH = 6;
    private static final String PLATE_PATTERN = "^\\\\p\\{InGreek}{3}[0-9]{3}$";
    private static final String POSTAL_CODE = "^[0-9]{5}$";
    private static final String NAME = ".{3,30}";

    public boolean validatePlate(String plate) {
        return plate.length() == LENGTH && plate.matches(PLATE_PATTERN);
    }

    public boolean validateNumberOfWheels(List<Wheel> wheels) {
        return wheels.size() == 4 || wheels.size() == 6;
    }

    public boolean validateWheelAttributes(Wheel wheel) {
        if (wheel == null) {
            return false;
        }

        return !wheel.getManufacturer().isEmpty() || wheel.getPressure() == null || wheel.getSize() <= 0;
    }

   public boolean validatePressure(List<Wheel> wheels) {
        return true;
    }

    public boolean validatePostalCode(String postalCode) {
        return postalCode.matches(POSTAL_CODE);
    }

    public boolean validateVehicleName(String name) {
        return name.matches(NAME);
    }
}
