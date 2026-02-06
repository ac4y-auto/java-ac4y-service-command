package ac4y.command.service.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link Ac4yCMDServiceRequest}.
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 */
public class Ac4yCMDServiceRequestTest {

    private Ac4yCMDServiceRequest serviceRequest;

    @Before
    public void setUp() {
        serviceRequest = new Ac4yCMDServiceRequest();
    }

    @Test
    public void testServiceRequestCanBeCreated() {
        assertNotNull(serviceRequest);
    }

    @Test
    public void testRequestInitiallyNull() {
        assertNull(serviceRequest.getRequest());
    }

    @Test
    public void testResponseInitiallyNull() {
        assertNull(serviceRequest.getResponse());
    }

    @Test
    public void testRequestCanBeSet() {
        Ac4yCMDServiceRequestRequest request = new Ac4yCMDServiceRequestRequest();
        serviceRequest.setRequest(request);
        assertEquals(request, serviceRequest.getRequest());
    }

    @Test
    public void testRequestCanBeSetToNull() {
        Ac4yCMDServiceRequestRequest request = new Ac4yCMDServiceRequestRequest();
        serviceRequest.setRequest(request);
        assertNotNull(serviceRequest.getRequest());

        serviceRequest.setRequest(null);
        assertNull(serviceRequest.getRequest());
    }

    @Test
    public void testInheritedCommandNameFunctionality() {
        serviceRequest.setCommandName("SERVICE_REQUEST");
        assertEquals("SERVICE_REQUEST", serviceRequest.getCommandName());
    }
}
