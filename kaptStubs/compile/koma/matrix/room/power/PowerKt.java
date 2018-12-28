package koma.matrix.room.power;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0004\u001a\f\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\u0002\u00a8\u0006\r"}, d2 = {"canUserSet", "", "Lkoma/matrix/event/room_message/state/RoomPowerLevelsContent;", "user", "Lkoma/matrix/UserId;", "et", "Lmatrix/event/room_message/RoomEventType;", "canUserSetStates", "getState", "", "getUser", "u", "state_default", "koma-library"})
public final class PowerKt {
    
    public static final float getUser(@org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.state.RoomPowerLevelsContent $receiver, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId u) {
        return 0.0F;
    }
    
    public static final float state_default(@org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.state.RoomPowerLevelsContent $receiver) {
        return 0.0F;
    }
    
    public static final float getState(@org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.state.RoomPowerLevelsContent $receiver, @org.jetbrains.annotations.NotNull()
    matrix.event.room_message.RoomEventType et) {
        return 0.0F;
    }
    
    /**
     * * Can a user send a type of state event?
     */
    public static final boolean canUserSet(@org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.state.RoomPowerLevelsContent $receiver, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId user, @org.jetbrains.annotations.NotNull()
    matrix.event.room_message.RoomEventType et) {
        return false;
    }
    
    public static final boolean canUserSetStates(@org.jetbrains.annotations.Nullable()
    koma.matrix.event.room_message.state.RoomPowerLevelsContent $receiver, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId user) {
        return false;
    }
}