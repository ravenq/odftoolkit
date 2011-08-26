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

package org.odftoolkit.odfdom.dom.element.config;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.config.ConfigNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.config.ConfigTypeAttribute;

;

/**
 * DOM implementation of OpenDocument element  {@odf.element config:config-item}.
 *
 */
public abstract class ConfigConfigItemElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.CONFIG), "config-item" );


	/**
	 * Create the instance of <code>ConfigConfigItemElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public ConfigConfigItemElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element config:config-item}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  ConfigConfigItemElement}
	 *
     * @param configNameAttributeValue  The mandatory attribute {@odf.attribute  config:name}"
     * @param configTypeAttributeValue  The mandatory attribute {@odf.attribute  config:type}"
     *
	 */
	public void init(String configNameAttributeValue, String configTypeAttributeValue)
	{
		setConfigNameAttribute( configNameAttributeValue );
		setConfigTypeAttribute( configTypeAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ConfigNameAttribute</code> , See {@odf.attribute config:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getConfigNameAttribute()
	{
		ConfigNameAttribute attr = (ConfigNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.CONFIG), "name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ConfigNameAttribute</code> , See {@odf.attribute config:name}
	 *
	 * @param configNameValue   The type is <code>String</code>
	 */
	public void setConfigNameAttribute( String configNameValue )
	{
		ConfigNameAttribute attr =  new ConfigNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( configNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>ConfigTypeAttribute</code> , See {@odf.attribute config:type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getConfigTypeAttribute()
	{
		ConfigTypeAttribute attr = (ConfigTypeAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.CONFIG), "type" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ConfigTypeAttribute</code> , See {@odf.attribute config:type}
	 *
	 * @param configTypeValue   The type is <code>String</code>
	 */
	public void setConfigTypeAttribute( String configTypeValue )
	{
		ConfigTypeAttribute attr =  new ConfigTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( configTypeValue );
	}

}
