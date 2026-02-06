package ac4y.command.service.algebra;

import ac4y.service.domain.Ac4yServiceRequest;
import ac4y.service.domain.Ac4yServiceResponse;

/**
 * Algebra class for Service Command Response Request operations in the Ac4y framework.
 * <p>
 * This algebra layer extends the base service request and adds response object
 * management capabilities. It provides methods to create, access, and validate
 * response objects within the context of a service request.
 * </p>
 * <p>
 * The algebra pattern separates the business logic for response management from
 * the domain implementation, providing reusable functionality for any service
 * request that needs to carry response data.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 * @see Ac4yServiceRequest
 * @see Ac4yServiceResponse
 */
public class Ac4yCMDServiceResponseRequestAlgebra extends Ac4yServiceRequest {

    /**
     * The service response object associated with this request.
     */
    private Ac4yServiceResponse response;

    /**
     * Gets the service response object.
     *
     * @return the service response, or null if not set
     */
    public Ac4yServiceResponse getResponse() {
        return response;
    }

    /**
     * Sets the service response object.
     *
     * @param response the service response to set
     */
    public void setResponse(Ac4yServiceResponse response) {
        this.response = response;
    }

    /**
     * Checks if this request has a response object.
     *
     * @return true if the response is not null, false otherwise
     */
    public boolean hasResponse(){
        return getResponse()!=null;
    }

    /**
     * Creates a new service response object and associates it with this request.
     * <p>
     * Initializes a new instance of Ac4yServiceResponse and sets it as the
     * response for this request.
     * </p>
     */
    public void createResponse(){
        setResponse(new Ac4yServiceResponse());
    }

}
