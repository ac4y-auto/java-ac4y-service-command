package ac4y.command.service.domain;

import ac4y.command.service.algebra.Ac4yCMDServiceResponseRequestAlgebra;

/**
 * Domain class representing a Service Command Response Request in the Ac4y framework.
 * <p>
 * This class extends the algebra layer to provide a concrete implementation for
 * service requests that include response objects. It automatically initializes
 * the response object upon construction if one doesn't exist.
 * </p>
 * <p>
 * Used when a service request needs to carry response data along with the request,
 * enabling bidirectional service communication patterns.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 * @see Ac4yCMDServiceResponseRequestAlgebra
 */
public class Ac4yCMDServiceResponseRequest extends Ac4yCMDServiceResponseRequestAlgebra {

    /**
     * Constructs a new Ac4yCMDServiceResponseRequest.
     * <p>
     * Automatically creates a response object if one doesn't exist,
     * ensuring the request is ready for service operations that require
     * response handling.
     * </p>
     */
    public Ac4yCMDServiceResponseRequest(){
        if (!hasResponse())
            createResponse();
    }
}