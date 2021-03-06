package net.neoremind.mycode.designpattern.async.method.invocation;

import com.google.common.base.Optional;

public interface AsyncCallback<T> {

    /**
     * Complete handler which is executed when async task is completed or fails execution.
     *
     * @param value the evaluated value from async task, undefined when execution fails
     * @param ex    empty value if execution succeeds, some exception if executions fails
     */
    void onComplete(T value, Optional<Exception> ex);

}
