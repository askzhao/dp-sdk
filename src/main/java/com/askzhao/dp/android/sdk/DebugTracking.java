package com.askzhao.dp.android.sdk;

import org.json.JSONObject;

/**
 * SDK内部接口
 **/
public interface DebugTracking {

    void reportTrack(JSONObject eventJson);

}
