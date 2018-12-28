package koma.storage.config.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0007\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u000b"}, d2 = {"filename", "", "getFilename", "()Ljava/lang/String;", "getRecentUsers", "", "Lkoma/matrix/UserId;", "Lkoma/Koma;", "saveLastUsed", "", "userId", "koma-library"})
public final class Last_usedKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String filename = "last_used.json";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getFilename() {
        return null;
    }
    
    /**
     * * save recently used accounts to disk
     */
    public static final void saveLastUsed(@org.jetbrains.annotations.NotNull()
    koma.Koma $receiver, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId userId) {
    }
    
    /**
     * * load recently used accounts from disk
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<koma.matrix.UserId> getRecentUsers(@org.jetbrains.annotations.NotNull()
    koma.Koma $receiver) {
        return null;
    }
}