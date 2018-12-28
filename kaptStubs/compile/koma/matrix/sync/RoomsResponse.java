package koma.matrix.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003H\u00c6\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0003JK\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lkoma/matrix/sync/RoomsResponse;", "", "join", "", "", "Lmatrix/room/JoinedRoom;", "invite", "Lmatrix/room/InvitedRoom;", "leave", "Lkoma/matrix/room/naming/RoomId;", "Lmatrix/room/LeftRoom;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getInvite", "()Ljava/util/Map;", "getJoin", "getLeave", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "koma-library"})
public final class RoomsResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, matrix.room.JoinedRoom> join = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, matrix.room.InvitedRoom> invite = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<koma.matrix.room.naming.RoomId, matrix.room.LeftRoom> leave = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, matrix.room.JoinedRoom> getJoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, matrix.room.InvitedRoom> getInvite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<koma.matrix.room.naming.RoomId, matrix.room.LeftRoom> getLeave() {
        return null;
    }
    
    public RoomsResponse(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, matrix.room.JoinedRoom> join, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, matrix.room.InvitedRoom> invite, @org.jetbrains.annotations.NotNull()
    java.util.Map<koma.matrix.room.naming.RoomId, matrix.room.LeftRoom> leave) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, matrix.room.JoinedRoom> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, matrix.room.InvitedRoom> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<koma.matrix.room.naming.RoomId, matrix.room.LeftRoom> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.RoomsResponse copy(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, matrix.room.JoinedRoom> join, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, matrix.room.InvitedRoom> invite, @org.jetbrains.annotations.NotNull()
    java.util.Map<koma.matrix.room.naming.RoomId, matrix.room.LeftRoom> leave) {
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
}