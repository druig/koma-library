package koma.controller.sync;

import java.lang.System;

/**
 * * get events using the sync api
 * * it stops when there is an exception
 * * it is up to the caller to restart the sync
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0014J\u0011\u0010\u0016\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tj\u0002`\n0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lkoma/controller/sync/MatrixSyncReceiver;", "", "since", "", "(Ljava/lang/String;)V", "events", "Lkotlinx/coroutines/channels/Channel;", "Lcom/github/kittinunf/result/Result;", "Lkoma/matrix/sync/SyncResponse;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getEvents", "()Lkotlinx/coroutines/channels/Channel;", "shutdownChan", "Lkotlinx/coroutines/CompletableDeferred;", "", "getSince", "()Ljava/lang/String;", "setSince", "timeCheck", "", "startSyncing", "stopSyncing", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "koma-library"})
public final class MatrixSyncReceiver {
    
    /**
     * * channel of responses from the sync api
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.channels.Channel<com.github.kittinunf.result.Result<koma.matrix.sync.SyncResponse, java.lang.Exception>> events = null;
    
    /**
     * * check whether the computer was not running for some time
     */
    private final kotlinx.coroutines.channels.Channel<kotlin.Unit> timeCheck = null;
    
    /**
     * * stop syncing, returns true when it's stopped
     */
    private final kotlinx.coroutines.channels.Channel<kotlinx.coroutines.CompletableDeferred<java.lang.Boolean>> shutdownChan = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String since;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.channels.Channel<com.github.kittinunf.result.Result<koma.matrix.sync.SyncResponse, java.lang.Exception>> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object stopSyncing(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public final void startSyncing() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSince() {
        return null;
    }
    
    public final void setSince(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MatrixSyncReceiver(@org.jetbrains.annotations.Nullable()
    java.lang.String since) {
        super();
    }
    
    public MatrixSyncReceiver() {
        super();
    }
}