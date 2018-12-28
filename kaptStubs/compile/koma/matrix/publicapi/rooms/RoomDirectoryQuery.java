package koma.matrix.publicapi.rooms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lkoma/matrix/publicapi/rooms/RoomDirectoryQuery;", "", "filter", "Lkoma/matrix/publicapi/rooms/RoomDirectoryFilter;", "since", "", "third_party_instance_id", "limit", "", "(Lkoma/matrix/publicapi/rooms/RoomDirectoryFilter;Ljava/lang/String;Ljava/lang/String;I)V", "getFilter", "()Lkoma/matrix/publicapi/rooms/RoomDirectoryFilter;", "getLimit", "()I", "getSince", "()Ljava/lang/String;", "getThird_party_instance_id", "koma-library"})
public final class RoomDirectoryQuery {
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.publicapi.rooms.RoomDirectoryFilter filter = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String since = null;
    
    /**
     * * for example
     *         * irc-freenode|freenode
     *         * gitter|gitter
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String third_party_instance_id = null;
    
    /**
     * * the default of synapse seems to be 100
     */
    private final int limit = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.publicapi.rooms.RoomDirectoryFilter getFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSince() {
        return null;
    }
    
    /**
     * * for example
     *         * irc-freenode|freenode
     *         * gitter|gitter
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThird_party_instance_id() {
        return null;
    }
    
    /**
     * * the default of synapse seems to be 100
     */
    public final int getLimit() {
        return 0;
    }
    
    public RoomDirectoryQuery(@org.jetbrains.annotations.NotNull()
    koma.matrix.publicapi.rooms.RoomDirectoryFilter filter, @org.jetbrains.annotations.Nullable()
    java.lang.String since, @org.jetbrains.annotations.Nullable()
    java.lang.String third_party_instance_id, int limit) {
        super();
    }
}