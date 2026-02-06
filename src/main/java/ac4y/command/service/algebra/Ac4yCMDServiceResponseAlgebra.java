package ac4y.command.service.algebra;

import ac4y.command.domain.Ac4yCommand;
import ac4y.command.service.domain.Ac4yCMDServiceResponseRequest;
import ac4y.service.domain.Ac4yServiceResponse;

/**
 * Algebra class for service response command operations.
 * <p>
 * This class extends {@link Ac4yCommand} and provides the algebraic structure
 * for service response commands. It manages both request and response objects
 * with helper methods to check existence and create instances.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 */
public class Ac4yCMDServiceResponseAlgebra extends Ac4yCommand {

    /**
     * The service response request.
     */
    private Ac4yCMDServiceResponseRequest request;

    /**
     * The service response.
     */
    private Ac4yServiceResponse response;

    /**
     * Gets the service response request.
     *
     * @return the request, or null if not set
     */
    public Ac4yCMDServiceResponseRequest getRequest() {
        return request;
    }

    /**
     * Sets the service response request.
     *
     * @param request the request to set
     */
    public void setRequest(Ac4yCMDServiceResponseRequest request) {
        this.request = request;
    }

    /**
     * Checks if a request has been set.
     *
     * @return true if request is not null, false otherwise
     */
    public boolean hasRequest(){
        return getRequest()!=null;
    }

    /**
     * Creates and initializes a new service response request.
     */
    public void createRequest(){
        setRequest(new Ac4yCMDServiceResponseRequest());
    }

    /**
     * Gets the service response.
     *
     * @return the response, or null if not set
     */
    public Ac4yServiceResponse getResponse() {
        return response;
    }

    /**
     * Sets the service response.
     *
     * @param response the response to set
     */
    public void setResponse(Ac4yServiceResponse response) {
        this.response = response;
    }

    /**
     * Checks if a response has been set.
     *
     * @return true if response is not null, false otherwise
     */
    public boolean hasResponse(){
        return getResponse()!=null;
    }

    /**
     * Creates and initializes a new service response.
     */
    public void createResponse(){
        setResponse(new Ac4yServiceResponse());
    }

}
