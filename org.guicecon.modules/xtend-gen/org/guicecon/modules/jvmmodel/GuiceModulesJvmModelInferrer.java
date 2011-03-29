package org.guicecon.modules.jvmmodel;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class GuiceModulesJvmModelInferrer implements IJvmModelInferrer {
  private final GuiceModulesJvmModelInferrer _this = this;
  @com.google.inject.Inject private IJvmModelAssociator iJvmModelAssociator;
  
  public List<? extends JvmDeclaredType> inferJvmModel(final EObject sourceObject) {
    ArrayList<? extends JvmDeclaredType> _newArrayList = CollectionLiterals.newArrayList();
    return _newArrayList;
  }
}