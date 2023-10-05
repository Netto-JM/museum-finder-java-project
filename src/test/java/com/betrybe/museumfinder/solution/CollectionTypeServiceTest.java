//package com.betrybe.museumfinder.solution;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import com.betrybe.museumfinder.database.MuseumFakeDatabase;
//import com.betrybe.museumfinder.dto.CollectionTypeCount;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import com.betrybe.museumfinder.service.CollectionTypeService;
//
//@AutoConfigureMockMvc
//@DisplayName("Tests for CollectionTypeService")
//public class CollectionTypeServiceTest {
//
//  @Autowired
//  private MockMvc mockMvc;
//
//  @MockBean
//  private MuseumFakeDatabase database;
//
//  @Test
//  @DisplayName("Should return a CollectionTypeCount with the number os Museums found.")
//  public void testCollectionTypeCount() throws Exception {
//    String[] collectionTypes = {"history","music"};
//
//    Mockito.when(database.countByCollectionType("history"))
//        .thenReturn(123L);
//
//    Mockito.when(database.countByCollectionType("music"))
//        .thenReturn(111L);
//
//    CollectionTypeCount expected = CollectionTypeService.countByCollectionTypes("history,music");
//
//    assertEquals(expected, new CollectionTypeCount(collectionTypes, 234));
//
//  }
//}