package koma.matrix.event.room_message;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lkoma/matrix/event/room_message/MRoomMessage;", "Lkoma/matrix/event/room_message/RoomEvent;", "event_id", "Lkoma/matrix/event/EventId;", "origin_server_ts", "", "prev_content", "", "", "", "sender", "Lkoma/matrix/UserId;", "unsigned", "Lkoma/matrix/event/room_message/chat/MessageUnsigned;", "content", "Lkoma/matrix/event/room_message/chat/M_Message;", "(Lkoma/matrix/event/EventId;JLjava/util/Map;Lkoma/matrix/UserId;Lkoma/matrix/event/room_message/chat/MessageUnsigned;Lkoma/matrix/event/room_message/chat/M_Message;)V", "getContent", "()Lkoma/matrix/event/room_message/chat/M_Message;", "getPrev_content", "()Ljava/util/Map;", "getSender", "()Lkoma/matrix/UserId;", "getUnsigned", "()Lkoma/matrix/event/room_message/chat/MessageUnsigned;", "koma-library"})
public final class MRoomMessage extends koma.matrix.event.room_message.RoomEvent {
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.Object> prev_content = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.UserId sender = null;
    @org.jetbrains.annotations.Nullable()
    private final koma.matrix.event.room_message.chat.MessageUnsigned unsigned = null;
    
    /**
     * * sometimes content can be as empty as {}
     */
    @org.jetbrains.annotations.Nullable()
    private final koma.matrix.event.room_message.chat.M_Message content = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> getPrev_content() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.UserId getSender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final koma.matrix.event.room_message.chat.MessageUnsigned getUnsigned() {
        return null;
    }
    
    /**
     * * sometimes content can be as empty as {}
     */
    @org.jetbrains.annotations.Nullable()
    public final koma.matrix.event.room_message.chat.M_Message getContent() {
        return null;
    }
    
    public MRoomMessage(@org.jetbrains.annotations.NotNull()
    koma.matrix.event.EventId event_id, long origin_server_ts, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> prev_content, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId sender, @org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.chat.MessageUnsigned unsigned, @org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.chat.M_Message content) {
        super(null, 0L, null);
    }
}