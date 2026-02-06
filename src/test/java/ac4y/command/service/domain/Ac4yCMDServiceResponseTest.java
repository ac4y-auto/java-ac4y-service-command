package ac4y.command.service.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link Ac4yCMDServiceResponse}.
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 */
public class Ac4yCMDServiceResponseTest {

    private Ac4yCMDServiceResponse serviceResponse;

    @Before
    public void setUp() {
        serviceResponse = new Ac4yCMDServiceResponse();
    }

    @Test
    public void testConstructorCreatesResponse() {
        assertTrue(serviceResponse.hasResponse());
        assertNotNull(serviceResponse.getResponse());
    }

    @Test
    public void testConstructorCreatesRequest() {
        assertTrue(serviceResponse.hasRequest());
        assertNotNull(serviceResponse.getRequest());
    }

    @Test
    public void testHasResponseReturnsTrueAfterConstruction() {
        assertTrue(serviceResponse.hasResponse());
    }

    @Test
    public void testHasRequestReturnsTrueAfterConstruction() {
        assertTrue(serviceResponse.hasRequest());
    }

    @Test
    public void testCreateResponseMethodWorks() {
        serviceResponse.setResponse(null);
        assertFalse(serviceResponse.hasResponse());

        serviceResponse.createResponse();
        assertTrue(serviceResponse.hasResponse());
        assertNotNull(serviceResponse.getResponse());
    }

    @Test
    public void testCreateRequestMethodWorks() {
        serviceResponse.setRequest(null);
        assertFalse(serviceResponse.hasRequest());

        serviceResponse.createRequest();
        assertTrue(serviceResponse.hasRequest());
        assertNotNull(serviceResponse.getRequest());
    }

    @Test
    public void testResponseCanBeSetToNull() {
        serviceResponse.setResponse(null);
        assertNull(serviceResponse.getResponse());
        assertFalse(serviceResponse.hasResponse());
    }

    @Test
    public void testRequestCanBeSetToNull() {
        serviceResponse.setRequest(null);
        assertNull(serviceResponse.getRequest());
        assertFalse(serviceResponse.hasRequest());
    }

    @Test
    public void testRequestIsInstanceOfCorrectType() {
        assertTrue(serviceResponse.getRequest() instanceof Ac4yCMDServiceResponseRequest);
    }
}
