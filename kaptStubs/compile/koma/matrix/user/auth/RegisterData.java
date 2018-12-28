package koma.matrix.user.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lkoma/matrix/user/auth/RegisterData;", "", "()V", "Password", "Query", "Lkoma/matrix/user/auth/RegisterData$Query;", "Lkoma/matrix/user/auth/RegisterData$Password;", "koma-library"})
public abstract class RegisterData {
    
    private RegisterData() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkoma/matrix/user/auth/RegisterData$Query;", "Lkoma/matrix/user/auth/RegisterData;", "()V", "koma-library"})
    public static final class Query extends koma.matrix.user.auth.RegisterData {
        
        public Query() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\u0002\u0010\u0007R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lkoma/matrix/user/auth/RegisterData$Password;", "Lkoma/matrix/user/auth/RegisterData;", "username", "", "password", "auth", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAuth", "()Ljava/util/Map;", "getPassword", "()Ljava/lang/String;", "getUsername", "koma-library"})
    public static final class Password extends koma.matrix.user.auth.RegisterData {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String username = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String password = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.lang.String> auth = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUsername() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPassword() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> getAuth() {
            return null;
        }
        
        public Password(@org.jetbrains.annotations.NotNull()
        java.lang.String username, @org.jetbrains.annotations.NotNull()
        java.lang.String password, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> auth) {
            super();
        }
    }
}