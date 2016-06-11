package com.thekey.toolslib.mvp.domain.executor;


import com.thekey.toolslib.mvp.domain.interactors.AbstractInteractor;

import java.util.HashMap;

/**
 * This executor is responsible for running interactors on background threads.
 * <p/>
 */
public interface Executor {

    /**
     * This method should call the interactor's run method and thus start the interactor. This should be called
     * on a background thread as interactors might do lengthy operations.
     *
     * @param interactor The interactor to run.
     */
    void execute(HashMap<String, String> params, final AbstractInteractor interactor);
}
