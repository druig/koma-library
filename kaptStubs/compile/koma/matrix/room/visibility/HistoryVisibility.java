package koma.matrix.room.visibility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\b"}, d2 = {"Lkoma/matrix/room/visibility/HistoryVisibility;", "", "(Ljava/lang/String;I)V", "Invited", "Joined", "Shared", "WorldReadable", "Companion", "koma-library"})
public enum HistoryVisibility {
    @com.squareup.moshi.Json(name = "invited")
    /*public static final*/ Invited /* = new Invited() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "joined")
    /*public static final*/ Joined /* = new Joined() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "shared")
    /*public static final*/ Shared /* = new Shared() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "world_readable")
    /*public static final*/ WorldReadable /* = new WorldReadable() */ /*enum*/ ;
    public static final koma.matrix.room.visibility.HistoryVisibility.Companion Companion = null;
    
    HistoryVisibility() {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkoma/matrix/room/visibility/HistoryVisibility$Companion;", "", "()V", "fromString", "Lkoma/matrix/room/visibility/HistoryVisibility;", "hvstr", "", "koma-library"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final koma.matrix.room.visibility.HistoryVisibility fromString(@org.jetbrains.annotations.NotNull()
        java.lang.String hvstr) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}