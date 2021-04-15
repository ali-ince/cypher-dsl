package org.neo4j.cypherdsl.codegen.sdn6.models.same_rel_different_source;

import java.util.List;
import javax.annotation.Generated;
import org.neo4j.cypherdsl.core.MapExpression;
import org.neo4j.cypherdsl.core.NodeBase;
import org.neo4j.cypherdsl.core.NodeLabel;
import org.neo4j.cypherdsl.core.Properties;
import org.neo4j.cypherdsl.core.Property;
import org.neo4j.cypherdsl.core.SymbolicName;

@Generated(
	value = "org.neo4j.cypherdsl.codegen.core.NodeImplBuilder",
	date = "2019-09-21T21:21:00+01:00",
	comments = "This class is generated by the Neo4j Cypher-DSL. All changes to it will be lost after regeneration."
)
public final class Person_ extends NodeBase<Person_> {
	public static final Person_ PERSON = new Person_();

	public final Property NAME = this.property("name");

	public Person_() {
		super("Person");
	}

	private Person_(SymbolicName symbolicName, List<NodeLabel> labels, Properties properties) {
		super(symbolicName, labels, properties);
	}

	@Override
	public Person_ named(SymbolicName newSymbolicName) {
		return new Person_(newSymbolicName, getLabels(), getProperties());
	}

	@Override
	public Person_ withProperties(MapExpression newProperties) {
		return new Person_(getSymbolicName().orElse(null), getLabels(), Properties.create(newProperties));
	}
}