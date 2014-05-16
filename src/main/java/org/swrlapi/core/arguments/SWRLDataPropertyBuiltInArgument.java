package org.swrlapi.core.arguments;

import org.semanticweb.owlapi.model.OWLDataProperty;

/**
 * Represents an OWL data property argument to a built-in atom.
 */
public interface SWRLDataPropertyBuiltInArgument extends SWRLNamedBuiltInArgument
{
	OWLDataProperty getOWLDataProperty();
}