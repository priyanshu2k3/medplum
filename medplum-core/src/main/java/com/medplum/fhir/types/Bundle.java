/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Bundle extends FhirResource {
    public static final String RESOURCE_TYPE = "Bundle";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_TIMESTAMP = "timestamp";
    public static final String PROPERTY_TOTAL = "total";
    public static final String PROPERTY_LINK = "link";
    public static final String PROPERTY_ENTRY = "entry";
    public static final String PROPERTY_SIGNATURE = "signature";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Bundle(final JsonObject data) {
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
     * A persistent identifier for the bundle that won't change as a bundle
     * is copied from server to server.
     */
    public Identifier identifier() {
        return getObject(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Indicates the purpose of this bundle - how it is intended to be used.
     */
    public String type() {
        return getString(PROPERTY_TYPE);
    }

    /**
     * The date/time that the bundle was assembled - i.e. when the resources
     * were placed in the bundle.
     */
    public java.time.Instant timestamp() {
        return java.time.Instant.parse(data.getString(PROPERTY_TIMESTAMP));
    }

    /**
     * If a set of search matches, this is the total number of entries of
     * type 'match' across all pages in the search.  It does not include
     * search.mode = 'include' or 'outcome' entries and it does not provide a
     * count of the number of entries in the Bundle.
     */
    public Integer total() {
        return data.getInt(PROPERTY_TOTAL);
    }

    /**
     * A series of links that provide context to this bundle.
     */
    public java.util.List<BundleLink> link() {
        return getList(BundleLink.class, PROPERTY_LINK);
    }

    /**
     * An entry in a bundle resource - will either contain a resource or
     * information about a resource (transactions and history only).
     */
    public java.util.List<BundleEntry> entry() {
        return getList(BundleEntry.class, PROPERTY_ENTRY);
    }

    /**
     * Digital Signature - base64 encoded. XML-DSig or a JWT.
     */
    public Signature signature() {
        return getObject(Signature.class, PROPERTY_SIGNATURE);
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

        public Builder identifier(final Identifier identifier) {
            b.add(PROPERTY_IDENTIFIER, identifier);
            return this;
        }

        public Builder type(final String type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder timestamp(final java.time.Instant timestamp) {
            b.add(PROPERTY_TIMESTAMP, timestamp.toString());
            return this;
        }

        public Builder total(final Integer total) {
            b.add(PROPERTY_TOTAL, total);
            return this;
        }

        public Builder link(final java.util.List<BundleLink> link) {
            b.add(PROPERTY_LINK, FhirObject.toArray(link));
            return this;
        }

        public Builder entry(final java.util.List<BundleEntry> entry) {
            b.add(PROPERTY_ENTRY, FhirObject.toArray(entry));
            return this;
        }

        public Builder signature(final Signature signature) {
            b.add(PROPERTY_SIGNATURE, signature);
            return this;
        }

        public Bundle build() {
            return new Bundle(b.build());
        }
    }

    public static class BundleEntry extends FhirObject {
        public static final String RESOURCE_TYPE = "BundleEntry";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_LINK = "link";
        public static final String PROPERTY_FULL_URL = "fullUrl";
        public static final String PROPERTY_RESOURCE = "resource";
        public static final String PROPERTY_SEARCH = "search";
        public static final String PROPERTY_REQUEST = "request";
        public static final String PROPERTY_RESPONSE = "response";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public BundleEntry(final JsonObject data) {
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
         * A series of links that provide context to this entry.
         */
        public java.util.List<BundleLink> link() {
            return getList(BundleLink.class, PROPERTY_LINK);
        }

        /**
         * The Absolute URL for the resource.  The fullUrl SHALL NOT disagree
         * with the id in the resource - i.e. if the fullUrl is not a urn:uuid,
         * the URL shall be version-independent URL consistent with the
         * Resource.id. The fullUrl is a version independent reference to the
         * resource. The fullUrl element SHALL have a value except that: 
         * * fullUrl can be empty on a POST (although it does not need to when
         * specifying a temporary id for reference in the bundle)
         * * Results from operations might involve resources that are not
         * identified.
         */
        public String fullUrl() {
            return getString(PROPERTY_FULL_URL);
        }

        /**
         * The Resource for the entry. The purpose/meaning of the resource is
         * determined by the Bundle.type.
         */
        public FhirResource resource() {
            return getObject(FhirResource.class, PROPERTY_RESOURCE);
        }

        public <T extends FhirResource> T resource(final Class<T> c) {
            return getObject(c, PROPERTY_RESOURCE);
        }

        /**
         * Information about the search process that lead to the creation of this
         * entry.
         */
        public BundleSearch search() {
            return getObject(BundleSearch.class, PROPERTY_SEARCH);
        }

        /**
         * Additional information about how this entry should be processed as
         * part of a transaction or batch.  For history, it shows how the entry
         * was processed to create the version contained in the entry.
         */
        public BundleRequest request() {
            return getObject(BundleRequest.class, PROPERTY_REQUEST);
        }

        /**
         * Indicates the results of processing the corresponding 'request' entry
         * in the batch or transaction being responded to or what the results of
         * an operation where when returning history.
         */
        public BundleResponse response() {
            return getObject(BundleResponse.class, PROPERTY_RESPONSE);
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

            public Builder link(final java.util.List<BundleLink> link) {
                b.add(PROPERTY_LINK, FhirObject.toArray(link));
                return this;
            }

            public Builder fullUrl(final String fullUrl) {
                b.add(PROPERTY_FULL_URL, fullUrl);
                return this;
            }

            public Builder resource(final JsonObject resource) {
                b.add(PROPERTY_RESOURCE, resource);
                return this;
            }

            public Builder search(final BundleSearch search) {
                b.add(PROPERTY_SEARCH, search);
                return this;
            }

            public Builder request(final BundleRequest request) {
                b.add(PROPERTY_REQUEST, request);
                return this;
            }

            public Builder response(final BundleResponse response) {
                b.add(PROPERTY_RESPONSE, response);
                return this;
            }

            public BundleEntry build() {
                return new BundleEntry(b.build());
            }
        }
    }

    public static class BundleLink extends FhirObject {
        public static final String RESOURCE_TYPE = "BundleLink";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_RELATION = "relation";
        public static final String PROPERTY_URL = "url";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public BundleLink(final JsonObject data) {
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
         * A name which details the functional use for this link - see
         * [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1).
         */
        public String relation() {
            return getString(PROPERTY_RELATION);
        }

        /**
         * The reference details for the link.
         */
        public String url() {
            return getString(PROPERTY_URL);
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

            public Builder relation(final String relation) {
                b.add(PROPERTY_RELATION, relation);
                return this;
            }

            public Builder url(final String url) {
                b.add(PROPERTY_URL, url);
                return this;
            }

            public BundleLink build() {
                return new BundleLink(b.build());
            }
        }
    }

    public static class BundleRequest extends FhirObject {
        public static final String RESOURCE_TYPE = "BundleRequest";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_METHOD = "method";
        public static final String PROPERTY_URL = "url";
        public static final String PROPERTY_IF_NONE_MATCH = "ifNoneMatch";
        public static final String PROPERTY_IF_MODIFIED_SINCE = "ifModifiedSince";
        public static final String PROPERTY_IF_MATCH = "ifMatch";
        public static final String PROPERTY_IF_NONE_EXIST = "ifNoneExist";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public BundleRequest(final JsonObject data) {
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
         * In a transaction or batch, this is the HTTP action to be executed for
         * this entry. In a history bundle, this indicates the HTTP action that
         * occurred.
         */
        public String method() {
            return getString(PROPERTY_METHOD);
        }

        /**
         * The URL for this entry, relative to the root (the address to which the
         * request is posted).
         */
        public String url() {
            return getString(PROPERTY_URL);
        }

        /**
         * If the ETag values match, return a 304 Not Modified status. See the
         * API documentation for ["Conditional Read"](http.html#cread).
         */
        public String ifNoneMatch() {
            return getString(PROPERTY_IF_NONE_MATCH);
        }

        /**
         * Only perform the operation if the last updated date matches. See the
         * API documentation for ["Conditional Read"](http.html#cread).
         */
        public java.time.Instant ifModifiedSince() {
            return java.time.Instant.parse(data.getString(PROPERTY_IF_MODIFIED_SINCE));
        }

        /**
         * Only perform the operation if the Etag value matches. For more
         * information, see the API section ["Managing Resource
         * Contention"](http.html#concurrency).
         */
        public String ifMatch() {
            return getString(PROPERTY_IF_MATCH);
        }

        /**
         * Instruct the server not to perform the create if a specified resource
         * already exists. For further information, see the API documentation for
         * ["Conditional Create"](http.html#ccreate). This is just the query
         * portion of the URL - what follows the "?" (not including the "?").
         */
        public String ifNoneExist() {
            return getString(PROPERTY_IF_NONE_EXIST);
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

            public Builder method(final String method) {
                b.add(PROPERTY_METHOD, method);
                return this;
            }

            public Builder url(final String url) {
                b.add(PROPERTY_URL, url);
                return this;
            }

            public Builder ifNoneMatch(final String ifNoneMatch) {
                b.add(PROPERTY_IF_NONE_MATCH, ifNoneMatch);
                return this;
            }

            public Builder ifModifiedSince(final java.time.Instant ifModifiedSince) {
                b.add(PROPERTY_IF_MODIFIED_SINCE, ifModifiedSince.toString());
                return this;
            }

            public Builder ifMatch(final String ifMatch) {
                b.add(PROPERTY_IF_MATCH, ifMatch);
                return this;
            }

            public Builder ifNoneExist(final String ifNoneExist) {
                b.add(PROPERTY_IF_NONE_EXIST, ifNoneExist);
                return this;
            }

            public BundleRequest build() {
                return new BundleRequest(b.build());
            }
        }
    }

    public static class BundleResponse extends FhirObject {
        public static final String RESOURCE_TYPE = "BundleResponse";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_STATUS = "status";
        public static final String PROPERTY_LOCATION = "location";
        public static final String PROPERTY_ETAG = "etag";
        public static final String PROPERTY_LAST_MODIFIED = "lastModified";
        public static final String PROPERTY_OUTCOME = "outcome";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public BundleResponse(final JsonObject data) {
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
         * The status code returned by processing this entry. The status SHALL
         * start with a 3 digit HTTP code (e.g. 404) and may contain the standard
         * HTTP description associated with the status code.
         */
        public String status() {
            return getString(PROPERTY_STATUS);
        }

        /**
         * The location header created by processing this operation, populated if
         * the operation returns a location.
         */
        public String location() {
            return getString(PROPERTY_LOCATION);
        }

        /**
         * The Etag for the resource, if the operation for the entry produced a
         * versioned resource (see [Resource Metadata and
         * Versioning](http.html#versioning) and [Managing Resource
         * Contention](http.html#concurrency)).
         */
        public String etag() {
            return getString(PROPERTY_ETAG);
        }

        /**
         * The date/time that the resource was modified on the server.
         */
        public java.time.Instant lastModified() {
            return java.time.Instant.parse(data.getString(PROPERTY_LAST_MODIFIED));
        }

        /**
         * An OperationOutcome containing hints and warnings produced as part of
         * processing this entry in a batch or transaction.
         */
        public FhirResource outcome() {
            return getObject(FhirResource.class, PROPERTY_OUTCOME);
        }

        public <T extends FhirResource> T outcome(final Class<T> c) {
            return getObject(c, PROPERTY_OUTCOME);
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

            public Builder status(final String status) {
                b.add(PROPERTY_STATUS, status);
                return this;
            }

            public Builder location(final String location) {
                b.add(PROPERTY_LOCATION, location);
                return this;
            }

            public Builder etag(final String etag) {
                b.add(PROPERTY_ETAG, etag);
                return this;
            }

            public Builder lastModified(final java.time.Instant lastModified) {
                b.add(PROPERTY_LAST_MODIFIED, lastModified.toString());
                return this;
            }

            public Builder outcome(final JsonObject outcome) {
                b.add(PROPERTY_OUTCOME, outcome);
                return this;
            }

            public BundleResponse build() {
                return new BundleResponse(b.build());
            }
        }
    }

    public static class BundleSearch extends FhirObject {
        public static final String RESOURCE_TYPE = "BundleSearch";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_MODE = "mode";
        public static final String PROPERTY_SCORE = "score";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public BundleSearch(final JsonObject data) {
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
         * Why this entry is in the result set - whether it's included as a match
         * or because of an _include requirement, or to convey information or
         * warning information about the search process.
         */
        public String mode() {
            return getString(PROPERTY_MODE);
        }

        /**
         * When searching, the server's search ranking score for the entry.
         */
        public Double score() {
            return data.getJsonNumber(PROPERTY_SCORE).doubleValue();
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

            public Builder mode(final String mode) {
                b.add(PROPERTY_MODE, mode);
                return this;
            }

            public Builder score(final Double score) {
                b.add(PROPERTY_SCORE, score);
                return this;
            }

            public BundleSearch build() {
                return new BundleSearch(b.build());
            }
        }
    }
}
