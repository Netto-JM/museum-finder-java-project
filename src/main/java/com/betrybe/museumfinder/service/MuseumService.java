package com.betrybe.museumfinder.service;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.util.CoordinateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * A service class responsible for handling museum-related operations.
 */
@Service
public class MuseumService implements MuseumServiceInterface {

  private final MuseumFakeDatabase museumFakeDatabase;

  @Autowired
  public MuseumService(MuseumFakeDatabase museumFakeDatabase) {
    this.museumFakeDatabase = museumFakeDatabase;
  }

  /**
   * Retrieves the closest museum based on the given coordinate and maximum distance.
   *
   * @param coordinate   The coordinate to use as a reference.
   * @param maxDistance  The maximum distance from the coordinate to consider.
   * @return The closest museum to the provided coordinate.
   * @throws InvalidCoordinateException If the provided coordinate is invalid.
   * @throws MuseumNotFoundException   If no museum is found within the specified distance.
   */
  @Override
  public Museum getClosestMuseum(Coordinate coordinate, Double maxDistance) {
    if (!CoordinateUtil.isCoordinateValid(coordinate)) {
      throw new InvalidCoordinateException();
    }
    return museumFakeDatabase.getClosestMuseum(coordinate, maxDistance)
        .orElseThrow(MuseumNotFoundException::new);
  }

  /**
   * Creates a new museum with the provided information.
   *
   * @param museum The museum object containing information about the museum to create.
   * @return The created museum.
   * @throws InvalidCoordinateException If the museum's coordinate is invalid.
   */
  @Override
  public Museum createMuseum(Museum museum) {
    if (!CoordinateUtil.isCoordinateValid(museum.getCoordinate())) {
      throw new InvalidCoordinateException();
    }
    return museumFakeDatabase.saveMuseum(museum);
  }

  /**
   * Retrieves a museum by its unique identifier.
   *
   * @param id The unique identifier of the museum to retrieve.
   * @return The museum with the specified identifier.
   * @throws MuseumNotFoundException If no museum is found with the specified identifier.
   */
  @Override
  public Museum getMuseum(Long id) {
    return museumFakeDatabase.getMuseum(id)
        .orElseThrow(MuseumNotFoundException::new);
  }
}
