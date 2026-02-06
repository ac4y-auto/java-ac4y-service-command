package ac4y.command.service.domain;

import ac4y.command.service.algebra.Ac4yCMDServiceRequestAlgebra;

/**
 * Domain class representing a basic Service Command Request in the Ac4y framework.
 * <p>
 * This is a concrete implementation of the service request algebra, providing
 * a standard service request object without additional initialization logic.
 * It serves as the base service request type for simple service invocations.
 * </p>
 * <p>
 * Inherits all service request properties and behaviors from the algebra layer,
 * including provider, service name, requester, and request data fields.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 * @see Ac4yCMDServiceRequestAlgebra
 */
public class Ac4yCMDServiceRequest extends Ac4yCMDServiceRequestAlgebra {
}
