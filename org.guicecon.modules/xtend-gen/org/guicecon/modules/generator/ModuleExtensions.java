package org.guicecon.modules.generator;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.guicecon.modules.guiceModules.Module;

@SuppressWarnings("all")
public class ModuleExtensions {
  private final ModuleExtensions _this = this;
  
  public String javaPath(final Module m) {
    String _qualifiedName = _this.qualifiedName(m);
    String _replace = _qualifiedName.replace(".", "/");
    String _operator_plus = StringExtensions.operator_plus(_replace, ".java");
    return _operator_plus;
  }
  
  public String qualifiedName(final Module m) {
    String _packageName = m.getPackageName();
    String _operator_plus = StringExtensions.operator_plus(_packageName, ".");
    String _name = m.getName();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
    return _operator_plus_1;
  }
  
  public List<String> foo() {
    char[] _charArray = "hello".toCharArray();
    final Function1<Character,String> function = new Function1<Character,String>() {
        public String apply(Character e) {
          String _holla = _this.holla();
          final Character typeConverted_e = (Character)e;
          String _operator_plus = StringExtensions.operator_plus(_holla, typeConverted_e);
          return _operator_plus;
        }
      };
    List<String> _map = ListExtensions.map(((List<Character>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_charArray)), function);
    return _map;
  }
  
  public String holla() {
    return "hello ";
  }
}