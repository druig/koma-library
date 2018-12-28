package koma.util.coroutine.adapter.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0006\u0010\u000f\u001a\u00020\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lkoma/util/coroutine/adapter/retrofit/HttpException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "message", "", "body", "(ILjava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getCode", "()I", "getMessage", "toString", "toStringShowBody", "Companion", "koma-library"})
public class HttpException extends java.lang.Exception {
    private final int code = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String body = null;
    public static final koma.util.coroutine.adapter.retrofit.HttpException.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toStringShowBody() {
        return null;
    }
    
    public final int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBody() {
        return null;
    }
    
    public HttpException(int code, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String body) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkoma/util/coroutine/adapter/retrofit/HttpException$Companion;", "", "()V", "fromOkhttp", "Lkoma/util/coroutine/adapter/retrofit/HttpException;", "response", "Lokhttp3/Response;", "koma-library"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final koma.util.coroutine.adapter.retrofit.HttpException fromOkhttp(@org.jetbrains.annotations.NotNull()
        okhttp3.Response response) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}