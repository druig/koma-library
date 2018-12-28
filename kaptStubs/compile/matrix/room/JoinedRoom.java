package matrix.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u00c6\u0003JU\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lmatrix/room/JoinedRoom;", "", "unread_notifications", "Lmatrix/room/UnreadNotifications;", "account_data", "Lkoma/matrix/sync/Events;", "Lkoma/matrix/event/GeneralEvent;", "ephemeral", "Lkoma/matrix/epemeral/EphemeralRawEvent;", "state", "Lkoma/matrix/event/room_message/RoomEvent;", "timeline", "Lmatrix/room/Timeline;", "(Lmatrix/room/UnreadNotifications;Lkoma/matrix/sync/Events;Lkoma/matrix/sync/Events;Lkoma/matrix/sync/Events;Lmatrix/room/Timeline;)V", "getAccount_data", "()Lkoma/matrix/sync/Events;", "getEphemeral", "getState", "getTimeline", "()Lmatrix/room/Timeline;", "getUnread_notifications", "()Lmatrix/room/UnreadNotifications;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "koma-library"})
public final class JoinedRoom {
    @org.jetbrains.annotations.Nullable()
    private final matrix.room.UnreadNotifications unread_notifications = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.sync.Events<koma.matrix.event.GeneralEvent> account_data = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.sync.Events<koma.matrix.epemeral.EphemeralRawEvent> ephemeral = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.sync.Events<koma.matrix.event.room_message.RoomEvent> state = null;
    @org.jetbrains.annotations.NotNull()
    private final matrix.room.Timeline<koma.matrix.event.room_message.RoomEvent> timeline = null;
    
    @org.jetbrains.annotations.Nullable()
    public final matrix.room.UnreadNotifications getUnread_notifications() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.Events<koma.matrix.event.GeneralEvent> getAccount_data() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.Events<koma.matrix.epemeral.EphemeralRawEvent> getEphemeral() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.Events<koma.matrix.event.room_message.RoomEvent> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final matrix.room.Timeline<koma.matrix.event.room_message.RoomEvent> getTimeline() {
        return null;
    }
    
    public JoinedRoom(@org.jetbrains.annotations.Nullable()
    matrix.room.UnreadNotifications unread_notifications, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.Events<koma.matrix.event.GeneralEvent> account_data, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.Events<koma.matrix.epemeral.EphemeralRawEvent> ephemeral, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.Events<koma.matrix.event.room_message.RoomEvent> state, @org.jetbrains.annotations.NotNull()
    matrix.room.Timeline<koma.matrix.event.room_message.RoomEvent> timeline) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final matrix.room.UnreadNotifications component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.Events<koma.matrix.event.GeneralEvent> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.Events<koma.matrix.epemeral.EphemeralRawEvent> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.Events<koma.matrix.event.room_message.RoomEvent> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final matrix.room.Timeline<koma.matrix.event.room_message.RoomEvent> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final matrix.room.JoinedRoom copy(@org.jetbrains.annotations.Nullable()
    matrix.room.UnreadNotifications unread_notifications, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.Events<koma.matrix.event.GeneralEvent> account_data, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.Events<koma.matrix.epemeral.EphemeralRawEvent> ephemeral, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.Events<koma.matrix.event.room_message.RoomEvent> state, @org.jetbrains.annotations.NotNull()
    matrix.room.Timeline<koma.matrix.event.room_message.RoomEvent> timeline) {
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