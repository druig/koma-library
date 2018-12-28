package koma.matrix.event.room_message.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lkoma/matrix/event/room_message/state/RoomPowerLevelsContent;", "", "users_default", "", "state_default", "events_default", "ban", "invite", "kick", "redact", "events", "", "", "users", "Lkoma/matrix/UserId;", "(FFFFFFFLjava/util/Map;Ljava/util/Map;)V", "getBan", "()F", "getEvents", "()Ljava/util/Map;", "getEvents_default", "getInvite", "getKick", "getRedact", "getState_default", "getUsers", "getUsers_default", "koma-library"})
public final class RoomPowerLevelsContent {
    private final float users_default = 0.0F;
    
    /**
     * *  state_default Defaults to 50 if unspecified,
     *         * but 0 if there is no m.room.power_levels event at all.
     */
    private final float state_default = 0.0F;
    private final float events_default = 0.0F;
    private final float ban = 0.0F;
    private final float invite = 0.0F;
    private final float kick = 0.0F;
    private final float redact = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Float> events = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<koma.matrix.UserId, java.lang.Float> users = null;
    
    public final float getUsers_default() {
        return 0.0F;
    }
    
    /**
     * *  state_default Defaults to 50 if unspecified,
     *         * but 0 if there is no m.room.power_levels event at all.
     */
    public final float getState_default() {
        return 0.0F;
    }
    
    public final float getEvents_default() {
        return 0.0F;
    }
    
    public final float getBan() {
        return 0.0F;
    }
    
    public final float getInvite() {
        return 0.0F;
    }
    
    public final float getKick() {
        return 0.0F;
    }
    
    public final float getRedact() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Float> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<koma.matrix.UserId, java.lang.Float> getUsers() {
        return null;
    }
    
    public RoomPowerLevelsContent(float users_default, float state_default, float events_default, float ban, float invite, float kick, float redact, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Float> events, @org.jetbrains.annotations.NotNull()
    java.util.Map<koma.matrix.UserId, java.lang.Float> users) {
        super();
    }
}