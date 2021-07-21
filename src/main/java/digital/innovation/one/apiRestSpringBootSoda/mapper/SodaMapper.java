package digital.innovation.one.apiRestSpringBootSoda.mapper;

import digital.innovation.one.apiRestSpringBootSoda.dto.SodaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import digital.innovation.one.apiRestSpringBootSoda.entidades.Soda;

public interface SodaMapper {
    SodaMapper INSTANCE = Mappers.getMapper(SodaMapper.class);

    Soda toModel(SodaDTO sodaDTO);

    SodaDTO toDTO(Soda soda);
}
