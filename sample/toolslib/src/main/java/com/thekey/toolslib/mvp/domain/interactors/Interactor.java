package com.thekey.toolslib.mvp.domain.interactors;


import java.util.Map;

/**
 * This is the main interface of an interactor. Each interactor serves a specific use case.
 */
public interface Interactor {

    /**
     * This is the main method that starts an interactor. It will make sure that the interactor operation is done on a
     * background thread.
     */
    void execute(Map<String, String> params);
}
