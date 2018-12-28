package koma.matrix.event.room_message;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lkoma/matrix/event/room_message/RoomEvent;", "", "event_id", "Lkoma/matrix/event/EventId;", "origin_server_ts", "", "type", "Lmatrix/event/room_message/RoomEventType;", "(Lkoma/matrix/event/EventId;JLmatrix/event/room_message/RoomEventType;)V", "getEvent_id", "()Lkoma/matrix/event/EventId;", "getOrigin_server_ts", "()J", "getType", "()Lmatrix/event/room_message/RoomEventType;", "compareTo", "", "other", "equals", "", "", "hashCode", "toJson", "", "indent", "Companion", "koma-library"})
public abstract class RoomEvent implements java.lang.Comparable<koma.matrix.event.room_message.RoomEvent> {
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.event.EventId event_id = null;
    private final long origin_server_ts = 0L;
    @org.jetbrains.annotations.Nullable()
    private final matrix.event.room_message.RoomEventType type = null;
    private static final com.squareup.moshi.JsonAdapter<koma.matrix.event.room_message.RoomEvent> adapter = null;
    private static final com.squareup.moshi.JsonAdapter<koma.matrix.event.room_message.RoomEvent> adapterIndented = null;
    public static final koma.matrix.event.room_message.RoomEvent.Companion Companion = null;
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    koma.matrix.event.room_message.RoomEvent other) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toJson(boolean indent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.event.EventId getEvent_id() {
        return null;
    }
    
    public final long getOrigin_server_ts() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public matrix.event.room_message.RoomEventType getType() {
        return null;
    }
    
    public RoomEvent(@org.jetbrains.annotations.NotNull()
    koma.matrix.event.EventId event_id, long origin_server_ts, @org.jetbrains.annotations.Nullable()
    matrix.event.room_message.RoomEventType type) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\u0007\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lkoma/matrix/event/room_message/RoomEvent$Companion;", "", "()V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lkoma/matrix/event/room_message/RoomEvent;", "kotlin.jvm.PlatformType", "adapterIndented", "koma-library"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}