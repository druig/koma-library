package koma.matrix.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b0\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\nH\u00c6\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lkoma/matrix/sync/SyncResponse;", "", "next_batch", "", "presence", "Lkoma/matrix/sync/Events;", "Lkoma/matrix/user/presence/PresenceMessage;", "account_data", "", "rooms", "Lkoma/matrix/sync/RoomsResponse;", "(Ljava/lang/String;Lkoma/matrix/sync/Events;Lkoma/matrix/sync/Events;Lkoma/matrix/sync/RoomsResponse;)V", "getAccount_data", "()Lkoma/matrix/sync/Events;", "getNext_batch", "()Ljava/lang/String;", "getPresence", "getRooms", "()Lkoma/matrix/sync/RoomsResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "koma-library"})
public final class SyncResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String next_batch = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.sync.Events<koma.matrix.user.presence.PresenceMessage> presence = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.sync.Events<java.util.Map<java.lang.String, java.lang.Object>> account_data = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.sync.RoomsResponse rooms = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNext_batch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.Events<koma.matrix.user.presence.PresenceMessage> getPresence() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.Events<java.util.Map<java.lang.String, java.lang.Object>> getAccount_data() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.RoomsResponse getRooms() {
        return null;
    }
    
    public SyncResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String next_batch, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.Events<koma.matrix.user.presence.PresenceMessage> presence, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.Events<java.util.Map<java.lang.String, java.lang.Object>> account_data, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.RoomsResponse rooms) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.Events<koma.matrix.user.presence.PresenceMessage> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.Events<java.util.Map<java.lang.String, java.lang.Object>> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.RoomsResponse component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.sync.SyncResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String next_batch, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.Events<koma.matrix.user.presence.PresenceMessage> presence, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.Events<java.util.Map<java.lang.String, java.lang.Object>> account_data, @org.jetbrains.annotations.NotNull()
    koma.matrix.sync.RoomsResponse rooms) {
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