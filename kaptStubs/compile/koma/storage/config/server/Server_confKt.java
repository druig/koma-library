package koma.storage.config.server;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0003\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\u00032\u0006\u0010\t\u001a\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"conf_file_name", "", "getAddress", "Lkoma/storage/config/server/ServerConf;", "getApiUrlBuilder", "Lokhttp3/HttpUrl$Builder;", "getMediaPath", "save", "", "dir", "Ljava/io/File;", "koma-library"})
public final class Server_confKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String conf_file_name = "server_conf.json";
    
    /**
     * * get preferred web address
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getAddress(@org.jetbrains.annotations.NotNull()
    koma.storage.config.server.ServerConf $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final okhttp3.HttpUrl.Builder getApiUrlBuilder(@org.jetbrains.annotations.NotNull()
    koma.storage.config.server.ServerConf $receiver) {
        return null;
    }
    
    /**
     * * in practice null can happen
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getMediaPath(@org.jetbrains.annotations.NotNull()
    koma.storage.config.server.ServerConf $receiver) {
        return null;
    }
    
    public static final void save(@org.jetbrains.annotations.NotNull()
    koma.storage.config.server.ServerConf $receiver, @org.jetbrains.annotations.NotNull()
    java.io.File dir) {
    }
}