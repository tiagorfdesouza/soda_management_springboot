package digital.innovation.one.apiRestSpringBootSoda.builder;

import digital.innovation.one.apiRestSpringBootSoda.dto.SodaDTO;
import digital.innovation.one.apiRestSpringBootSoda.enums.SodaType;
import lombok.Builder;
@Builder
public class SodaDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Brahma";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private int max = 50;

    @Builder.Default
    private int quantity = 10;

    @Builder.Default
    private SodaType type = SodaType.LAGER;

    public SodaDTO toSodaDTO() {
        return new SodaDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}
