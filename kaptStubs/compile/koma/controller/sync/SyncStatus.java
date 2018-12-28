package koma.controller.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lkoma/controller/sync/SyncStatus;", "", "()V", "Response", "Resync", "Shutdown", "Lkoma/controller/sync/SyncStatus$Resync;", "Lkoma/controller/sync/SyncStatus$Shutdown;", "Lkoma/controller/sync/SyncStatus$Response;", "koma-library"})
public abstract class SyncStatus {
    
    private SyncStatus() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkoma/controller/sync/SyncStatus$Resync;", "Lkoma/controller/sync/SyncStatus;", "()V", "koma-library"})
    public static final class Resync extends koma.controller.sync.SyncStatus {
        
        public Resync() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lkoma/controller/sync/SyncStatus$Shutdown;", "Lkoma/controller/sync/SyncStatus;", "done", "Lkotlinx/coroutines/CompletableDeferred;", "", "(Lkotlinx/coroutines/CompletableDeferred;)V", "getDone", "()Lkotlinx/coroutines/CompletableDeferred;", "koma-library"})
    public static final class Shutdown extends koma.controller.sync.SyncStatus {
        @org.jetbrains.annotations.NotNull()
        private final kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> done = null;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> getDone() {
            return null;
        }
        
        public Shutdown(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> done) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003\u00a2\u0006\u0002\u0010\u0007R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lkoma/controller/sync/SyncStatus$Response;", "Lkoma/controller/sync/SyncStatus;", "response", "Lcom/github/kittinunf/result/Result;", "Lkoma/matrix/sync/SyncResponse;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lcom/github/kittinunf/result/Result;)V", "getResponse", "()Lcom/github/kittinunf/result/Result;", "koma-library"})
    public static final class Response extends koma.controller.sync.SyncStatus {
        @org.jetbrains.annotations.NotNull()
        private final com.github.kittinunf.result.Result<koma.matrix.sync.SyncResponse, java.lang.Exception> response = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.kittinunf.result.Result<koma.matrix.sync.SyncResponse, java.lang.Exception> getResponse() {
            return null;
        }
        
        public Response(@org.jetbrains.annotations.NotNull()
        com.github.kittinunf.result.Result<koma.matrix.sync.SyncResponse, ? extends java.lang.Exception> response) {
            super();
        }
    }
}