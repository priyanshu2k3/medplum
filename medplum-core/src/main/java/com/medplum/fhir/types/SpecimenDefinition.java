/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class SpecimenDefinition extends FhirResource {
    public static final String RESOURCE_TYPE = "SpecimenDefinition";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_TYPE_COLLECTED = "typeCollected";
    public static final String PROPERTY_PATIENT_PREPARATION = "patientPreparation";
    public static final String PROPERTY_TIME_ASPECT = "timeAspect";
    public static final String PROPERTY_COLLECTION = "collection";
    public static final String PROPERTY_TYPE_TESTED = "typeTested";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public SpecimenDefinition(final JsonObject data) {
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
     * A business identifier associated with the kind of specimen.
     */
    public Identifier identifier() {
        return getObject(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The kind of material to be collected.
     */
    public CodeableConcept typeCollected() {
        return getObject(CodeableConcept.class, PROPERTY_TYPE_COLLECTED);
    }

    /**
     * Preparation of the patient for specimen collection.
     */
    public java.util.List<CodeableConcept> patientPreparation() {
        return getList(CodeableConcept.class, PROPERTY_PATIENT_PREPARATION);
    }

    /**
     * Time aspect of specimen collection (duration or offset).
     */
    public String timeAspect() {
        return getString(PROPERTY_TIME_ASPECT);
    }

    /**
     * The action to be performed for collecting the specimen.
     */
    public java.util.List<CodeableConcept> collection() {
        return getList(CodeableConcept.class, PROPERTY_COLLECTION);
    }

    /**
     * Specimen conditioned in a container as expected by the testing
     * laboratory.
     */
    public java.util.List<SpecimenDefinitionTypeTested> typeTested() {
        return getList(SpecimenDefinitionTypeTested.class, PROPERTY_TYPE_TESTED);
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

        public Builder identifier(final Identifier identifier) {
            b.add(PROPERTY_IDENTIFIER, identifier);
            return this;
        }

        public Builder typeCollected(final CodeableConcept typeCollected) {
            b.add(PROPERTY_TYPE_COLLECTED, typeCollected);
            return this;
        }

        public Builder patientPreparation(final java.util.List<CodeableConcept> patientPreparation) {
            b.add(PROPERTY_PATIENT_PREPARATION, FhirObject.toArray(patientPreparation));
            return this;
        }

        public Builder timeAspect(final String timeAspect) {
            b.add(PROPERTY_TIME_ASPECT, timeAspect);
            return this;
        }

        public Builder collection(final java.util.List<CodeableConcept> collection) {
            b.add(PROPERTY_COLLECTION, FhirObject.toArray(collection));
            return this;
        }

        public Builder typeTested(final java.util.List<SpecimenDefinitionTypeTested> typeTested) {
            b.add(PROPERTY_TYPE_TESTED, FhirObject.toArray(typeTested));
            return this;
        }

        public SpecimenDefinition build() {
            return new SpecimenDefinition(b.build());
        }
    }

    public static class SpecimenDefinitionAdditive extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenDefinitionAdditive";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_ADDITIVE_CODEABLE_CONCEPT = "additiveCodeableConcept";
        public static final String PROPERTY_ADDITIVE_REFERENCE = "additiveReference";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenDefinitionAdditive(final JsonObject data) {
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
         * Substance introduced in the kind of container to preserve, maintain or
         * enhance the specimen. Examples: Formalin, Citrate, EDTA.
         */
        public CodeableConcept additiveCodeableConcept() {
            return getObject(CodeableConcept.class, PROPERTY_ADDITIVE_CODEABLE_CONCEPT);
        }

        /**
         * Substance introduced in the kind of container to preserve, maintain or
         * enhance the specimen. Examples: Formalin, Citrate, EDTA.
         */
        public Reference additiveReference() {
            return getObject(Reference.class, PROPERTY_ADDITIVE_REFERENCE);
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

            public Builder additiveCodeableConcept(final CodeableConcept additiveCodeableConcept) {
                b.add(PROPERTY_ADDITIVE_CODEABLE_CONCEPT, additiveCodeableConcept);
                return this;
            }

            public Builder additiveReference(final Reference additiveReference) {
                b.add(PROPERTY_ADDITIVE_REFERENCE, additiveReference);
                return this;
            }

            public SpecimenDefinitionAdditive build() {
                return new SpecimenDefinitionAdditive(b.build());
            }
        }
    }

    public static class SpecimenDefinitionContainer extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenDefinitionContainer";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_MATERIAL = "material";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_CAP = "cap";
        public static final String PROPERTY_DESCRIPTION = "description";
        public static final String PROPERTY_CAPACITY = "capacity";
        public static final String PROPERTY_MINIMUM_VOLUME_QUANTITY = "minimumVolumeQuantity";
        public static final String PROPERTY_MINIMUM_VOLUME_STRING = "minimumVolumeString";
        public static final String PROPERTY_ADDITIVE = "additive";
        public static final String PROPERTY_PREPARATION = "preparation";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenDefinitionContainer(final JsonObject data) {
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
         * The type of material of the container.
         */
        public CodeableConcept material() {
            return getObject(CodeableConcept.class, PROPERTY_MATERIAL);
        }

        /**
         * The type of container used to contain this kind of specimen.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, PROPERTY_TYPE);
        }

        /**
         * Color of container cap.
         */
        public CodeableConcept cap() {
            return getObject(CodeableConcept.class, PROPERTY_CAP);
        }

        /**
         * The textual description of the kind of container.
         */
        public String description() {
            return getString(PROPERTY_DESCRIPTION);
        }

        /**
         * The capacity (volume or other measure) of this kind of container.
         */
        public Quantity capacity() {
            return getObject(Quantity.class, PROPERTY_CAPACITY);
        }

        /**
         * The minimum volume to be conditioned in the container.
         */
        public Quantity minimumVolumeQuantity() {
            return getObject(Quantity.class, PROPERTY_MINIMUM_VOLUME_QUANTITY);
        }

        /**
         * The minimum volume to be conditioned in the container.
         */
        public String minimumVolumeString() {
            return getString(PROPERTY_MINIMUM_VOLUME_STRING);
        }

        /**
         * Substance introduced in the kind of container to preserve, maintain or
         * enhance the specimen. Examples: Formalin, Citrate, EDTA.
         */
        public java.util.List<SpecimenDefinitionAdditive> additive() {
            return getList(SpecimenDefinitionAdditive.class, PROPERTY_ADDITIVE);
        }

        /**
         * Special processing that should be applied to the container for this
         * kind of specimen.
         */
        public String preparation() {
            return getString(PROPERTY_PREPARATION);
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

            public Builder material(final CodeableConcept material) {
                b.add(PROPERTY_MATERIAL, material);
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder cap(final CodeableConcept cap) {
                b.add(PROPERTY_CAP, cap);
                return this;
            }

            public Builder description(final String description) {
                b.add(PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder capacity(final Quantity capacity) {
                b.add(PROPERTY_CAPACITY, capacity);
                return this;
            }

            public Builder minimumVolumeQuantity(final Quantity minimumVolumeQuantity) {
                b.add(PROPERTY_MINIMUM_VOLUME_QUANTITY, minimumVolumeQuantity);
                return this;
            }

            public Builder minimumVolumeString(final String minimumVolumeString) {
                b.add(PROPERTY_MINIMUM_VOLUME_STRING, minimumVolumeString);
                return this;
            }

            public Builder additive(final java.util.List<SpecimenDefinitionAdditive> additive) {
                b.add(PROPERTY_ADDITIVE, FhirObject.toArray(additive));
                return this;
            }

            public Builder preparation(final String preparation) {
                b.add(PROPERTY_PREPARATION, preparation);
                return this;
            }

            public SpecimenDefinitionContainer build() {
                return new SpecimenDefinitionContainer(b.build());
            }
        }
    }

    public static class SpecimenDefinitionHandling extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenDefinitionHandling";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_TEMPERATURE_QUALIFIER = "temperatureQualifier";
        public static final String PROPERTY_TEMPERATURE_RANGE = "temperatureRange";
        public static final String PROPERTY_MAX_DURATION = "maxDuration";
        public static final String PROPERTY_INSTRUCTION = "instruction";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenDefinitionHandling(final JsonObject data) {
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
         * It qualifies the interval of temperature, which characterizes an
         * occurrence of handling. Conditions that are not related to temperature
         * may be handled in the instruction element.
         */
        public CodeableConcept temperatureQualifier() {
            return getObject(CodeableConcept.class, PROPERTY_TEMPERATURE_QUALIFIER);
        }

        /**
         * The temperature interval for this set of handling instructions.
         */
        public Range temperatureRange() {
            return getObject(Range.class, PROPERTY_TEMPERATURE_RANGE);
        }

        /**
         * The maximum time interval of preservation of the specimen with these
         * conditions.
         */
        public Duration maxDuration() {
            return getObject(Duration.class, PROPERTY_MAX_DURATION);
        }

        /**
         * Additional textual instructions for the preservation or transport of
         * the specimen. For instance, 'Protect from light exposure'.
         */
        public String instruction() {
            return getString(PROPERTY_INSTRUCTION);
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

            public Builder temperatureQualifier(final CodeableConcept temperatureQualifier) {
                b.add(PROPERTY_TEMPERATURE_QUALIFIER, temperatureQualifier);
                return this;
            }

            public Builder temperatureRange(final Range temperatureRange) {
                b.add(PROPERTY_TEMPERATURE_RANGE, temperatureRange);
                return this;
            }

            public Builder maxDuration(final Duration maxDuration) {
                b.add(PROPERTY_MAX_DURATION, maxDuration);
                return this;
            }

            public Builder instruction(final String instruction) {
                b.add(PROPERTY_INSTRUCTION, instruction);
                return this;
            }

            public SpecimenDefinitionHandling build() {
                return new SpecimenDefinitionHandling(b.build());
            }
        }
    }

    public static class SpecimenDefinitionTypeTested extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenDefinitionTypeTested";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_IS_DERIVED = "isDerived";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_PREFERENCE = "preference";
        public static final String PROPERTY_CONTAINER = "container";
        public static final String PROPERTY_REQUIREMENT = "requirement";
        public static final String PROPERTY_RETENTION_TIME = "retentionTime";
        public static final String PROPERTY_REJECTION_CRITERION = "rejectionCriterion";
        public static final String PROPERTY_HANDLING = "handling";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenDefinitionTypeTested(final JsonObject data) {
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
         * Primary of secondary specimen.
         */
        public Boolean isDerived() {
            return data.getBoolean(PROPERTY_IS_DERIVED);
        }

        /**
         * The kind of specimen conditioned for testing expected by lab.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, PROPERTY_TYPE);
        }

        /**
         * The preference for this type of conditioned specimen.
         */
        public String preference() {
            return getString(PROPERTY_PREFERENCE);
        }

        /**
         * The specimen's container.
         */
        public SpecimenDefinitionContainer container() {
            return getObject(SpecimenDefinitionContainer.class, PROPERTY_CONTAINER);
        }

        /**
         * Requirements for delivery and special handling of this kind of
         * conditioned specimen.
         */
        public String requirement() {
            return getString(PROPERTY_REQUIREMENT);
        }

        /**
         * The usual time that a specimen of this kind is retained after the
         * ordered tests are completed, for the purpose of additional testing.
         */
        public Duration retentionTime() {
            return getObject(Duration.class, PROPERTY_RETENTION_TIME);
        }

        /**
         * Criterion for rejection of the specimen in its container by the
         * laboratory.
         */
        public java.util.List<CodeableConcept> rejectionCriterion() {
            return getList(CodeableConcept.class, PROPERTY_REJECTION_CRITERION);
        }

        /**
         * Set of instructions for preservation/transport of the specimen at a
         * defined temperature interval, prior the testing process.
         */
        public java.util.List<SpecimenDefinitionHandling> handling() {
            return getList(SpecimenDefinitionHandling.class, PROPERTY_HANDLING);
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

            public Builder isDerived(final Boolean isDerived) {
                b.add(PROPERTY_IS_DERIVED, isDerived);
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder preference(final String preference) {
                b.add(PROPERTY_PREFERENCE, preference);
                return this;
            }

            public Builder container(final SpecimenDefinitionContainer container) {
                b.add(PROPERTY_CONTAINER, container);
                return this;
            }

            public Builder requirement(final String requirement) {
                b.add(PROPERTY_REQUIREMENT, requirement);
                return this;
            }

            public Builder retentionTime(final Duration retentionTime) {
                b.add(PROPERTY_RETENTION_TIME, retentionTime);
                return this;
            }

            public Builder rejectionCriterion(final java.util.List<CodeableConcept> rejectionCriterion) {
                b.add(PROPERTY_REJECTION_CRITERION, FhirObject.toArray(rejectionCriterion));
                return this;
            }

            public Builder handling(final java.util.List<SpecimenDefinitionHandling> handling) {
                b.add(PROPERTY_HANDLING, FhirObject.toArray(handling));
                return this;
            }

            public SpecimenDefinitionTypeTested build() {
                return new SpecimenDefinitionTypeTested(b.build());
            }
        }
    }
}
