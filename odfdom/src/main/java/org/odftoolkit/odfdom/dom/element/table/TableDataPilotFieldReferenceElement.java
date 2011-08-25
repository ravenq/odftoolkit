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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.table.TableFieldNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableMemberNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableMemberTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTypeAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:data-pilot-field-reference}.
 *
 */
public class TableDataPilotFieldReferenceElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "data-pilot-field-reference");

	/**
	 * Create the instance of <code>TableDataPilotFieldReferenceElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDataPilotFieldReferenceElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:data-pilot-field-reference}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFieldNameAttribute</code> , See {@odf.attribute table:field-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFieldNameAttribute() {
		TableFieldNameAttribute attr = (TableFieldNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "field-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFieldNameAttribute</code> , See {@odf.attribute table:field-name}
	 *
	 * @param tableFieldNameValue   The type is <code>String</code>
	 */
	public void setTableFieldNameAttribute(String tableFieldNameValue) {
		TableFieldNameAttribute attr = new TableFieldNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableFieldNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableMemberNameAttribute</code> , See {@odf.attribute table:member-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableMemberNameAttribute() {
		TableMemberNameAttribute attr = (TableMemberNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "member-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableMemberNameAttribute</code> , See {@odf.attribute table:member-name}
	 *
	 * @param tableMemberNameValue   The type is <code>String</code>
	 */
	public void setTableMemberNameAttribute(String tableMemberNameValue) {
		TableMemberNameAttribute attr = new TableMemberNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableMemberNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableMemberTypeAttribute</code> , See {@odf.attribute table:member-type}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableMemberTypeAttribute() {
		TableMemberTypeAttribute attr = (TableMemberTypeAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "member-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableMemberTypeAttribute</code> , See {@odf.attribute table:member-type}
	 *
	 * @param tableMemberTypeValue   The type is <code>String</code>
	 */
	public void setTableMemberTypeAttribute(String tableMemberTypeValue) {
		TableMemberTypeAttribute attr = new TableMemberTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableMemberTypeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTypeAttribute</code> , See {@odf.attribute table:type}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableTypeAttribute() {
		TableTypeAttribute attr = (TableTypeAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTypeAttribute</code> , See {@odf.attribute table:type}
	 *
	 * @param tableTypeValue   The type is <code>String</code>
	 */
	public void setTableTypeAttribute(String tableTypeValue) {
		TableTypeAttribute attr = new TableTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableTypeValue);
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