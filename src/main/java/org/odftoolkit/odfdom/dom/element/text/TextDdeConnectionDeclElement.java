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
import org.odftoolkit.odfdom.dom.attribute.office.OfficeNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeDdeApplicationAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeDdeTopicAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeDdeItemAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeAutomaticUpdateAttribute;

;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:dde-connection-decl}.
 *
 */
public abstract class TextDdeConnectionDeclElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "dde-connection-decl" );


	/**
	 * Create the instance of <code>TextDdeConnectionDeclElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextDdeConnectionDeclElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:dde-connection-decl}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextDdeConnectionDeclElement}
	 *
     * @param officeNameAttributeValue  The mandatory attribute {@odf.attribute  office:name}"
     * @param officeDdeApplicationAttributeValue  The mandatory attribute {@odf.attribute  office:dde-application}"
     * @param officeDdeTopicAttributeValue  The mandatory attribute {@odf.attribute  office:dde-topic}"
     * @param officeDdeItemAttributeValue  The mandatory attribute {@odf.attribute  office:dde-item}"
     *
	 */
	public void init(String officeNameAttributeValue, String officeDdeApplicationAttributeValue, String officeDdeTopicAttributeValue, String officeDdeItemAttributeValue)
	{
		setOfficeNameAttribute( officeNameAttributeValue );
		setOfficeDdeApplicationAttribute( officeDdeApplicationAttributeValue );
		setOfficeDdeTopicAttribute( officeDdeTopicAttributeValue );
		setOfficeDdeItemAttribute( officeDdeItemAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeNameAttribute</code> , See {@odf.attribute office:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeNameAttribute()
	{
		OfficeNameAttribute attr = (OfficeNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.OFFICE), "name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeNameAttribute</code> , See {@odf.attribute office:name}
	 *
	 * @param officeNameValue   The type is <code>String</code>
	 */
	public void setOfficeNameAttribute( String officeNameValue )
	{
		OfficeNameAttribute attr =  new OfficeNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeDdeApplicationAttribute</code> , See {@odf.attribute office:dde-application}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeDdeApplicationAttribute()
	{
		OfficeDdeApplicationAttribute attr = (OfficeDdeApplicationAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.OFFICE), "dde-application" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeDdeApplicationAttribute</code> , See {@odf.attribute office:dde-application}
	 *
	 * @param officeDdeApplicationValue   The type is <code>String</code>
	 */
	public void setOfficeDdeApplicationAttribute( String officeDdeApplicationValue )
	{
		OfficeDdeApplicationAttribute attr =  new OfficeDdeApplicationAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeDdeApplicationValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeDdeTopicAttribute</code> , See {@odf.attribute office:dde-topic}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeDdeTopicAttribute()
	{
		OfficeDdeTopicAttribute attr = (OfficeDdeTopicAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.OFFICE), "dde-topic" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeDdeTopicAttribute</code> , See {@odf.attribute office:dde-topic}
	 *
	 * @param officeDdeTopicValue   The type is <code>String</code>
	 */
	public void setOfficeDdeTopicAttribute( String officeDdeTopicValue )
	{
		OfficeDdeTopicAttribute attr =  new OfficeDdeTopicAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeDdeTopicValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeDdeItemAttribute</code> , See {@odf.attribute office:dde-item}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeDdeItemAttribute()
	{
		OfficeDdeItemAttribute attr = (OfficeDdeItemAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.OFFICE), "dde-item" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeDdeItemAttribute</code> , See {@odf.attribute office:dde-item}
	 *
	 * @param officeDdeItemValue   The type is <code>String</code>
	 */
	public void setOfficeDdeItemAttribute( String officeDdeItemValue )
	{
		OfficeDdeItemAttribute attr =  new OfficeDdeItemAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeDdeItemValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeAutomaticUpdateAttribute</code> , See {@odf.attribute office:automatic-update}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getOfficeAutomaticUpdateAttribute()
	{
		OfficeAutomaticUpdateAttribute attr = (OfficeAutomaticUpdateAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.OFFICE), "automatic-update" ) );
		if( attr != null ){
		 	return Boolean.valueOf( attr.getBooleanValue() );
		}
		return Boolean.valueOf( OfficeAutomaticUpdateAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeAutomaticUpdateAttribute</code> , See {@odf.attribute office:automatic-update}
	 *
	 * @param officeAutomaticUpdateValue   The type is <code>Boolean</code>
	 */
	public void setOfficeAutomaticUpdateAttribute( Boolean officeAutomaticUpdateValue )
	{
		OfficeAutomaticUpdateAttribute attr =  new OfficeAutomaticUpdateAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( officeAutomaticUpdateValue.booleanValue() );
	}

}
