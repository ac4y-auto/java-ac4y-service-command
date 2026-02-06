package ac4y.command.service.algebra;

import ac4y.service.domain.Ac4yServiceRequest;

/**
 * Algebra class for Service Command Request-Request operations in the Ac4y framework.
 * <p>
 * This algebra layer extends the base service request and adds fields for managing
 * service invocation details including provider, service name, requester, and request data.
 * It provides the foundational structure for routing and executing service requests
 * across the Ac4y framework.
 * </p>
 * <p>
 * The algebra pattern separates the business logic and data structure from the domain
 * implementation, providing reusable functionality for service request management.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 * @see Ac4yServiceRequest
 */
public class Ac4yCMDServiceRequestRequestAlgebra extends Ac4yServiceRequest {

    /**
     * The service provider identifier.
     */
    private String provider;

    /**
     * The service name to be invoked.
     */
    private String service;

    /**
     * The requester identifier.
     */
    private String requester;

    /**
     * The request data or parameters.
     */
    private String request;

    /**
     * Gets the service provider identifier.
     *
     * @return the provider identifier
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the service provider identifier.
     *
     * @param provider the provider identifier to set
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * Gets the service name to be invoked.
     *
     * @return the service name
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the service name to be invoked.
     *
     * @param service the service name to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * Gets the requester identifier.
     *
     * @return the requester identifier
     */
    public String getRequester() {
        return requester;
    }

    /**
     * Sets the requester identifier.
     *
     * @param requester the requester identifier to set
     */
    public void setRequester(String requester) {
        this.requester = requester;
    }

    /**
     * Gets the request data or parameters.
     *
     * @return the request data
     */
    public String getRequest() {
        return request;
    }

    /**
     * Sets the request data or parameters.
     *
     * @param request the request data to set
     */
    public void setRequest(String request) {
        this.request = request;
    }

}
