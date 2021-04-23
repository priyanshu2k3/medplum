/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.JsonObject;

public class EnrollmentResponse extends FhirResource {
    public static final String RESOURCE_TYPE = "EnrollmentResponse";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_REQUEST = "request";
    public static final String PROPERTY_OUTCOME = "outcome";
    public static final String PROPERTY_DISPOSITION = "disposition";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_REQUEST_PROVIDER = "requestProvider";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public EnrollmentResponse(final JsonObject data) {
        super(data);
    }

    /**
     * A reference to a set of rules that were followed when the resource was
     * constructed, and which must be understood when processing the content.
     * Often, this is a reference to an implementation guide that defines the
     * special rules along with other profiles etc.
     */
    public String implicitRules() {
        return getString(PROPERTY_IMPLICIT_RULES);
    }

    /**
     * The base language in which the resource is written.
     */
    public String language() {
        return getString(PROPERTY_LANGUAGE);
    }

    /**
     * A human-readable narrative that contains a summary of the resource and
     * can be used to represent the content of the resource to a human. The
     * narrative need not encode all the structured data, but is required to
     * contain sufficient detail to make it "clinically safe" for a human to
     * just read the narrative. Resource definitions may define what content
     * should be represented in the narrative to ensure clinical safety.
     */
    public Narrative text() {
        return getObject(Narrative.class, PROPERTY_TEXT);
    }

    /**
     * These resources do not have an independent existence apart from the
     * resource that contains them - they cannot be identified independently,
     * and nor can they have their own independent transaction scope.
     */
    public java.util.List<FhirResource> contained() {
        return getList(FhirResource.class, PROPERTY_CONTAINED);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource and that modifies the
     * understanding of the element that contains it and/or the understanding
     * of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe
     * and manageable, there is a strict set of governance applied to the
     * definition and use of extensions. Though any implementer is allowed to
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension. Applications processing a
     * resource are required to check for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on
     * Resource or DomainResource (including cannot change the meaning of
     * modifierExtension itself).
     */
    public java.util.List<Extension> modifierExtension() {
        return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
    }

    /**
     * The Response business identifier.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The status of the resource instance.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Original request resource reference.
     */
    public Reference request() {
        return getObject(Reference.class, PROPERTY_REQUEST);
    }

    /**
     * Processing status: error, complete.
     */
    public String outcome() {
        return getString(PROPERTY_OUTCOME);
    }

    /**
     * A description of the status of the adjudication.
     */
    public String disposition() {
        return getString(PROPERTY_DISPOSITION);
    }

    /**
     * The date when the enclosed suite of services were performed or
     * completed.
     */
    public java.time.Instant created() {
        return java.time.Instant.parse(data.getString(PROPERTY_CREATED));
    }

    /**
     * The Insurer who produced this adjudicated response.
     */
    public Reference organization() {
        return getObject(Reference.class, PROPERTY_ORGANIZATION);
    }

    /**
     * The practitioner who is responsible for the services rendered to the
     * patient.
     */
    public Reference requestProvider() {
        return getObject(Reference.class, PROPERTY_REQUEST_PROVIDER);
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

        public Builder meta(final Meta meta) {
            b.add(PROPERTY_META, meta);
            return this;
        }

        public Builder implicitRules(final String implicitRules) {
            b.add(PROPERTY_IMPLICIT_RULES, implicitRules);
            return this;
        }

        public Builder language(final String language) {
            b.add(PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder text(final Narrative text) {
            b.add(PROPERTY_TEXT, text);
            return this;
        }

        public Builder contained(final java.util.List<FhirResource> contained) {
            b.add(PROPERTY_CONTAINED, FhirObject.toArray(contained));
            return this;
        }

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder request(final Reference request) {
            b.add(PROPERTY_REQUEST, request);
            return this;
        }

        public Builder outcome(final String outcome) {
            b.add(PROPERTY_OUTCOME, outcome);
            return this;
        }

        public Builder disposition(final String disposition) {
            b.add(PROPERTY_DISPOSITION, disposition);
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder organization(final Reference organization) {
            b.add(PROPERTY_ORGANIZATION, organization);
            return this;
        }

        public Builder requestProvider(final Reference requestProvider) {
            b.add(PROPERTY_REQUEST_PROVIDER, requestProvider);
            return this;
        }

        public EnrollmentResponse build() {
            return new EnrollmentResponse(b.build());
        }
    }
}
