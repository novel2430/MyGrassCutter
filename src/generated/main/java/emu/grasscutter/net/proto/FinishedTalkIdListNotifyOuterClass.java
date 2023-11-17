// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FinishedTalkIdListNotify.proto

package emu.grasscutter.net.proto;

public final class FinishedTalkIdListNotifyOuterClass {
  private FinishedTalkIdListNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FinishedTalkIdListNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FinishedTalkIdListNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 finished_talk_id_list = 2;</code>
     * @return A list containing the finishedTalkIdList.
     */
    java.util.List<java.lang.Integer> getFinishedTalkIdListList();
    /**
     * <code>repeated uint32 finished_talk_id_list = 2;</code>
     * @return The count of finishedTalkIdList.
     */
    int getFinishedTalkIdListCount();
    /**
     * <code>repeated uint32 finished_talk_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The finishedTalkIdList at the given index.
     */
    int getFinishedTalkIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 28424
   * Obf: JNBCHGENADD
   * </pre>
   *
   * Protobuf type {@code FinishedTalkIdListNotify}
   */
  public static final class FinishedTalkIdListNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FinishedTalkIdListNotify)
      FinishedTalkIdListNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FinishedTalkIdListNotify.newBuilder() to construct.
    private FinishedTalkIdListNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FinishedTalkIdListNotify() {
      finishedTalkIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FinishedTalkIdListNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FinishedTalkIdListNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                finishedTalkIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              finishedTalkIdList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                finishedTalkIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                finishedTalkIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          finishedTalkIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.internal_static_FinishedTalkIdListNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.internal_static_FinishedTalkIdListNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify.class, emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify.Builder.class);
    }

    public static final int FINISHED_TALK_ID_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList finishedTalkIdList_;
    /**
     * <code>repeated uint32 finished_talk_id_list = 2;</code>
     * @return A list containing the finishedTalkIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFinishedTalkIdListList() {
      return finishedTalkIdList_;
    }
    /**
     * <code>repeated uint32 finished_talk_id_list = 2;</code>
     * @return The count of finishedTalkIdList.
     */
    public int getFinishedTalkIdListCount() {
      return finishedTalkIdList_.size();
    }
    /**
     * <code>repeated uint32 finished_talk_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The finishedTalkIdList at the given index.
     */
    public int getFinishedTalkIdList(int index) {
      return finishedTalkIdList_.getInt(index);
    }
    private int finishedTalkIdListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getFinishedTalkIdListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(finishedTalkIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < finishedTalkIdList_.size(); i++) {
        output.writeUInt32NoTag(finishedTalkIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < finishedTalkIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(finishedTalkIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFinishedTalkIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        finishedTalkIdListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify other = (emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify) obj;

      if (!getFinishedTalkIdListList()
          .equals(other.getFinishedTalkIdListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getFinishedTalkIdListCount() > 0) {
        hash = (37 * hash) + FINISHED_TALK_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFinishedTalkIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 28424
     * Obf: JNBCHGENADD
     * </pre>
     *
     * Protobuf type {@code FinishedTalkIdListNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FinishedTalkIdListNotify)
        emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.internal_static_FinishedTalkIdListNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.internal_static_FinishedTalkIdListNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify.class, emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        finishedTalkIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.internal_static_FinishedTalkIdListNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify build() {
        emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify buildPartial() {
        emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify result = new emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          finishedTalkIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.finishedTalkIdList_ = finishedTalkIdList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify other) {
        if (other == emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify.getDefaultInstance()) return this;
        if (!other.finishedTalkIdList_.isEmpty()) {
          if (finishedTalkIdList_.isEmpty()) {
            finishedTalkIdList_ = other.finishedTalkIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFinishedTalkIdListIsMutable();
            finishedTalkIdList_.addAll(other.finishedTalkIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList finishedTalkIdList_ = emptyIntList();
      private void ensureFinishedTalkIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          finishedTalkIdList_ = mutableCopy(finishedTalkIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 finished_talk_id_list = 2;</code>
       * @return A list containing the finishedTalkIdList.
       */
      public java.util.List<java.lang.Integer>
          getFinishedTalkIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(finishedTalkIdList_) : finishedTalkIdList_;
      }
      /**
       * <code>repeated uint32 finished_talk_id_list = 2;</code>
       * @return The count of finishedTalkIdList.
       */
      public int getFinishedTalkIdListCount() {
        return finishedTalkIdList_.size();
      }
      /**
       * <code>repeated uint32 finished_talk_id_list = 2;</code>
       * @param index The index of the element to return.
       * @return The finishedTalkIdList at the given index.
       */
      public int getFinishedTalkIdList(int index) {
        return finishedTalkIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 finished_talk_id_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The finishedTalkIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedTalkIdList(
          int index, int value) {
        ensureFinishedTalkIdListIsMutable();
        finishedTalkIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_talk_id_list = 2;</code>
       * @param value The finishedTalkIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFinishedTalkIdList(int value) {
        ensureFinishedTalkIdListIsMutable();
        finishedTalkIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_talk_id_list = 2;</code>
       * @param values The finishedTalkIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFinishedTalkIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFinishedTalkIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, finishedTalkIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_talk_id_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedTalkIdList() {
        finishedTalkIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FinishedTalkIdListNotify)
    }

    // @@protoc_insertion_point(class_scope:FinishedTalkIdListNotify)
    private static final emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify();
    }

    public static emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FinishedTalkIdListNotify>
        PARSER = new com.google.protobuf.AbstractParser<FinishedTalkIdListNotify>() {
      @java.lang.Override
      public FinishedTalkIdListNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FinishedTalkIdListNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FinishedTalkIdListNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FinishedTalkIdListNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FinishedTalkIdListNotifyOuterClass.FinishedTalkIdListNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FinishedTalkIdListNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FinishedTalkIdListNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036FinishedTalkIdListNotify.proto\"9\n\030Fini" +
      "shedTalkIdListNotify\022\035\n\025finished_talk_id" +
      "_list\030\002 \003(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FinishedTalkIdListNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FinishedTalkIdListNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FinishedTalkIdListNotify_descriptor,
        new java.lang.String[] { "FinishedTalkIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
