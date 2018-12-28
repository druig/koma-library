package koma.matrix.user.presence;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lkoma/matrix/user/presence/UserPresenceType;", "", "(Ljava/lang/String;I)V", "Online", "Offline", "Unavailable", "koma-library"})
public enum UserPresenceType {
    @com.squareup.moshi.Json(name = "online")
    /*public static final*/ Online /* = new Online() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "offline")
    /*public static final*/ Offline /* = new Offline() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "unavailable")
    /*public static final*/ Unavailable /* = new Unavailable() */ /*enum*/ ;
    
    UserPresenceType() {
    }
}