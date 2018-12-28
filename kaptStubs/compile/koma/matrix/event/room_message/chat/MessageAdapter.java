package koma.matrix.event.room_message.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000Re\u0010\u000e\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f \u0010*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t0\t \u0010**\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f \u0010*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t0\t\u0018\u00010\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Lkoma/matrix/event/room_message/chat/MessageAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lkoma/matrix/event/room_message/chat/M_Message;", "m", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "keyFinder", "Lkoma/matrix/event/room_message/JsonKeyFinder;", "keyToAdapters", "", "", "makeMA", "Lkotlin/Function1;", "Ljava/lang/Class;", "mapAdapter", "", "kotlin.jvm.PlatformType", "getMapAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "fromJson", "r", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "msg", "koma-library"})
final class MessageAdapter extends com.squareup.moshi.JsonAdapter<koma.matrix.event.room_message.chat.M_Message> {
    private final kotlin.jvm.functions.Function1<java.lang.Class<? extends koma.matrix.event.room_message.chat.M_Message>, com.squareup.moshi.JsonAdapter<koma.matrix.event.room_message.chat.M_Message>> makeMA = null;
    private final java.util.Map<java.lang.String, com.squareup.moshi.JsonAdapter<koma.matrix.event.room_message.chat.M_Message>> keyToAdapters = null;
    private final koma.matrix.event.room_message.JsonKeyFinder keyFinder = null;
    private final com.squareup.moshi.JsonAdapter<java.util.Map<java.lang.String, java.lang.Object>> mapAdapter = null;
    
    public final com.squareup.moshi.JsonAdapter<java.util.Map<java.lang.String, java.lang.Object>> getMapAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.chat.M_Message msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public koma.matrix.event.room_message.chat.M_Message fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader r) {
        return null;
    }
    
    public MessageAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi m) {
        super();
    }
}