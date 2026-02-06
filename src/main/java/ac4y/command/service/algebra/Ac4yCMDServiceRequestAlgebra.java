package ac4y.command.service.algebra;

import ac4y.command.domain.Ac4yCommand;
import ac4y.command.service.domain.Ac4yCMDServiceRequestRequest;
import ac4y.service.domain.Ac4yServiceResponse;

/**
 * Algebra class for service request command operations.
 * <p>
 * This class extends {@link Ac4yCommand} and provides the algebraic structure
 * for service request commands. It implements a request-response pattern for
 * service invocations.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 */
public class Ac4yCMDServiceRequestAlgebra extends Ac4yCommand {

    /**
     * The service request containing the request parameters.
     */
    private Ac4yCMDServiceRequestRequest request;

    /**
     * The service response received after processing.
     */
    private Ac4yServiceResponse response;

    /**
     * Gets the service request for this command.
     *
     * @return the service request, or null if not set
     */
    public Ac4yCMDServiceRequestRequest getRequest() {
        return request;
    }

    /**
     * Sets the service request for this command.
     *
     * @param request the service request to set
     */
    public void setRequest(Ac4yCMDServiceRequestRequest request) {
        this.request = request;
    }

    /**
     * Gets the service response for this command.
     *
     * @return the service response, or null if not received
     */
    public Ac4yServiceResponse getResponse() {
        return response;
    }

    /**
     * Sets the service response for this command.
     *
     * @param response the service response to set
     */
    public void setResponse(Ac4yServiceResponse response) {
        this.response = response;
    }

}
