package org.visitor;

/**
 * Created by ainacio on Dec, 2023
 */
public interface ShoppinCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
