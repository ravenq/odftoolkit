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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.db.DbNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbCatalogNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbIsUniqueAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbIsClusteredAttribute;

;

/**
 * DOM implementation of OpenDocument element  {@odf.element db:index}.
 *
 */
public abstract class DbIndexElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "index" );


	/**
	 * Create the instance of <code>DbIndexElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbIndexElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:index}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DbIndexElement}
	 *
     * @param dbNameAttributeValue  The mandatory attribute {@odf.attribute  db:name}"
     *
	 */
	public void init(String dbNameAttributeValue)
	{
		setDbNameAttribute( dbNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbNameAttribute()
	{
		DbNameAttribute attr = (DbNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @param dbNameValue   The type is <code>String</code>
	 */
	public void setDbNameAttribute( String dbNameValue )
	{
		DbNameAttribute attr =  new DbNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbCatalogNameAttribute</code> , See {@odf.attribute db:catalog-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbCatalogNameAttribute()
	{
		DbCatalogNameAttribute attr = (DbCatalogNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "catalog-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbCatalogNameAttribute</code> , See {@odf.attribute db:catalog-name}
	 *
	 * @param dbCatalogNameValue   The type is <code>String</code>
	 */
	public void setDbCatalogNameAttribute( String dbCatalogNameValue )
	{
		DbCatalogNameAttribute attr =  new DbCatalogNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbCatalogNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbIsUniqueAttribute</code> , See {@odf.attribute db:is-unique}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbIsUniqueAttribute()
	{
		DbIsUniqueAttribute attr = (DbIsUniqueAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "is-unique" ) );
		if( attr != null ){
		 	return Boolean.valueOf( attr.getBooleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbIsUniqueAttribute</code> , See {@odf.attribute db:is-unique}
	 *
	 * @param dbIsUniqueValue   The type is <code>Boolean</code>
	 */
	public void setDbIsUniqueAttribute( Boolean dbIsUniqueValue )
	{
		DbIsUniqueAttribute attr =  new DbIsUniqueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbIsUniqueValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbIsClusteredAttribute</code> , See {@odf.attribute db:is-clustered}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbIsClusteredAttribute()
	{
		DbIsClusteredAttribute attr = (DbIsClusteredAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "is-clustered" ) );
		if( attr != null ){
		 	return Boolean.valueOf( attr.getBooleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbIsClusteredAttribute</code> , See {@odf.attribute db:is-clustered}
	 *
	 * @param dbIsClusteredValue   The type is <code>Boolean</code>
	 */
	public void setDbIsClusteredAttribute( Boolean dbIsClusteredValue )
	{
		DbIsClusteredAttribute attr =  new DbIsClusteredAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbIsClusteredValue.booleanValue() );
	}

	/**
	 * Create child element {@odf.element db:index-columns}.
	 *
	 * @return   return  the element {@odf.element db:index-columns}
	 * DifferentQName 
	 */
	public DbIndexColumnsElement newDbIndexColumnsElement()
	{
		DbIndexColumnsElement  dbIndexColumns = ((OdfFileDom)this.ownerDocument).newOdfElement(DbIndexColumnsElement.class);
		this.appendChild( dbIndexColumns);
		return  dbIndexColumns;
	}                   
               
}
