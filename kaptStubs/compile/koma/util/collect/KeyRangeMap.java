package koma.util.collect;

import java.lang.System;

/**
 * * bidirectional mapping between ordered keys and ordered ranges
 * * ranges are expected to be continuous and non-overlapping
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\fH\u0002J\u0013\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u00120\bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0015\u001a\u00020\nJ%\u0010\u0016\u001a\u0014\u0018\u00010\bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u0014\u0018\u00010\bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0015\u001a\u00020\nJ\u0015\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001aJ#\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u0010\u000fJ \u0010 \u001a\u00020\f2\u0016\u0010!\u001a\u00120\bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J\u0013\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010#R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u00120\bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0014\u0012\u00120\bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lkoma/util/collect/KeyRangeMap;", "K", "", "V", "", "()V", "keyMap", "Ljava/util/TreeMap;", "Lkoma/util/collect/KeyRangeMap$Entry;", "posMap", "", "changeSizeOf", "", "key", "delta", "(Ljava/lang/Comparable;I)V", "checkConsistency", "containsKey", "", "(Ljava/lang/Comparable;)Z", "getEntryAt", "pos", "getEntryByKey", "(Ljava/lang/Comparable;)Lkoma/util/collect/KeyRangeMap$Entry;", "getEntryOrNull", "getOffsetFor", "(Ljava/lang/Comparable;)Ljava/lang/Integer;", "insert", "size", "value", "(Ljava/lang/Comparable;ILjava/lang/Object;)V", "prepareTail", "registerEntryPos", "entry", "remove", "(Ljava/lang/Comparable;)V", "Entry", "koma-library"})
public final class KeyRangeMap<K extends java.lang.Comparable<? super K>, V extends java.lang.Object> {
    private final java.util.TreeMap<K, koma.util.collect.KeyRangeMap<K, V>.Entry> keyMap = null;
    private final java.util.TreeMap<java.lang.Integer, koma.util.collect.KeyRangeMap<K, V>.Entry> posMap = null;
    
    public final boolean containsKey(@org.jetbrains.annotations.NotNull()
    K key) {
        return false;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    K key, int size, V value) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    K key) {
    }
    
    public final void changeSizeOf(@org.jetbrains.annotations.NotNull()
    K key, int delta) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final koma.util.collect.KeyRangeMap<K, V>.Entry getEntryByKey(@org.jetbrains.annotations.NotNull()
    K key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final koma.util.collect.KeyRangeMap<K, V>.Entry getEntryAt(int pos) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final koma.util.collect.KeyRangeMap<K, V>.Entry getEntryOrNull(int pos) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOffsetFor(@org.jetbrains.annotations.NotNull()
    K key) {
        return null;
    }
    
    private final void prepareTail(K key, int delta) {
    }
    
    private final void registerEntryPos(koma.util.collect.KeyRangeMap<K, V>.Entry entry) {
    }
    
    private final void checkConsistency() {
    }
    
    public KeyRangeMap() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00028\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lkoma/util/collect/KeyRangeMap$Entry;", "", "key", "value", "range", "Lkoma/util/collect/IntRange;", "(Lkoma/util/collect/KeyRangeMap;Ljava/lang/Comparable;Ljava/lang/Object;Lkoma/util/collect/IntRange;)V", "getKey", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getRange", "()Lkoma/util/collect/IntRange;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "koma-library"})
    public final class Entry {
        @org.jetbrains.annotations.NotNull()
        private final K key = null;
        private final V value = null;
        @org.jetbrains.annotations.NotNull()
        private final koma.util.collect.IntRange range = null;
        
        @org.jetbrains.annotations.NotNull()
        public final K getKey() {
            return null;
        }
        
        public final V getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final koma.util.collect.IntRange getRange() {
            return null;
        }
        
        public Entry(@org.jetbrains.annotations.NotNull()
        K key, V value, @org.jetbrains.annotations.NotNull()
        koma.util.collect.IntRange range) {
            super();
        }
    }
}