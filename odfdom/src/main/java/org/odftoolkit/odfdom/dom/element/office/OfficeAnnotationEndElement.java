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

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeNameAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element office:annotation-end}.
 *
 */
public class OfficeAnnotationEndElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.OFFICE, "annotation-end" );


	/**
	 * Create the instance of <code>OfficeAnnotationEndElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public OfficeAnnotationEndElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element office:annotation-end}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  OfficeAnnotationEndElement}
	 *
     * @param officeNameAttributeValue  The mandatory attribute {@odf.attribute  office:name}"
     *
	 */
	public void init(String officeNameAttributeValue)
	{
		setOfficeNameAttribute( officeNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeNameAttribute</code> , See {@odf.attribute office:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeNameAttribute()
	{
		OfficeNameAttribute attr = (OfficeNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "name" ) ;
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

}