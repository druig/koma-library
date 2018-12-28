package matrix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020$J\u0018\u0010-\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u000201H\u0002J\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030(2\u0006\u00104\u001a\u000205J\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002070(2\u0006\u00108\u001a\u00020\nJ\u001a\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:0(2\u0006\u0010<\u001a\u00020=J\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020?0(2\u0006\u0010*\u001a\u00020+2\u0006\u0010@\u001a\u00020AJ\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020C0(2\b\u0010D\u001a\u0004\u0018\u00010\nJ6\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0(2\u0006\u0010H\u001a\u00020+2\u0006\u0010D\u001a\u00020\n2\u0006\u0010I\u001a\u00020J2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\nJ\u0006\u0010L\u001a\u00020MJ\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020O0(2\u0006\u0010P\u001a\u00020+2\u0006\u0010,\u001a\u00020$J\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0(2\u0006\u0010*\u001a\u00020+J\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020T0(2\u0006\u0010*\u001a\u00020+J\u001c\u0010U\u001a\b\u0012\u0004\u0012\u0002070(2\u0006\u0010*\u001a\u00020+2\u0006\u00108\u001a\u00020\nJ\u0014\u0010V\u001a\b\u0012\u0004\u0012\u00020W0(2\u0006\u0010X\u001a\u00020\nJ\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0(2\u0006\u0010H\u001a\u00020+2\u0006\u0010[\u001a\u00020\\J\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0(2\u0006\u0010*\u001a\u00020+2\u0006\u0010^\u001a\u00020_J\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020Z0(2\u0006\u0010H\u001a\u00020+2\u0006\u0010a\u001a\u00020bJ\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020Z0(2\u0006\u0010*\u001a\u00020+2\u0006\u0010d\u001a\u00020eJ\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020g0(2\u0006\u0010h\u001a\u00020$2\u0006\u0010i\u001a\u00020jJ\u0014\u0010k\u001a\b\u0012\u0004\u0012\u0002070(2\u0006\u0010l\u001a\u00020\nJ\u001c\u0010m\u001a\b\u0012\u0004\u0012\u00020n0(2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u001f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u0006s"}, d2 = {"Lmatrix/ApiClient;", "", "profile", "Lkoma/storage/config/profile/Profile;", "serverConf", "Lkoma/storage/config/server/ServerConf;", "koma", "Lkoma/Koma;", "(Lkoma/storage/config/profile/Profile;Lkoma/storage/config/server/ServerConf;Lkoma/Koma;)V", "apiURL", "", "getApiURL", "()Ljava/lang/String;", "http", "Lkoma/network/client/okhttp/AppHttpClient;", "longPollService", "Lmatrix/MatrixAccessApi;", "getLongPollService", "()Lmatrix/MatrixAccessApi;", "mediaService", "Lmatrix/MatrixMediaApi;", "getMediaService", "()Lmatrix/MatrixMediaApi;", "next_batch", "getNext_batch", "setNext_batch", "(Ljava/lang/String;)V", "getProfile", "()Lkoma/storage/config/profile/Profile;", "service", "getService", "token", "getToken", "txnIdUnique", "Ljava/util/concurrent/atomic/AtomicLong;", "userId", "Lkoma/matrix/UserId;", "getUserId", "()Lkoma/matrix/UserId;", "banMember", "Lretrofit2/Call;", "Lkoma/matrix/room/admin/BanRoomResult;", "roomid", "Lkoma/matrix/room/naming/RoomId;", "memId", "createMediaService", "client", "Lokhttp3/OkHttpClient;", "createRetrofitBuilder", "Lretrofit2/Retrofit$Builder;", "createRoom", "Lkoma/matrix/room/admin/CreateRoomResult;", "settings", "Lkoma/matrix/room/admin/CreateRoomSettings;", "deleteRoomAlias", "Ldomain/EmptyResult;", "alias", "findPublicRooms", "Lkoma/matrix/pagination/RoomBatch;", "Ldomain/DiscoveredRoom;", "query", "Lkoma/matrix/publicapi/rooms/RoomDirectoryQuery;", "getEventContext", "Lkoma/matrix/event/context/ContextResponse;", "eventId", "Lkoma/matrix/event/EventId;", "getEvents", "Lkoma/matrix/sync/SyncResponse;", "from", "getRoomMessages", "Ldomain/Chunked;", "Lkoma/matrix/event/room_message/RoomEvent;", "roomId", "direction", "Lkoma/matrix/pagination/FetchDirection;", "to", "getTxnId", "", "inviteMember", "Lkoma/matrix/room/participation/invite/InviteMemResult;", "room", "joinRoom", "Lkoma/matrix/room/participation/join/JoinRoomResult;", "leavingRoom", "Lkoma/matrix/room/participation/LeaveRoomResult;", "putRoomAlias", "resolveRoomAlias", "Lkoma/matrix/room/naming/ResolveRoomAliasResult;", "roomAlias", "sendRoomMessage", "Lmatrix/SendResult;", "message", "Lkoma/matrix/event/room_message/chat/M_Message;", "setRoomCanonicalAlias", "canonicalAlias", "Lkoma/matrix/event/room_message/state/RoomCanonAliasContent;", "setRoomIcon", "content", "Lkoma/matrix/event/room_message/state/RoomAvatarContent;", "setRoomName", "name", "Lkoma/matrix/event/room_message/state/RoomNameContent;", "updateAvatar", "Lmatrix/UpdateAvatarResult;", "user_id", "avatarUrl", "Ldomain/AvatarUrl;", "updateDisplayName", "newname", "uploadFile", "Ldomain/UploadResponse;", "file", "Ljava/io/File;", "contentType", "Lokhttp3/MediaType;", "koma-library"})
public final class ApiClient {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apiURL = null;
    private final koma.network.client.okhttp.AppHttpClient http = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String token = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.matrix.UserId userId = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String next_batch;
    @org.jetbrains.annotations.NotNull()
    private final matrix.MatrixAccessApi service = null;
    @org.jetbrains.annotations.NotNull()
    private final matrix.MatrixAccessApi longPollService = null;
    @org.jetbrains.annotations.NotNull()
    private final matrix.MatrixMediaApi mediaService = null;
    private final java.util.concurrent.atomic.AtomicLong txnIdUnique = null;
    @org.jetbrains.annotations.NotNull()
    private final koma.storage.config.profile.Profile profile = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiURL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.UserId getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNext_batch() {
        return null;
    }
    
    public final void setNext_batch(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final matrix.MatrixAccessApi getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final matrix.MatrixAccessApi getLongPollService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final matrix.MatrixMediaApi getMediaService() {
        return null;
    }
    
    public final long getTxnId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<koma.matrix.room.admin.CreateRoomResult> createRoom(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.admin.CreateRoomSettings settings) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<domain.Chunked<koma.matrix.event.room_message.RoomEvent>> getRoomMessages(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId roomId, @org.jetbrains.annotations.NotNull()
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    koma.matrix.pagination.FetchDirection direction, @org.jetbrains.annotations.Nullable()
    java.lang.String to) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<koma.matrix.room.participation.join.JoinRoomResult> joinRoom(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId roomid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<koma.matrix.event.context.ContextResponse> getEventContext(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId roomid, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.EventId eventId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<domain.UploadResponse> uploadFile(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    okhttp3.MediaType contentType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<koma.matrix.room.participation.invite.InviteMemResult> inviteMember(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId room, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId memId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<matrix.UpdateAvatarResult> updateAvatar(@org.jetbrains.annotations.NotNull()
    koma.matrix.UserId user_id, @org.jetbrains.annotations.NotNull()
    domain.AvatarUrl avatarUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<domain.EmptyResult> updateDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String newname) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<matrix.SendResult> setRoomIcon(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId roomId, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.room_message.state.RoomAvatarContent content) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<koma.matrix.room.admin.BanRoomResult> banMember(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId roomid, @org.jetbrains.annotations.NotNull()
    koma.matrix.UserId memId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<koma.matrix.room.participation.LeaveRoomResult> leavingRoom(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId roomid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<domain.EmptyResult> putRoomAlias(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId roomid, @org.jetbrains.annotations.NotNull()
    java.lang.String alias) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<domain.EmptyResult> deleteRoomAlias(@org.jetbrains.annotations.NotNull()
    java.lang.String alias) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<matrix.SendResult> setRoomCanonicalAlias(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId roomid, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.room_message.state.RoomCanonAliasContent canonicalAlias) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<matrix.SendResult> setRoomName(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId roomid, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.room_message.state.RoomNameContent name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<koma.matrix.room.naming.ResolveRoomAliasResult> resolveRoomAlias(@org.jetbrains.annotations.NotNull()
    java.lang.String roomAlias) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<matrix.SendResult> sendRoomMessage(@org.jetbrains.annotations.NotNull()
    koma.matrix.room.naming.RoomId roomId, @org.jetbrains.annotations.NotNull()
    koma.matrix.event.room_message.chat.M_Message message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<koma.matrix.pagination.RoomBatch<domain.DiscoveredRoom>> findPublicRooms(@org.jetbrains.annotations.NotNull()
    koma.matrix.publicapi.rooms.RoomDirectoryQuery query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<koma.matrix.sync.SyncResponse> getEvents(@org.jetbrains.annotations.Nullable()
    java.lang.String from) {
        return null;
    }
    
    /**
     * * add adapters to moshi and then add moshi to retrofit
     */
    private final retrofit2.Retrofit.Builder createRetrofitBuilder() {
        return null;
    }
    
    private final matrix.MatrixMediaApi createMediaService(koma.storage.config.server.ServerConf serverConf, okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.storage.config.profile.Profile getProfile() {
        return null;
    }
    
    public ApiClient(@org.jetbrains.annotations.NotNull()
    koma.storage.config.profile.Profile profile, @org.jetbrains.annotations.NotNull()
    koma.storage.config.server.ServerConf serverConf, @org.jetbrains.annotations.NotNull()
    koma.Koma koma) {
        super();
    }
}