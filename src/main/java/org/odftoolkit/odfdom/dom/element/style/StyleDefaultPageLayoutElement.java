/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:default-page-layout}.
 *
 */
public class StyleDefaultPageLayoutElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "default-page-layout");

	/**
	 * Create the instance of <code>StyleDefaultPageLayoutElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleDefaultPageLayoutElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:default-page-layout}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element style:footer-style}.
	 *
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element style:footer-style}
	 */
	public StyleFooterStyleElement newStyleFooterStyleElement() {
		StyleFooterStyleElement styleFooterStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(StyleFooterStyleElement.class);
		this.appendChild(styleFooterStyle);
		return styleFooterStyle;
	}

	/**
	 * Create child element {@odf.element style:header-style}.
	 *
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element style:header-style}
	 */
	public StyleHeaderStyleElement newStyleHeaderStyleElement() {
		StyleHeaderStyleElement styleHeaderStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(StyleHeaderStyleElement.class);
		this.appendChild(styleHeaderStyle);
		return styleHeaderStyle;
	}

	/**
	 * Create child element {@odf.element style:page-layout-properties}.
	 *
	 * @param styleNumFormatValue  the <code>String</code> value of <code>StyleNumFormatAttribute</code>, see {@odf.attribute  style:num-format} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element style:page-layout-properties}
	 */
	 public StylePageLayoutPropertiesElement newStylePageLayoutPropertiesElement(String styleNumFormatValue) {
		StylePageLayoutPropertiesElement stylePageLayoutProperties = ((OdfFileDom) this.ownerDocument).newOdfElement(StylePageLayoutPropertiesElement.class);
		stylePageLayoutProperties.setStyleNumFormatAttribute(styleNumFormatValue);
		this.appendChild(stylePageLayoutProperties);
		return stylePageLayoutProperties;
	}

}
