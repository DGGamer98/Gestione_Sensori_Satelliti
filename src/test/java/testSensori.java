/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.gestione_sensori_satelliti.DTO.SensoreDTO;
import com.mycompany.gestione_sensori_satelliti.service.Service;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class testSensori {

    private SensoreDTO sensoreDTO;
    private Service service;

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Started");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Finished");
    }

    @BeforeEach
    public void setUp() {
        sensoreDTO = new SensoreDTO();
        service = new Service();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("fine test");
    }

    /*
    TEST PER LE OPERAZIONI CRUD
     */
    @Test
    public void creaSensoreTest() {

        sensoreDTO.setId(1);
        sensoreDTO.setNome("Sensore Termico");
        sensoreDTO.setSatelliteId(1001);
        sensoreDTO.setTipo("GEO");
        sensoreDTO.setAttivo(true);

        service.createSensore(sensoreDTO);

        SensoreDTO risultato = service.cercaSensore(1);

        //asserzioni
        Assertions.assertNotNull(risultato);
        assertEquals("Sensore Termico", risultato.getNome());
        assertTrue(risultato.isAttivo());

    }

    @Test
    public void cercaTuttiSensori() {

        sensoreDTO.setId(1);
        sensoreDTO.setNome("Sensore Termico");
        sensoreDTO.setSatelliteId(1001);
        sensoreDTO.setTipo("GEO");
        sensoreDTO.setAttivo(true);

        service.createSensore(sensoreDTO);

        List<SensoreDTO> lista = service.trovaTutti();

        assertEquals(1, lista.size()); // mi aspetto un solo sensore
    }

    @Test
    public void eliminaSensore() {

        sensoreDTO.setId(1);
        sensoreDTO.setNome("Sensore Termico");
        sensoreDTO.setSatelliteId(1001);
        sensoreDTO.setTipo("GEO");
        sensoreDTO.setAttivo(true);

        service.createSensore(sensoreDTO);
        service.elimina(1);

        SensoreDTO risultato = service.cercaSensore(1);

        assertNull(risultato);
    }

    @Test
    public void aggiornaSensore() {
        SensoreDTO sDTO = new SensoreDTO();

        //l'oggetto d'aggiornare
        sensoreDTO.setId(1);
        sensoreDTO.setNome("Sensore Termico");
        sensoreDTO.setSatelliteId(1001);
        sensoreDTO.setTipo("GEO");
        sensoreDTO.setAttivo(true);

        //l'oggetto nuovo
        sDTO.setId(1);
        sDTO.setNome("Sensore spetro");
        sDTO.setSatelliteId(2001);
        sDTO.setTipo("LEO");
        sDTO.setAttivo(false);

        service.createSensore(sensoreDTO);
        service.aggiornaSensore(sDTO);

        SensoreDTO risultato = service.cercaSensore(1);

        Assertions.assertNotNull(risultato);
        assertEquals("Sensore spetro", risultato.getNome());

    }

}
