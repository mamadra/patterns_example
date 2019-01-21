package com.company.iterator;

import com.company.observer.Observer;

public interface IIterator {
    boolean hasNext();

    Object getNext();
}
