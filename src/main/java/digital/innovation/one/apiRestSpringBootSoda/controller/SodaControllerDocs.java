package digital.innovation.one.apiRestSpringBootSoda.controller;

import digital.innovation.one.apiRestSpringBootSoda.dto.SodaDTO;
import digital.innovation.one.apiRestSpringBootSoda.exception.SodaAlreadyRegisteredException;
import digital.innovation.one.apiRestSpringBootSoda.exception.SodaNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;


@Api("Manages beer stock")
public interface SodaControllerDocs {
    @ApiOperation(value = "Soda creation operation")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success soda creation"),
            @ApiResponse(code = 400, message = "Missing required fields or wrong field range value.")
    })
    SodaDTO createSoda(SodaDTO sodaDTO) throws SodaAlreadyRegisteredException;


    SodaDTO findByName(@PathVariable String name) throws SodaNotFoundException;

    @ApiOperation(value = "Returns a list of all sodas registered in the system")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of all sodas registered in the system"),
    })
    List<SodaDTO> listSodas();

    @ApiOperation(value = "Delete a soda found by a given valid Id")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Success soda deleted in the system"),
            @ApiResponse(code = 404, message = "Soda with given id not found.")
    })
    void deleteById(@PathVariable Long id) throws SodaNotFoundException;

}
