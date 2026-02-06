package ac4y.command.service.domain;

import ac4y.command.service.algebra.Ac4yCMDServiceResponseAlgebra;

/**
 * Domain class representing a Service Command Response in the Ac4y framework.
 * <p>
 * This class extends the algebra layer to provide a concrete implementation for
 * service responses that include both request and response objects. It automatically
 * initializes both the response and request objects upon construction if they don't exist.
 * </p>
 * <p>
 * Used for complete service operation representations where both the original request
 * and the resulting response need to be maintained together, enabling full context
 * tracking and bidirectional service communication.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 * @see Ac4yCMDServiceResponseAlgebra
 */
public class Ac4yCMDServiceResponse extends Ac4yCMDServiceResponseAlgebra {

    /**
     * Constructs a new Ac4yCMDServiceResponse.
     * <p>
     * Automatically creates both response and request objects if they don't exist,
     * ensuring the service response is fully initialized and ready for operations
     * that require both request and response context.
     * </p>
     */
    public Ac4yCMDServiceResponse(){
        if (!hasResponse())
            createResponse();
        if (!hasRequest())
            createRequest();
    }
}
