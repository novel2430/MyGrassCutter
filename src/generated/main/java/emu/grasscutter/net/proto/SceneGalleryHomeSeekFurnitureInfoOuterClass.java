// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryHomeSeekFurnitureInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryHomeSeekFurnitureInfoOuterClass {
  private SceneGalleryHomeSeekFurnitureInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryHomeSeekFurnitureInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryHomeSeekFurnitureInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 MPKMCJKPIAI = 2;</code>
     * @return The mPKMCJKPIAI.
     */
    int getMPKMCJKPIAI();

    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
     */
    int getPlayerScoreMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
     */
    boolean containsPlayerScoreMap(
        int key);
    /**
     * Use {@link #getPlayerScoreMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPlayerScoreMap();
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPlayerScoreMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
     */

    int getPlayerScoreMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
     */

    int getPlayerScoreMapOrThrow(
        int key);

    /**
     * <code>uint32 JMKGIKHIGKF = 15;</code>
     * @return The jMKGIKHIGKF.
     */
    int getJMKGIKHIGKF();

    /**
     * <code>uint32 FOMNOCFGOCP = 6;</code>
     * @return The fOMNOCFGOCP.
     */
    int getFOMNOCFGOCP();
  }
  /**
   * <pre>
   * Obf: MOHMOKLMNOA
   * </pre>
   *
   * Protobuf type {@code SceneGalleryHomeSeekFurnitureInfo}
   */
  public static final class SceneGalleryHomeSeekFurnitureInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryHomeSeekFurnitureInfo)
      SceneGalleryHomeSeekFurnitureInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryHomeSeekFurnitureInfo.newBuilder() to construct.
    private SceneGalleryHomeSeekFurnitureInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryHomeSeekFurnitureInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryHomeSeekFurnitureInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryHomeSeekFurnitureInfo(
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

              mPKMCJKPIAI_ = input.readUInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playerScoreMap_ = com.google.protobuf.MapField.newMapField(
                    PlayerScoreMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              playerScoreMap__ = input.readMessage(
                  PlayerScoreMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              playerScoreMap_.getMutableMap().put(
                  playerScoreMap__.getKey(), playerScoreMap__.getValue());
              break;
            }
            case 48: {

              fOMNOCFGOCP_ = input.readUInt32();
              break;
            }
            case 120: {

              jMKGIKHIGKF_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetPlayerScoreMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.class, emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.Builder.class);
    }

    public static final int MPKMCJKPIAI_FIELD_NUMBER = 2;
    private int mPKMCJKPIAI_;
    /**
     * <code>uint32 MPKMCJKPIAI = 2;</code>
     * @return The mPKMCJKPIAI.
     */
    @java.lang.Override
    public int getMPKMCJKPIAI() {
      return mPKMCJKPIAI_;
    }

    public static final int PLAYER_SCORE_MAP_FIELD_NUMBER = 4;
    private static final class PlayerScoreMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> playerScoreMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetPlayerScoreMap() {
      if (playerScoreMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PlayerScoreMapDefaultEntryHolder.defaultEntry);
      }
      return playerScoreMap_;
    }

    public int getPlayerScoreMapCount() {
      return internalGetPlayerScoreMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
     */

    @java.lang.Override
    public boolean containsPlayerScoreMap(
        int key) {
      
      return internalGetPlayerScoreMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPlayerScoreMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMap() {
      return getPlayerScoreMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMapMap() {
      return internalGetPlayerScoreMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
     */
    @java.lang.Override

    public int getPlayerScoreMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPlayerScoreMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
     */
    @java.lang.Override

    public int getPlayerScoreMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPlayerScoreMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int JMKGIKHIGKF_FIELD_NUMBER = 15;
    private int jMKGIKHIGKF_;
    /**
     * <code>uint32 JMKGIKHIGKF = 15;</code>
     * @return The jMKGIKHIGKF.
     */
    @java.lang.Override
    public int getJMKGIKHIGKF() {
      return jMKGIKHIGKF_;
    }

    public static final int FOMNOCFGOCP_FIELD_NUMBER = 6;
    private int fOMNOCFGOCP_;
    /**
     * <code>uint32 FOMNOCFGOCP = 6;</code>
     * @return The fOMNOCFGOCP.
     */
    @java.lang.Override
    public int getFOMNOCFGOCP() {
      return fOMNOCFGOCP_;
    }

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
      if (mPKMCJKPIAI_ != 0) {
        output.writeUInt32(2, mPKMCJKPIAI_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetPlayerScoreMap(),
          PlayerScoreMapDefaultEntryHolder.defaultEntry,
          4);
      if (fOMNOCFGOCP_ != 0) {
        output.writeUInt32(6, fOMNOCFGOCP_);
      }
      if (jMKGIKHIGKF_ != 0) {
        output.writeUInt32(15, jMKGIKHIGKF_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mPKMCJKPIAI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, mPKMCJKPIAI_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetPlayerScoreMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        playerScoreMap__ = PlayerScoreMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, playerScoreMap__);
      }
      if (fOMNOCFGOCP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, fOMNOCFGOCP_);
      }
      if (jMKGIKHIGKF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, jMKGIKHIGKF_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo other = (emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo) obj;

      if (getMPKMCJKPIAI()
          != other.getMPKMCJKPIAI()) return false;
      if (!internalGetPlayerScoreMap().equals(
          other.internalGetPlayerScoreMap())) return false;
      if (getJMKGIKHIGKF()
          != other.getJMKGIKHIGKF()) return false;
      if (getFOMNOCFGOCP()
          != other.getFOMNOCFGOCP()) return false;
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
      hash = (37 * hash) + MPKMCJKPIAI_FIELD_NUMBER;
      hash = (53 * hash) + getMPKMCJKPIAI();
      if (!internalGetPlayerScoreMap().getMap().isEmpty()) {
        hash = (37 * hash) + PLAYER_SCORE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetPlayerScoreMap().hashCode();
      }
      hash = (37 * hash) + JMKGIKHIGKF_FIELD_NUMBER;
      hash = (53 * hash) + getJMKGIKHIGKF();
      hash = (37 * hash) + FOMNOCFGOCP_FIELD_NUMBER;
      hash = (53 * hash) + getFOMNOCFGOCP();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo prototype) {
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
     * Obf: MOHMOKLMNOA
     * </pre>
     *
     * Protobuf type {@code SceneGalleryHomeSeekFurnitureInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryHomeSeekFurnitureInfo)
        emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetPlayerScoreMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutablePlayerScoreMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.class, emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.newBuilder()
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
        mPKMCJKPIAI_ = 0;

        internalGetMutablePlayerScoreMap().clear();
        jMKGIKHIGKF_ = 0;

        fOMNOCFGOCP_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo build() {
        emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo result = new emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo(this);
        int from_bitField0_ = bitField0_;
        result.mPKMCJKPIAI_ = mPKMCJKPIAI_;
        result.playerScoreMap_ = internalGetPlayerScoreMap();
        result.playerScoreMap_.makeImmutable();
        result.jMKGIKHIGKF_ = jMKGIKHIGKF_;
        result.fOMNOCFGOCP_ = fOMNOCFGOCP_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.getDefaultInstance()) return this;
        if (other.getMPKMCJKPIAI() != 0) {
          setMPKMCJKPIAI(other.getMPKMCJKPIAI());
        }
        internalGetMutablePlayerScoreMap().mergeFrom(
            other.internalGetPlayerScoreMap());
        if (other.getJMKGIKHIGKF() != 0) {
          setJMKGIKHIGKF(other.getJMKGIKHIGKF());
        }
        if (other.getFOMNOCFGOCP() != 0) {
          setFOMNOCFGOCP(other.getFOMNOCFGOCP());
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
        emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int mPKMCJKPIAI_ ;
      /**
       * <code>uint32 MPKMCJKPIAI = 2;</code>
       * @return The mPKMCJKPIAI.
       */
      @java.lang.Override
      public int getMPKMCJKPIAI() {
        return mPKMCJKPIAI_;
      }
      /**
       * <code>uint32 MPKMCJKPIAI = 2;</code>
       * @param value The mPKMCJKPIAI to set.
       * @return This builder for chaining.
       */
      public Builder setMPKMCJKPIAI(int value) {
        
        mPKMCJKPIAI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MPKMCJKPIAI = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMPKMCJKPIAI() {
        
        mPKMCJKPIAI_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> playerScoreMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetPlayerScoreMap() {
        if (playerScoreMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              PlayerScoreMapDefaultEntryHolder.defaultEntry);
        }
        return playerScoreMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutablePlayerScoreMap() {
        onChanged();;
        if (playerScoreMap_ == null) {
          playerScoreMap_ = com.google.protobuf.MapField.newMapField(
              PlayerScoreMapDefaultEntryHolder.defaultEntry);
        }
        if (!playerScoreMap_.isMutable()) {
          playerScoreMap_ = playerScoreMap_.copy();
        }
        return playerScoreMap_;
      }

      public int getPlayerScoreMapCount() {
        return internalGetPlayerScoreMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
       */

      @java.lang.Override
      public boolean containsPlayerScoreMap(
          int key) {
        
        return internalGetPlayerScoreMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getPlayerScoreMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMap() {
        return getPlayerScoreMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMapMap() {
        return internalGetPlayerScoreMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
       */
      @java.lang.Override

      public int getPlayerScoreMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetPlayerScoreMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
       */
      @java.lang.Override

      public int getPlayerScoreMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetPlayerScoreMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearPlayerScoreMap() {
        internalGetMutablePlayerScoreMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
       */

      public Builder removePlayerScoreMap(
          int key) {
        
        internalGetMutablePlayerScoreMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutablePlayerScoreMap() {
        return internalGetMutablePlayerScoreMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
       */
      public Builder putPlayerScoreMap(
          int key,
          int value) {
        
        
        internalGetMutablePlayerScoreMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 4;</code>
       */

      public Builder putAllPlayerScoreMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutablePlayerScoreMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int jMKGIKHIGKF_ ;
      /**
       * <code>uint32 JMKGIKHIGKF = 15;</code>
       * @return The jMKGIKHIGKF.
       */
      @java.lang.Override
      public int getJMKGIKHIGKF() {
        return jMKGIKHIGKF_;
      }
      /**
       * <code>uint32 JMKGIKHIGKF = 15;</code>
       * @param value The jMKGIKHIGKF to set.
       * @return This builder for chaining.
       */
      public Builder setJMKGIKHIGKF(int value) {
        
        jMKGIKHIGKF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JMKGIKHIGKF = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearJMKGIKHIGKF() {
        
        jMKGIKHIGKF_ = 0;
        onChanged();
        return this;
      }

      private int fOMNOCFGOCP_ ;
      /**
       * <code>uint32 FOMNOCFGOCP = 6;</code>
       * @return The fOMNOCFGOCP.
       */
      @java.lang.Override
      public int getFOMNOCFGOCP() {
        return fOMNOCFGOCP_;
      }
      /**
       * <code>uint32 FOMNOCFGOCP = 6;</code>
       * @param value The fOMNOCFGOCP to set.
       * @return This builder for chaining.
       */
      public Builder setFOMNOCFGOCP(int value) {
        
        fOMNOCFGOCP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FOMNOCFGOCP = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFOMNOCFGOCP() {
        
        fOMNOCFGOCP_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryHomeSeekFurnitureInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryHomeSeekFurnitureInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryHomeSeekFurnitureInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryHomeSeekFurnitureInfo>() {
      @java.lang.Override
      public SceneGalleryHomeSeekFurnitureInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryHomeSeekFurnitureInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryHomeSeekFurnitureInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryHomeSeekFurnitureInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SceneGalleryHomeSeekFurnitureInfo.prot" +
      "o\"\353\001\n!SceneGalleryHomeSeekFurnitureInfo\022" +
      "\023\n\013MPKMCJKPIAI\030\002 \001(\r\022P\n\020player_score_map" +
      "\030\004 \003(\01326.SceneGalleryHomeSeekFurnitureIn" +
      "fo.PlayerScoreMapEntry\022\023\n\013JMKGIKHIGKF\030\017 " +
      "\001(\r\022\023\n\013FOMNOCFGOCP\030\006 \001(\r\0325\n\023PlayerScoreM" +
      "apEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor,
        new java.lang.String[] { "MPKMCJKPIAI", "PlayerScoreMap", "JMKGIKHIGKF", "FOMNOCFGOCP", });
    internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor =
      internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor.getNestedTypes().get(0);
    internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
