package pl.lsnova.vehiclerest.converter;

import org.apache.commons.lang3.StringUtils;

public class PlateConverter {

    static String convertPlate(String plate) {
        return StringUtils.upperCase(plate);
    }
}
