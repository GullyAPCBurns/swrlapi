package org.swrlapi.factory;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDatatype;

/**
 * A convenience factory to create a core set of OWLAPI OWL datatypes.
 *
 * @see org.semanticweb.owlapi.model.OWLDatatype
 */
public interface OWLDatatypeFactory
{
  @NonNull OWLDatatype getOWLDatatype(@NonNull IRI iri);

  @NonNull OWLDatatype getByteDatatype();

  @NonNull OWLDatatype getShortDatatype();

  @NonNull OWLDatatype getIntDatatype();

  @NonNull OWLDatatype getLongDatatype();

  @NonNull OWLDatatype getFloatDatatype();

  @NonNull OWLDatatype getDoubleDatatype();

  @NonNull OWLDatatype getDecimalDatatype();

  @NonNull OWLDatatype getIntegerDatatype();

  @NonNull OWLDatatype getStringDatatype();

  @NonNull OWLDatatype getBooleanDatatype();

  @NonNull OWLDatatype getURIDatatype();

  @NonNull OWLDatatype getDateDatatype();

  @NonNull OWLDatatype getTimeDatatype();

  @NonNull OWLDatatype getDateTimeDatatype();

  @NonNull OWLDatatype getDurationDatatype();
}
