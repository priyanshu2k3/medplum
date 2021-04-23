/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.JsonObject;

public class ResearchDefinition extends FhirResource {
    public static final String RESOURCE_TYPE = "ResearchDefinition";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_URL = "url";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_VERSION = "version";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_TITLE = "title";
    public static final String PROPERTY_SHORT_TITLE = "shortTitle";
    public static final String PROPERTY_SUBTITLE = "subtitle";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_EXPERIMENTAL = "experimental";
    public static final String PROPERTY_SUBJECT_CODEABLE_CONCEPT = "subjectCodeableConcept";
    public static final String PROPERTY_SUBJECT_REFERENCE = "subjectReference";
    public static final String PROPERTY_DATE = "date";
    public static final String PROPERTY_PUBLISHER = "publisher";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_COMMENT = "comment";
    public static final String PROPERTY_USE_CONTEXT = "useContext";
    public static final String PROPERTY_JURISDICTION = "jurisdiction";
    public static final String PROPERTY_PURPOSE = "purpose";
    public static final String PROPERTY_USAGE = "usage";
    public static final String PROPERTY_COPYRIGHT = "copyright";
    public static final String PROPERTY_APPROVAL_DATE = "approvalDate";
    public static final String PROPERTY_LAST_REVIEW_DATE = "lastReviewDate";
    public static final String PROPERTY_EFFECTIVE_PERIOD = "effectivePeriod";
    public static final String PROPERTY_TOPIC = "topic";
    public static final String PROPERTY_AUTHOR = "author";
    public static final String PROPERTY_EDITOR = "editor";
    public static final String PROPERTY_REVIEWER = "reviewer";
    public static final String PROPERTY_ENDORSER = "endorser";
    public static final String PROPERTY_RELATED_ARTIFACT = "relatedArtifact";
    public static final String PROPERTY_LIBRARY = "library";
    public static final String PROPERTY_POPULATION = "population";
    public static final String PROPERTY_EXPOSURE = "exposure";
    public static final String PROPERTY_EXPOSURE_ALTERNATIVE = "exposureAlternative";
    public static final String PROPERTY_OUTCOME = "outcome";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ResearchDefinition(final JsonObject data) {
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
     * An absolute URI that is used to identify this research definition when
     * it is referenced in a specification, model, design or an instance;
     * also called its canonical identifier. This SHOULD be globally unique
     * and SHOULD be a literal address at which at which an authoritative
     * instance of this research definition is (or will be) published. This
     * URL can be the target of a canonical reference. It SHALL remain the
     * same when the research definition is stored on different servers.
     */
    public String url() {
        return getString(PROPERTY_URL);
    }

    /**
     * A formal identifier that is used to identify this research definition
     * when it is represented in other formats, or referenced in a
     * specification, model, design or an instance.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The identifier that is used to identify this version of the research
     * definition when it is referenced in a specification, model, design or
     * instance. This is an arbitrary value managed by the research
     * definition author and is not expected to be globally unique. For
     * example, it might be a timestamp (e.g. yyyymmdd) if a managed version
     * is not available. There is also no expectation that versions can be
     * placed in a lexicographical sequence. To provide a version consistent
     * with the Decision Support Service specification, use the format
     * Major.Minor.Revision (e.g. 1.0.0). For more information on versioning
     * knowledge assets, refer to the Decision Support Service specification.
     * Note that a version is required for non-experimental active artifacts.
     */
    public String version() {
        return getString(PROPERTY_VERSION);
    }

    /**
     * A natural language name identifying the research definition. This name
     * should be usable as an identifier for the module by machine processing
     * applications such as code generation.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * A short, descriptive, user-friendly title for the research definition.
     */
    public String title() {
        return getString(PROPERTY_TITLE);
    }

    /**
     * The short title provides an alternate title for use in informal
     * descriptive contexts where the full, formal title is not necessary.
     */
    public String shortTitle() {
        return getString(PROPERTY_SHORT_TITLE);
    }

    /**
     * An explanatory or alternate title for the ResearchDefinition giving
     * additional information about its content.
     */
    public String subtitle() {
        return getString(PROPERTY_SUBTITLE);
    }

    /**
     * The status of this research definition. Enables tracking the
     * life-cycle of the content.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * A Boolean value to indicate that this research definition is authored
     * for testing purposes (or education/evaluation/marketing) and is not
     * intended to be used for genuine usage.
     */
    public Boolean experimental() {
        return data.getBoolean(PROPERTY_EXPERIMENTAL);
    }

    /**
     * The intended subjects for the ResearchDefinition. If this element is
     * not provided, a Patient subject is assumed, but the subject of the
     * ResearchDefinition can be anything.
     */
    public CodeableConcept subjectCodeableConcept() {
        return getObject(CodeableConcept.class, PROPERTY_SUBJECT_CODEABLE_CONCEPT);
    }

    /**
     * The intended subjects for the ResearchDefinition. If this element is
     * not provided, a Patient subject is assumed, but the subject of the
     * ResearchDefinition can be anything.
     */
    public Reference subjectReference() {
        return getObject(Reference.class, PROPERTY_SUBJECT_REFERENCE);
    }

    /**
     * The date  (and optionally time) when the research definition was
     * published. The date must change when the business version changes and
     * it must change if the status code changes. In addition, it should
     * change when the substantive content of the research definition
     * changes.
     */
    public java.time.Instant date() {
        return java.time.Instant.parse(data.getString(PROPERTY_DATE));
    }

    /**
     * The name of the organization or individual that published the research
     * definition.
     */
    public String publisher() {
        return getString(PROPERTY_PUBLISHER);
    }

    /**
     * Contact details to assist a user in finding and communicating with the
     * publisher.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, PROPERTY_CONTACT);
    }

    /**
     * A free text natural language description of the research definition
     * from a consumer's perspective.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * A human-readable string to clarify or explain concepts about the
     * resource.
     */
    public java.util.List<String> comment() {
        return getList(String.class, PROPERTY_COMMENT);
    }

    /**
     * The content was developed with a focus and intent of supporting the
     * contexts that are listed. These contexts may be general categories
     * (gender, age, ...) or may be references to specific programs
     * (insurance plans, studies, ...) and may be used to assist with
     * indexing and searching for appropriate research definition instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, PROPERTY_USE_CONTEXT);
    }

    /**
     * A legal or geographic region in which the research definition is
     * intended to be used.
     */
    public java.util.List<CodeableConcept> jurisdiction() {
        return getList(CodeableConcept.class, PROPERTY_JURISDICTION);
    }

    /**
     * Explanation of why this research definition is needed and why it has
     * been designed as it has.
     */
    public String purpose() {
        return getString(PROPERTY_PURPOSE);
    }

    /**
     * A detailed description, from a clinical perspective, of how the
     * ResearchDefinition is used.
     */
    public String usage() {
        return getString(PROPERTY_USAGE);
    }

    /**
     * A copyright statement relating to the research definition and/or its
     * contents. Copyright statements are generally legal restrictions on the
     * use and publishing of the research definition.
     */
    public String copyright() {
        return getString(PROPERTY_COPYRIGHT);
    }

    /**
     * The date on which the resource content was approved by the publisher.
     * Approval happens once when the content is officially approved for
     * usage.
     */
    public java.time.Instant approvalDate() {
        return java.time.Instant.parse(data.getString(PROPERTY_APPROVAL_DATE));
    }

    /**
     * The date on which the resource content was last reviewed. Review
     * happens periodically after approval but does not change the original
     * approval date.
     */
    public java.time.Instant lastReviewDate() {
        return java.time.Instant.parse(data.getString(PROPERTY_LAST_REVIEW_DATE));
    }

    /**
     * The period during which the research definition content was or is
     * planned to be in active use.
     */
    public Period effectivePeriod() {
        return getObject(Period.class, PROPERTY_EFFECTIVE_PERIOD);
    }

    /**
     * Descriptive topics related to the content of the ResearchDefinition.
     * Topics provide a high-level categorization grouping types of
     * ResearchDefinitions that can be useful for filtering and searching.
     */
    public java.util.List<CodeableConcept> topic() {
        return getList(CodeableConcept.class, PROPERTY_TOPIC);
    }

    /**
     * An individiual or organization primarily involved in the creation and
     * maintenance of the content.
     */
    public java.util.List<ContactDetail> author() {
        return getList(ContactDetail.class, PROPERTY_AUTHOR);
    }

    /**
     * An individual or organization primarily responsible for internal
     * coherence of the content.
     */
    public java.util.List<ContactDetail> editor() {
        return getList(ContactDetail.class, PROPERTY_EDITOR);
    }

    /**
     * An individual or organization primarily responsible for review of some
     * aspect of the content.
     */
    public java.util.List<ContactDetail> reviewer() {
        return getList(ContactDetail.class, PROPERTY_REVIEWER);
    }

    /**
     * An individual or organization responsible for officially endorsing the
     * content for use in some setting.
     */
    public java.util.List<ContactDetail> endorser() {
        return getList(ContactDetail.class, PROPERTY_ENDORSER);
    }

    /**
     * Related artifacts such as additional documentation, justification, or
     * bibliographic references.
     */
    public java.util.List<RelatedArtifact> relatedArtifact() {
        return getList(RelatedArtifact.class, PROPERTY_RELATED_ARTIFACT);
    }

    /**
     * A reference to a Library resource containing the formal logic used by
     * the ResearchDefinition.
     */
    public java.util.List<String> library() {
        return getList(String.class, PROPERTY_LIBRARY);
    }

    /**
     * A reference to a ResearchElementDefinition resource that defines the
     * population for the research.
     */
    public Reference population() {
        return getObject(Reference.class, PROPERTY_POPULATION);
    }

    /**
     * A reference to a ResearchElementDefinition resource that defines the
     * exposure for the research.
     */
    public Reference exposure() {
        return getObject(Reference.class, PROPERTY_EXPOSURE);
    }

    /**
     * A reference to a ResearchElementDefinition resource that defines the
     * exposureAlternative for the research.
     */
    public Reference exposureAlternative() {
        return getObject(Reference.class, PROPERTY_EXPOSURE_ALTERNATIVE);
    }

    /**
     * A reference to a ResearchElementDefinition resomece that defines the
     * outcome for the research.
     */
    public Reference outcome() {
        return getObject(Reference.class, PROPERTY_OUTCOME);
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

        public Builder url(final String url) {
            b.add(PROPERTY_URL, url);
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder version(final String version) {
            b.add(PROPERTY_VERSION, version);
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder title(final String title) {
            b.add(PROPERTY_TITLE, title);
            return this;
        }

        public Builder shortTitle(final String shortTitle) {
            b.add(PROPERTY_SHORT_TITLE, shortTitle);
            return this;
        }

        public Builder subtitle(final String subtitle) {
            b.add(PROPERTY_SUBTITLE, subtitle);
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder experimental(final Boolean experimental) {
            b.add(PROPERTY_EXPERIMENTAL, experimental);
            return this;
        }

        public Builder subjectCodeableConcept(final CodeableConcept subjectCodeableConcept) {
            b.add(PROPERTY_SUBJECT_CODEABLE_CONCEPT, subjectCodeableConcept);
            return this;
        }

        public Builder subjectReference(final Reference subjectReference) {
            b.add(PROPERTY_SUBJECT_REFERENCE, subjectReference);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder publisher(final String publisher) {
            b.add(PROPERTY_PUBLISHER, publisher);
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder comment(final java.util.List<String> comment) {
            b.add(PROPERTY_COMMENT, FhirObject.toStringArray(comment));
            return this;
        }

        public Builder useContext(final java.util.List<UsageContext> useContext) {
            b.add(PROPERTY_USE_CONTEXT, FhirObject.toArray(useContext));
            return this;
        }

        public Builder jurisdiction(final java.util.List<CodeableConcept> jurisdiction) {
            b.add(PROPERTY_JURISDICTION, FhirObject.toArray(jurisdiction));
            return this;
        }

        public Builder purpose(final String purpose) {
            b.add(PROPERTY_PURPOSE, purpose);
            return this;
        }

        public Builder usage(final String usage) {
            b.add(PROPERTY_USAGE, usage);
            return this;
        }

        public Builder copyright(final String copyright) {
            b.add(PROPERTY_COPYRIGHT, copyright);
            return this;
        }

        public Builder approvalDate(final java.time.Instant approvalDate) {
            b.add(PROPERTY_APPROVAL_DATE, approvalDate.toString());
            return this;
        }

        public Builder lastReviewDate(final java.time.Instant lastReviewDate) {
            b.add(PROPERTY_LAST_REVIEW_DATE, lastReviewDate.toString());
            return this;
        }

        public Builder effectivePeriod(final Period effectivePeriod) {
            b.add(PROPERTY_EFFECTIVE_PERIOD, effectivePeriod);
            return this;
        }

        public Builder topic(final java.util.List<CodeableConcept> topic) {
            b.add(PROPERTY_TOPIC, FhirObject.toArray(topic));
            return this;
        }

        public Builder author(final java.util.List<ContactDetail> author) {
            b.add(PROPERTY_AUTHOR, FhirObject.toArray(author));
            return this;
        }

        public Builder editor(final java.util.List<ContactDetail> editor) {
            b.add(PROPERTY_EDITOR, FhirObject.toArray(editor));
            return this;
        }

        public Builder reviewer(final java.util.List<ContactDetail> reviewer) {
            b.add(PROPERTY_REVIEWER, FhirObject.toArray(reviewer));
            return this;
        }

        public Builder endorser(final java.util.List<ContactDetail> endorser) {
            b.add(PROPERTY_ENDORSER, FhirObject.toArray(endorser));
            return this;
        }

        public Builder relatedArtifact(final java.util.List<RelatedArtifact> relatedArtifact) {
            b.add(PROPERTY_RELATED_ARTIFACT, FhirObject.toArray(relatedArtifact));
            return this;
        }

        public Builder library(final java.util.List<String> library) {
            b.add(PROPERTY_LIBRARY, FhirObject.toStringArray(library));
            return this;
        }

        public Builder population(final Reference population) {
            b.add(PROPERTY_POPULATION, population);
            return this;
        }

        public Builder exposure(final Reference exposure) {
            b.add(PROPERTY_EXPOSURE, exposure);
            return this;
        }

        public Builder exposureAlternative(final Reference exposureAlternative) {
            b.add(PROPERTY_EXPOSURE_ALTERNATIVE, exposureAlternative);
            return this;
        }

        public Builder outcome(final Reference outcome) {
            b.add(PROPERTY_OUTCOME, outcome);
            return this;
        }

        public ResearchDefinition build() {
            return new ResearchDefinition(b.build());
        }
    }
}
