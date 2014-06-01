package org.wikidata.wdtk.dumpfiles.renderer.constraint;

/*
 * #%L
 * Wikidata Toolkit Dump File Handling
 * %%
 * Copyright (C) 2014 Wikidata Toolkit Developers
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.wikidata.wdtk.dumpfiles.constraint.Constraint;
import org.wikidata.wdtk.dumpfiles.constraint.ConstraintExistingFile;

/**
 * 
 * @author Julian Mendez
 * 
 */
class ConstraintExistingFileRenderer implements ConstraintRenderer {

	public ConstraintExistingFileRenderer() {
	}

	@Override
	public void renderConstraint(Constraint c) {
		if (c instanceof ConstraintExistingFile) {
			render((ConstraintExistingFile) c);
		}
	}

	public void render(ConstraintExistingFile c) {
	}

}