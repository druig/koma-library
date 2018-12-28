package koma.matrix.user.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0006\u0007\bB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lkoma/matrix/user/auth/AuthException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "AuthFail", "HttpFail", "MatrixFail", "Lkoma/matrix/user/auth/AuthException$AuthFail;", "Lkoma/matrix/user/auth/AuthException$MatrixFail;", "Lkoma/matrix/user/auth/AuthException$HttpFail;", "koma-library"})
public abstract class AuthException extends java.lang.Exception {
    
    private AuthException(java.lang.String message) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lkoma/matrix/user/auth/AuthException$AuthFail;", "Lkoma/matrix/user/auth/AuthException;", "status", "Lkoma/matrix/user/auth/Unauthorized;", "(Lkoma/matrix/user/auth/Unauthorized;)V", "getStatus", "()Lkoma/matrix/user/auth/Unauthorized;", "koma-library"})
    public static final class AuthFail extends koma.matrix.user.auth.AuthException {
        @org.jetbrains.annotations.NotNull()
        private final koma.matrix.user.auth.Unauthorized status = null;
        
        @org.jetbrains.annotations.NotNull()
        public final koma.matrix.user.auth.Unauthorized getStatus() {
            return null;
        }
        
        public AuthFail(@org.jetbrains.annotations.NotNull()
        koma.matrix.user.auth.Unauthorized status) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lkoma/matrix/user/auth/AuthException$MatrixFail;", "Lkoma/matrix/user/auth/AuthException;", "error", "Lkoma/util/coroutine/adapter/retrofit/MatrixError;", "(Lkoma/util/coroutine/adapter/retrofit/MatrixError;)V", "getError", "()Lkoma/util/coroutine/adapter/retrofit/MatrixError;", "koma-library"})
    public static final class MatrixFail extends koma.matrix.user.auth.AuthException {
        @org.jetbrains.annotations.NotNull()
        private final koma.util.coroutine.adapter.retrofit.MatrixError error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final koma.util.coroutine.adapter.retrofit.MatrixError getError() {
            return null;
        }
        
        public MatrixFail(@org.jetbrains.annotations.NotNull()
        koma.util.coroutine.adapter.retrofit.MatrixError error) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lkoma/matrix/user/auth/AuthException$HttpFail;", "Lkoma/matrix/user/auth/AuthException;", "error", "Lkoma/util/coroutine/adapter/retrofit/HttpException;", "(Lkoma/util/coroutine/adapter/retrofit/HttpException;)V", "getError", "()Lkoma/util/coroutine/adapter/retrofit/HttpException;", "koma-library"})
    public static final class HttpFail extends koma.matrix.user.auth.AuthException {
        @org.jetbrains.annotations.NotNull()
        private final koma.util.coroutine.adapter.retrofit.HttpException error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final koma.util.coroutine.adapter.retrofit.HttpException getError() {
            return null;
        }
        
        public HttpFail(@org.jetbrains.annotations.NotNull()
        koma.util.coroutine.adapter.retrofit.HttpException error) {
            super(null);
        }
    }
}