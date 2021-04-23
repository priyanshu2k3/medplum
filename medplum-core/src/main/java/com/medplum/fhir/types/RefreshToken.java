/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.JsonObject;

public class RefreshToken extends FhirResource {
    public static final String RESOURCE_TYPE = "RefreshToken";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_USER = "user";
    public static final String PROPERTY_SCOPE = "scope";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public RefreshToken(final JsonObject data) {
        super(data);
    }

    /**
     * The client requesting the code.
     */
    public Reference client() {
        return getObject(Reference.class, PROPERTY_CLIENT);
    }

    /**
     * The user requesting the code.
     */
    public Reference user() {
        return getObject(Reference.class, PROPERTY_USER);
    }

    /**
     * OAuth scope or scopes.
     */
    public String scope() {
        return getString(PROPERTY_SCOPE);
    }

    public static class Builder extends FhirResource.Builder {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder resourceType(final String resourceType) {
            b.add(PROPERTY_RESOURCE_TYPE, resourceType);
            return this;
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder client(final Reference client) {
            b.add(PROPERTY_CLIENT, client);
            return this;
        }

        public Builder user(final Reference user) {
            b.add(PROPERTY_USER, user);
            return this;
        }

        public Builder scope(final String scope) {
            b.add(PROPERTY_SCOPE, scope);
            return this;
        }

        public RefreshToken build() {
            return new RefreshToken(b.build());
        }
    }
}
