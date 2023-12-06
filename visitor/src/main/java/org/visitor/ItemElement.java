package org.visitor;

/**
 * Created by ainacio on Dec, 2023
 */
public interface ItemElement {

    public int accept(ShoppinCartVisitor visitor);
}
