package com.betrybe.museumfinder.model;

/**
 * Representa um museu com informações detalhadas.
 * Esta classe é usada para modelar informações sobre um museu, incluindo seu nome, descrição, endereço, coleção, URL, coordenadas de localização e identificação legada.
 */
public class Museum {

  private Long id;                 // O identificador único do museu.
  private String name;             // O nome do museu.
  private String description;      // A descrição do museu.
  private String address;          // O endereço do museu.
  private String collectionType;   // O tipo de coleção do museu.
  private String subject;          // O assunto ou tema do museu.
  private String url;              // A URL relacionada ao museu.
  private Coordinate coordinate;   // As coordenadas de localização do museu.
  private Long legacyId;           // O identificador legado do museu.

  /**
   * Obtém o identificador único do museu.
   *
   * @return O identificador único do museu.
   */
  public Long getId() {
    return id;
  }

  /**
   * Define o identificador único do museu.
   *
   * @param id O identificador único a ser definido para o museu.
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Obtém o nome do museu.
   *
   * @return O nome do museu.
   */
  public String getName() {
    return name;
  }

  /**
   * Define o nome do museu.
   *
   * @param name O nome a ser definido para o museu.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Obtém a descrição do museu.
   *
   * @return A descrição do museu.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Define a descrição do museu.
   *
   * @param description A descrição a ser definida para o museu.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Obtém o endereço do museu.
   *
   * @return O endereço do museu.
   */
  public String getAddress() {
    return address;
  }

  /**
   * Define o endereço do museu.
   *
   * @param address O endereço a ser definido para o museu.
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Obtém o tipo de coleção do museu.
   *
   * @return O tipo de coleção do museu.
   */
  public String getCollectionType() {
    return collectionType;
  }

  /**
   * Define o tipo de coleção do museu.
   *
   * @param collectionType O tipo de coleção a ser definido para o museu.
   */
  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  /**
   * Obtém o assunto ou tema do museu.
   *
   * @return O assunto ou tema do museu.
   */
  public String getSubject() {
    return subject;
  }

  /**
   * Define o assunto ou tema do museu.
   *
   * @param subject O assunto ou tema a ser definido para o museu.
   */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Obtém a URL relacionada ao museu.
   *
   * @return A URL relacionada ao museu.
   */
  public String getUrl() {
    return url;
  }

  /**
   * Define a URL relacionada ao museu.
   *
   * @param url A URL a ser definida para o museu.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Obtém as coordenadas de localização do museu.
   *
   * @return As coordenadas de localização do museu.
   */
  public Coordinate getCoordinate() {
    return coordinate;
  }

  /**
   * Define as coordenadas de localização do museu.
   *
   * @param coordinate As coordenadas de localização a serem definidas para o museu.
   */
  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  /**
   * Obtém o identificador legado do museu.
   *
   * @return O identificador legado do museu.
   */
  public Long getLegacyId() {
    return legacyId;
  }

  /**
   * Define o identificador legado do museu.
   *
   * @param legacyId O identificador legado a ser definido para o museu.
   */
  public void setLegacyId(Long legacyId) {
    this.legacyId = legacyId;
  }
}
