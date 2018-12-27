package com.smartwarehouse.aldillaputri.smartwarehouse.base;

import android.content.Context;
import android.support.annotation.NonNull;

public interface BaseView<T> {
    void setPresenter(@NonNull T presenter);
    Context getContextView();
}