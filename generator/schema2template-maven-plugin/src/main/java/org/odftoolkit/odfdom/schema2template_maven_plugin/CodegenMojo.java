/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Copyright 2009 Benson I. Margulies. All rights reserved.
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
 */
package org.odftoolkit.odfdom.schema2template_maven_plugin;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import schema2template.example.odf.OdfCodegen;

/**
 * Generate Java code for ODFDOM.
 * @goal Schema2template
 * @phase generate-sources
 * @description Schema2template tool
 * @requiresDependencyResolution compile
 */
public class CodegenMojo extends AbstractMojo {

	/**
	 * @parameter
	 * @required
	 */
	String sourceRoot;
	/**
	 * @parameter
	 * @required
	 */
	File schemaFile;
	/**
	 * @parameter
	 * @required
	 */
	File configFile;
	/**
	 * @parameter
	 * @required
	 */
	File templateFile;
	/**
	 * @parameter expression="${project}"
	 * @required
	 */
	MavenProject project;

	/* (non-Javadoc)
	 * @see org.apache.maven.plugin.Mojo#execute()
	 * @goal codegen
	 */
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Schema2template code generation.");
		getLog().debug("Config file " + configFile.getAbsolutePath());
		getLog().debug("Schema file " + schemaFile.getAbsolutePath());
		getLog().debug("TemplateFile " + templateFile.getAbsolutePath());
		try {
			OdfCodegen.main(null);
		} catch (Exception e) {
			e.printStackTrace();
			getLog().error("Failed to parse template.");
			String msg = "Failed to execute ODF schema2template example";
			throw new MojoFailureException(e, msg, msg);
		}
		//OdfCodeGen xThis = new OdfCodeGen(sourceRoot);
//         if (xThis.parseConfig(configFile.getAbsolutePath()) ) {
//             if (xThis.parseSchema(schemaFile.getAbsolutePath())) {
//                 if (xThis.parseTemplate(templateFile.getAbsolutePath())) {
//                     if (!xThis.executeTemplate(xThis.getTemplate())) {
//                    	 getLog().error("Failed to execute template.");
//                    	 throw new MojoFailureException("Failed to execute template.");
//                     }
//                 } else {
//                	 getLog().error("Failed to parse template.");
//                	 throw new MojoFailureException("Failed to parse template.");
//                 }
//             } else {
//            	 getLog().error("Failed to parse schema.");
//            	 throw new MojoFailureException("Failed to parse schema.");
//             }
//         } else {
//        	 getLog().error("Failed to parse config.");
//        	 throw new MojoFailureException("Failed to parse config.");
//         }
//         getLog().info("Schema2template complete.");
//
//         if (project != null) {
//             boolean alreadyInSourceRoots = false;
//             for (Object sr : project.getCompileSourceRoots()) {
//            	 String srs = (String) sr;
//            	 if (srs.equals(sourceRoot)) {
//            		 alreadyInSourceRoots = true;
//            	 }
//             }
//             if (!alreadyInSourceRoots) {
//            	 getLog().info("Adding " + sourceRoot + " to project source roots.");
//            	 project.addCompileSourceRoot(sourceRoot);
//             }
//         }
	}
}
