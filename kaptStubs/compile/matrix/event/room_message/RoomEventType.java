package matrix.event.room_message;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0015"}, d2 = {"Lmatrix/event/room_message/RoomEventType;", "", "(Ljava/lang/String;I)V", "toString", "", "Aliases", "CanonAlias", "Create", "JoinRule", "PowerLevels", "Member", "Message", "Redaction", "Name", "Topic", "Avatar", "PinnedEvents", "BotOptions", "HistoryVisibility", "GuestAccess", "Companion", "koma-library"})
public enum RoomEventType {
    @com.squareup.moshi.Json(name = "m.room.aliases")
    /*public static final*/ Aliases /* = new Aliases() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.canonical_alias")
    /*public static final*/ CanonAlias /* = new CanonAlias() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.create")
    /*public static final*/ Create /* = new Create() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.join_rules")
    /*public static final*/ JoinRule /* = new JoinRule() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.power_levels")
    /*public static final*/ PowerLevels /* = new PowerLevels() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.member")
    /*public static final*/ Member /* = new Member() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.message")
    /*public static final*/ Message /* = new Message() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.redaction")
    /*public static final*/ Redaction /* = new Redaction() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.name")
    /*public static final*/ Name /* = new Name() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.topic")
    /*public static final*/ Topic /* = new Topic() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.avatar")
    /*public static final*/ Avatar /* = new Avatar() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "pinned-events")
    /*public static final*/ PinnedEvents /* = new PinnedEvents() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.bot.options")
    /*public static final*/ BotOptions /* = new BotOptions() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.history_visibility")
    /*public static final*/ HistoryVisibility /* = new HistoryVisibility() */ /*enum*/ ,
    @com.squareup.moshi.Json(name = "m.room.guest_access")
    /*public static final*/ GuestAccess /* = new GuestAccess() */ /*enum*/ ;
    private static final java.util.Map<matrix.event.room_message.RoomEventType, java.lang.String> enumStrMap = null;
    private static final java.util.Map<java.lang.String, matrix.event.room_message.RoomEventType> strEnumMap = null;
    public static final matrix.event.room_message.RoomEventType.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    RoomEventType() {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lmatrix/event/room_message/RoomEventType$Companion;", "", "()V", "enumStrMap", "", "Lmatrix/event/room_message/RoomEventType;", "", "strEnumMap", "enumToStr", "t", "findJsonAnnotationStr", "strToEnum", "s", "koma-library"})
    public static final class Companion {
        
        private final java.lang.String findJsonAnnotationStr(matrix.event.room_message.RoomEventType t) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String enumToStr(@org.jetbrains.annotations.NotNull()
        matrix.event.room_message.RoomEventType t) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final matrix.event.room_message.RoomEventType strToEnum(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}