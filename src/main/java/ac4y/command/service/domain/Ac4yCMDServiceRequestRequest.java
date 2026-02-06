package ac4y.command.service.domain;

import ac4y.command.service.algebra.Ac4yCMDServiceRequestRequestAlgebra;

/**
 * Domain class representing a Service Command Request-Request in the Ac4y framework.
 * <p>
 * This class extends the algebra layer to provide a concrete implementation for
 * nested service request patterns where a request contains another request.
 * It inherits all request properties including provider, service, requester,
 * and request data fields.
 * </p>
 * <p>
 * Used in complex service invocation scenarios where request chaining or
 * delegation is required between service components.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 * @see Ac4yCMDServiceRequestRequestAlgebra
 */
public class Ac4yCMDServiceRequestRequest extends Ac4yCMDServiceRequestRequestAlgebra {
}