/*
 * Copyright (c) 2019-2020 "Neo4j,"
 * Neo4j Sweden AB [https://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.cypherdsl.core;

import static org.apiguardian.api.API.Status.EXPERIMENTAL;

import org.apiguardian.api.API;

/**
 * A step exposing a {@link #match(PatternElement...)} method. This is one of the main entry points of most Cypher queries.
 *
 * @author Michael J. Simons
 * @since 1.0
 */
@API(status = EXPERIMENTAL, since = "1.0")
public interface ExposesMatch {

	/**
	 * Adds (another) {@code MATCH} clause.
	 *
	 * @param pattern The patterns to match
	 * @return An ongoing match that is used to specify an optional where and a required return clause
	 */
	default StatementBuilder.OngoingReadingWithoutWhere match(PatternElement... pattern) {
		return this.match(false, pattern);
	}

	/**
	 * Adds (another) optional {@code MATCH} clause.
	 *
	 * @param pattern The patterns to match
	 * @return An ongoing match that is used to specify an optional where and a required return clause
	 */
	default StatementBuilder.OngoingReadingWithoutWhere optionalMatch(PatternElement... pattern) {
		return this.match(true, pattern);
	}

	/**
	 * Adds (another) {@code MATCH} clause.
	 *
	 * @param optional A flag whether the {@code MATCH} clause includes the {@code OPTIONAL} keyword.
	 * @param pattern  The patterns to match
	 * @return An ongoing match that is used to specify an optional where and a required return clause
	 * @since 2020.1.3
	 */
	StatementBuilder.OngoingReadingWithoutWhere match(boolean optional, PatternElement... pattern);
}
