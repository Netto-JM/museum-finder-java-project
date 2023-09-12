package com.betrybe.museumfinder.solution;

// import com.betrybe.museumfinder.dto.CollectionTypeCount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
// import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
// import com.betrybe.museumfinder.service.CollectionTypeService;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

// Previous tests, for reference:

/*@SpringBootTest
@AutoConfigureMockMvc
@DisplayName("Tests for CollectionTypeController")
public class CollectionTypeControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private CollectionTypeService service;

  @Test
  @DisplayName("Should return the number of Museums with certain collection types.")
  public void testMuseumCollectionTypesCount() throws Exception {
    String[] collectionTypes = {"history","music"};

    Mockito.when(service.countByCollectionTypes("history,music"))
      .thenReturn(new CollectionTypeCount(collectionTypes,234));

    mockMvc.perform(get("/collections/count/{typesList}", "history,music"))
      .andExpect(status().isOk())
      .andExpect(content().contentType(MediaType.APPLICATION_JSON))
      .andExpect(jsonPath("$.count").value(234));
  }

  @Test
  @DisplayName("Should return 404 when no Museums are found with certain collection types.")
  public void testMuseumCollectionTypesNotFound() throws Exception {
    String[] collectionTypes = {"no","match"};

    Mockito.when(service.countByCollectionTypes("no,match"))
      .thenReturn(new CollectionTypeCount(collectionTypes,0));

    mockMvc.perform(get("/collections/count/{typesList}", "no,match"))
      .andExpect(status().isNotFound());
  }
}*/

@SpringBootTest
@AutoConfigureMockMvc
@DisplayName("Tests for CollectionTypeController")
public class CollectionTypeControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  @DisplayName("Should return the number of Museums with certain collection types.")
  public void testMuseumCollectionTypesCount() throws Exception {
    String[] collectionTypes = {"hist","imag"};

    mockMvc.perform(get("/collections/count/{typesList}", "hist,imag"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.count").value(492));
  }

  @Test
  @DisplayName("Should return 404 when no Museums are found with certain collection types.")
  public void testMuseumCollectionTypesNotFound() throws Exception {

    mockMvc.perform(get("/collections/count/{typesList}", "noMatchHere"))
        .andExpect(status().isNotFound());
  }
}
