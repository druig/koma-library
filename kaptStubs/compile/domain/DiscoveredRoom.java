package domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\t\u0010#\u001a\u00020\rH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\u0014\u0010&\u001a\u00020\b2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003Jg\u0010(\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bH\u00c6\u0001J\u0006\u0010)\u001a\u00020\u0006J\u0013\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u000bH\u00d6\u0001J\t\u0010-\u001a\u00020\u0006H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016\u00a8\u0006."}, d2 = {"Ldomain/DiscoveredRoom;", "", "aliases", "", "Lkoma/matrix/room/naming/RoomAlias;", "avatar_url", "", "guest_can_join", "", "name", "num_joined_members", "", "room_id", "Lkoma/matrix/room/naming/RoomId;", "topic", "world_readable", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ILkoma/matrix/room/naming/RoomId;Ljava/lang/String;Z)V", "getAliases", "()Ljava/util/List;", "getAvatar_url", "()Ljava/lang/String;", "getGuest_can_join", "()Z", "getName", "getNum_joined_members", "()I", "getRoom_id", "()Lkoma/matrix/room/naming/RoomId;", "getTopic", "getWorld_readable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "containsTerms", "terms", "copy", "dispName", "equals", "other", "hashCode", "toString", "koma-library"})
public final class DiscoveredRoom {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<koma.matrix.room.naming.RoomAlias> aliases = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String avatar_url = null;
    private final boolean guest_can_join = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    private final int num_joined_members = 0;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.room.naming.RoomId room_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String topic = null;
    private final boolean world_readable = false;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dispName() {
        return null;
    }
    
    public final boolean containsTerms(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> terms) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<koma.matrix.room.naming.RoomAlias> getAliases() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvatar_url() {
        return null;
    }
    
    public final boolean getGuest_can_join() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getNum_joined_members() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.room.naming.RoomId getRoom_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTopic() {
        return null;
    }
    
    public final boolean getWorld_readable() {
        return false;
    }
    
    public DiscoveredRoom(@org.jetbrains.annotations.Nullable()
    java.util.List<koma.matrix.room.naming.RoomAlias> aliases, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar_url, boolean guest_can_join, @org.jetbrains.annotations.Nullable()
    java.lang.String name, int num_joined_members, @org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId room_id, @org.jetbrains.annotations.Nullable()
    java.lang.String topic, boolean world_readable) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<koma.matrix.room.naming.RoomAlias> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.room.naming.RoomId component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final domain.DiscoveredRoom copy(@org.jetbrains.annotations.Nullable()
    java.util.List<koma.matrix.room.naming.RoomAlias> aliases, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar_url, boolean guest_can_join, @org.jetbrains.annotations.Nullable()
    java.lang.String name, int num_joined_members, @org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId room_id, @org.jetbrains.annotations.Nullable()
    java.lang.String topic, boolean world_readable) {
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