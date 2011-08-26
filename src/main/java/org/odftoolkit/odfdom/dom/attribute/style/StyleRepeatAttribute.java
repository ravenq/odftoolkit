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
package org.odftoolkit.odfdom.dom.attribute.style;

import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfAttribute;
import org.odftoolkit.odfdom.OdfElement;import org.odftoolkit.odfdom.dom.element.style.StyleBackgroundImageElement;
import org.odftoolkit.odfdom.dom.element.style.StyleDrawingPagePropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleGraphicPropertiesElement;
     
/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute style:repeat}.
 *
 */
public class StyleRepeatAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "repeat" );
	public static final String DEFAULT_VALUE = "repeat";

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute style:repeat}.
	 * 
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public StyleRepeatAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}
	
	/**
	 * Returns the attribute name.
	 * 
	 * @return the <code>OdfName</code> for {@odf.attribute style:repeat}.
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
	 * The value set of {@odf.attribute style:repeat}.
	 */
	public enum Value {
	 
	 NO_REPEAT( "no-repeat" ), REPEAT( "repeat" ), STRETCH( "stretch" );
              
		private String mValue;

		Value( String value )
		{
			mValue = value;
		}
	 	
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static Value enumValueOf( String value )
	    {
	        for( Value aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	 
	/**
	 * @param attrValue The <code>Enum</code> value of the attribute.
	 */
	public void setEnumValue(Value attrValue) {
		setValue(attrValue.toString());
	}
    
	/**
	 * @return Returns the <code>Enum</code> value of the attribute
	 */
	public Value getEnumValue(){
		return Value.enumValueOf(this.getValue());
	}
    
	/**
	 * @param attrValue The <code>String</code> value of the attribute.
	 */
	@Override
	public void setValue(String attrValue) {
		try{
			super.setValue(Value.enumValueOf(attrValue).toString());		
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
			return Value.enumValueOf(super.getValue()).toString();		
		} catch (IllegalArgumentException e) {
			// TODO: validation handling/logging
			throw new NumberFormatException("the value of style:repeat is not valid");
		}
	}
	/**
	 * Returns the default value of {@odf.attribute style:repeat} dependent of its element name
	 * 
	 * @return the default value as <code>String</code>, 
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		String defaultValue = null;
		if (parentElement != null) {
			defaultValue = DEFAULT_VALUE;			
		}
		return defaultValue;
	}

	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 * 
	 * @return <code>true</code> if style:repeat has an element parent 
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return getOwnerElement() == null ? false : true;
	}
	
	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
    
	}
}
