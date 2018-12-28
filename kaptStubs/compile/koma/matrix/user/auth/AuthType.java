package koma.matrix.user.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0005\b\t\n\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lkoma/matrix/user/auth/AuthType;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "toDisplay", "Companion", "Dummy", "Email", "Other", "Recaptcha", "Lkoma/matrix/user/auth/AuthType$Dummy;", "Lkoma/matrix/user/auth/AuthType$Email;", "Lkoma/matrix/user/auth/AuthType$Recaptcha;", "Lkoma/matrix/user/auth/AuthType$Other;", "koma-library"})
public abstract class AuthType {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    public static final koma.matrix.user.auth.AuthType.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toDisplay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    private AuthType(java.lang.String type) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lkoma/matrix/user/auth/AuthType$Dummy;", "Lkoma/matrix/user/auth/AuthType;", "t", "", "(Ljava/lang/String;)V", "koma-library"})
    public static final class Dummy extends koma.matrix.user.auth.AuthType {
        
        public Dummy(@org.jetbrains.annotations.NotNull()
        java.lang.String t) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lkoma/matrix/user/auth/AuthType$Email;", "Lkoma/matrix/user/auth/AuthType;", "t", "", "(Ljava/lang/String;)V", "koma-library"})
    public static final class Email extends koma.matrix.user.auth.AuthType {
        
        public Email(@org.jetbrains.annotations.NotNull()
        java.lang.String t) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lkoma/matrix/user/auth/AuthType$Recaptcha;", "Lkoma/matrix/user/auth/AuthType;", "t", "", "(Ljava/lang/String;)V", "koma-library"})
    public static final class Recaptcha extends koma.matrix.user.auth.AuthType {
        
        public Recaptcha(@org.jetbrains.annotations.NotNull()
        java.lang.String t) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lkoma/matrix/user/auth/AuthType$Other;", "Lkoma/matrix/user/auth/AuthType;", "type", "", "(Ljava/lang/String;)V", "koma-library"})
    public static final class Other extends koma.matrix.user.auth.AuthType {
        
        public Other(@org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkoma/matrix/user/auth/AuthType$Companion;", "", "()V", "parse", "Lkoma/matrix/user/auth/AuthType;", "s", "", "koma-library"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final koma.matrix.user.auth.AuthType parse(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}