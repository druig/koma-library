package matrix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lmatrix/MatrixMediaApi;", "", "uploadMedia", "Lretrofit2/Call;", "Ldomain/UploadResponse;", "type", "", "token", "content", "Lokhttp3/RequestBody;", "koma-library"})
public abstract interface MatrixMediaApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "upload")
    public abstract retrofit2.Call<domain.UploadResponse> uploadMedia(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody content);
}