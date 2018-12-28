package koma.storage.config.server;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0007J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\n\u001a\u00020\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lkoma/storage/config/server/ServerConfStore;", "", "paths", "Lkoma/storage/config/ConfigPaths;", "(Lkoma/storage/config/ConfigPaths;)V", "configurations", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkoma/storage/config/server/ServerConf;", "computeServerConf", "servername", "loadServerCert", "Lkotlin/Pair;", "Ljavax/net/ssl/SSLContext;", "Lkoma/storage/config/server/cert_trust/CompositeX509TrustManager;", "serverConf", "saveServerAddress", "", "addr", "serverConfFromAddr", "serverConfWithAddr", "serverSettingsPath", "Ljava/io/File;", "koma-library"})
public final class ServerConfStore {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, koma.storage.config.server.ServerConf> configurations = null;
    private final koma.storage.config.ConfigPaths paths = null;
    
    /**
     * * path used to store server settings
     */
    @org.jetbrains.annotations.Nullable()
    public final java.io.File serverSettingsPath(@org.jetbrains.annotations.NotNull()
    java.lang.String servername) {
        return null;
    }
    
    public final void saveServerAddress(@org.jetbrains.annotations.NotNull()
    koma.storage.config.server.ServerConf serverConf, @org.jetbrains.annotations.NotNull()
    java.lang.String addr) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<javax.net.ssl.SSLContext, koma.storage.config.server.cert_trust.CompositeX509TrustManager> loadServerCert(@org.jetbrains.annotations.NotNull()
    koma.storage.config.server.ServerConf serverConf) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.storage.config.server.ServerConf serverConf(@org.jetbrains.annotations.NotNull()
    java.lang.String servername) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.storage.config.server.ServerConf serverConfWithAddr(@org.jetbrains.annotations.NotNull()
    java.lang.String servername, @org.jetbrains.annotations.NotNull()
    java.lang.String addr) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final koma.storage.config.server.ServerConf serverConfFromAddr(@org.jetbrains.annotations.NotNull()
    java.lang.String addr) {
        return null;
    }
    
    private final koma.storage.config.server.ServerConf computeServerConf(java.lang.String servername) {
        return null;
    }
    
    public ServerConfStore(@org.jetbrains.annotations.NotNull()
    koma.storage.config.ConfigPaths paths) {
        super();
    }
}