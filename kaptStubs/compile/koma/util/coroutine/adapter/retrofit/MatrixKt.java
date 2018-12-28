package koma.util.coroutine.adapter.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a5\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u0002H\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\u00040\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u001a,\u0010\n\u001a\u0012\u0012\u0004\u0012\u0002H\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\u00040\u000bH\u0002\u001a\u000e\u0010\f\u001a\u00020\r*\u00060\u0005j\u0002`\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"logger", "Lmu/KLogger;", "awaitMatrix", "Lcom/github/kittinunf/result/Result;", "T", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractBody", "Lretrofit2/Response;", "isTemporaryNetFailure", "", "koma-library"})
public final class MatrixKt {
    private static final mu.KLogger logger = null;
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object awaitMatrix(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.github.kittinunf.result.Result<? extends T, ? extends java.lang.Exception>> p1) {
        return null;
    }
    
    public static final boolean isTemporaryNetFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception $receiver) {
        return false;
    }
    
    private static final <T extends java.lang.Object>com.github.kittinunf.result.Result<T, java.lang.Exception> extractBody(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> $receiver) {
        return null;
    }
}