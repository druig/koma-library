package koma.matrix.user.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060\u0017j\u0002`\u00180\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J1\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\b\u0012\u00060\u0017j\u0002`\u00180\u00152\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \t*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n \t*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lkoma/matrix/user/auth/Register;", "", "serverConf", "Lkoma/storage/config/server/ServerConf;", "httpClient", "Lkoma/network/client/okhttp/AppHttpClient;", "(Lkoma/storage/config/server/ServerConf;Lkoma/network/client/okhttp/AppHttpClient;)V", "client", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "moshi", "Lcom/squareup/moshi/Moshi;", "retrofit", "Lretrofit2/Retrofit;", "getServerConf", "()Lkoma/storage/config/server/ServerConf;", "service", "Lkoma/matrix/user/auth/MatrixRegisterApi;", "session", "", "getFlows", "Lcom/github/kittinunf/result/Result;", "Lkoma/matrix/user/auth/Unauthorized;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerByPassword", "Lkoma/matrix/user/auth/RegisterdUser;", "username", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "koma-library"})
public final class Register {
    private final com.squareup.moshi.Moshi moshi = null;
    private final okhttp3.OkHttpClient client = null;
    private final retrofit2.Retrofit retrofit = null;
    private final koma.matrix.user.auth.MatrixRegisterApi service = null;
    private java.lang.String session;
    @org.jetbrains.annotations.NotNull()
    private final koma.storage.config.server.ServerConf serverConf = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFlows(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.github.kittinunf.result.Result<koma.matrix.user.auth.Unauthorized, ? extends java.lang.Exception>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerByPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.github.kittinunf.result.Result<koma.matrix.user.auth.RegisterdUser, ? extends java.lang.Exception>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.storage.config.server.ServerConf getServerConf() {
        return null;
    }
    
    public Register(@org.jetbrains.annotations.NotNull()
    koma.storage.config.server.ServerConf serverConf, @org.jetbrains.annotations.NotNull()
    koma.network.client.okhttp.AppHttpClient httpClient) {
        super();
    }
}