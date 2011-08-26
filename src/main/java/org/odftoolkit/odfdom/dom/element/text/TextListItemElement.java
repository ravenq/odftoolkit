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
import org.odftoolkit.odfdom.dom.attribute.text.TextStartValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleOverrideAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;

import org.odftoolkit.odfdom.dom.attribute.text.TextOutlineLevelAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextOutlineLevelAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:list-item}.
 *
 */
public abstract class TextListItemElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "list-item" );


	/**
	 * Create the instance of <code>TextListItemElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextListItemElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:list-item}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStartValueAttribute</code> , See {@odf.attribute text:start-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStartValueAttribute()
	{
		TextStartValueAttribute attr = (TextStartValueAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "start-value" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStartValueAttribute</code> , See {@odf.attribute text:start-value}
	 *
	 * @param textStartValueValue   The type is <code>String</code>
	 */
	public void setTextStartValueAttribute( String textStartValueValue )
	{
		TextStartValueAttribute attr =  new TextStartValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textStartValueValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStyleOverrideAttribute</code> , See {@odf.attribute text:style-override}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStyleOverrideAttribute()
	{
		TextStyleOverrideAttribute attr = (TextStyleOverrideAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "style-override" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStyleOverrideAttribute</code> , See {@odf.attribute text:style-override}
	 *
	 * @param textStyleOverrideValue   The type is <code>String</code>
	 */
	public void setTextStyleOverrideAttribute( String textStyleOverrideValue )
	{
		TextStyleOverrideAttribute attr =  new TextStyleOverrideAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textStyleOverrideValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute()
	{
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.XML), "id" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute( String xmlIdValue )
	{
		XmlIdAttribute attr =  new XmlIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xmlIdValue );
	}

	/**
	 * Create child element {@odf.element text:number}.
	 *
	 * @return   return  the element {@odf.element text:number}
	 * DifferentQName 
	 */
	public TextNumberElement newTextNumberElement()
	{
		TextNumberElement  textNumber = ((OdfFileDom)this.ownerDocument).newOdfElement(TextNumberElement.class);
		this.appendChild( textNumber);
		return  textNumber;
	}                   
               
	/**
	 * Create child element {@odf.element text:p}.
	 *
	 * @return   return  the element {@odf.element text:p}
	 * DifferentQName 
	 */
	public TextPElement newTextPElement()
	{
		TextPElement  textP = ((OdfFileDom)this.ownerDocument).newOdfElement(TextPElement.class);
		this.appendChild( textP);
		return  textP;
	}                   
               
	/**
	 * Create child element {@odf.element text:h}.
	 *
     * @param textOutlineLevelAttributeValue  the <code>String</code> value of <code>TextOutlineLevelAttribute</code>, see {@odf.attribute  text:outline-level} at specification
	 * @return   return  the element {@odf.element text:h}
	 * DifferentQName 
	 */
    
	public TextHElement newTextHElement(String textOutlineLevelAttributeValue)
	{
		TextHElement  textH = ((OdfFileDom)this.ownerDocument).newOdfElement(TextHElement.class);
		textH.setTextOutlineLevelAttribute( textOutlineLevelAttributeValue );
		this.appendChild( textH);
		return  textH;      
	}
    
	/**
	 * Create child element {@odf.element text:list}.
	 *
	 * @return   return  the element {@odf.element text:list}
	 * DifferentQName 
	 */
	public TextListElement newTextListElement()
	{
		TextListElement  textList = ((OdfFileDom)this.ownerDocument).newOdfElement(TextListElement.class);
		this.appendChild( textList);
		return  textList;
	}                   
               
	/**
	 * Create child element {@odf.element text:soft-page-break}.
	 *
	 * @return   return  the element {@odf.element text:soft-page-break}
	 * DifferentQName 
	 */
	public TextSoftPageBreakElement newTextSoftPageBreakElement()
	{
		TextSoftPageBreakElement  textSoftPageBreak = ((OdfFileDom)this.ownerDocument).newOdfElement(TextSoftPageBreakElement.class);
		this.appendChild( textSoftPageBreak);
		return  textSoftPageBreak;
	}                   
               
}
