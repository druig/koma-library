package koma.network.client.okhttp;

import java.lang.System;

/**
 * * try to always reuse this client instead of creating a new one
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u000eH\u0002R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lkoma/network/client/okhttp/AppHttpClient;", "", "paths", "Lkoma/storage/config/ConfigPaths;", "koma", "Lkoma/Koma;", "proxy", "Ljava/net/Proxy;", "(Lkoma/storage/config/ConfigPaths;Lkoma/Koma;Ljava/net/Proxy;)V", "builder", "Lokhttp3/OkHttpClient$Builder;", "getBuilder", "()Lokhttp3/OkHttpClient$Builder;", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "builderForServer", "serverConf", "Lkoma/storage/config/server/ServerConf;", "setUpClient", "koma-library"})
public final class AppHttpClient {
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.OkHttpClient client = null;
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.OkHttpClient.Builder builder = null;
    private final koma.storage.config.ConfigPaths paths = null;
    private final koma.Koma koma = null;
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient.Builder getBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient.Builder builderForServer(@org.jetbrains.annotations.NotNull()
    koma.storage.config.server.ServerConf serverConf) {
        return null;
    }
    
    private final okhttp3.OkHttpClient setUpClient() {
        return null;
    }
    
    public AppHttpClient(@org.jetbrains.annotations.NotNull()
    koma.storage.config.ConfigPaths paths, @org.jetbrains.annotations.NotNull()
    koma.Koma koma, @org.jetbrains.annotations.Nullable()
    java.net.Proxy proxy) {
        super();
    }
}