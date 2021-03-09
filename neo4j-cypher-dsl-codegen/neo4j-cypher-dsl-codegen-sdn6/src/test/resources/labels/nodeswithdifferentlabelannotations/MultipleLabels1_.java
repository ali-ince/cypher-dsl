package org.neo4j.cypherdsl.codegen.sdn6.models.valid.labels.nodeswithdifferentlabelannotations;

import java.util.List;
import javax.annotation.Generated;
import org.neo4j.cypherdsl.core.MapExpression;
import org.neo4j.cypherdsl.core.NodeImpl;
import org.neo4j.cypherdsl.core.NodeLabel;
import org.neo4j.cypherdsl.core.Properties;
import org.neo4j.cypherdsl.core.SymbolicName;

@Generated(
		value = "org.neo4j.cypherdsl.codegen.core.NodeImplBuilder",
		date = "2019-09-21T21:21:00+01:00",
		comments = "This class is generated by the Neo4j Cypher-DSL. All changes to it will be lost after regeneration."
)
public final class MultipleLabels1_ extends NodeImpl<MultipleLabels1_> {
	public static final MultipleLabels1_ MULTIPLE_LABELS_1 = new MultipleLabels1_();

	public MultipleLabels1_() {
		super("Label1", "Label2");
	}

	private MultipleLabels1_(SymbolicName symbolicName, List<NodeLabel> labels,
			Properties properties) {
		super(symbolicName, labels, properties);
	}

	@Override
	public MultipleLabels1_ named(SymbolicName newSymbolicName) {
		return new MultipleLabels1_(newSymbolicName, getLabels(), getProperties());
	}

	@Override
	public MultipleLabels1_ withProperties(MapExpression newProperties) {
		return new MultipleLabels1_(getSymbolicName().orElse(null), getLabels(), Properties.create(newProperties));
	}
}