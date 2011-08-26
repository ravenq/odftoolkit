/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 * Copyright 2009 IBM. All rights reserved.
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
package org.odftoolkit.odfdom.doc;

import org.odftoolkit.odfdom.doc.office.OdfOfficeText;
import org.odftoolkit.odfdom.doc.text.OdfTextParagraph;
import org.odftoolkit.odfdom.pkg.MediaType;
import org.odftoolkit.odfdom.pkg.OdfPackage;
import org.w3c.dom.Node;

/**
 * This class represents an empty ODF text document.
 * 
 */
public class OdfTextDocument extends OdfDocument {

	private static final String EMPTY_TEXT_DOCUMENT_PATH = "/OdfTextDocument.odt";
	static final Resource EMPTY_TEXT_DOCUMENT_RESOURCE = new Resource(EMPTY_TEXT_DOCUMENT_PATH);

	/**
	 * This enum contains all possible media types of OdfSpreadsheetDocument
	 * documents.
	 */
	public enum OdfMediaType implements MediaType {

		TEXT(OdfDocument.OdfMediaType.TEXT),
		TEXT_TEMPLATE(OdfDocument.OdfMediaType.TEXT_TEMPLATE),
		TEXT_MASTER(OdfDocument.OdfMediaType.TEXT_MASTER),
		TEXT_WEB(OdfDocument.OdfMediaType.TEXT_WEB);
		private final OdfDocument.OdfMediaType mMediaType;

		OdfMediaType(OdfDocument.OdfMediaType mediaType) {
			this.mMediaType = mediaType;
		}

		/**
		 * @return the mediatype of this document
		 */
		public String getMediaTypeString() {
			return mMediaType.getMediaTypeString();
		}

		/**
		 * @return the ODF filesuffix of this document
		 */
		public String getSuffix() {
			return mMediaType.getSuffix();
		}

		/**
		 *
		 * @param mediaType string defining an ODF document
		 * @return the according OdfMediatype encapuslating the given string and the suffix
		 */
		public static OdfDocument.OdfMediaType getOdfMediaType(String mediaType) {
			return OdfDocument.OdfMediaType.getOdfMediaType(mediaType);
		}
	}

	/**
	 * Creates an empty text document.
	 * @return ODF text document based on a default template
	 * @throws java.lang.Exception - if the document could not be created
	 */
	public static OdfTextDocument newTextDocument() throws Exception {
		return (OdfTextDocument) OdfDocument.loadTemplate(EMPTY_TEXT_DOCUMENT_RESOURCE, OdfDocument.OdfMediaType.TEXT);
	}

	/**
	 * Creates an empty text document.
	 * @return ODF text document based on a default template
	 * @throws java.lang.Exception - if the document could not be created
	 */
	public static OdfTextDocument newTextDocument(OdfTextDocument.OdfMediaType mimeType) throws Exception {
		return (OdfTextDocument) OdfDocument.loadTemplate(EMPTY_TEXT_DOCUMENT_RESOURCE, OdfDocument.OdfMediaType.TEXT);
	}


	/**
	 * Creates an empty text template.
	 * @return ODF text template based on a default
	 * @throws java.lang.Exception - if the template could not be created
	 */
	public static OdfTextDocument newTextTemplateDocument() throws Exception {
		return  (OdfTextDocument) OdfDocument.loadTemplate(EMPTY_TEXT_DOCUMENT_RESOURCE, OdfDocument.OdfMediaType.TEXT_TEMPLATE);
	}

	/**
	 * Creates an empty text master document.
	 * @return ODF text master based on a default
	 * @throws java.lang.Exception - if the document could not be created
	 */
	public static OdfTextDocument newTextMasterDocument() throws Exception {
		OdfTextDocument doc = (OdfTextDocument) OdfDocument.loadTemplate(EMPTY_TEXT_DOCUMENT_RESOURCE, OdfDocument.OdfMediaType.TEXT_MASTER);
		doc.changeMode(OdfMediaType.TEXT_MASTER);
		return doc;
	}

	/**
	 * Creates an empty text web.
	 * @return ODF text web based on a default
	 * @throws java.lang.Exception - if the document could not be created
	 */
	public static OdfTextDocument newTextWebDocument() throws Exception {
		OdfTextDocument doc = (OdfTextDocument) OdfDocument.loadTemplate(EMPTY_TEXT_DOCUMENT_RESOURCE, OdfDocument.OdfMediaType.TEXT_WEB);
		doc.changeMode(OdfMediaType.TEXT_WEB);
		return doc;
	}

	// Using static factory instead of constructor
	protected OdfTextDocument(OdfPackage pkg, String internalPath, OdfTextDocument.OdfMediaType odfMediaType) {
		super(pkg, internalPath, odfMediaType.mMediaType);
	}

	/**
	 * Get the content root of a text document. Start here to get or create new
	 * elements of a text document like paragraphs, headings, tables or lists.
	 *
	 * @return content root, representing the office:text tag
	 * @throws Exception if the file DOM could not be created.
	 */
	@Override
	public OdfOfficeText getContentRoot() throws Exception {
		return super.getContentRoot(OdfOfficeText.class);
	}

	/**
	 * Creates a new paragraph and append text
	 *
	 * @param text
	 * @return the new paragraph
	 * @throws Exception if the file DOM could not be created.
	 */
	public OdfTextParagraph newParagraph(String text) throws Exception {
		OdfTextParagraph para = newParagraph();
		para.addContent(text);
		return para;
	}

	/**
	 * Creates a new paragraph
	 *
	 * @return The new paragraph
	 * @throws Exception if the file DOM could not be created.
	 */
	public OdfTextParagraph newParagraph() throws Exception {
		OdfOfficeText odfText = getContentRoot();
		return (OdfTextParagraph) odfText.newTextPElement();
	}

	/**
	 * Append text to the end of a text document.
	 * If there is no paragraph at the end of a document, a new one will be created.
	 *
	 * @param text initial text for the paragraph.
	 * @return The paragraph at the end of the text document, where the text has been added to.
	 * @throws Exception if the file DOM could not be created.
	 */
	public OdfTextParagraph addText(String text) throws Exception {
		OdfOfficeText odfText = getContentRoot();
		Node n = odfText.getLastChild();
		OdfTextParagraph para;
		if (OdfTextParagraph.class.isInstance(n)) {
			para = (OdfTextParagraph) n;
		} else {
			para = newParagraph();
		}
		para.addContent(text);
		return para;
	}

	/**
	 * Changes the document to the given mediatype.
	 * This method can only be used to convert a document to a related mediatype, e.g. template.
	 *
	 * @param mediaType the related ODF mimetype
	 */
	public void changeMode(OdfMediaType mediaType) {
		setOdfMediaType(mediaType.mMediaType);
	}
}
