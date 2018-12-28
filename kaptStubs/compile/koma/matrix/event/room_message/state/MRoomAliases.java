package koma.matrix.event.room_message.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lkoma/matrix/event/room_message/state/MRoomAliases;", "Lkoma/matrix/event/room_message/state/RoomStateEvent;", "origin_server_ts", "", "event_id", "Lkoma/matrix/event/EventId;", "prev_content", "", "", "", "sender", "Lkoma/matrix/UserId;", "state_key", "content", "Lkoma/matrix/event/room_message/state/RoomAliasesContent;", "(JLkoma/matrix/event/EventId;Ljava/util/Map;Lkoma/matrix/UserId;Ljava/lang/String;Lkoma/matrix/event/room_message/state/RoomAliasesContent;)V", "getContent", "()Lkoma/matrix/event/room_message/state/RoomAliasesContent;", "getPrev_content", "()Ljava/util/Map;", "getSender", "()Lkoma/matrix/UserId;", "getState_key", "()Ljava/lang/String;", "koma-library"})
public final class MRoomAliases extends koma.matrix.event.room_message.state.RoomStateEvent {
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.Object> prev_content = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.UserId sender = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String state_key = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.event.room_message.state.RoomAliasesContent content = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> getPrev_content() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.UserId getSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.event.room_message.state.RoomAliasesContent getContent() {
        return null;
    }
    
    public MRoomAliases(long origin_server_ts, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.EventId event_id, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> prev_content, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId sender, @org.jetbrains.annotations.NotNull()
    java.lang.String state_key, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.room_message.state.RoomAliasesContent content) {
    }
}