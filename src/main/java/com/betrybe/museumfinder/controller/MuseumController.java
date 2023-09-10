package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import com.betrybe.museumfinder.util.ModelDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * A controller class responsible for handling museum-related endpoints.
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {

  private final MuseumServiceInterface service;

  @Autowired
  public MuseumController(MuseumServiceInterface service) {
    this.service = service;
  }

  /**
   * Retrieves the closest museum based on the provided latitude, longitude, and maximum distance.
   *
   * @param lat       The latitude of the reference coordinate.
   * @param lng       The longitude of the reference coordinate.
   * @param maxDistKm The maximum distance (in kilometers) from the reference coordinate to consider
   * @return The closest museum to the specified coordinate.
   */
  @GetMapping("/closest")
  public ResponseEntity<MuseumDto> getClosestMuseum(
      @RequestParam Double lat,
      @RequestParam Double lng,
      @RequestParam("max_dist_km") Double maxDistKm
  ) {
    Coordinate coordinate = new Coordinate(lat, lng);
    Museum museum = service.getClosestMuseum(coordinate, maxDistKm);
    return ResponseEntity.ok(ModelDtoConverter.modelToDto(museum));
  }

  /**
   * Creates a new museum based on the provided museum data.
   *
   * @param museumDto The DTO object containing information about the museum to create.
   * @return The created museum DTO.
   */
  @PostMapping
  public ResponseEntity<MuseumDto> createMuseum(@RequestBody MuseumDto museumDto) {
    Museum museum = ModelDtoConverter.dtoToModel(museumDto);
    Museum createdMuseum = service.createMuseum(museum);
    MuseumDto createdMuseumDto = ModelDtoConverter.modelToDto(createdMuseum);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdMuseumDto);
  }
}
