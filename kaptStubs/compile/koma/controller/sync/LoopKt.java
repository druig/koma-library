package koma.controller.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2 = {"logger", "Lmu/KLogger;", "longPollTimeout", "", "getLongPollTimeout", "()I", "detectTimeLeap", "Lkotlinx/coroutines/channels/Channel;", "", "koma-library"})
public final class LoopKt {
    private static final mu.KLogger logger = null;
    private static final int longPollTimeout = 50;
    
    public static final int getLongPollTimeout() {
        return 0;
    }
    
    /**
     * * detect computer suspend and resume and restart sync
     */
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.channels.Channel<kotlin.Unit> detectTimeLeap() {
        return null;
    }
}