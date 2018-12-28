package koma.matrix.event.room_message.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lkoma/matrix/event/room_message/chat/VideoInfo;", "", "h", "", "w", "duration", "mimetype", "", "size", "thumbnail_url", "thumbnail_info", "Lkoma/matrix/event/room_message/chat/ThumbnailInfo;", "(IILjava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Lkoma/matrix/event/room_message/chat/ThumbnailInfo;)V", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getH", "()I", "getMimetype", "()Ljava/lang/String;", "getSize", "getThumbnail_info", "()Lkoma/matrix/event/room_message/chat/ThumbnailInfo;", "getThumbnail_url", "getW", "koma-library"})
public final class VideoInfo {
    private final int h = 0;
    private final int w = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer duration = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mimetype = null;
    private final int size = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String thumbnail_url = null;
    @org.jetbrains.annotations.Nullable()
    private final koma.matrix.event.room_message.chat.ThumbnailInfo thumbnail_info = null;
    
    public final int getH() {
        return 0;
    }
    
    public final int getW() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMimetype() {
        return null;
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbnail_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final koma.matrix.event.room_message.chat.ThumbnailInfo getThumbnail_info() {
        return null;
    }
    
    public VideoInfo(int h, int w, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration, @org.jetbrains.annotations.NotNull()
    java.lang.String mimetype, int size, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnail_url, @org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.chat.ThumbnailInfo thumbnail_info) {
        super();
    }
}