package koma.util.coroutine.adapter.okhttp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001*\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u001a\u001a\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001*\u00020\u0002\u001a\u0018\u0010\t\u001a\u00020\n*\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"await", "Lcom/github/kittinunf/result/Result;", "Lokhttp3/Response;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lokhttp3/Call;", "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extract", "Lokhttp3/ResponseBody;", "registerOnCompletion", "", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "koma-library"})
public final class AdapterKt {
    
    /**
     * * Suspend extension that allows suspend [Call] inside coroutine.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object await(@org.jetbrains.annotations.NotNull()
    okhttp3.Call $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.github.kittinunf.result.Result<okhttp3.Response, ? extends java.lang.Exception>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.github.kittinunf.result.Result<okhttp3.ResponseBody, java.lang.Exception> extract(@org.jetbrains.annotations.NotNull()
    okhttp3.Response $receiver) {
        return null;
    }
    
    private static final void registerOnCompletion(@org.jetbrains.annotations.NotNull()
    okhttp3.Call $receiver, kotlinx.coroutines.CancellableContinuation<?> continuation) {
    }
}