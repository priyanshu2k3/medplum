/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class SupplyRequest extends FhirResource {
    public static final String RESOURCE_TYPE = "SupplyRequest";
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
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_PRIORITY = "priority";
    public static final String PROPERTY_ITEM_CODEABLE_CONCEPT = "itemCodeableConcept";
    public static final String PROPERTY_ITEM_REFERENCE = "itemReference";
    public static final String PROPERTY_QUANTITY = "quantity";
    public static final String PROPERTY_PARAMETER = "parameter";
    public static final String PROPERTY_OCCURRENCE_DATE_TIME = "occurrenceDateTime";
    public static final String PROPERTY_OCCURRENCE_PERIOD = "occurrencePeriod";
    public static final String PROPERTY_OCCURRENCE_TIMING = "occurrenceTiming";
    public static final String PROPERTY_AUTHORED_ON = "authoredOn";
    public static final String PROPERTY_REQUESTER = "requester";
    public static final String PROPERTY_SUPPLIER = "supplier";
    public static final String PROPERTY_REASON_CODE = "reasonCode";
    public static final String PROPERTY_REASON_REFERENCE = "reasonReference";
    public static final String PROPERTY_DELIVER_FROM = "deliverFrom";
    public static final String PROPERTY_DELIVER_TO = "deliverTo";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public SupplyRequest(final JsonObject data) {
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
     * Business identifiers assigned to this SupplyRequest by the author
     * and/or other systems. These identifiers remain constant as the
     * resource is updated and propagates from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Status of the supply request.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Category of supply, e.g.  central, non-stock, etc. This is used to
     * support work flows associated with the supply process.
     */
    public CodeableConcept category() {
        return getObject(CodeableConcept.class, PROPERTY_CATEGORY);
    }

    /**
     * Indicates how quickly this SupplyRequest should be addressed with
     * respect to other requests.
     */
    public String priority() {
        return getString(PROPERTY_PRIORITY);
    }

    /**
     * The item that is requested to be supplied. This is either a link to a
     * resource representing the details of the item or a code that
     * identifies the item from a known list.
     */
    public CodeableConcept itemCodeableConcept() {
        return getObject(CodeableConcept.class, PROPERTY_ITEM_CODEABLE_CONCEPT);
    }

    /**
     * The item that is requested to be supplied. This is either a link to a
     * resource representing the details of the item or a code that
     * identifies the item from a known list.
     */
    public Reference itemReference() {
        return getObject(Reference.class, PROPERTY_ITEM_REFERENCE);
    }

    /**
     * The amount that is being ordered of the indicated item.
     */
    public Quantity quantity() {
        return getObject(Quantity.class, PROPERTY_QUANTITY);
    }

    /**
     * Specific parameters for the ordered item.  For example, the size of
     * the indicated item.
     */
    public java.util.List<SupplyRequestParameter> parameter() {
        return getList(SupplyRequestParameter.class, PROPERTY_PARAMETER);
    }

    /**
     * When the request should be fulfilled.
     */
    public String occurrenceDateTime() {
        return getString(PROPERTY_OCCURRENCE_DATE_TIME);
    }

    /**
     * When the request should be fulfilled.
     */
    public Period occurrencePeriod() {
        return getObject(Period.class, PROPERTY_OCCURRENCE_PERIOD);
    }

    /**
     * When the request should be fulfilled.
     */
    public Timing occurrenceTiming() {
        return getObject(Timing.class, PROPERTY_OCCURRENCE_TIMING);
    }

    /**
     * When the request was made.
     */
    public java.time.Instant authoredOn() {
        return java.time.Instant.parse(data.getString(PROPERTY_AUTHORED_ON));
    }

    /**
     * The device, practitioner, etc. who initiated the request.
     */
    public Reference requester() {
        return getObject(Reference.class, PROPERTY_REQUESTER);
    }

    /**
     * Who is intended to fulfill the request.
     */
    public java.util.List<Reference> supplier() {
        return getList(Reference.class, PROPERTY_SUPPLIER);
    }

    /**
     * The reason why the supply item was requested.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, PROPERTY_REASON_CODE);
    }

    /**
     * The reason why the supply item was requested.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, PROPERTY_REASON_REFERENCE);
    }

    /**
     * Where the supply is expected to come from.
     */
    public Reference deliverFrom() {
        return getObject(Reference.class, PROPERTY_DELIVER_FROM);
    }

    /**
     * Where the supply is destined to go.
     */
    public Reference deliverTo() {
        return getObject(Reference.class, PROPERTY_DELIVER_TO);
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

        public Builder category(final CodeableConcept category) {
            b.add(PROPERTY_CATEGORY, category);
            return this;
        }

        public Builder priority(final String priority) {
            b.add(PROPERTY_PRIORITY, priority);
            return this;
        }

        public Builder itemCodeableConcept(final CodeableConcept itemCodeableConcept) {
            b.add(PROPERTY_ITEM_CODEABLE_CONCEPT, itemCodeableConcept);
            return this;
        }

        public Builder itemReference(final Reference itemReference) {
            b.add(PROPERTY_ITEM_REFERENCE, itemReference);
            return this;
        }

        public Builder quantity(final Quantity quantity) {
            b.add(PROPERTY_QUANTITY, quantity);
            return this;
        }

        public Builder parameter(final java.util.List<SupplyRequestParameter> parameter) {
            b.add(PROPERTY_PARAMETER, FhirObject.toArray(parameter));
            return this;
        }

        public Builder occurrenceDateTime(final String occurrenceDateTime) {
            b.add(PROPERTY_OCCURRENCE_DATE_TIME, occurrenceDateTime);
            return this;
        }

        public Builder occurrencePeriod(final Period occurrencePeriod) {
            b.add(PROPERTY_OCCURRENCE_PERIOD, occurrencePeriod);
            return this;
        }

        public Builder occurrenceTiming(final Timing occurrenceTiming) {
            b.add(PROPERTY_OCCURRENCE_TIMING, occurrenceTiming);
            return this;
        }

        public Builder authoredOn(final java.time.Instant authoredOn) {
            b.add(PROPERTY_AUTHORED_ON, authoredOn.toString());
            return this;
        }

        public Builder requester(final Reference requester) {
            b.add(PROPERTY_REQUESTER, requester);
            return this;
        }

        public Builder supplier(final java.util.List<Reference> supplier) {
            b.add(PROPERTY_SUPPLIER, FhirObject.toArray(supplier));
            return this;
        }

        public Builder reasonCode(final java.util.List<CodeableConcept> reasonCode) {
            b.add(PROPERTY_REASON_CODE, FhirObject.toArray(reasonCode));
            return this;
        }

        public Builder reasonReference(final java.util.List<Reference> reasonReference) {
            b.add(PROPERTY_REASON_REFERENCE, FhirObject.toArray(reasonReference));
            return this;
        }

        public Builder deliverFrom(final Reference deliverFrom) {
            b.add(PROPERTY_DELIVER_FROM, deliverFrom);
            return this;
        }

        public Builder deliverTo(final Reference deliverTo) {
            b.add(PROPERTY_DELIVER_TO, deliverTo);
            return this;
        }

        public SupplyRequest build() {
            return new SupplyRequest(b.build());
        }
    }

    public static class SupplyRequestParameter extends FhirObject {
        public static final String RESOURCE_TYPE = "SupplyRequestParameter";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_VALUE_CODEABLE_CONCEPT = "valueCodeableConcept";
        public static final String PROPERTY_VALUE_QUANTITY = "valueQuantity";
        public static final String PROPERTY_VALUE_RANGE = "valueRange";
        public static final String PROPERTY_VALUE_BOOLEAN = "valueBoolean";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SupplyRequestParameter(final JsonObject data) {
            super(data);
        }

        /**
         * Unique id for the element within a resource (for internal references).
         * This may be any string value that does not contain spaces.
         */
        public String id() {
            return getString(PROPERTY_ID);
        }

        /**
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * A code or string that identifies the device detail being asserted.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * The value of the device detail.
         */
        public CodeableConcept valueCodeableConcept() {
            return getObject(CodeableConcept.class, PROPERTY_VALUE_CODEABLE_CONCEPT);
        }

        /**
         * The value of the device detail.
         */
        public Quantity valueQuantity() {
            return getObject(Quantity.class, PROPERTY_VALUE_QUANTITY);
        }

        /**
         * The value of the device detail.
         */
        public Range valueRange() {
            return getObject(Range.class, PROPERTY_VALUE_RANGE);
        }

        /**
         * The value of the device detail.
         */
        public Boolean valueBoolean() {
            return data.getBoolean(PROPERTY_VALUE_BOOLEAN);
        }

        public static class Builder {
            private final JsonObjectBuilder b;

            private Builder() {
                b = Json.createObjectBuilder();
            }

            private Builder(final JsonObject data) {
                b = Json.createObjectBuilder(data);
            }

            public Builder id(final String id) {
                b.add(PROPERTY_ID, id);
                return this;
            }

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder code(final CodeableConcept code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder valueCodeableConcept(final CodeableConcept valueCodeableConcept) {
                b.add(PROPERTY_VALUE_CODEABLE_CONCEPT, valueCodeableConcept);
                return this;
            }

            public Builder valueQuantity(final Quantity valueQuantity) {
                b.add(PROPERTY_VALUE_QUANTITY, valueQuantity);
                return this;
            }

            public Builder valueRange(final Range valueRange) {
                b.add(PROPERTY_VALUE_RANGE, valueRange);
                return this;
            }

            public Builder valueBoolean(final Boolean valueBoolean) {
                b.add(PROPERTY_VALUE_BOOLEAN, valueBoolean);
                return this;
            }

            public SupplyRequestParameter build() {
                return new SupplyRequestParameter(b.build());
            }
        }
    }
}
