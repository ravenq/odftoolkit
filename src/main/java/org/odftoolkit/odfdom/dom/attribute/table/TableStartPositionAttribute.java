/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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
package org.odftoolkit.odfdom.dom.attribute.table;

import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfAttribute;
     
/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute table:start-position}.
 *
 */
public class TableStartPositionAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "start-position" );

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute table:start-position}.
	 * 
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public TableStartPositionAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}
	
	/**
	 * Returns the attribute name.
	 * 
	 * @return the <code>OdfName</code> for {@odf.attribute table:start-position}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}
	
	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * @param value The <code>int</code> value of the attribute.
	 */
	public void setIntValue(int value) {
 		super.setValue(String.valueOf(value));
	}
    
	/**
	 * @return Returns the <code>int</code> value of the attribute
	 */
	public int getIntValue(){
		String value = super.getValue();
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// TODO: validation handling/logging
			throw (e);
		}
	}
	/**
	 * @param attrValue The <code>String</code> value of the attribute.
	 */
	@Override
	public void setValue(String attrValue) {
		try{
			super.setValue(Integer.toString(Integer.parseInt(attrValue)));		
		} catch (IllegalArgumentException e) {
			// TODO: validation handling/logging
			throw (e);
		}
	}
    
	/**
	 * @return Returns the <code>String</code> value of the attribute
	 */
	@Override
	public String getValue(){
		try{
			return String.valueOf(Integer.parseInt(super.getValue()));		
		} catch (IllegalArgumentException e) {
			// TODO: validation handling/logging
			throw new NumberFormatException("the value of table:start-position is not valid");
		}
	}
	
	/**
	 * Returns the default value of {@odf.attribute table:start-position}.
	 * 
	 * @return the default value as <code>String</code> dependent of its element name
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		return null;
	}
	
	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 * 
	 * @return <code>true</code> if table:start-position has an element parent 
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return false;
	}
	
	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
    
	}
}
