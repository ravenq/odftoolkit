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
package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.element.number.NumberBooleanStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberCurrencyStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberDateStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberNumberStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberPercentageStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberTextStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberTimeStyleElement;
import org.odftoolkit.odfdom.dom.element.style.StylePageLayoutElement;
import org.odftoolkit.odfdom.dom.element.style.StyleStyleElement;
import org.odftoolkit.odfdom.dom.element.text.TextListStyleElement;
import org.odftoolkit.odfdom.pkg.OdfContainerElementBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element office:automatic-styles}.
 *
 */
public class OfficeAutomaticStylesElement extends OdfContainerElementBase {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.OFFICE, "automatic-styles");

	/**
	 * Create the instance of <code>OfficeAutomaticStylesElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public OfficeAutomaticStylesElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element office:automatic-styles}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element number:boolean-style}.
	 *
	 * @param styleNameValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return the element {@odf.element number:boolean-style}
	 */
	 public NumberBooleanStyleElement newNumberBooleanStyleElement(String styleNameValue) {
		NumberBooleanStyleElement numberBooleanStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(NumberBooleanStyleElement.class);
		numberBooleanStyle.setStyleNameAttribute(styleNameValue);
		this.appendChild(numberBooleanStyle);
		return numberBooleanStyle;
	}

	/**
	 * Create child element {@odf.element number:currency-style}.
	 *
	 * @param styleNameValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return the element {@odf.element number:currency-style}
	 */
	 public NumberCurrencyStyleElement newNumberCurrencyStyleElement(String styleNameValue) {
		NumberCurrencyStyleElement numberCurrencyStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(NumberCurrencyStyleElement.class);
		numberCurrencyStyle.setStyleNameAttribute(styleNameValue);
		this.appendChild(numberCurrencyStyle);
		return numberCurrencyStyle;
	}

	/**
	 * Create child element {@odf.element number:date-style}.
	 *
	 * @param styleNameValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return the element {@odf.element number:date-style}
	 */
	 public NumberDateStyleElement newNumberDateStyleElement(String styleNameValue) {
		NumberDateStyleElement numberDateStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(NumberDateStyleElement.class);
		numberDateStyle.setStyleNameAttribute(styleNameValue);
		this.appendChild(numberDateStyle);
		return numberDateStyle;
	}

	/**
	 * Create child element {@odf.element number:number-style}.
	 *
	 * @param styleNameValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return the element {@odf.element number:number-style}
	 */
	 public NumberNumberStyleElement newNumberNumberStyleElement(String styleNameValue) {
		NumberNumberStyleElement numberNumberStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(NumberNumberStyleElement.class);
		numberNumberStyle.setStyleNameAttribute(styleNameValue);
		this.appendChild(numberNumberStyle);
		return numberNumberStyle;
	}

	/**
	 * Create child element {@odf.element number:percentage-style}.
	 *
	 * @param styleNameValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return the element {@odf.element number:percentage-style}
	 */
	 public NumberPercentageStyleElement newNumberPercentageStyleElement(String styleNameValue) {
		NumberPercentageStyleElement numberPercentageStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(NumberPercentageStyleElement.class);
		numberPercentageStyle.setStyleNameAttribute(styleNameValue);
		this.appendChild(numberPercentageStyle);
		return numberPercentageStyle;
	}

	/**
	 * Create child element {@odf.element number:text-style}.
	 *
	 * @param styleNameValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return the element {@odf.element number:text-style}
	 */
	 public NumberTextStyleElement newNumberTextStyleElement(String styleNameValue) {
		NumberTextStyleElement numberTextStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(NumberTextStyleElement.class);
		numberTextStyle.setStyleNameAttribute(styleNameValue);
		this.appendChild(numberTextStyle);
		return numberTextStyle;
	}

	/**
	 * Create child element {@odf.element number:time-style}.
	 *
	 * @param styleNameValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return the element {@odf.element number:time-style}
	 */
	 public NumberTimeStyleElement newNumberTimeStyleElement(String styleNameValue) {
		NumberTimeStyleElement numberTimeStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(NumberTimeStyleElement.class);
		numberTimeStyle.setStyleNameAttribute(styleNameValue);
		this.appendChild(numberTimeStyle);
		return numberTimeStyle;
	}

	/**
	 * Create child element {@odf.element style:page-layout}.
	 *
	 * @param styleNameValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return the element {@odf.element style:page-layout}
	 */
	 public StylePageLayoutElement newStylePageLayoutElement(String styleNameValue) {
		StylePageLayoutElement stylePageLayout = ((OdfFileDom) this.ownerDocument).newOdfElement(StylePageLayoutElement.class);
		stylePageLayout.setStyleNameAttribute(styleNameValue);
		this.appendChild(stylePageLayout);
		return stylePageLayout;
	}

	/**
	 * Create child element {@odf.element style:style}.
	 *
	 * @param styleFamilyValue  the <code>String</code> value of <code>StyleFamilyAttribute</code>, see {@odf.attribute  style:family} at specification
	 * @param styleNameValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return the element {@odf.element style:style}
	 */
	 public StyleStyleElement newStyleStyleElement(String styleFamilyValue, String styleNameValue) {
		StyleStyleElement styleStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(StyleStyleElement.class);
		styleStyle.setStyleFamilyAttribute(styleFamilyValue);
		styleStyle.setStyleNameAttribute(styleNameValue);
		this.appendChild(styleStyle);
		return styleStyle;
	}

	/**
	 * Create child element {@odf.element text:list-style}.
	 *
	 * @param styleNameValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return the element {@odf.element text:list-style}
	 */
	 public TextListStyleElement newTextListStyleElement(String styleNameValue) {
		TextListStyleElement textListStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(TextListStyleElement.class);
		textListStyle.setStyleNameAttribute(styleNameValue);
		this.appendChild(textListStyle);
		return textListStyle;
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}