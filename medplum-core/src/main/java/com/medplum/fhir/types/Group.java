/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Group extends FhirResource {
    public static final String RESOURCE_TYPE = "Group";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_ACTUAL = "actual";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_QUANTITY = "quantity";
    public static final String PROPERTY_MANAGING_ENTITY = "managingEntity";
    public static final String PROPERTY_CHARACTERISTIC = "characteristic";
    public static final String PROPERTY_MEMBER = "member";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Group(final JsonObject data) {
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
     * A unique business identifier for this group.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Indicates whether the record for the group is available for use or is
     * merely being retained for historical purposes.
     */
    public Boolean active() {
        return data.getBoolean(PROPERTY_ACTIVE);
    }

    /**
     * Identifies the broad classification of the kind of resources the group
     * includes.
     */
    public String type() {
        return getString(PROPERTY_TYPE);
    }

    /**
     * If true, indicates that the resource refers to a specific group of
     * real individuals.  If false, the group defines a set of intended
     * individuals.
     */
    public Boolean actual() {
        return data.getBoolean(PROPERTY_ACTUAL);
    }

    /**
     * Provides a specific type of resource the group includes; e.g. "cow",
     * "syringe", etc.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, PROPERTY_CODE);
    }

    /**
     * A label assigned to the group for human identification and
     * communication.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * A count of the number of resource instances that are part of the
     * group.
     */
    public Integer quantity() {
        return data.getInt(PROPERTY_QUANTITY);
    }

    /**
     * Entity responsible for defining and maintaining Group characteristics
     * and/or registered members.
     */
    public Reference managingEntity() {
        return getObject(Reference.class, PROPERTY_MANAGING_ENTITY);
    }

    /**
     * Identifies traits whose presence r absence is shared by members of the
     * group.
     */
    public java.util.List<GroupCharacteristic> characteristic() {
        return getList(GroupCharacteristic.class, PROPERTY_CHARACTERISTIC);
    }

    /**
     * Identifies the resource instances that are members of the group.
     */
    public java.util.List<GroupMember> member() {
        return getList(GroupMember.class, PROPERTY_MEMBER);
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

        public Builder active(final Boolean active) {
            b.add(PROPERTY_ACTIVE, active);
            return this;
        }

        public Builder type(final String type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder actual(final Boolean actual) {
            b.add(PROPERTY_ACTUAL, actual);
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(PROPERTY_CODE, code);
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder quantity(final Integer quantity) {
            b.add(PROPERTY_QUANTITY, quantity);
            return this;
        }

        public Builder managingEntity(final Reference managingEntity) {
            b.add(PROPERTY_MANAGING_ENTITY, managingEntity);
            return this;
        }

        public Builder characteristic(final java.util.List<GroupCharacteristic> characteristic) {
            b.add(PROPERTY_CHARACTERISTIC, FhirObject.toArray(characteristic));
            return this;
        }

        public Builder member(final java.util.List<GroupMember> member) {
            b.add(PROPERTY_MEMBER, FhirObject.toArray(member));
            return this;
        }

        public Group build() {
            return new Group(b.build());
        }
    }

    public static class GroupCharacteristic extends FhirObject {
        public static final String RESOURCE_TYPE = "GroupCharacteristic";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_VALUE_CODEABLE_CONCEPT = "valueCodeableConcept";
        public static final String PROPERTY_VALUE_BOOLEAN = "valueBoolean";
        public static final String PROPERTY_VALUE_QUANTITY = "valueQuantity";
        public static final String PROPERTY_VALUE_RANGE = "valueRange";
        public static final String PROPERTY_VALUE_REFERENCE = "valueReference";
        public static final String PROPERTY_EXCLUDE = "exclude";
        public static final String PROPERTY_PERIOD = "period";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public GroupCharacteristic(final JsonObject data) {
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
         * A code that identifies the kind of trait being asserted.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * The value of the trait that holds (or does not hold - see 'exclude')
         * for members of the group.
         */
        public CodeableConcept valueCodeableConcept() {
            return getObject(CodeableConcept.class, PROPERTY_VALUE_CODEABLE_CONCEPT);
        }

        /**
         * The value of the trait that holds (or does not hold - see 'exclude')
         * for members of the group.
         */
        public Boolean valueBoolean() {
            return data.getBoolean(PROPERTY_VALUE_BOOLEAN);
        }

        /**
         * The value of the trait that holds (or does not hold - see 'exclude')
         * for members of the group.
         */
        public Quantity valueQuantity() {
            return getObject(Quantity.class, PROPERTY_VALUE_QUANTITY);
        }

        /**
         * The value of the trait that holds (or does not hold - see 'exclude')
         * for members of the group.
         */
        public Range valueRange() {
            return getObject(Range.class, PROPERTY_VALUE_RANGE);
        }

        /**
         * The value of the trait that holds (or does not hold - see 'exclude')
         * for members of the group.
         */
        public Reference valueReference() {
            return getObject(Reference.class, PROPERTY_VALUE_REFERENCE);
        }

        /**
         * If true, indicates the characteristic is one that is NOT held by
         * members of the group.
         */
        public Boolean exclude() {
            return data.getBoolean(PROPERTY_EXCLUDE);
        }

        /**
         * The period over which the characteristic is tested; e.g. the patient
         * had an operation during the month of June.
         */
        public Period period() {
            return getObject(Period.class, PROPERTY_PERIOD);
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

            public Builder valueBoolean(final Boolean valueBoolean) {
                b.add(PROPERTY_VALUE_BOOLEAN, valueBoolean);
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

            public Builder valueReference(final Reference valueReference) {
                b.add(PROPERTY_VALUE_REFERENCE, valueReference);
                return this;
            }

            public Builder exclude(final Boolean exclude) {
                b.add(PROPERTY_EXCLUDE, exclude);
                return this;
            }

            public Builder period(final Period period) {
                b.add(PROPERTY_PERIOD, period);
                return this;
            }

            public GroupCharacteristic build() {
                return new GroupCharacteristic(b.build());
            }
        }
    }

    public static class GroupMember extends FhirObject {
        public static final String RESOURCE_TYPE = "GroupMember";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_ENTITY = "entity";
        public static final String PROPERTY_PERIOD = "period";
        public static final String PROPERTY_INACTIVE = "inactive";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public GroupMember(final JsonObject data) {
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
         * A reference to the entity that is a member of the group. Must be
         * consistent with Group.type. If the entity is another group, then the
         * type must be the same.
         */
        public Reference entity() {
            return getObject(Reference.class, PROPERTY_ENTITY);
        }

        /**
         * The period that the member was in the group, if known.
         */
        public Period period() {
            return getObject(Period.class, PROPERTY_PERIOD);
        }

        /**
         * A flag to indicate that the member is no longer in the group, but
         * previously may have been a member.
         */
        public Boolean inactive() {
            return data.getBoolean(PROPERTY_INACTIVE);
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

            public Builder entity(final Reference entity) {
                b.add(PROPERTY_ENTITY, entity);
                return this;
            }

            public Builder period(final Period period) {
                b.add(PROPERTY_PERIOD, period);
                return this;
            }

            public Builder inactive(final Boolean inactive) {
                b.add(PROPERTY_INACTIVE, inactive);
                return this;
            }

            public GroupMember build() {
                return new GroupMember(b.build());
            }
        }
    }
}
