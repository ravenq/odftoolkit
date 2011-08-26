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

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleParentStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNextStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleListLevelAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleListStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleMasterPageNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleAutoUpdateAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDataStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StylePercentageDataStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleClassAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDefaultOutlineLevelAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleFamilyAttribute;

import org.odftoolkit.odfdom.dom.attribute.text.TextDisplayAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextConditionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDisplayAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartSymbolTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartSymbolNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleApplyStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleConditionAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:style}.
 *
 */
public abstract class StyleStyleElement extends OdfStyleBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "style" );


	/**
	 * Create the instance of <code>StyleStyleElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleStyleElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:style}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  StyleStyleElement}
	 *
     * @param styleNameAttributeValue  The mandatory attribute {@odf.attribute  style:name}"
     * @param styleFamilyAttributeValue  The mandatory attribute {@odf.attribute  style:family}"
     *
	 */
	public void init(String styleNameAttributeValue, String styleFamilyAttributeValue)
	{
		setStyleFamilyAttribute( styleFamilyAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNameAttribute</code> , See {@odf.attribute style:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNameAttribute()
	{
		StyleNameAttribute attr = (StyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNameAttribute</code> , See {@odf.attribute style:name}
	 *
	 * @param styleNameValue   The type is <code>String</code>
	 */
	public void setStyleNameAttribute( String styleNameValue )
	{
		StyleNameAttribute attr =  new StyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleDisplayNameAttribute</code> , See {@odf.attribute style:display-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleDisplayNameAttribute()
	{
		StyleDisplayNameAttribute attr = (StyleDisplayNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "display-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDisplayNameAttribute</code> , See {@odf.attribute style:display-name}
	 *
	 * @param styleDisplayNameValue   The type is <code>String</code>
	 */
	public void setStyleDisplayNameAttribute( String styleDisplayNameValue )
	{
		StyleDisplayNameAttribute attr =  new StyleDisplayNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleDisplayNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleParentStyleNameAttribute</code> , See {@odf.attribute style:parent-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleParentStyleNameAttribute()
	{
		StyleParentStyleNameAttribute attr = (StyleParentStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "parent-style-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleParentStyleNameAttribute</code> , See {@odf.attribute style:parent-style-name}
	 *
	 * @param styleParentStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleParentStyleNameAttribute( String styleParentStyleNameValue )
	{
		StyleParentStyleNameAttribute attr =  new StyleParentStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleParentStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNextStyleNameAttribute</code> , See {@odf.attribute style:next-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNextStyleNameAttribute()
	{
		StyleNextStyleNameAttribute attr = (StyleNextStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "next-style-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNextStyleNameAttribute</code> , See {@odf.attribute style:next-style-name}
	 *
	 * @param styleNextStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleNextStyleNameAttribute( String styleNextStyleNameValue )
	{
		StyleNextStyleNameAttribute attr =  new StyleNextStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleNextStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleListLevelAttribute</code> , See {@odf.attribute style:list-level}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getStyleListLevelAttribute()
	{
		StyleListLevelAttribute attr = (StyleListLevelAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "list-level" ) );
		if( attr != null ){
		 	return Integer.valueOf( attr.getIntValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleListLevelAttribute</code> , See {@odf.attribute style:list-level}
	 *
	 * @param styleListLevelValue   The type is <code>Integer</code>
	 */
	public void setStyleListLevelAttribute( Integer styleListLevelValue )
	{
		StyleListLevelAttribute attr =  new StyleListLevelAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( styleListLevelValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleListStyleNameAttribute</code> , See {@odf.attribute style:list-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleListStyleNameAttribute()
	{
		StyleListStyleNameAttribute attr = (StyleListStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "list-style-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleListStyleNameAttribute</code> , See {@odf.attribute style:list-style-name}
	 *
	 * @param styleListStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleListStyleNameAttribute( String styleListStyleNameValue )
	{
		StyleListStyleNameAttribute attr =  new StyleListStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleListStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleMasterPageNameAttribute</code> , See {@odf.attribute style:master-page-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleMasterPageNameAttribute()
	{
		StyleMasterPageNameAttribute attr = (StyleMasterPageNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "master-page-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleMasterPageNameAttribute</code> , See {@odf.attribute style:master-page-name}
	 *
	 * @param styleMasterPageNameValue   The type is <code>String</code>
	 */
	public void setStyleMasterPageNameAttribute( String styleMasterPageNameValue )
	{
		StyleMasterPageNameAttribute attr =  new StyleMasterPageNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleMasterPageNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleAutoUpdateAttribute</code> , See {@odf.attribute style:auto-update}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getStyleAutoUpdateAttribute()
	{
		StyleAutoUpdateAttribute attr = (StyleAutoUpdateAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "auto-update" ) );
		if( attr != null ){
		 	return Boolean.valueOf( attr.getBooleanValue() );
		}
		return Boolean.valueOf( StyleAutoUpdateAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleAutoUpdateAttribute</code> , See {@odf.attribute style:auto-update}
	 *
	 * @param styleAutoUpdateValue   The type is <code>Boolean</code>
	 */
	public void setStyleAutoUpdateAttribute( Boolean styleAutoUpdateValue )
	{
		StyleAutoUpdateAttribute attr =  new StyleAutoUpdateAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( styleAutoUpdateValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleDataStyleNameAttribute()
	{
		StyleDataStyleNameAttribute attr = (StyleDataStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "data-style-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @param styleDataStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleDataStyleNameAttribute( String styleDataStyleNameValue )
	{
		StyleDataStyleNameAttribute attr =  new StyleDataStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleDataStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StylePercentageDataStyleNameAttribute</code> , See {@odf.attribute style:percentage-data-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStylePercentageDataStyleNameAttribute()
	{
		StylePercentageDataStyleNameAttribute attr = (StylePercentageDataStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "percentage-data-style-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StylePercentageDataStyleNameAttribute</code> , See {@odf.attribute style:percentage-data-style-name}
	 *
	 * @param stylePercentageDataStyleNameValue   The type is <code>String</code>
	 */
	public void setStylePercentageDataStyleNameAttribute( String stylePercentageDataStyleNameValue )
	{
		StylePercentageDataStyleNameAttribute attr =  new StylePercentageDataStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( stylePercentageDataStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleClassAttribute</code> , See {@odf.attribute style:class}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleClassAttribute()
	{
		StyleClassAttribute attr = (StyleClassAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "class" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleClassAttribute</code> , See {@odf.attribute style:class}
	 *
	 * @param styleClassValue   The type is <code>String</code>
	 */
	public void setStyleClassAttribute( String styleClassValue )
	{
		StyleClassAttribute attr =  new StyleClassAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleClassValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleDefaultOutlineLevelAttribute</code> , See {@odf.attribute style:default-outline-level}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getStyleDefaultOutlineLevelAttribute()
	{
		StyleDefaultOutlineLevelAttribute attr = (StyleDefaultOutlineLevelAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "default-outline-level" ) );
		if( attr != null ){
		 	return Integer.valueOf( attr.getIntValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDefaultOutlineLevelAttribute</code> , See {@odf.attribute style:default-outline-level}
	 *
	 * @param styleDefaultOutlineLevelValue   The type is <code>Integer</code>
	 */
	public void setStyleDefaultOutlineLevelAttribute( Integer styleDefaultOutlineLevelValue )
	{
		StyleDefaultOutlineLevelAttribute attr =  new StyleDefaultOutlineLevelAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( styleDefaultOutlineLevelValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleFamilyAttribute</code> , See {@odf.attribute style:family}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleFamilyAttribute()
	{
		StyleFamilyAttribute attr = (StyleFamilyAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.STYLE), "family" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleFamilyAttribute</code> , See {@odf.attribute style:family}
	 *
	 * @param styleFamilyValue   The type is <code>String</code>
	 */
	public void setStyleFamilyAttribute( String styleFamilyValue )
	{
		StyleFamilyAttribute attr =  new StyleFamilyAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleFamilyValue );
	}

	/**
	 * Create child element {@odf.element style:text-properties}.
	 *
     * @param textDisplayAttributeValue  the <code>String</code> value of <code>TextDisplayAttribute</code>, see {@odf.attribute  text:display} at specification
	 * @return   return  the element {@odf.element style:text-properties}
	 * DifferentQName 
	 */
    
	public StyleTextPropertiesElement newStyleTextPropertiesElement(String textDisplayAttributeValue)
	{
		StyleTextPropertiesElement  styleTextProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
		styleTextProperties.setTextDisplayAttribute( textDisplayAttributeValue );
		this.appendChild( styleTextProperties);
		return  styleTextProperties;      
	}
    
	/**
	 * Create child element {@odf.element style:text-properties}.
	 *
     * @param textConditionAttributeValue  the <code>String</code> value of <code>TextConditionAttribute</code>, see {@odf.attribute  text:condition} at specification
	 * @param textDisplayAttributeValue  the <code>String</code> value of <code>TextDisplayAttribute</code>, see {@odf.attribute  text:display} at specification
	 * @return   return  the element {@odf.element style:text-properties}
	 * DifferentQName 
	 */
    
	public StyleTextPropertiesElement newStyleTextPropertiesElement(String textConditionAttributeValue, String textDisplayAttributeValue)
	{
		StyleTextPropertiesElement  styleTextProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
		styleTextProperties.setTextConditionAttribute( textConditionAttributeValue );
		styleTextProperties.setTextDisplayAttribute( textDisplayAttributeValue );
		this.appendChild( styleTextProperties);
		return  styleTextProperties;      
	}
    
	/**
	 * Create child element {@odf.element style:paragraph-properties}.
	 *
	 * @return   return  the element {@odf.element style:paragraph-properties}
	 * DifferentQName 
	 */
	public StyleParagraphPropertiesElement newStyleParagraphPropertiesElement()
	{
		StyleParagraphPropertiesElement  styleParagraphProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleParagraphPropertiesElement.class);
		this.appendChild( styleParagraphProperties);
		return  styleParagraphProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:section-properties}.
	 *
	 * @return   return  the element {@odf.element style:section-properties}
	 * DifferentQName 
	 */
	public StyleSectionPropertiesElement newStyleSectionPropertiesElement()
	{
		StyleSectionPropertiesElement  styleSectionProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleSectionPropertiesElement.class);
		this.appendChild( styleSectionProperties);
		return  styleSectionProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:ruby-properties}.
	 *
	 * @return   return  the element {@odf.element style:ruby-properties}
	 * DifferentQName 
	 */
	public StyleRubyPropertiesElement newStyleRubyPropertiesElement()
	{
		StyleRubyPropertiesElement  styleRubyProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleRubyPropertiesElement.class);
		this.appendChild( styleRubyProperties);
		return  styleRubyProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:table-properties}.
	 *
	 * @return   return  the element {@odf.element style:table-properties}
	 * DifferentQName 
	 */
	public StyleTablePropertiesElement newStyleTablePropertiesElement()
	{
		StyleTablePropertiesElement  styleTableProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTablePropertiesElement.class);
		this.appendChild( styleTableProperties);
		return  styleTableProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:table-column-properties}.
	 *
	 * @return   return  the element {@odf.element style:table-column-properties}
	 * DifferentQName 
	 */
	public StyleTableColumnPropertiesElement newStyleTableColumnPropertiesElement()
	{
		StyleTableColumnPropertiesElement  styleTableColumnProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTableColumnPropertiesElement.class);
		this.appendChild( styleTableColumnProperties);
		return  styleTableColumnProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:table-row-properties}.
	 *
	 * @return   return  the element {@odf.element style:table-row-properties}
	 * DifferentQName 
	 */
	public StyleTableRowPropertiesElement newStyleTableRowPropertiesElement()
	{
		StyleTableRowPropertiesElement  styleTableRowProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTableRowPropertiesElement.class);
		this.appendChild( styleTableRowProperties);
		return  styleTableRowProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:table-cell-properties}.
	 *
	 * @return   return  the element {@odf.element style:table-cell-properties}
	 * DifferentQName 
	 */
	public StyleTableCellPropertiesElement newStyleTableCellPropertiesElement()
	{
		StyleTableCellPropertiesElement  styleTableCellProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTableCellPropertiesElement.class);
		this.appendChild( styleTableCellProperties);
		return  styleTableCellProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:graphic-properties}.
	 *
	 * @return   return  the element {@odf.element style:graphic-properties}
	 * DifferentQName 
	 */
	public StyleGraphicPropertiesElement newStyleGraphicPropertiesElement()
	{
		StyleGraphicPropertiesElement  styleGraphicProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleGraphicPropertiesElement.class);
		this.appendChild( styleGraphicProperties);
		return  styleGraphicProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:drawing-page-properties}.
	 *
	 * @return   return  the element {@odf.element style:drawing-page-properties}
	 * DifferentQName 
	 */
	public StyleDrawingPagePropertiesElement newStyleDrawingPagePropertiesElement()
	{
		StyleDrawingPagePropertiesElement  styleDrawingPageProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleDrawingPagePropertiesElement.class);
		this.appendChild( styleDrawingPageProperties);
		return  styleDrawingPageProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:chart-properties}.
	 *
     * @param chartSymbolTypeAttributeValue  the <code>String</code> value of <code>ChartSymbolTypeAttribute</code>, see {@odf.attribute  chart:symbol-type} at specification
	 * @return   return  the element {@odf.element style:chart-properties}
	 * DifferentQName 
	 */
    
	public StyleChartPropertiesElement newStyleChartPropertiesElement(String chartSymbolTypeAttributeValue)
	{
		StyleChartPropertiesElement  styleChartProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleChartPropertiesElement.class);
		styleChartProperties.setChartSymbolTypeAttribute( chartSymbolTypeAttributeValue );
		this.appendChild( styleChartProperties);
		return  styleChartProperties;      
	}
    
	/**
	 * Create child element {@odf.element style:chart-properties}.
	 *
     * @param chartSymbolNameAttributeValue  the <code>String</code> value of <code>ChartSymbolNameAttribute</code>, see {@odf.attribute  chart:symbol-name} at specification
	 * @param chartSymbolTypeAttributeValue  the <code>String</code> value of <code>ChartSymbolTypeAttribute</code>, see {@odf.attribute  chart:symbol-type} at specification
	 * @return   return  the element {@odf.element style:chart-properties}
	 * DifferentQName 
	 */
    
	public StyleChartPropertiesElement newStyleChartPropertiesElement(String chartSymbolNameAttributeValue, String chartSymbolTypeAttributeValue)
	{
		StyleChartPropertiesElement  styleChartProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleChartPropertiesElement.class);
		styleChartProperties.setChartSymbolNameAttribute( chartSymbolNameAttributeValue );
		styleChartProperties.setChartSymbolTypeAttribute( chartSymbolTypeAttributeValue );
		this.appendChild( styleChartProperties);
		return  styleChartProperties;      
	}
    
	/**
	 * Create child element {@odf.element style:map}.
	 *
     * @param styleApplyStyleNameAttributeValue  the <code>String</code> value of <code>StyleApplyStyleNameAttribute</code>, see {@odf.attribute  style:apply-style-name} at specification
	 * @param styleConditionAttributeValue  the <code>String</code> value of <code>StyleConditionAttribute</code>, see {@odf.attribute  style:condition} at specification
	 * @return   return  the element {@odf.element style:map}
	 * DifferentQName 
	 */
    
	public StyleMapElement newStyleMapElement(String styleApplyStyleNameAttributeValue, String styleConditionAttributeValue)
	{
		StyleMapElement  styleMap = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleMapElement.class);
		styleMap.setStyleApplyStyleNameAttribute( styleApplyStyleNameAttributeValue );
		styleMap.setStyleConditionAttribute( styleConditionAttributeValue );
		this.appendChild( styleMap);
		return  styleMap;      
	}
    
}
