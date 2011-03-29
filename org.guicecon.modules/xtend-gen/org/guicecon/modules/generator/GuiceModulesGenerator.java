package org.guicecon.modules.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.guicecon.modules.generator.ModuleExtensions;
import org.guicecon.modules.guiceModules.AnnotationRef;
import org.guicecon.modules.guiceModules.Binding;
import org.guicecon.modules.guiceModules.Key;
import org.guicecon.modules.guiceModules.Module;

@SuppressWarnings("all")
public class GuiceModulesGenerator implements IGenerator {
  private final GuiceModulesGenerator _this = this;
  @com.google.inject.Inject private ModuleExtensions moduleExtensions;
  @com.google.inject.Inject private XbaseCompiler xbaseCompiler;
  @com.google.inject.Inject private TypeReferences typeReferences;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    {
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.head(_contents);
      final Module m = ((org.guicecon.modules.guiceModules.Module) _head);
      ModuleExtensions _moduleExtensions = moduleExtensions;
      String _javaPath = _moduleExtensions.javaPath(m);
      StringConcatenation _generateJava = _this.generateJava(m);
      fsa.generateFile(_javaPath, _generateJava);
    }
  }
  
  public StringConcatenation generateJava(final Module m) {
    {
      final ImportManager im = new ImportManager(true);
      final StringBuilder sb = new StringBuilder();
      final Module typeConverted_m = (Module)m;
      _this.registerType(im, "java.util.HashSet", typeConverted_m);
      final Module typeConverted_m_1 = (Module)m;
      _this.registerType(im, "java.util.Set", typeConverted_m_1);
      final Module typeConverted_m_2 = (Module)m;
      _this.registerType(im, "com.google.inject.Binder", typeConverted_m_2);
      final Module typeConverted_m_3 = (Module)m;
      _this.registerType(im, "com.google.inject.Key", typeConverted_m_3);
      final Module typeConverted_m_4 = (Module)m;
      _this.registerType(im, "com.google.inject.Module", typeConverted_m_4);
      final Module typeConverted_m_5 = (Module)m;
      _this.registerType(im, "com.google.inject.TypeLiteral", typeConverted_m_5);
      final Module typeConverted_m_6 = (Module)m;
      Object _generate = _this.generate(typeConverted_m_6, im);
      final Object contents = _generate;
      StringConcatenation builder = new StringConcatenation();
      builder.append("package \u00C7m.packageName\u00C8;");
      builder.newLine();
      builder.newLine();
      builder.append("\u00C7FOR imp : im.imports\u00C8");
      builder.newLine();
      builder.append("\t");
      builder.append("import \u00C7imp\u00C8;");
      builder.newLine();
      builder.append("\u00C7ENDFOR\u00C8");
      builder.newLine();
      builder.newLine();
      builder.append("\u00C7contents\u00C8");
      builder.newLine();
      return builder;
    }
  }
  
  public ImportManager registerType(final ImportManager m, final String typeSignature, final EObject context) {
    {
      TypeReferences _typeReferences = _this.typeReferences;
      final EObject typeConverted_context = (EObject)context;
      JvmTypeReference _typeForName = _typeReferences.getTypeForName(typeSignature, typeConverted_context);
      final JvmTypeReference typeRef = _typeForName;
      m.appendTypeRef(typeRef, new StringBuilder());
      return m;
    }
  }
  
  public StringConcatenation _generate(final Module m, final ImportManager im) {
    StringConcatenation builder = new StringConcatenation();
    builder.append("@SuppressWarnings(\"all\")");
    builder.newLine();
    builder.append("public class \u00C7m.name\u00C8 implements Module {");
    builder.newLine();
    builder.append("\t");
    builder.newLine();
    builder.append("\t");
    builder.append("\u00C7FOR mixedIn : m.mixins\u00C8");
    builder.newLine();
    builder.append("\t\t");
    builder.append("private \u00C7mixedIn.qualifiedName\u00C8 \u00C7mixedIn.name.toFirstLower\u00C8 = new \u00C7mixedIn.qualifiedName\u00C8(); ");
    builder.newLine();
    builder.append("\t");
    builder.append("\u00C7ENDFOR\u00C8");
    builder.newLine();
    builder.append("\t");
    builder.newLine();
    builder.append("\t");
    builder.append("public void configure(Binder binder) {");
    builder.newLine();
    builder.append("\t\t");
    builder.append("configure(binder, new HashSet<Key<?>>());");
    builder.newLine();
    builder.append("\t");
    builder.append("}");
    builder.newLine();
    builder.append("\t");
    builder.newLine();
    builder.append("\t");
    builder.append("public void configure(Binder binder, Set<Key<?>> usedKeys) {");
    builder.newLine();
    builder.append("\t\t");
    builder.append("\u00C7FOR b : m.bindings\u00C8");
    builder.newLine();
    builder.append("\t\t\t");
    builder.append("\u00C7b.generate(im)\u00C8");
    builder.newLine();
    builder.append("\t\t");
    builder.append("\u00C7ENDFOR\u00C8");
    builder.newLine();
    builder.append("\t\t");
    builder.append("\u00C7FOR mixedIn : m.mixins\u00C8");
    builder.newLine();
    builder.append("\t\t\t");
    builder.append("\u00C7mixedIn.name.toFirstLower\u00C8.configure(binder, usedKeys); ");
    builder.newLine();
    builder.append("\t\t");
    builder.append("\u00C7ENDFOR\u00C8");
    builder.newLine();
    builder.append("\t");
    builder.append("}");
    builder.newLine();
    builder.append("}");
    builder.newLine();
    return builder;
  }
  
  public IAppendable _generate(final Binding b, final ImportManager im) {
    IAppendable _xblockexpression = null;
    {
      final StringBuilderBasedAppendable sb = new StringBuilderBasedAppendable(im);
      sb.append("\nif (usedKeys.add(");
      Key _from = b.getFrom();
      final StringBuilderBasedAppendable typeConverted_sb = (StringBuilderBasedAppendable)sb;
      _this.appendKey(_from, typeConverted_sb);
      sb.append(")) {");
      sb.increaseIndentation();
      XExpression _instance = b.getToInstance();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_instance, null);
      if (((Boolean)_operator_notEquals)) {
        XExpression _instance_1 = b.getToInstance();
        final StringBuilderBasedAppendable typeConverted_sb_1 = (StringBuilderBasedAppendable)sb;
        _this.prepare(_instance_1, typeConverted_sb_1);
      }
      sb.append("\nbinder.bind(");
      Key _from_1 = b.getFrom();
      final StringBuilderBasedAppendable typeConverted_sb_2 = (StringBuilderBasedAppendable)sb;
      _this.appendKey(_from_1, typeConverted_sb_2);
      sb.append(")");
      Key _to = b.getTo();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_to, null);
      if (((Boolean)_operator_notEquals_1)) {
        {
          sb.append(".to(");
          Key _to_1 = b.getTo();
          final StringBuilderBasedAppendable typeConverted_sb_3 = (StringBuilderBasedAppendable)sb;
          _this.appendKey(_to_1, typeConverted_sb_3);
          sb.append(")");
        }
      } else {
        {
          sb.append(".toInstance(");
          XExpression _instance_2 = b.getToInstance();
          final StringBuilderBasedAppendable typeConverted_sb_4 = (StringBuilderBasedAppendable)sb;
          _this.toExpression(_instance_2, typeConverted_sb_4);
          sb.append(")");
        }
      }
      sb.append(";");
      sb.decreaseIndentation();
      IAppendable _append = sb.append("\n}");
      _xblockexpression = (_append);
    }
    return _xblockexpression;
  }
  
  public void appendKey(final Key k, final IAppendable sb) {
    {
      sb.append("Key.get(");
      sb.append("new TypeLiteral<");
      JvmParameterizedTypeReference _type = k.getType();
      IAppendable _append = sb.append(_type);
      _append.append(">(){}");
      AnnotationRef _annotation = k.getAnnotation();
      JvmAnnotationType _annotation_1 = _annotation==null?(JvmAnnotationType)null:_annotation.getAnnotation();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_annotation_1, null);
      if (((Boolean)_operator_notEquals)) {
        IAppendable _append_1 = sb.append(",");
        AnnotationRef _annotation_2 = k.getAnnotation();
        JvmAnnotationType _annotation_3 = _annotation_2.getAnnotation();
        IAppendable _append_2 = _append_1.append(_annotation_3);
        _append_2.append(".class");
      }
      sb.append(")");
    }
  }
  
  public void prepare(final XExpression expr, final IAppendable app) {
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(expr, null);
    if (((Boolean)_operator_notEquals)) {
      XbaseCompiler _xbaseCompiler = _this.xbaseCompiler;
      _xbaseCompiler.toJavaStatement(expr, app, true);
    }
  }
  
  public void toExpression(final XExpression expr, final IAppendable app) {
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(expr, null);
    if (((Boolean)_operator_notEquals)) {
      XbaseCompiler _xbaseCompiler = _this.xbaseCompiler;
      _xbaseCompiler.toJavaExpression(expr, app);
    }
  }
  
  public Object generate(final EObject b, final ImportManager im) {
    if ((b instanceof Binding)
         && (im instanceof ImportManager)) {
      return _generate((Binding)b, (ImportManager)im);
    } else if ((b instanceof Module)
         && (im instanceof ImportManager)) {
      return _generate((Module)b, (ImportManager)im);
    } else {
      throw new IllegalArgumentException();
    }
  }
}