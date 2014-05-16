package org.swrlapi.ext.impl;

import java.util.List;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.swrlapi.core.OWLIRIResolver;
import org.swrlapi.core.OWLLiteralFactory;
import org.swrlapi.core.SWRLAPIFactory;
import org.swrlapi.core.arguments.SWRLBuiltInArgument;
import org.swrlapi.core.arguments.SWRLBuiltInArgumentFactory;
import org.swrlapi.ext.SWRLAPIBuiltInAtom;
import org.swrlapi.ext.SWRLAPILiteralFactory;
import org.swrlapi.ext.SWRLAPIOWLDataFactory;
import org.swrlapi.ext.SWRLAPIOWLDatatypeFactory;
import org.swrlapi.ext.SWRLAPIRule;
import org.swrlapi.sqwrl.values.SQWRLResultValueFactory;

import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;

public class DefaultSWRLAPIOWLDataFactory extends OWLDataFactoryImpl implements SWRLAPIOWLDataFactory
{
	private static final long serialVersionUID = 1L;

	private final OWLIRIResolver owlIRIResolver;
	private final OWLLiteralFactory owlLiteralFactory;
	private final SWRLAPIOWLDatatypeFactory swrlapiOWLDatatypeFactory;
	private final SWRLAPILiteralFactory swrlapiLiteralFactory;
	private final SWRLBuiltInArgumentFactory swrlBuiltInArgumentFactory;
	private final SQWRLResultValueFactory sqwrlResultValueFactory;

	public DefaultSWRLAPIOWLDataFactory(OWLIRIResolver owlIRIResolver)
	{
		this.owlIRIResolver = owlIRIResolver;
		this.swrlapiOWLDatatypeFactory = SWRLAPIFactory.createSWRLAPIOWLDatatypeFactory();
		this.owlLiteralFactory = SWRLAPIFactory.createOWLLiteralFactory(this.swrlapiOWLDatatypeFactory);
		this.swrlapiLiteralFactory = SWRLAPIFactory.createSWRLAPILiteralFactory(this.owlLiteralFactory);
		this.swrlBuiltInArgumentFactory = SWRLAPIFactory.createSWRLBuiltInArgumentFactory(this.owlIRIResolver,
				this.owlLiteralFactory);
		this.sqwrlResultValueFactory = SWRLAPIFactory.createSQWRLResultValueFactory(this.owlIRIResolver,
				this.owlLiteralFactory);
	}

	@Override
	public SWRLBuiltInArgumentFactory getSWRLBuiltInArgumentFactory()
	{
		return this.swrlBuiltInArgumentFactory;
	}

	@Override
	public SWRLAPIBuiltInAtom getSWRLAPIBuiltInAtom(String ruleName, IRI builtInIRI, String builtInPrefixedName,
			List<SWRLBuiltInArgument> arguments)
	{
		return new DefaultSWRLAPIBuiltInAtom(ruleName, builtInIRI, builtInPrefixedName, arguments);
	}

	@Override
	public SWRLAPIRule getSWRLRule(String ruleName, String ruleText)
	{
		throw new RuntimeException("SWRL parser not implemented");
	}

	@Override
	public SQWRLResultValueFactory getSQWRLResultValueFactory()
	{
		return this.sqwrlResultValueFactory;
	}

	@Override
	public OWLDeclarationAxiom getOWLClassDeclarationAxiom(OWLClass cls)
	{
		return getOWLDeclarationAxiom(cls);
	}

	@Override
	public OWLDeclarationAxiom getOWLIndividualDeclarationAxiom(OWLNamedIndividual individual)
	{
		return getOWLDeclarationAxiom(individual);
	}

	@Override
	public OWLDeclarationAxiom getOWLObjectPropertyDeclarationAxiom(OWLObjectProperty property)
	{
		return getOWLDeclarationAxiom(property);
	}

	@Override
	public OWLDeclarationAxiom getOWLDataPropertyDeclarationAxiom(OWLDataProperty property)
	{
		return getOWLDeclarationAxiom(property);
	}

	@Override
	public OWLDeclarationAxiom getOWLAnnotationPropertyDeclarationAxiom(OWLAnnotationProperty property)
	{
		return getOWLDeclarationAxiom(property);
	}

	@Override
	public OWLDeclarationAxiom getOWLDatatypeDeclarationAxiom(OWLDatatype datatype)
	{
		return getOWLDeclarationAxiom(datatype);
	}

	@Override
	public SWRLAPIOWLDatatypeFactory getSWRLAPIOWLDatatypeFactory()
	{
		return this.swrlapiOWLDatatypeFactory;
	}

	@Override
	public OWLLiteralFactory getOWLLiteralFactory()
	{
		return this.owlLiteralFactory;
	}

	@Override
	public SWRLAPILiteralFactory getSWRLAPILiteralFactory()
	{
		return this.swrlapiLiteralFactory;
	}

	@Override
	public OWLIRIResolver getOWLIRIResolver()
	{
		return this.owlIRIResolver;
	}

}