package hu.bme.mit.model2gml;

import org.eclipse.xtend2.lib.StringConcatenation;

public class Model2GML {
  public Object transform(final /* EObject */Object root) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved"
      + "\neAllContents cannot be resolved"
      + "\ntoList cannot be resolved"
      + "\ntoList cannot be resolved"
      + "\ntransform cannot be resolved");
  }
  
  public Object transform(final /* List<EObject> */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nMap cannot be resolved to a type."
      + "\nList cannot be resolved to a type."
      + "\nEObject cannot be resolved to a type."
      + "\nHashMap cannot be resolved."
      + "\nEObject cannot be resolved to a type."
      + "\nInteger cannot be resolved to a type."
      + "\nEObject cannot be resolved to a type."
      + "\nThe method transformObject(EObject, int, Map) from the type Model2GML refers to the missing type java.lang.CharSequence"
      + "\nsize cannot be resolved"
      + "\n+ cannot be resolved"
      + "\neClass cannot be resolved"
      + "\ngetEAllReferences cannot be resolved"
      + "\nisMany cannot be resolved"
      + "\neGet cannot be resolved"
      + "\ntransformRelation cannot be resolved"
      + "\ntransformRelation cannot be resolved"
      + "\neGet cannot be resolved"
      + "\ntoString cannot be resolved");
  }
  
  protected final int titleSize = 16;
  
  protected final int attributeSize = 14;
  
  protected final int borderDistance = 6;
  
  protected final int attributeBorderDistance = 8;
  
  protected final Object ratio /* Skipped initializer because of errors */;
  
  protected java.lang.CharSequence transformObject(final /* EObject */Object object, final int id, final /* Map<EObject, Integer> */Object objectToID) {
    throw new Error("Unresolved compilation problems:"
      + "\n* cannot be resolved."
      + "\nThe method or field length is undefined"
      + "\n* cannot be resolved."
      + "\n* cannot be resolved."
      + "\nMath cannot be resolved to a type."
      + "\n* cannot be resolved."
      + "\nMath cannot be resolved to a type."
      + "\n+ cannot be resolved."
      + "\n* cannot be resolved."
      + "\nThe method transformAttribute(EAttribute, Void) from the type Model2GML refers to the missing type java.lang.CharSequence"
      + "\nThe method transformAttribute(EAttribute, Void) from the type Model2GML refers to the missing type java.lang.CharSequence"
      + "\nThe field Model2GML.ratio refers to the missing type Object"
      + "\ntransormTitle cannot be resolved"
      + "\neClass cannot be resolved"
      + "\ngetEAllAttributes cannot be resolved"
      + "\nmap cannot be resolved"
      + "\neGet cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n* cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nmap cannot be resolved"
      + "\n* cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nmax cannot be resolved"
      + "\nmax cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n* cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nput cannot be resolved");
  }
  
  protected java.lang.CharSequence transormTitle(final /* EObject */Object object, final int id) {
    throw new Error("Unresolved compilation problems:"
      + "\neClass cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  protected java.lang.CharSequence _transformAttribute(final /* EAttribute */Object attribute, final /* Void */Object value) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  protected java.lang.CharSequence _transformAttribute(final /* EAttribute */Object attribute, final /* Object */Object value) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\ntransformAttributeValue cannot be resolved"
      + "\nclass cannot be resolved");
  }
  
  protected java.lang.CharSequence _transformAttribute(final /* EAttribute */Object attribute, final /* List<? extends  */Object values) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method transformAttributeValue(String, Class) from the type Model2GML refers to the missing type Object"
      + "\nThe method transformAttributeValue(String, Class) from the type Model2GML refers to the missing type Object"
      + "\nname cannot be resolved"
      + "\nmap cannot be resolved"
      + "\ngetEType cannot be resolved"
      + "\ninstanceClass cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  protected Object _transformAttributeValue(final /* String */Object value, final /* Class<? extends  */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nreplaceAll cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  protected Object _transformAttributeValue(final /* Double */Object value, final /* Class<? extends  */Object type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(value);
    return _builder;
  }
  
  protected Object _transformAttributeValue(final /* Integer */Object value, final /* Class<? extends  */Object type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(value);
    return _builder;
  }
  
  protected Object _transformAttributeValue(final /* Boolean */Object value, final /* Class<? extends  */Object type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(value);
    return _builder;
  }
  
  protected Object _transformAttributeValue(final /* Object */Object value, final /* Class<? extends  */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nisEnum cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nsimpleName cannot be resolved");
  }
  
  protected java.lang.CharSequence transformRelation(final /* EReference */Object reference, final /* EObject */Object source, final /* EObject */Object target, final /* Map<EObject, Integer> */Object objectToID) {
    throw new Error("Unresolved compilation problems:"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ncontainsKey cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\ncontainment cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  protected java.lang.CharSequence transformAttribute(final EAttribute attribute, final Void value) {
    if (attribute != null
         && value != null) {
      return _transformAttribute(attribute, value); else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(attribute, value).toString());
      }
    }
    
    protected Object transformAttributeValue(final String value, final Class type) {
      if (value != null
           && type != null) {
        return _transformAttributeValue(value, type); else {
          throw new IllegalArgumentException("Unhandled parameter types: " +
            Arrays.<Object>asList(value, type).toString());
        }
      }
    }
    