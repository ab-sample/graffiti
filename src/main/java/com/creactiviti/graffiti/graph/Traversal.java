package com.creactiviti.graffiti.graph;

import java.util.Iterator;

public interface Traversal<E extends Element> extends Iterator<E> {
  
  Traversal<E> hasId (String aId);
  
  Traversal<E> has (String aProperty, Object aValue);
  
  
}
