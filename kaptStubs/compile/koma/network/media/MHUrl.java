package koma.network.media;

import java.lang.System;

/**
 * * matrix or http media url
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u00060\u000bj\u0002`\f0\tJ\b\u0010\r\u001a\u00020\u000eH\u0016\u0082\u0001\u0002\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lkoma/network/media/MHUrl;", "", "()V", "equals", "", "other", "hashCode", "", "toHttpUrl", "Lcom/github/kittinunf/result/Result;", "Lokhttp3/HttpUrl;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "toString", "", "Companion", "Http", "Mxc", "Lkoma/network/media/MHUrl$Mxc;", "Lkoma/network/media/MHUrl$Http;", "koma-library"})
public abstract class MHUrl {
    public static final koma.network.media.MHUrl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.kittinunf.result.Result<okhttp3.HttpUrl, java.lang.Exception> toHttpUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    private MHUrl() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lkoma/network/media/MHUrl$Mxc;", "Lkoma/network/media/MHUrl;", "mxc", "", "(Ljava/lang/String;)V", "getMxc", "()Ljava/lang/String;", "koma-library"})
    public static final class Mxc extends koma.network.media.MHUrl {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String mxc = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMxc() {
            return null;
        }
        
        public Mxc(@org.jetbrains.annotations.NotNull()
        java.lang.String mxc) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lkoma/network/media/MHUrl$Http;", "Lkoma/network/media/MHUrl;", "http", "Lokhttp3/HttpUrl;", "maxStale", "", "(Lokhttp3/HttpUrl;Ljava/lang/Integer;)V", "getHttp", "()Lokhttp3/HttpUrl;", "getMaxStale", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "koma-library"})
    public static final class Http extends koma.network.media.MHUrl {
        @org.jetbrains.annotations.NotNull()
        private final okhttp3.HttpUrl http = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer maxStale = null;
        
        @org.jetbrains.annotations.NotNull()
        public final okhttp3.HttpUrl getHttp() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getMaxStale() {
            return null;
        }
        
        public Http(@org.jetbrains.annotations.NotNull()
        okhttp3.HttpUrl http, @org.jetbrains.annotations.Nullable()
        java.lang.Integer maxStale) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00042\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lkoma/network/media/MHUrl$Companion;", "", "()V", "fromStr", "Lcom/github/kittinunf/result/Result;", "Lkoma/network/media/MHUrl;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "url", "", "koma-library"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.kittinunf.result.Result<koma.network.media.MHUrl, java.lang.Exception> fromStr(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}