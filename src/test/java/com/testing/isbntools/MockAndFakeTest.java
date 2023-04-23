package com.testing.isbntools;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


public class MockAndFakeTest {

    ExternalISBNDataService testWebService = isbn -> new Book("0140177396", "The Making of a Manager", "Julie Zhou");

    ExternalISBNDataService testDBService = isbn -> null;

    StockManager stockManager;

    ExternalISBNDataService fakeWebService;

    ExternalISBNDataService fakeDBService;

    @BeforeEach
    public void setup() {
        stockManager = new StockManager();
        fakeWebService = mock(ExternalISBNDataService.class);
        fakeDBService = mock(ExternalISBNDataService.class);
        stockManager.setWebService(fakeWebService);
        stockManager.setDatabaseService(fakeDBService);
    }

    @AfterEach
    public void tearDown() {
        System.gc();
    }

    @Test
    public void canGetCorrectLocatorCode() {
        when(fakeWebService.lookup(anyString())).thenReturn(new Book("0140177396", "The Making of a Manager", "Julie Zhou"));
        when(fakeDBService.lookup(anyString())).thenReturn(null);
        String isbn = "0140177396";
        String code = stockManager.getLocatorCode(isbn);
        assertEquals("7396J5", code);
    }

    @Test
    public void databaseIsUsedIfPresent() {
        String isbn = "0140177396";
        when(fakeDBService.lookup(isbn)).thenReturn(new Book("0140177396", "ABC", "ABC"));
        stockManager.getLocatorCode(isbn);
        verify(fakeDBService, times(1)).lookup(anyString());
        verify(fakeWebService, never()).lookup(anyString());
    }

    @Test
    public void webServiceIsUsedIfNotPresent() {
        String isbn = "0140177396";
        when(fakeDBService.lookup(isbn)).thenReturn(null);
        when(fakeWebService.lookup(isbn)).thenReturn(new Book("0140177396", "ABC", "ABC"));
        stockManager.getLocatorCode(isbn);
        verify(fakeDBService).lookup(anyString());
        verify(fakeWebService).lookup(anyString());
    }
}
