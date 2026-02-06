# java-ac4y-service-command

Service command module for the Ac4y framework - service request/response patterns.

## Maven Dependency

```xml
<dependency>
    <groupId>ac4y</groupId>
    <artifactId>ac4y-service-command</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Overview

Provides service command operations for service invocations with request/response handling. Includes service request routing (provider, service, requester) and bidirectional response patterns.

## Dependencies

- `ac4y:ac4y-command:1.0.0` (base command)
- `ac4y:ac4y-service-domain:1.0.0` (service request/response)

## Package Structure

- `ac4y.command.service.algebra` - Service request/response algebras
- `ac4y.command.service.domain` - Service command domain classes

## Key Classes

- `Ac4yCMDServiceRequest` - Basic service request command
- `Ac4yCMDServiceResponse` - Service response with auto-initialization
- `Ac4yCMDServiceRequestRequest` - Nested request with provider/service/requester fields
- `Ac4yCMDServiceResponseRequest` - Request carrying response data

## Build

```bash
mvn clean install
mvn test
```

## Origin

Extracted from `IJAc4yCommandModule/IJAc4yServiceCommand` module.

---
**Version:** 1.0.0
