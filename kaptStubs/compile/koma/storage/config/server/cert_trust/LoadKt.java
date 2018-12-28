package koma.storage.config.server.cert_trust;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\n"}, d2 = {"certFileName", "", "getCertFileName", "()Ljava/lang/String;", "loadContext", "Lkotlin/Pair;", "Ljavax/net/ssl/SSLContext;", "Lkoma/storage/config/server/cert_trust/CompositeX509TrustManager;", "dir", "Ljava/io/File;", "koma-library"})
public final class LoadKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String certFileName = "self-cert.crt";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCertFileName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final kotlin.Pair<javax.net.ssl.SSLContext, koma.storage.config.server.cert_trust.CompositeX509TrustManager> loadContext(@org.jetbrains.annotations.NotNull()
    java.io.File dir) {
        return null;
    }
}