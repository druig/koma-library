package koma.matrix.event.room_message.state.member;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lkoma/matrix/event/room_message/state/member/RoomMemberContent;", "", "membership", "Lkoma/matrix/room/participation/Membership;", "avatar_url", "", "displayname", "is_direct", "", "third_party_invite", "Lkoma/matrix/event/room_message/state/member/Invite;", "(Lkoma/matrix/room/participation/Membership;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkoma/matrix/event/room_message/state/member/Invite;)V", "getAvatar_url", "()Ljava/lang/String;", "getDisplayname", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMembership", "()Lkoma/matrix/room/participation/Membership;", "getThird_party_invite", "()Lkoma/matrix/event/room_message/state/member/Invite;", "koma-library"})
public final class RoomMemberContent {
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.room.participation.Membership membership = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String avatar_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String displayname = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean is_direct = null;
    @org.jetbrains.annotations.Nullable()
    private final koma.matrix.event.room_message.state.member.Invite third_party_invite = null;
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.room.participation.Membership getMembership() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvatar_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDisplayname() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_direct() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final koma.matrix.event.room_message.state.member.Invite getThird_party_invite() {
        return null;
    }
    
    public RoomMemberContent(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.participation.Membership membership, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar_url, @org.jetbrains.annotations.Nullable()
    java.lang.String displayname, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_direct, @org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.state.member.Invite third_party_invite) {
        super();
    }
}