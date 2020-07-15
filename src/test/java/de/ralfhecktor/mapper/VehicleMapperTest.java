package de.ralfhecktor.mapper;

import org.junit.jupiter.api.Test;

import de.ralfhecktor.Vehicle;
import de.ralfhecktor.VehicleDTO;

public class VehicleMapperTest {

    @Test
    public void test() {

        VehicleDTO dto = new VehicleDTO();
        dto.setAmountOfWheels(4);
        dto.setColor("blue");

        Vehicle vehicle = VehicleMapper.INSTANCE.map(dto);

    }

}
