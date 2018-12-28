package koma.util.coroutine.adapter.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u001a\u001c\u0010\t\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"await", "Lcom/github/kittinunf/result/Result;", "Lretrofit2/Response;", "T", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerOnCompletion", "", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "koma-library"})
public final class AdapterKt {
    
    /**
     * * Suspend extension for [Call] that returns a result
     */
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object await(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.github.kittinunf.result.Result<retrofit2.Response<T>, ? extends java.lang.Exception>> p1) {
        return null;
    }
    
    private static final void registerOnCompletion(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<?> $receiver, kotlinx.coroutines.CancellableContinuation<?> continuation) {
    }
}