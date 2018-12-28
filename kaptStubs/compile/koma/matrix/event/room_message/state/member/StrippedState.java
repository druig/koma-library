package koma.matrix.event.room_message.state.member;

import java.lang.System;

/**
 * * m.room.member may also include an invite_room_state key outside
 * * the content key. If present, this contains an array of StrippedState Events
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lkoma/matrix/event/room_message/state/member/StrippedState;", "", "state_key", "", "type", "content", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getContent", "()Ljava/util/Map;", "getState_key", "()Ljava/lang/String;", "getType", "koma-library"})
public final class StrippedState {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String state_key = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Object> content = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> getContent() {
        return null;
    }
    
    public StrippedState(@org.jetbrains.annotations.NotNull()
    java.lang.String state_key, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> content) {
        super();
    }
}