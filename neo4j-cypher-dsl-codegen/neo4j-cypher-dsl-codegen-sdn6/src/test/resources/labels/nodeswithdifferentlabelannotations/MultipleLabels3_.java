package org.neo4j.cypherdsl.codegen.sdn6.models.labels.nodeswithdifferentlabelannotations;

import java.util.List;
import javax.annotation.Generated;
import org.neo4j.cypherdsl.core.MapExpression;
import org.neo4j.cypherdsl.core.NodeBase;
import org.neo4j.cypherdsl.core.NodeLabel;
import org.neo4j.cypherdsl.core.Properties;
import org.neo4j.cypherdsl.core.SymbolicName;

@Generated(
		value = "org.neo4j.cypherdsl.codegen.core.NodeImplBuilder",
		date = "2019-09-21T21:21:00+01:00",
		comments = "This class is generated by the Neo4j Cypher-DSL. All changes to it will be lost after regeneration."
)
public final class MultipleLabels3_ extends NodeBase<MultipleLabels3_> {
	public static final String $PRIMARY_LABEL = "PL";

	public static final MultipleLabels3_ MULTIPLE_LABELS_3 = new MultipleLabels3_();

	public MultipleLabels3_() {
		super($PRIMARY_LABEL, "Label1", "Label2", "Some more");
	}

	private MultipleLabels3_(SymbolicName symbolicName, List<NodeLabel> labels,
			Properties properties) {
		super(symbolicName, labels, properties);
	}

	@Override
	public MultipleLabels3_ named(SymbolicName newSymbolicName) {
		return new MultipleLabels3_(newSymbolicName, getLabels(), getProperties());
	}

	@Override
	public MultipleLabels3_ withProperties(MapExpression newProperties) {
		return new MultipleLabels3_(getSymbolicName().orElse(null), getLabels(), Properties.create(newProperties));
	}
}
