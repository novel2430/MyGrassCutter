// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGTCTavernInfoNotify.proto

package emu.grasscutter.net.proto;

public final class GCGTCTavernInfoNotifyOuterClass {
  private GCGTCTavernInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGTCTavernInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGTCTavernInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 character_id = 11;</code>
     * @return The characterId.
     */
    int getCharacterId();

    /**
     * <code>uint32 avatar_id = 7;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>bool KPBIEOPHOHC = 4;</code>
     * @return The kPBIEOPHOHC.
     */
    boolean getKPBIEOPHOHC();

    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 element_type = 5;</code>
     * @return The elementType.
     */
    int getElementType();

    /**
     * <code>uint32 point_id = 6;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>bool EKEOEIDDHCN = 3;</code>
     * @return The eKEOEIDDHCN.
     */
    boolean getEKEOEIDDHCN();
  }
  /**
   * <pre>
   * CmdId: 22639
   * Obf: KLMPBEENMNG
   * </pre>
   *
   * Protobuf type {@code GCGTCTavernInfoNotify}
   */
  public static final class GCGTCTavernInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGTCTavernInfoNotify)
      GCGTCTavernInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGTCTavernInfoNotify.newBuilder() to construct.
    private GCGTCTavernInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGTCTavernInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGTCTavernInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGTCTavernInfoNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 24: {

              eKEOEIDDHCN_ = input.readBool();
              break;
            }
            case 32: {

              kPBIEOPHOHC_ = input.readBool();
              break;
            }
            case 40: {

              elementType_ = input.readUInt32();
              break;
            }
            case 48: {

              pointId_ = input.readUInt32();
              break;
            }
            case 56: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 88: {

              characterId_ = input.readUInt32();
              break;
            }
            case 104: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.class, emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.Builder.class);
    }

    public static final int CHARACTER_ID_FIELD_NUMBER = 11;
    private int characterId_;
    /**
     * <code>uint32 character_id = 11;</code>
     * @return The characterId.
     */
    @java.lang.Override
    public int getCharacterId() {
      return characterId_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 7;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 7;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int KPBIEOPHOHC_FIELD_NUMBER = 4;
    private boolean kPBIEOPHOHC_;
    /**
     * <code>bool KPBIEOPHOHC = 4;</code>
     * @return The kPBIEOPHOHC.
     */
    @java.lang.Override
    public boolean getKPBIEOPHOHC() {
      return kPBIEOPHOHC_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 13;
    private int levelId_;
    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int ELEMENT_TYPE_FIELD_NUMBER = 5;
    private int elementType_;
    /**
     * <code>uint32 element_type = 5;</code>
     * @return The elementType.
     */
    @java.lang.Override
    public int getElementType() {
      return elementType_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 6;
    private int pointId_;
    /**
     * <code>uint32 point_id = 6;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int EKEOEIDDHCN_FIELD_NUMBER = 3;
    private boolean eKEOEIDDHCN_;
    /**
     * <code>bool EKEOEIDDHCN = 3;</code>
     * @return The eKEOEIDDHCN.
     */
    @java.lang.Override
    public boolean getEKEOEIDDHCN() {
      return eKEOEIDDHCN_;
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
      if (eKEOEIDDHCN_ != false) {
        output.writeBool(3, eKEOEIDDHCN_);
      }
      if (kPBIEOPHOHC_ != false) {
        output.writeBool(4, kPBIEOPHOHC_);
      }
      if (elementType_ != 0) {
        output.writeUInt32(5, elementType_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(6, pointId_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(7, avatarId_);
      }
      if (characterId_ != 0) {
        output.writeUInt32(11, characterId_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(13, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eKEOEIDDHCN_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, eKEOEIDDHCN_);
      }
      if (kPBIEOPHOHC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, kPBIEOPHOHC_);
      }
      if (elementType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, elementType_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, pointId_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, avatarId_);
      }
      if (characterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, characterId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify other = (emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify) obj;

      if (getCharacterId()
          != other.getCharacterId()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getKPBIEOPHOHC()
          != other.getKPBIEOPHOHC()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getElementType()
          != other.getElementType()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (getEKEOEIDDHCN()
          != other.getEKEOEIDDHCN()) return false;
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
      hash = (37 * hash) + CHARACTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCharacterId();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + KPBIEOPHOHC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKPBIEOPHOHC());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + ELEMENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementType();
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + EKEOEIDDHCN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEKEOEIDDHCN());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify prototype) {
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
     * CmdId: 22639
     * Obf: KLMPBEENMNG
     * </pre>
     *
     * Protobuf type {@code GCGTCTavernInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGTCTavernInfoNotify)
        emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.class, emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.newBuilder()
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
        characterId_ = 0;

        avatarId_ = 0;

        kPBIEOPHOHC_ = false;

        levelId_ = 0;

        elementType_ = 0;

        pointId_ = 0;

        eKEOEIDDHCN_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify build() {
        emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify buildPartial() {
        emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify result = new emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify(this);
        result.characterId_ = characterId_;
        result.avatarId_ = avatarId_;
        result.kPBIEOPHOHC_ = kPBIEOPHOHC_;
        result.levelId_ = levelId_;
        result.elementType_ = elementType_;
        result.pointId_ = pointId_;
        result.eKEOEIDDHCN_ = eKEOEIDDHCN_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify other) {
        if (other == emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.getDefaultInstance()) return this;
        if (other.getCharacterId() != 0) {
          setCharacterId(other.getCharacterId());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getKPBIEOPHOHC() != false) {
          setKPBIEOPHOHC(other.getKPBIEOPHOHC());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getElementType() != 0) {
          setElementType(other.getElementType());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getEKEOEIDDHCN() != false) {
          setEKEOEIDDHCN(other.getEKEOEIDDHCN());
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
        emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int characterId_ ;
      /**
       * <code>uint32 character_id = 11;</code>
       * @return The characterId.
       */
      @java.lang.Override
      public int getCharacterId() {
        return characterId_;
      }
      /**
       * <code>uint32 character_id = 11;</code>
       * @param value The characterId to set.
       * @return This builder for chaining.
       */
      public Builder setCharacterId(int value) {
        
        characterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 character_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCharacterId() {
        
        characterId_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 7;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 7;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private boolean kPBIEOPHOHC_ ;
      /**
       * <code>bool KPBIEOPHOHC = 4;</code>
       * @return The kPBIEOPHOHC.
       */
      @java.lang.Override
      public boolean getKPBIEOPHOHC() {
        return kPBIEOPHOHC_;
      }
      /**
       * <code>bool KPBIEOPHOHC = 4;</code>
       * @param value The kPBIEOPHOHC to set.
       * @return This builder for chaining.
       */
      public Builder setKPBIEOPHOHC(boolean value) {
        
        kPBIEOPHOHC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool KPBIEOPHOHC = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearKPBIEOPHOHC() {
        
        kPBIEOPHOHC_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 13;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int elementType_ ;
      /**
       * <code>uint32 element_type = 5;</code>
       * @return The elementType.
       */
      @java.lang.Override
      public int getElementType() {
        return elementType_;
      }
      /**
       * <code>uint32 element_type = 5;</code>
       * @param value The elementType to set.
       * @return This builder for chaining.
       */
      public Builder setElementType(int value) {
        
        elementType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementType() {
        
        elementType_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 6;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 6;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private boolean eKEOEIDDHCN_ ;
      /**
       * <code>bool EKEOEIDDHCN = 3;</code>
       * @return The eKEOEIDDHCN.
       */
      @java.lang.Override
      public boolean getEKEOEIDDHCN() {
        return eKEOEIDDHCN_;
      }
      /**
       * <code>bool EKEOEIDDHCN = 3;</code>
       * @param value The eKEOEIDDHCN to set.
       * @return This builder for chaining.
       */
      public Builder setEKEOEIDDHCN(boolean value) {
        
        eKEOEIDDHCN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool EKEOEIDDHCN = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEKEOEIDDHCN() {
        
        eKEOEIDDHCN_ = false;
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


      // @@protoc_insertion_point(builder_scope:GCGTCTavernInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGTCTavernInfoNotify)
    private static final emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify();
    }

    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGTCTavernInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGTCTavernInfoNotify>() {
      @java.lang.Override
      public GCGTCTavernInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGTCTavernInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGTCTavernInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGTCTavernInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGTCTavernInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGTCTavernInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033GCGTCTavernInfoNotify.proto\"\244\001\n\025GCGTCT" +
      "avernInfoNotify\022\024\n\014character_id\030\013 \001(\r\022\021\n" +
      "\tavatar_id\030\007 \001(\r\022\023\n\013KPBIEOPHOHC\030\004 \001(\010\022\020\n" +
      "\010level_id\030\r \001(\r\022\024\n\014element_type\030\005 \001(\r\022\020\n" +
      "\010point_id\030\006 \001(\r\022\023\n\013EKEOEIDDHCN\030\003 \001(\010B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGTCTavernInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGTCTavernInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGTCTavernInfoNotify_descriptor,
        new java.lang.String[] { "CharacterId", "AvatarId", "KPBIEOPHOHC", "LevelId", "ElementType", "PointId", "EKEOEIDDHCN", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
