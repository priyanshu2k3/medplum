/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Subscription extends FhirResource {
    public static final String RESOURCE_TYPE = "Subscription";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_END = "end";
    public static final String PROPERTY_REASON = "reason";
    public static final String PROPERTY_CRITERIA = "criteria";
    public static final String PROPERTY_ERROR = "error";
    public static final String PROPERTY_CHANNEL = "channel";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Subscription(final JsonObject data) {
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
     * The status of the subscription, which marks the server state for
     * managing the subscription.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Contact details for a human to contact about the subscription. The
     * primary use of this for system administrator troubleshooting.
     */
    public java.util.List<ContactPoint> contact() {
        return getList(ContactPoint.class, PROPERTY_CONTACT);
    }

    /**
     * The time for the server to turn the subscription off.
     */
    public java.time.Instant end() {
        return java.time.Instant.parse(data.getString(PROPERTY_END));
    }

    /**
     * A description of why this subscription is defined.
     */
    public String reason() {
        return getString(PROPERTY_REASON);
    }

    /**
     * The rules that the server should use to determine when to generate
     * notifications for this subscription.
     */
    public String criteria() {
        return getString(PROPERTY_CRITERIA);
    }

    /**
     * A record of the last error that occurred when the server processed a
     * notification.
     */
    public String error() {
        return getString(PROPERTY_ERROR);
    }

    /**
     * Details where to send notifications when resources are received that
     * meet the criteria.
     */
    public SubscriptionChannel channel() {
        return getObject(SubscriptionChannel.class, PROPERTY_CHANNEL);
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

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder contact(final java.util.List<ContactPoint> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder end(final java.time.Instant end) {
            b.add(PROPERTY_END, end.toString());
            return this;
        }

        public Builder reason(final String reason) {
            b.add(PROPERTY_REASON, reason);
            return this;
        }

        public Builder criteria(final String criteria) {
            b.add(PROPERTY_CRITERIA, criteria);
            return this;
        }

        public Builder error(final String error) {
            b.add(PROPERTY_ERROR, error);
            return this;
        }

        public Builder channel(final SubscriptionChannel channel) {
            b.add(PROPERTY_CHANNEL, channel);
            return this;
        }

        public Subscription build() {
            return new Subscription(b.build());
        }
    }

    public static class SubscriptionChannel extends FhirObject {
        public static final String RESOURCE_TYPE = "SubscriptionChannel";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_ENDPOINT = "endpoint";
        public static final String PROPERTY_PAYLOAD = "payload";
        public static final String PROPERTY_HEADER = "header";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubscriptionChannel(final JsonObject data) {
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
         * The type of channel to send notifications on.
         */
        public String type() {
            return getString(PROPERTY_TYPE);
        }

        /**
         * The url that describes the actual end-point to send messages to.
         */
        public String endpoint() {
            return getString(PROPERTY_ENDPOINT);
        }

        /**
         * The mime type to send the payload in - either application/fhir+xml, or
         * application/fhir+json. If the payload is not present, then there is no
         * payload in the notification, just a notification. The mime type
         * "text/plain" may also be used for Email and SMS subscriptions.
         */
        public String payload() {
            return getString(PROPERTY_PAYLOAD);
        }

        /**
         * Additional headers / information to send as part of the notification.
         */
        public java.util.List<String> header() {
            return getList(String.class, PROPERTY_HEADER);
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

            public Builder type(final String type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder endpoint(final String endpoint) {
                b.add(PROPERTY_ENDPOINT, endpoint);
                return this;
            }

            public Builder payload(final String payload) {
                b.add(PROPERTY_PAYLOAD, payload);
                return this;
            }

            public Builder header(final java.util.List<String> header) {
                b.add(PROPERTY_HEADER, FhirObject.toStringArray(header));
                return this;
            }

            public SubscriptionChannel build() {
                return new SubscriptionChannel(b.build());
            }
        }
    }
}
