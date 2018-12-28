package matrix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\'J6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\b\b\u0003\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'JD\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010 \u001a\u00020!2\b\b\u0003\u0010\"\u001a\u00020\u001c2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0006H\'JR\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00182\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010\'\u001a\u00020(2\b\b\u0003\u0010\u001b\u001a\u00020\u001c2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u0006H\'J,\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010,\u001a\u00020-H\'J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u00100\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00182\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J*\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00032\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u001b\u001a\u00020\u001cH\'J,\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00106\u001a\u000207H\'J\u0018\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\'J@\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00182\b\b\u0001\u0010<\u001a\u00020=2\b\b\u0001\u0010>\u001a\u00020?2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010@\u001a\u00020AH\'J6\u0010B\u001a\b\u0012\u0004\u0012\u00020;0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00182\b\b\u0001\u0010C\u001a\u00020=2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020\u0001H\'J,\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00032\b\b\u0001\u0010G\u001a\u00020H2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010I\u001a\u00020JH\'J8\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010G\u001a\u00020H2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060MH\'\u00a8\u0006N"}, d2 = {"Lmatrix/MatrixAccessApi;", "", "banUser", "Lretrofit2/Call;", "Lkoma/matrix/room/admin/BanRoomResult;", "roomId", "", "token", "banishment", "Lkoma/matrix/room/admin/MemberBanishment;", "createRoom", "Lkoma/matrix/room/admin/CreateRoomResult;", "roomSettings", "Lkoma/matrix/room/admin/CreateRoomSettings;", "deleteRoomAlias", "Ldomain/EmptyResult;", "roomAlias", "findPublicRooms", "Lkoma/matrix/pagination/RoomBatch;", "Ldomain/DiscoveredRoom;", "query", "Lkoma/matrix/publicapi/rooms/RoomDirectoryQuery;", "getEventContext", "Lkoma/matrix/event/context/ContextResponse;", "Lkoma/matrix/room/naming/RoomId;", "eventId", "Lkoma/matrix/event/EventId;", "limit", "", "getEvents", "Lkoma/matrix/sync/SyncResponse;", "from", "full_state", "", "timeout", "filter", "getMessages", "Ldomain/Chunked;", "Lkoma/matrix/event/room_message/RoomEvent;", "dir", "Lkoma/matrix/pagination/FetchDirection;", "to", "inviteUser", "Lkoma/matrix/room/participation/invite/InviteMemResult;", "invitation", "Lkoma/matrix/room/participation/invite/InviteUserData;", "joinRoom", "Lkoma/matrix/room/participation/join/JoinRoomResult;", "roomIdentifier", "leaveRoom", "Lkoma/matrix/room/participation/LeaveRoomResult;", "publicRooms", "since", "putRoomAlias", "roomInfo", "Ldomain/RoomInfo;", "resolveRoomAlias", "Lkoma/matrix/room/naming/ResolveRoomAliasResult;", "sendMessageEvent", "Lmatrix/SendResult;", "eventType", "Lmatrix/event/room_message/RoomEventType;", "txnId", "", "message", "Lkoma/matrix/event/room_message/chat/M_Message;", "sendStateEvent", "type", "content", "updateAvatar", "Lmatrix/UpdateAvatarResult;", "user_id", "Lkoma/matrix/UserId;", "avatarUrl", "Ldomain/AvatarUrl;", "updateDisplayName", "body", "", "koma-library"})
public abstract interface MatrixAccessApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "createRoom")
    public abstract retrofit2.Call<koma.matrix.room.admin.CreateRoomResult> createRoom(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    koma.matrix.room.admin.CreateRoomSettings roomSettings);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "rooms/{roomIdentifier}/join")
    public abstract retrofit2.Call<koma.matrix.room.participation.join.JoinRoomResult> joinRoom(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomIdentifier")
    java.lang.String roomIdentifier, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "rooms/{roomId}/leave")
    public abstract retrofit2.Call<koma.matrix.room.participation.LeaveRoomResult> leaveRoom(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomId")
    koma.matrix.room.naming.RoomId roomId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "directory/room/{roomAlias}")
    public abstract retrofit2.Call<koma.matrix.room.naming.ResolveRoomAliasResult> resolveRoomAlias(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomAlias")
    java.lang.String roomAlias);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "directory/room/{roomAlias}")
    public abstract retrofit2.Call<domain.EmptyResult> putRoomAlias(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomAlias")
    java.lang.String roomAlias, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    domain.RoomInfo roomInfo);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "directory/room/{roomAlias}")
    public abstract retrofit2.Call<domain.EmptyResult> deleteRoomAlias(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomAlias")
    java.lang.String roomAlias, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "publicRooms")
    public abstract retrofit2.Call<koma.matrix.pagination.RoomBatch<domain.DiscoveredRoom>> publicRooms(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "since")
    java.lang.String since, @retrofit2.http.Query(value = "limit")
    int limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "publicRooms")
    public abstract retrofit2.Call<koma.matrix.pagination.RoomBatch<domain.DiscoveredRoom>> findPublicRooms(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    koma.matrix.publicapi.rooms.RoomDirectoryQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "rooms/{roomId}/messages")
    public abstract retrofit2.Call<domain.Chunked<koma.matrix.event.room_message.RoomEvent>> getMessages(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomId")
    koma.matrix.room.naming.RoomId roomId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "from")
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "dir")
    koma.matrix.pagination.FetchDirection dir, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "to")
    java.lang.String to);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "rooms/{roomId}/invite")
    public abstract retrofit2.Call<koma.matrix.room.participation.invite.InviteMemResult> inviteUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomId")
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    koma.matrix.room.participation.invite.InviteUserData invitation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "rooms/{roomId}/ban")
    public abstract retrofit2.Call<koma.matrix.room.admin.BanRoomResult> banUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomId")
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    koma.matrix.room.admin.MemberBanishment banishment);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "rooms/{roomId}/send/{eventType}/{txnId}")
    public abstract retrofit2.Call<matrix.SendResult> sendMessageEvent(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomId")
    koma.matrix.room.naming.RoomId roomId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "eventType")
    matrix.event.room_message.RoomEventType eventType, @retrofit2.http.Path(value = "txnId")
    long txnId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    koma.matrix.event.room_message.chat.M_Message message);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "rooms/{roomId}/state/{eventType}")
    public abstract retrofit2.Call<matrix.SendResult> sendStateEvent(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomId")
    koma.matrix.room.naming.RoomId roomId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "eventType")
    matrix.event.room_message.RoomEventType type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.lang.Object content);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "rooms/{roomId}/context/{eventId}")
    public abstract retrofit2.Call<koma.matrix.event.context.ContextResponse> getEventContext(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "roomId")
    koma.matrix.room.naming.RoomId roomId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "eventId")
    koma.matrix.event.EventId eventId, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "sync")
    public abstract retrofit2.Call<koma.matrix.sync.SyncResponse> getEvents(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "since")
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @retrofit2.http.Query(value = "full_state")
    boolean full_state, @retrofit2.http.Query(value = "timeout")
    int timeout, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "filter")
    java.lang.String filter);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "profile/{userId}/avatar_url")
    public abstract retrofit2.Call<matrix.UpdateAvatarResult> updateAvatar(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userId")
    koma.matrix.UserId user_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    domain.AvatarUrl avatarUrl);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "profile/{userId}/displayname")
    public abstract retrofit2.Call<domain.EmptyResult> updateDisplayName(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userId")
    koma.matrix.UserId user_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.String> body);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}