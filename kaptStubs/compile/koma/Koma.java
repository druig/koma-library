package koma;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lkoma/Koma;", "", "data_dir", "", "(Ljava/lang/String;)V", "http", "Lkoma/network/client/okhttp/AppHttpClient;", "getHttp", "()Lkoma/network/client/okhttp/AppHttpClient;", "paths", "Lkoma/storage/config/ConfigPaths;", "getPaths", "()Lkoma/storage/config/ConfigPaths;", "servers", "Lkoma/storage/config/server/ServerConfStore;", "getServers", "()Lkoma/storage/config/server/ServerConfStore;", "saveToDisk", "", "koma-library"})
public final class Koma {
    @org.jetbrains.annotations.NotNull()
    private final koma.storage.config.ConfigPaths paths = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.network.client.okhttp.AppHttpClient http = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.storage.config.server.ServerConfStore servers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final koma.storage.config.ConfigPaths getPaths() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.network.client.okhttp.AppHttpClient getHttp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.storage.config.server.ServerConfStore getServers() {
        return null;
    }
    
    /**
     * * Call after use to save access_token to disk
     */
    public final void saveToDisk() {
    }
    
    public Koma(@org.jetbrains.annotations.NotNull()
    java.lang.String data_dir) {
        super();
    }
}