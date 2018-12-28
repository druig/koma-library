package koma.matrix.event.room_message.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006\""}, d2 = {"Lkoma/matrix/event/room_message/state/MRoomMember;", "Lkoma/matrix/event/room_message/state/RoomStateEvent;", "event_id", "Lkoma/matrix/event/EventId;", "origin_server_ts", "", "prev_content", "Lkoma/matrix/event/room_message/state/member/PrevContent;", "sender", "Lkoma/matrix/UserId;", "unsigned", "Lkoma/matrix/event/room_message/state/member/RoomMemberUnsigned;", "replaces_state", "", "state_key", "invite_room_state", "", "Lkoma/matrix/event/room_message/state/member/StrippedState;", "content", "Lkoma/matrix/event/room_message/state/member/RoomMemberContent;", "(Lkoma/matrix/event/EventId;JLkoma/matrix/event/room_message/state/member/PrevContent;Lkoma/matrix/UserId;Lkoma/matrix/event/room_message/state/member/RoomMemberUnsigned;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkoma/matrix/event/room_message/state/member/RoomMemberContent;)V", "getContent", "()Lkoma/matrix/event/room_message/state/member/RoomMemberContent;", "getInvite_room_state", "()Ljava/util/List;", "getPrev_content", "()Lkoma/matrix/event/room_message/state/member/PrevContent;", "getReplaces_state", "()Ljava/lang/String;", "getSender", "()Lkoma/matrix/UserId;", "getState_key", "getUnsigned", "()Lkoma/matrix/event/room_message/state/member/RoomMemberUnsigned;", "koma-library"})
public final class MRoomMember extends koma.matrix.event.room_message.state.RoomStateEvent {
    @org.jetbrains.annotations.Nullable()
    private final koma.matrix.event.room_message.state.member.PrevContent prev_content = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.UserId sender = null;
    @org.jetbrains.annotations.Nullable()
    private final koma.matrix.event.room_message.state.member.RoomMemberUnsigned unsigned = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String replaces_state = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String state_key = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<koma.matrix.event.room_message.state.member.StrippedState> invite_room_state = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.event.room_message.state.member.RoomMemberContent content = null;
    
    @org.jetbrains.annotations.Nullable()
    public final koma.matrix.event.room_message.state.member.PrevContent getPrev_content() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.UserId getSender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final koma.matrix.event.room_message.state.member.RoomMemberUnsigned getUnsigned() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReplaces_state() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getState_key() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<koma.matrix.event.room_message.state.member.StrippedState> getInvite_room_state() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.event.room_message.state.member.RoomMemberContent getContent() {
        return null;
    }
    
    public MRoomMember(@org.jetbrains.annotations.NotNull()
    koma.matrix.event.EventId event_id, long origin_server_ts, @org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.state.member.PrevContent prev_content, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId sender, @org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.state.member.RoomMemberUnsigned unsigned, @org.jetbrains.annotations.Nullable()
    java.lang.String replaces_state, @org.jetbrains.annotations.Nullable()
    java.lang.String state_key, @org.jetbrains.annotations.Nullable()
    java.util.List<koma.matrix.event.room_message.state.member.StrippedState> invite_room_state, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.room_message.state.member.RoomMemberContent content) {
    }
}