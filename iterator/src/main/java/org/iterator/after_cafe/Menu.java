package org.iterator.after_cafe;

import org.iterator.MenuItem;

import java.util.Iterator;

/**
 * Created by ainacio on Nov, 2023
 */
public interface Menu {

    public Iterator<MenuItem> createIterator();
}
