package de.ralfhecktor.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import de.ralfhecktor.Vehicle;
import de.ralfhecktor.VehicleDTO;

@Mapper
public interface VehicleMapper {

    VehicleMapper INSTANCE = Mappers.getMapper(VehicleMapper.class);

    Vehicle map(VehicleDTO dto);

}
