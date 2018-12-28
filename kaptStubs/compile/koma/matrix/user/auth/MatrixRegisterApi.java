package koma.matrix.user.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0001H\'\u00a8\u0006\u0006"}, d2 = {"Lkoma/matrix/user/auth/MatrixRegisterApi;", "", "register", "Lretrofit2/Call;", "Lkoma/matrix/user/auth/RegisterdUser;", "data", "koma-library"})
public abstract interface MatrixRegisterApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "_matrix/client/r0/register")
    public abstract retrofit2.Call<koma.matrix.user.auth.RegisterdUser> register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.lang.Object data);
}