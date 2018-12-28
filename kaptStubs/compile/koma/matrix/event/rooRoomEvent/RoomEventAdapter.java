package koma.matrix.event.rooRoomEvent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R(\u0010\u0006\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lkoma/matrix/event/rooRoomEvent/RoomEventAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lkoma/matrix/event/room_message/RoomEvent;", "m", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "createSubAdapter", "Lkotlin/Function1;", "Ljava/lang/Class;", "fallbackAdapter", "Lkoma/matrix/event/room_message/MRoomUnrecognized;", "kotlin.jvm.PlatformType", "keyFinder", "Lkoma/matrix/event/room_message/JsonKeyFinder;", "keyToAdapters", "", "Lmatrix/event/room_message/RoomEventType;", "labels", "", "", "fromJson", "r", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "msg", "koma-library"})
final class RoomEventAdapter extends com.squareup.moshi.JsonAdapter<koma.matrix.event.room_message.RoomEvent> {
    private final kotlin.jvm.functions.Function1<java.lang.Class<? extends koma.matrix.event.room_message.RoomEvent>, com.squareup.moshi.JsonAdapter<koma.matrix.event.room_message.RoomEvent>> createSubAdapter = null;
    private final java.util.Map<matrix.event.room_message.RoomEventType, com.squareup.moshi.JsonAdapter<koma.matrix.event.room_message.RoomEvent>> keyToAdapters = null;
    private final java.util.List<java.lang.String> labels = null;
    private final koma.matrix.event.room_message.JsonKeyFinder keyFinder = null;
    private final com.squareup.moshi.JsonAdapter<koma.matrix.event.room_message.MRoomUnrecognized> fallbackAdapter = null;
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.RoomEvent msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public koma.matrix.event.room_message.RoomEvent fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader r) {
        return null;
    }
    
    public RoomEventAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi m) {
        super();
    }
}