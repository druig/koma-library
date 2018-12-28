package koma.matrix.event.context;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b0\u0006\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u001b\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b0\u0006H\u00c6\u0003Jc\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b0\u0006H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006#"}, d2 = {"Lkoma/matrix/event/context/ContextResponse;", "", "start", "", "end", "events_before", "", "Lkoma/matrix/event/room_message/RoomEvent;", "event", "events_after", "state", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkoma/matrix/event/room_message/RoomEvent;Ljava/util/List;Ljava/util/List;)V", "getEnd", "()Ljava/lang/String;", "getEvent", "()Lkoma/matrix/event/room_message/RoomEvent;", "getEvents_after", "()Ljava/util/List;", "getEvents_before", "getStart", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "koma-library"})
public final class ContextResponse {
    
    /**
     * *A token that can be used to paginate backwards with.
     *         * Actually, I'm afraid it can be null
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String start = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String end = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<koma.matrix.event.room_message.RoomEvent> events_before = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.event.room_message.RoomEvent event = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<koma.matrix.event.room_message.RoomEvent> events_after = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> state = null;
    
    /**
     * *A token that can be used to paginate backwards with.
     *         * Actually, I'm afraid it can be null
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<koma.matrix.event.room_message.RoomEvent> getEvents_before() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.event.room_message.RoomEvent getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<koma.matrix.event.room_message.RoomEvent> getEvents_after() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getState() {
        return null;
    }
    
    public ContextResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String start, @org.jetbrains.annotations.NotNull()
    java.lang.String end, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends koma.matrix.event.room_message.RoomEvent> events_before, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.room_message.RoomEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends koma.matrix.event.room_message.RoomEvent> events_after, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> state) {
        super();
    }
    
    /**
     * *A token that can be used to paginate backwards with.
     *         * Actually, I'm afraid it can be null
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<koma.matrix.event.room_message.RoomEvent> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.event.room_message.RoomEvent component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<koma.matrix.event.room_message.RoomEvent> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.event.context.ContextResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String start, @org.jetbrains.annotations.NotNull()
    java.lang.String end, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends koma.matrix.event.room_message.RoomEvent> events_before, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.room_message.RoomEvent event, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends koma.matrix.event.room_message.RoomEvent> events_after, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> state) {
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