package koma.matrix.event.room_message.state.member;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lkoma/matrix/event/room_message/state/member/RoomMemberUnsigned;", "", "age", "", "prev_content", "Lkoma/matrix/event/room_message/state/member/PrevContent;", "prev_sender", "Lkoma/matrix/UserId;", "replaces_state", "", "(JLkoma/matrix/event/room_message/state/member/PrevContent;Lkoma/matrix/UserId;Ljava/lang/String;)V", "getAge", "()J", "getPrev_content", "()Lkoma/matrix/event/room_message/state/member/PrevContent;", "getPrev_sender", "()Lkoma/matrix/UserId;", "getReplaces_state", "()Ljava/lang/String;", "koma-library"})
public final class RoomMemberUnsigned {
    private final long age = 0L;
    @org.jetbrains.annotations.Nullable()
    private final koma.matrix.event.room_message.state.member.PrevContent prev_content = null;
    @org.jetbrains.annotations.Nullable()
    private final koma.matrix.UserId prev_sender = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String replaces_state = null;
    
    public final long getAge() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final koma.matrix.event.room_message.state.member.PrevContent getPrev_content() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final koma.matrix.UserId getPrev_sender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReplaces_state() {
        return null;
    }
    
    public RoomMemberUnsigned(long age, @org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.state.member.PrevContent prev_content, @org.jetbrains.annotations.Nullable()
    koma.matrix.UserId prev_sender, @org.jetbrains.annotations.Nullable()
    java.lang.String replaces_state) {
        super();
    }
}