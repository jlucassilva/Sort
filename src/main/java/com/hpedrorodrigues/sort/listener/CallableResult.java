package com.hpedrorodrigues.sort.listener;

public interface CallableResult<I, O> {

    public O call(I input);
}