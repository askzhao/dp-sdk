package com.askzhao.dp.android.sdk;

import android.content.SharedPreferences;

import java.util.concurrent.Future;

/**
 * Created by 王灼洲 on 2017/4/10
 */

class PersistentLoginId extends PersistentIdentity<String> {
    PersistentLoginId(Future<SharedPreferences> loadStoredPreferences) {
        super(loadStoredPreferences, "events_login_id", new PersistentSerializer<String>() {
            @Override
            public String load(String value) {
                return value;
            }

            @Override
            public String save(String item) {
                return item;
            }

            @Override
            public String create() {
                return null;
            }
        });
    }
}
