package koma.matrix.room.participation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\b"}, d2 = {"Lkoma/matrix/room/participation/RoomJoinRules;", "", "(Ljava/lang/String;I)V", "Public", "Knock", "Invite", "Private", "Companion", "koma-library"})
public enum RoomJoinRules {
    @com.squareup.moshi.Json(name = "public")
    /*public static final*/ Public /* = new Public() */ /*enum*/ ,
    /*public static final*/ Knock /* = new Knock() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "invite")
    /*public static final*/ Invite /* = new Invite() */ /*enum*/ ,
    /*public static final*/ Private /* = new Private() */ /*enum*/ ;
    public static final koma.matrix.room.participation.RoomJoinRules.Companion Companion = null;
    
    RoomJoinRules() {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkoma/matrix/room/participation/RoomJoinRules$Companion;", "", "()V", "fromString", "Lkoma/matrix/room/participation/RoomJoinRules;", "rule", "", "koma-library"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final koma.matrix.room.participation.RoomJoinRules fromString(@org.jetbrains.annotations.NotNull()
        java.lang.String rule) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}