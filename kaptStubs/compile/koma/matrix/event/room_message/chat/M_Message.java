package koma.matrix.event.room_message.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\b\t\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lkoma/matrix/event/room_message/chat/M_Message;", "", "body", "", "(Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "toString", "Lkoma/matrix/event/room_message/chat/TextMessage;", "Lkoma/matrix/event/room_message/chat/EmoteMessage;", "Lkoma/matrix/event/room_message/chat/NoticeMessage;", "Lkoma/matrix/event/room_message/chat/VideoMessage;", "Lkoma/matrix/event/room_message/chat/AudioMessage;", "Lkoma/matrix/event/room_message/chat/ImageMessage;", "Lkoma/matrix/event/room_message/chat/LocationMessage;", "Lkoma/matrix/event/room_message/chat/FileMessage;", "Lkoma/matrix/event/room_message/chat/UnrecognizedMessage;", "koma-library"})
public abstract class M_Message {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String body = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBody() {
        return null;
    }
    
    private M_Message(java.lang.String body) {
        super();
    }
}