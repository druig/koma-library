package koma.matrix.event.room_message;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lkoma/matrix/event/room_message/MRoomRedaction;", "Lkoma/matrix/event/room_message/RoomEvent;", "event_id", "Lkoma/matrix/event/EventId;", "origin_server_ts", "", "prev_content", "", "", "", "sender", "Lkoma/matrix/UserId;", "state_key", "redacts", "content", "Lkoma/matrix/event/room_message/state/RoomRedactContent;", "(Lkoma/matrix/event/EventId;JLjava/util/Map;Lkoma/matrix/UserId;Ljava/lang/String;Ljava/lang/String;Lkoma/matrix/event/room_message/state/RoomRedactContent;)V", "getContent", "()Lkoma/matrix/event/room_message/state/RoomRedactContent;", "getPrev_content", "()Ljava/util/Map;", "getRedacts", "()Ljava/lang/String;", "getSender", "()Lkoma/matrix/UserId;", "getState_key", "koma-library"})
public final class MRoomRedaction extends koma.matrix.event.room_message.RoomEvent {
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.Object> prev_content = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.UserId sender = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String state_key = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String redacts = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.event.room_message.state.RoomRedactContent content = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> getPrev_content() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRedacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.event.room_message.state.RoomRedactContent getContent() {
        return null;
    }
    
    public MRoomRedaction(@org.jetbrains.annotations.NotNull()
    koma.matrix.event.EventId event_id, long origin_server_ts, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> prev_content, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId sender, @org.jetbrains.annotations.Nullable()
    java.lang.String state_key, @org.jetbrains.annotations.NotNull()
    java.lang.String redacts, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.room_message.state.RoomRedactContent content) {
        super(null, 0L, null);
    }
}