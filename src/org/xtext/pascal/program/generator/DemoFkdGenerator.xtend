/*
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.pascal.program.demoFkd.program

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DemoFkdGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))

		for(p : resource.allContents.toIterable.filter(program)) {
			fsa.generateFile("programs/" + p.getHeading().getName() + ".java", p.compile);
		}

	}
	
	def compile(program p) {
		var consts = p.getBlock().getConstant().getConsts();
		var vars = p.getBlock().getVariable().getSections();
		
		'''
			package DemoFkd;
			
			public class ?p.getHeading().getName()? {
				??? Constants
									
				?FOR c : consts?
					?IF c.getConst().getNumber().getNumber().real === null?
						static int ?c.getName()? = ?c.getConst().getNumber().getNumber().getInteger()?;
					?ELSE?
						static float ?c.getName()? = ?c.getConst().getNumber().getNumber().getReal()?;
					?ENDIF?
				?ENDFOR?
				
				public static void main(String[] args) {
					?FOR varSection : vars?
						?IF varSection.getType().getSimple().getName() == "integer"?
							int ?String.join(",", varSection.getIdentifiers().getNames())?;
						?ELSEIF varSection.getType().getSimple().getName() == "real"?
							float ?String.join(",", varSection.getIdentifiers().getNames())?;
			            ?ENDIF? 
					?ENDFOR?
				}
			}
		'''
	}
	

}
