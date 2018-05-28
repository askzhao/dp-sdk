package com.askzhao.dp.android.sdk;

/**
 * SDK内部接口
 */
public interface ResourceIds {

    boolean knownIdName(String name);

    int idFromName(String name);

    String nameForId(int id);

}
