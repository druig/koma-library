package koma.matrix.sync;

import java.lang.System;

/**
 * * message received as a dict from the server
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\t\u0010&\u001a\u00020\fH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\bH\u00c6\u0003J\u0088\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\u0006\u00101\u001a\u00020\u0005J\t\u00102\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00064"}, d2 = {"Lkoma/matrix/sync/RawMessage;", "", "age", "", "event_id", "", "origin_server_ts", "prev_content", "", "type", "Lmatrix/event/room_message/RoomEventType;", "sender", "Lkoma/matrix/UserId;", "state_key", "txn_id", "content", "(Ljava/lang/Long;Ljava/lang/String;JLjava/util/Map;Lmatrix/event/room_message/RoomEventType;Lkoma/matrix/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAge", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContent", "()Ljava/util/Map;", "getEvent_id", "()Ljava/lang/String;", "getOrigin_server_ts", "()J", "getPrev_content", "getSender", "()Lkoma/matrix/UserId;", "getState_key", "getTxn_id", "getType", "()Lmatrix/event/room_message/RoomEventType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;JLjava/util/Map;Lmatrix/event/room_message/RoomEventType;Lkoma/matrix/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lkoma/matrix/sync/RawMessage;", "equals", "", "other", "hashCode", "", "toJson", "toString", "Companion", "koma-library"})
public final class RawMessage {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long age = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String event_id = null;
    private final long origin_server_ts = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.Object> prev_content = null;
    @org.jetbrains.annotations.NotNull()
    private final matrix.event.room_message.RoomEventType type = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.UserId sender = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String state_key = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String txn_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Object> content = null;
    private static final com.squareup.moshi.JsonAdapter<koma.matrix.sync.RawMessage> adapter = null;
    public static final koma.matrix.sync.RawMessage.Companion Companion = null;
    
    /**
     * * convert to string to storage
     *     * omit age, which is temporary
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toJson() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getAge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEvent_id() {
        return null;
    }
    
    public final long getOrigin_server_ts() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> getPrev_content() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final matrix.event.room_message.RoomEventType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.UserId getSender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getState_key() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTxn_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> getContent() {
        return null;
    }
    
    public RawMessage(@org.jetbrains.annotations.Nullable()
    java.lang.Long age, @org.jetbrains.annotations.NotNull()
    java.lang.String event_id, long origin_server_ts, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> prev_content, @org.jetbrains.annotations.NotNull()
    matrix.event.room_message.RoomEventType type, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId sender, @org.jetbrains.annotations.Nullable()
    java.lang.String state_key, @org.jetbrains.annotations.Nullable()
    java.lang.String txn_id, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> content) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final matrix.event.room_message.RoomEventType component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.UserId component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> component9() {
        return null;
    }
    
    /**
     * * message received as a dict from the server
     */
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.RawMessage copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long age, @org.jetbrains.annotations.NotNull()
    java.lang.String event_id, long origin_server_ts, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> prev_content, @org.jetbrains.annotations.NotNull()
    matrix.event.room_message.RoomEventType type, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId sender, @org.jetbrains.annotations.Nullable()
    java.lang.String state_key, @org.jetbrains.annotations.Nullable()
    java.lang.String txn_id, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> content) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lkoma/matrix/sync/RawMessage$Companion;", "", "()V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lkoma/matrix/sync/RawMessage;", "kotlin.jvm.PlatformType", "koma-library"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}