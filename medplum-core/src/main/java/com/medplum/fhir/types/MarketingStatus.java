/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class MarketingStatus extends FhirResource {
    public static final String RESOURCE_TYPE = "MarketingStatus";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_COUNTRY = "country";
    public static final String PROPERTY_JURISDICTION = "jurisdiction";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_DATE_RANGE = "dateRange";
    public static final String PROPERTY_RESTORE_DATE = "restoreDate";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MarketingStatus(final JsonObject data) {
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
     * The country in which the marketing authorisation has been granted
     * shall be specified It should be specified using the ISO 3166 ‑ 1
     * alpha-2 code elements.
     */
    public CodeableConcept country() {
        return getObject(CodeableConcept.class, PROPERTY_COUNTRY);
    }

    /**
     * Where a Medicines Regulatory Agency has granted a marketing
     * authorisation for which specific provisions within a jurisdiction
     * apply, the jurisdiction can be specified using an appropriate
     * controlled terminology The controlled term and the controlled term
     * identifier shall be specified.
     */
    public CodeableConcept jurisdiction() {
        return getObject(CodeableConcept.class, PROPERTY_JURISDICTION);
    }

    /**
     * This attribute provides information on the status of the marketing of
     * the medicinal product See ISO/TS 20443 for more information and
     * examples.
     */
    public CodeableConcept status() {
        return getObject(CodeableConcept.class, PROPERTY_STATUS);
    }

    /**
     * The date when the Medicinal Product is placed on the market by the
     * Marketing Authorisation Holder (or where applicable, the
     * manufacturer/distributor) in a country and/or jurisdiction shall be
     * provided A complete date consisting of day, month and year shall be
     * specified using the ISO 8601 date format NOTE “Placed on the market”
     * refers to the release of the Medicinal Product into the distribution
     * chain.
     */
    public Period dateRange() {
        return getObject(Period.class, PROPERTY_DATE_RANGE);
    }

    /**
     * The date when the Medicinal Product is placed on the market by the
     * Marketing Authorisation Holder (or where applicable, the
     * manufacturer/distributor) in a country and/or jurisdiction shall be
     * provided A complete date consisting of day, month and year shall be
     * specified using the ISO 8601 date format NOTE “Placed on the market”
     * refers to the release of the Medicinal Product into the distribution
     * chain.
     */
    public java.time.Instant restoreDate() {
        return java.time.Instant.parse(data.getString(PROPERTY_RESTORE_DATE));
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

        public Builder country(final CodeableConcept country) {
            b.add(PROPERTY_COUNTRY, country);
            return this;
        }

        public Builder jurisdiction(final CodeableConcept jurisdiction) {
            b.add(PROPERTY_JURISDICTION, jurisdiction);
            return this;
        }

        public Builder status(final CodeableConcept status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder dateRange(final Period dateRange) {
            b.add(PROPERTY_DATE_RANGE, dateRange);
            return this;
        }

        public Builder restoreDate(final java.time.Instant restoreDate) {
            b.add(PROPERTY_RESTORE_DATE, restoreDate.toString());
            return this;
        }

        public MarketingStatus build() {
            return new MarketingStatus(b.build());
        }
    }
}
