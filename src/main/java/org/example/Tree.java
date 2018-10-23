package org.example;

public interface Tree {

    Iterable<Tree> getChildren();

    Iterable<? extends Property> getProperties();

}
