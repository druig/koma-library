package koma.matrix.pagination;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u00c6\u0003J5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lkoma/matrix/pagination/RoomBatch;", "T", "", "total_room_count_estimate", "", "next_batch", "", "chunk", "", "(ILjava/lang/String;Ljava/util/List;)V", "getChunk", "()Ljava/util/List;", "getNext_batch", "()Ljava/lang/String;", "getTotal_room_count_estimate", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "koma-library"})
public final class RoomBatch<T extends java.lang.Object> {
    private final int total_room_count_estimate = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String next_batch = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> chunk = null;
    
    public final int getTotal_room_count_estimate() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNext_batch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getChunk() {
        return null;
    }
    
    public RoomBatch(int total_room_count_estimate, @org.jetbrains.annotations.Nullable()
    java.lang.String next_batch, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> chunk) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.matrix.pagination.RoomBatch<T> copy(int total_room_count_estimate, @org.jetbrains.annotations.Nullable()
    java.lang.String next_batch, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> chunk) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}