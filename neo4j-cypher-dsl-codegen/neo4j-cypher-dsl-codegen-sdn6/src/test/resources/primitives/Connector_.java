package org.neo4j.cypherdsl.codegen.sdn6.models.valid.primitives;

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
public final class Connector_ extends NodeBase<Connector_> {
	public static final Connector_ CONNECTOR = new Connector_();

	public final Property ID = this.property("id");

	public final Property URI = this.property("uri");

	public final Property OFFICIAL = this.property("official");

	public final Property AN_INT = this.property("anInt");

	public final Property A_FLOAT = this.property("aFloat");

	public final Property A_DOUBLE = this.property("aDouble");

	public Connector_() {
		super("Connector");
	}

	private Connector_(SymbolicName symbolicName, List<NodeLabel> labels, Properties properties) {
		super(symbolicName, labels, properties);
	}

	@Override
	public Connector_ named(SymbolicName newSymbolicName) {
		return new Connector_(newSymbolicName, getLabels(), getProperties());
	}

	@Override
	public Connector_ withProperties(MapExpression newProperties) {
		return new Connector_(getSymbolicName().orElse(null), getLabels(), Properties.create(newProperties));
	}
}