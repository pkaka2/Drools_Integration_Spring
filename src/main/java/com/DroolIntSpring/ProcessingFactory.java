package com.DroolIntSpring;

public interface ProcessingFactory<T, V> {
    T createProcessingObject(V inputObject);
}