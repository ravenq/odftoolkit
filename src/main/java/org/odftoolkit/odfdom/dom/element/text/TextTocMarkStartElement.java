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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextOutlineLevelAttribute;

;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:toc-mark-start}.
 *
 */
public abstract class TextTocMarkStartElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "toc-mark-start" );


	/**
	 * Create the instance of <code>TextTocMarkStartElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextTocMarkStartElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:toc-mark-start}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextTocMarkStartElement}
	 *
     * @param textIdAttributeValue  The mandatory attribute {@odf.attribute  text:id}"
     *
	 */
	public void init(String textIdAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIdAttribute</code> , See {@odf.attribute text:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIdAttribute()
	{
		TextIdAttribute attr = (TextIdAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "id" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIdAttribute</code> , See {@odf.attribute text:id}
	 *
	 * @param textIdValue   The type is <code>String</code>
	 */
	public void setTextIdAttribute( String textIdValue )
	{
		TextIdAttribute attr =  new TextIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextOutlineLevelAttribute</code> , See {@odf.attribute text:outline-level}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextOutlineLevelAttribute()
	{
		TextOutlineLevelAttribute attr = (TextOutlineLevelAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "outline-level" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextOutlineLevelAttribute</code> , See {@odf.attribute text:outline-level}
	 *
	 * @param textOutlineLevelValue   The type is <code>String</code>
	 */
	public void setTextOutlineLevelAttribute( String textOutlineLevelValue )
	{
		TextOutlineLevelAttribute attr =  new TextOutlineLevelAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textOutlineLevelValue );
	}

}
