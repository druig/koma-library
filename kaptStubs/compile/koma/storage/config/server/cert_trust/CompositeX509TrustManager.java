package koma.storage.config.server.cert_trust;

import java.lang.System;

/**
 * * Represents an ordered list of [X509TrustManager]s with additive trust. If any one of the composed managers
 * * trusts a certificate chain, then it is trusted by the composite manager.
 * *
 * * This is necessary because of the fine-print on [SSLContext.init]: Only the first instance of a particular key
 * * and/or trust manager implementation type in the array is used. (For example, only the first
 * * javax.net.ssl.X509KeyManager in the array will be used.)
 * *
 * * @author codyaray
 * * @since 4/22/2013
 * * @see [
 * * http://stackoverflow.com/questions/1793979/registering-multiple-keystores-in-jvm
 * ](http://stackoverflow.com/questions/1793979/registering-multiple-keystores-in-jvm) *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016\u00a2\u0006\u0002\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016\u00a2\u0006\u0002\u0010\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lkoma/storage/config/server/cert_trust/CompositeX509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "keystore", "Ljava/security/KeyStore;", "(Ljava/security/KeyStore;)V", "trustManagers", "", "checkClientTrusted", "", "chain", "", "Ljava/security/cert/X509Certificate;", "authType", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "Companion", "koma-library"})
public final class CompositeX509TrustManager implements javax.net.ssl.X509TrustManager {
    private final java.util.List<javax.net.ssl.X509TrustManager> trustManagers = null;
    public static final koma.storage.config.server.cert_trust.CompositeX509TrustManager.Companion Companion = null;
    
    @java.lang.Override()
    public void checkClientTrusted(@org.jetbrains.annotations.NotNull()
    java.security.cert.X509Certificate[] chain, @org.jetbrains.annotations.NotNull()
    java.lang.String authType) throws java.security.cert.CertificateException {
    }
    
    @java.lang.Override()
    public void checkServerTrusted(@org.jetbrains.annotations.NotNull()
    java.security.cert.X509Certificate[] chain, @org.jetbrains.annotations.NotNull()
    java.lang.String authType) throws java.security.cert.CertificateException {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return null;
    }
    
    public CompositeX509TrustManager(@org.jetbrains.annotations.NotNull()
    java.security.KeyStore keystore) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lkoma/storage/config/server/cert_trust/CompositeX509TrustManager$Companion;", "", "()V", "defaultTrustManager", "Ljavax/net/ssl/X509TrustManager;", "getDefaultTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "getTrustManager", "keystore", "Ljava/security/KeyStore;", "algorithm", "", "koma-library"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final javax.net.ssl.X509TrustManager getDefaultTrustManager() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final javax.net.ssl.X509TrustManager getTrustManager(@org.jetbrains.annotations.Nullable()
        java.security.KeyStore keystore) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final javax.net.ssl.X509TrustManager getTrustManager(@org.jetbrains.annotations.NotNull()
        java.lang.String algorithm, @org.jetbrains.annotations.Nullable()
        java.security.KeyStore keystore) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}