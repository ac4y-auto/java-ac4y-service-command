# java-ac4y-service-command - Architektúra Dokumentáció

## Áttekintés

Service command modul az Ac4y keretrendszerhez. Service hívás request/response mintákat biztosít.

**Verzió:** 1.0.0
**Java verzió:** 1.8
**Szervezet:** ac4y-auto

## Fő Komponensek

### 1. Service Request oldal

#### Ac4yCMDServiceRequestAlgebra
Alap service request algebra. `Ac4yCommand`-ot terjeszti ki request/response mezőkkel.

#### Ac4yCMDServiceRequestRequestAlgebra
Service hívás részletei: provider, service, requester, request adatok.

#### Ac4yCMDServiceRequest / Ac4yCMDServiceRequestRequest
Domain osztályok - egyszerű implementációk.

### 2. Service Response oldal

#### Ac4yCMDServiceResponseAlgebra
Response algebra helper metódusokkal: `hasRequest()`, `hasResponse()`, `createRequest()`, `createResponse()`.

#### Ac4yCMDServiceResponseRequestAlgebra
Request ami response objektumot hordoz.

#### Ac4yCMDServiceResponse
Konstruktorban automatikusan létrehozza a response és request objektumokat.

#### Ac4yCMDServiceResponseRequest
Konstruktorban automatikusan létrehozza a response objektumot.

## Függőségek

```xml
<dependency>
    <groupId>ac4y</groupId>
    <artifactId>ac4y-command</artifactId>
    <version>1.0.0</version>
</dependency>
```

## AI Agent Használati Útmutató

### Gyors Döntési Fa

**Kérdés:** Service command kell?
1. **Egyszerű service request** → `Ac4yCMDServiceRequest`
2. **Service response kezelés** → `Ac4yCMDServiceResponse` (auto-init)
3. **Részletes routing** → `Ac4yCMDServiceRequestRequest` (provider, service, requester)

### Token-hatékony Tudás

**Mit tartalmaz:**
- Service request routing (provider, service, requester)
- Bidirektív response kezelés
- Automatikus inicializálás konstruktorban

**Függőségek:**
- ac4y-command (alap command)
- ac4y-service-domain (service request/response)

## Eredetileg

`IJAc4yCommandModule/IJAc4yServiceCommand` modulból kiemelve.

---
**Utolsó frissítés:** 2026-02-06
