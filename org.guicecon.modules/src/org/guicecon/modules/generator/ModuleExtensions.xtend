package org.guicecon.modules.generator

import org.guicecon.modules.guiceModules.Module

class ModuleExtensions {
	
	String javaPath(Module m) {
		m.qualifiedName.replace('.','/')+".java"
	}
	
	String qualifiedName(Module m) {
		m.packageName+"."+m.name
	}
	
	foo() {
		'hello'.toCharArray.map(e|holla+e)
	}
	
	holla() {'hello '}
	
//	@Inject String 
}