package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * Um objeto de transferência de dados (DTO) que representa informações sobre um museu.
 * Este DTO é usado para transmitir informações sobre museus com base em sua localização.
 */
public record MuseumDto(
    Long id,                 // O identificador único do museu.
    String name,             // O nome do museu.
    String description,      // A descrição do museu.
    String address,          // O endereço do museu.
    String collectionType,   // O tipo de coleção do museu.
    String subject,          // O assunto ou tema do museu.
    String url,              // A URL relacionada ao museu.
    Coordinate coordinate   // As coordenadas de localização do museu.
) {

}